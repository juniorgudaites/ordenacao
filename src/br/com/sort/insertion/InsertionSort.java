package br.com.sort.insertion;

import static br.com.sort.Vetor.printVetor;
import static br.com.sort.Vetor.randomVetor;

public class InsertionSort {

    public static void main(String[] args) {
        int[] vet = randomVetor(10);

        System.out.println("Vetor Old");
        printVetor(vet);

        ordena(vet);

        System.out.println("\nVetor New");
        printVetor(vet);

    }

    public static void ordena(int vet[]) {
        for (int i = 0; i < vet.length; i++) {
            int j = i;

            while (j > 0 && (vet[j - 1] > vet[j])) {
                int temp = vet[j];
                vet[j] = vet[j - 1];
                vet[j - 1] = temp;
                j = j - 1;
            }
        }
    }

}
