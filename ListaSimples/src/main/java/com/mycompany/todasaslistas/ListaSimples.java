/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.todasaslistas;

/**
 *
 * @author laurentino
 */
/**
 *
 * @author 2084007
 */
public class ListaSimples {

    private int[] valores;
    private int tamanho;

    public ListaSimples(int tamanho) {
        if (tamanho <= 0) {
            tamanho = 5;
        }
        this.tamanho = tamanho;
        this.valores = new int[tamanho];
    }

    public int insere(int valor, int pos) {
        if (pos >= 0 && pos < this.tamanho) {
            valores[pos] = valor;
            return pos;
        }
        return -1;
    }

    public int remove(int pos) {
        int valor;
        if (pos > 0 && pos < tamanho) {
            valor = valores[pos];
            valores[pos] = 0;
            return valor;
        }
        return -1;
    }

    public int encontra(int valor) {
        for (int i = 0; i < tamanho; i++) {
            if (valores[i] == valor) {
                return i;
            }
        }
        return -1;
    }

    public int vetMaior(int valor) {
        int maior = valores[0];
        for (int i = 1; i < this.valores.length; i++) {
            if(maior < valores[i]){
                maior = valores[i];
            }
        }
        return maior;
    }

    public String toString() {
        String volta = "";
        for (int i = 0; i < tamanho; i++) {
            volta += "Pos: " + i + " Valor: " + valores[i] + "\n";
        }
        return volta;
    }

}
