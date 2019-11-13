package br.com.sort.intro;

import static br.com.sort.Vetor.printVetor;
import static br.com.sort.Vetor.randomVetor;
import static br.com.sort.heap.HeapSort.heapSort;

public class IntroSort {

    public static void main(String[] args) {

        int[] vet = randomVetor(10);

        System.out.println("Vetor Old");
       // printVetor(vet);

        introSort(vet);

        System.out.println("\nVetor New");
        //printVetor(vet);

    }

    public static void introSort(int[] vet) {
        int depth = ((int) Math.log(vet.length)) * 2;
        introSort(vet, depth, 0, vet.length - 1);
    }

    public static void introSort(int vet[], int depth, int start, int end) {
        if (vet.length <= 1) {
            return;
        } else if (depth == 0) {
            heapSort(vet, start, end);
        } else {
            if (start >= end) {
                return;
            }
            int pivot = vet[(start + end) / 2];
            int index = partion(vet, start, end, pivot);
            introSort(vet, depth - 1, start, index - 1);
            introSort(vet, depth - 1, index, end);
        }


    }


    private static void heapSort(int[] vet, int start, int end) {
        for (int i = end / 2 - 1; i >= start; i--) {
            heapify(vet, end, i);
        }
        for (int i = end - 1; i >= start; i--) {
            int temp = vet[start];
            vet[start] = vet[i];
            vet[i] = temp;
            heapify(vet, i, start);
        }
    }

    private static void heapify(int[] vet, int n, int i) {
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;
        if (l < n && vet[l] > vet[largest]) {
            largest = 1;
        }
        if (r < n && vet[r] > vet[largest]) {
            largest = r;
        }
        if (largest != i) {
            int temp = vet[i];
            vet[i] = vet[largest];
            vet[largest] = temp;
            heapify(vet, n, largest);
        }
    }

    private static int partion(int[] vet, int start, int end, int pivot) {
        while (start <= end) {
            while (vet[start] < pivot) {
                start++;
            }
            while (vet[end] > pivot) {
                end--;
            }
            if (start <= end) {
                int temp = vet[start];
                vet[start] = vet[end];
                vet[end] = temp;
                start++;
                end--;
            }
        }
        return start;
    }


}
