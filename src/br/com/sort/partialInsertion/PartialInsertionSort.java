package br.com.sort.partialInsertion;

import static br.com.sort.Vetor.printVetor;
import static br.com.sort.Vetor.randomVetor;

public class PartialInsertionSort {

    public static void main(String[] args) {
        int[] vet = randomVetor(10);
        // k = Quantidade de Menores Numeros a serem ordenados
        int k = 5;

        System.out.println("Vetor Old");
        printVetor(vet);

        insertionSort(vet,vet.length,k);

        System.out.println("\nVetor New");
        printVetor(vet);

    }

    public static void insertionSort(int vet[], int n, int k) {
        int i,j,aux,inicio;
        for (i = 1; i < n; i++) {
            aux = vet[i];

            if(i>k-1){
                inicio = k-1;
                if(vet[i]<vet[k]){
                    vet[i] = vet[k];
                }
            }else{
                inicio = i-1;
            }

           for(j=inicio; j>=0 && vet[j]>aux; j--){
               vet[j+1] = vet[j];
            }
           vet[j+1] = aux;
        }
    }

}
