package br.com.sort.merge;

import static br.com.sort.Vetor.printVetor;
import static br.com.sort.Vetor.randomVetor;

public class MergeSort {
    public static void main(String[] args) {

        int[] vet = randomVetor(10);

        System.out.println("Vetor Old");
        printVetor(vet);

        mergeSort(vet, 0,vet.length-1);


        System.out.println("\nVetor New");
        printVetor(vet);
    }

    public static void mergeSort(int[] vet, int start, int end) {

        if (start < end) {
            int mid = ((start + end) / 2);
            mergeSort(vet, start, mid);
            mergeSort(vet, mid + 1, end);
            intercala(vet, start, mid, end);
        }

    }

    public static void intercala(int[] vet, int start, int mid, int end) {

        int vetB[] = new int[vet.length];

        for (int i = start; i <= mid; i++) {
            vetB[i] = vet[i];
        }

        for (int j = mid + 1; j <= end; j++) {
            vetB[end + mid + 1 - j] = vet[j];
        }
        int i = start;
        int j = end;
        for (int k = start; k <= end; k++) {
            if (vetB[i] <= vetB[j]) {
                vet[k] = vetB[i];
                i++;
            } else {
                vet[k] = vetB[j];
                j--;
            }
        }
    }
}

