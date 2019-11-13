package br.com.sort.partialSelection;

import static br.com.sort.Vetor.printVetor;
import static br.com.sort.Vetor.randomVetor;

public class PartialSelectionSort {

    public static void main(String[] args) {

        int[] vet = randomVetor(10);
        // k = Quantidade de Menores Numeros a serem ordenados
        int k = 5;

        System.out.println("Vetor Old");
        printVetor(vet);

        selectionSort(vet,vet.length,k);

        System.out.println("\nVetor New");
        printVetor(vet);
        
    }
    
    public static void selectionSort(int vet[],int n, int k){
        int min, x;
        for (int i = 0; i < k; i++) {
            min = i;
            for (int j = i+1; j < n; j++) {
                if (vet[j]<vet[min]) {
                    min = j;
                }
            }
            x = vet[min];
            vet[min] = vet[i];
            vet[i] = x;
        }
    }

    
}
