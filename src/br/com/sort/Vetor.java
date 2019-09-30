package br.com.sort;

public class Vetor {

    public static void printVetor(int[] vet) {
        for (int i = 0; i < vet.length; i++) {
            System.out.println("Vetor[" + i + "] = " + vet[i]);
        }
    }

    public static int[] randomVetor(int n){
        int[] vet = new int[n];
        for (int i = 0; i < vet.length; i++) {
            vet[i] = (int) (Math.random() * 100);
        }
        return vet;
    }
}
