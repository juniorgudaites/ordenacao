package br.com.sort.bubble;

import static br.com.sort.Vetor.printVetor;
import static br.com.sort.Vetor.randomVetor;

public class BubbleSort {

    public static void main(String[] args) {

        int[] vet = randomVetor(10);

        System.out.println("Vetor Old:");
        printVetor(vet);

        ordena(vet);

        System.out.println("\nVetor New:");
        printVetor(vet);

    }

    public static void ordena(int vet[]) {

        int temp;

        for (int i = 0; i < vet.length; i++) {
            for (int j = 0; j < vet.length-1; j++) {
                if (vet[j + 1] < vet[j]) {
                    temp = vet[j + 1];
                    vet[j + 1] = vet[j];
                    vet[j] = temp;
                }
            }
        }

    }





}



