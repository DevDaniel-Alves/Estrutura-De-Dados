package mergesort;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] vetor = {4, 5, 7, 1, 3, 8, 2, 9};
        int[] aux = new int[vetor.length];

        mergesSort(vetor, aux, 0, vetor.length - 1);
        
        System.out.println(Arrays.toString(vetor));
    }

    private static void mergesSort(int[] vetor, int[] aux, int inicio, int fim) {
        if (inicio < fim) {

            int meio = (inicio + fim) / 2;
            mergesSort(vetor, aux, inicio, meio);
            mergesSort(vetor, aux, meio + 1, fim);
            intercalar(vetor, aux, inicio, meio, fim);
        }
    }

    private static void intercalar(int[] vetor, int[] aux, int inicio, int meio, int fim) {
        for (int i = inicio; i <= fim; i++) {
            aux[i] = vetor[i];
        }

        int esquerda = inicio;
        int direita = meio + 1;

        for (int i = inicio; i <= fim; i++) {
            if (esquerda > meio) {
                vetor[i] = aux[direita++];
            } else if (direita > fim) {
                vetor[i] = aux[esquerda++];
            } else if (aux[esquerda] < aux[direita]) {
                vetor[i] = aux[esquerda++];
            } else {
                vetor[i] = aux[direita];
            }
        }
        
    }
    
}
