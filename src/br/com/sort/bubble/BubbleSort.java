package br.com.sort.bubble;

import static br.com.sort.Vetor.printVetor;
import static br.com.sort.Vetor.randomVetor;

public class BubbleSort {

    public static void main(String[] args) {

        int[] vet = randomVetor(1000);

        System.out.println("Vetor Old:");
        printVetor(vet);

        bubbleSort(vet);

        System.out.println("\nVetor New:");
        printVetor(vet);

    }

    public static void bubbleSort(int vet[]) {
        for (int i = 0; i < vet.length; i++) {
            for (int j = 0; j < vet.length - 1; j++) {
                if (vet[j + 1] < vet[j]) {
                    int temp = vet[j + 1];
                    vet[j + 1] = vet[j];
                    vet[j] = temp;
                }
            }
        }
    }


}



