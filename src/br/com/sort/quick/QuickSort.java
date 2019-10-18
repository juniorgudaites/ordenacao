package br.com.sort.quick;

import static br.com.sort.Vetor.printVetor;
import static br.com.sort.Vetor.randomVetor;

public class QuickSort {
    public static void main(String[] args) {

        int[] vet = randomVetor(10);

        System.out.println("Vetor Old");
        printVetor(vet);

        quickSort(vet, 0, vet.length - 1);

        System.out.println("\nVetor New");
        printVetor(vet);
    }

    public static void quickSort(int[] vet, int start, int end) {

        if (start < end) {
            int mid = part(vet, start, end);
            quickSort(vet, start, mid - 1);
            quickSort(vet, mid + 1, end);
        }

    }

    public static int part(int[] vet, int start, int end) {

        int i = start + 1;
        int j = end;
        int aux;

        while (i <= j) {
            if (vet[i] < vet[start]) {
                i++;
            } else {
                if (vet[j] > vet[start]) {
                    j--;
                } else {
                    aux = vet[i];
                    vet[i] = vet[j];
                    vet[j] = aux;
                    i++;
                    j--;
                }
            }
        }
        aux = vet[start];
        vet[start] = vet[j];
        vet[j] = aux;
        return j;
    }
}

