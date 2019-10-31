package br.com.sort.selection;

import static br.com.sort.Vetor.printVetor;
import static br.com.sort.Vetor.randomVetor;

public class SelectionSort {

    public static void main(String[] args) {

        int[] vet = randomVetor(10);

        System.out.println("Vetor Old");
        printVetor(vet);

        selectionSort(vet);

        System.out.println("\nVetor New");
        printVetor(vet);
        
    }
    
    public static void selectionSort(int vet[]){
        for (int i = 0; i < vet.length; i++) {
            int min = i;
            for (int j = 0; j < vet.length; j++) {
                if (vet[j]>vet[min]) {
                    min = j;
                }
                int temp = vet[i];
                vet[i] = vet[min];
                vet[min] = temp;
            }            
        }
    }

    
}
