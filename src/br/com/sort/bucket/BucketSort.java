package br.com.sort.bucket;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import static br.com.sort.Vetor.printVetor;
import static br.com.sort.Vetor.randomVetor;

public class BucketSort {

    public static void main(String[] args) {
        int[] vet = randomVetor(10);

        System.out.println("Vetor Old");
        printVetor(vet);
        // numBuckets = 10 - Numeros
        // numBuckets = 26 - Letras
        bucketSort(vet, 10);

        System.out.println("\nVetor New");
        printVetor(vet);

    }

    public static void bucketSort(int vet[], int numBuckets) {
        //Criando lista buckets
        List<Integer>[] buckets = new List[numBuckets];
        for (int i = 0; i < numBuckets; i++) {
            buckets[i] = new LinkedList<>();
        }
        for (int num : vet) {
            buckets[hash(num)].add(num);
        }
        //ordenando os buckers
        for (List<Integer> bucket : buckets) {
            Collections.sort(bucket);
        }
        int i = 0;
        // Merge buckets ordenado para a lista
        for (List<Integer> bucket : buckets) {
            for (int num:bucket) {
                vet[i++] = num;
            }

        }
    }


    public static int hash(int num) {
        return num / 10;
    }


}
