package br.com.sort.radix;

import static br.com.sort.Vetor.printVetor;
import static br.com.sort.Vetor.randomVetor;

public class RadixSort {

    public static void main(String[] args) {

        int[] vet = randomVetor(10);

        System.out.println("Vetor Old:");
        printVetor(vet);

        radixSort(vet);

        System.out.println("\nVetor New:");
        printVetor(vet);

    }

    public static void radixSort(int vet[]) {
        for (int dig = 0; dig < 3; dig++) {
            int power = (int) Math.pow(10, dig+1);

            int z[][] = new int[vet.length][10];
            int n [] = new int[10];

            for (int i = 0; i < vet.length; i++) {
                int num = vet[i];
                z[n[(num%power)/(power/10)]][(num%power)/(power/10)] = num;
                n[(num%power)/(power/10)]++;
            }
            int c = 0;
            for (int i = 0; i < 10; i++) {

                for (int j = 0; j < vet.length; j++) {
                    if(j< n[i]){
                        vet[c] = z[j][i];
                        c++;
                    }else{break;}
                }

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



