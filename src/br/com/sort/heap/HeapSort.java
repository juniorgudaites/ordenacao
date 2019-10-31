package br.com.sort.heap;

import static br.com.sort.Vetor.printVetor;
import static br.com.sort.Vetor.randomVetor;

public class HeapSort {
    public static void main(String[] args) {

        int[] vet = randomVetor(10);

        System.out.println("Vetor Old");
        printVetor(vet);

        heapSort(vet, vet.length);

        System.out.println("\nVetor New");
        printVetor(vet);
    }

    public static void heapSort(int[] vet, int length) {
        int end;
        createHeap(vet, length);
        end = length - 1;
        while (end > 0) {
            swap(vet, 0, end);
            --end;
            correctHeap(vet, 0, end);
        }
    }

    private static void createHeap(int[] vet, int length) {
        int start = (length - 2);
        while (start >= 0) {
            correctHeap(vet, start, length - 1);
            --start;
        }
    }

    private static void swap(int[] vet, int i, int j) {
        int temp = vet[j];
        vet[j] = vet[i];
        vet[i] = temp;
    }

    private static void correctHeap(int[] vet, int start, int end) {
        int raiz = start;
        int filho;
        int trocar;
        while (raiz * 2 + 1 <= end) {
            filho = raiz * 2 + 1;
            trocar = raiz;
            if (vet[trocar] < vet[filho]) {
                trocar = filho;
            }
            if (filho + 1 <= end && vet[trocar] < vet[filho + 1]){
                trocar = filho + 1;
            }
            if (trocar == raiz){
                break;
            }else{
                swap(vet,raiz,trocar);
                raiz = trocar;
            }
        }
    }
}

