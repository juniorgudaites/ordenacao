package br.com.sort.cocktail;

import static br.com.sort.Vetor.printVetor;
import static br.com.sort.Vetor.randomVetor;

public class CocktailSort {

    public static void main(String[] args) {
        int[] vet = randomVetor(10);

        System.out.println("Vetor Old");
        printVetor(vet);

        cocktailSort(vet);

        System.out.println("\nVetor New");
        printVetor(vet);
        
    }
    
    public static void cocktailSort(int vet[]){
       boolean invert = true;
       int start = 0;
       int end = vet.length-1;

       while (invert==true){
           invert = false;
           for (int i = start; i < end ; i++) {
               if (vet[i] > vet[i + 1]) {
                   int temp = vet[i];
                   vet[i] = vet[i+1];
                   vet[i+1] = temp;
                   invert = true;
               }
           }
           end = end - 1;
           for (int i = end; i > start; i--) {
               if (vet[i] < vet[i-1]){
                   int temp = vet[i];
                   vet[i] = vet[i-1];
                   vet[i-1] = temp;
                   invert = true;
               }
           }
           start = start + 1;
       }
    }



    
}
