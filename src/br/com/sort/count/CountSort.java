package br.com.sort.count;

import static br.com.sort.Vetor.printVetor;
import static br.com.sort.Vetor.randomVetor;

public class CountSort {

    public static void main(String[] args) {

        int[] vet = randomVetor(10);

        System.out.println("Vetor Old:");
        printVetor(vet);

        countSort(vet);

        System.out.println("\nVetor New:");
        printVetor(vet);

    }

    public static void countSort(int vet[]) {
        int maior = encontrarMaior(vet);
        int[] count = new int[maior+1];
        for (int i = 0; i < vet.length; i++) {
            count[vet[i]] += 1;
        }
        int indice = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0){
                vet[indice] = i;
                indice++;
                count[i]--;
            }
        }

    }

    public static int encontrarMaior(int vet[]){
        int maior = 0;
        for (int i = 0; i < vet.length; i++) {
            if(vet[i]>maior){
                maior = vet[i];
            }
        }
        return maior;
    }


}



