/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.todasaslistas;

/**
 *
 * @author laurentino
 */
public class Lista2 {

    int valores[];

    //
    public Lista2() {
        valores = new int[0];
    }

    public boolean vazio() {
        return valores.length == 0;
    }

    public int tamanho() {
        return this.valores.length;
    }

    public boolean existe(int valor) {
        for (int i = 0; i < this.valores.length; i++) {
            if (this.valores[i] == valor) {
                return true;
            }
        }
        return false;
    }

    //Altere o método Insere para que os valores sejam inseridos em ordem crescente 
    //e não seja aceito números repetidos;
    public boolean insere(int valor) {
        if (existe(valor)) {
            return false;
        }
        int aux[] = this.valores;
        this.valores = new int[this.valores.length + 1];
        boolean pula = false;
        for (int i = 0; i < aux.length; i++) {
            if (!pula) {
                if (aux[i] > valor) {
                    pula = true;
                    this.valores[i] = valor;
                    this.valores[i + 1] = aux[i];
                } else {
                    this.valores[i] = aux[i];
                }
            } else {
                this.valores[i + 1] = aux[i];
            }
        }
        if (!pula) {
            this.valores[this.valores.length - 1] = valor;
        }
        return true;
    }

    public int encontra(int valor) {
        for (int i = 0; i < this.valores.length; i++) {
            if (valores[i] == valor) {
                return i;
            }
        }
        return -1;
    }

    public String toString() {
        String volta = "";
        for (int i = 0; i < this.valores.length; i++) {
            volta += "Pos: " + i + " Valor: " + valores[i] + "\n";
        }
        return volta;
    }

    public boolean remove(int valor) {
        int pos = this.encontra(valor);
        if (pos > -1) {
            int aux[] = this.valores;
            this.valores = new int[this.valores.length - 1];
            for (int i = 0; i < aux.length; i++) {
                if (i < pos) {
                    this.valores[i] = aux[i];
                }
                if (i > pos) {
                    this.valores[i - 1] = aux[i];
                }
            }
            return true;
        }
        return false;
    }

    //Crie um método chamado maior que retorne o elemento de maior valor;
    public int maior() {
        if (vazio()) {
            return -1;
        }
        int maior = this.valores[0];
        for (int i = 1; i < this.valores.length; i++) {
            if (this.valores[i] > maior) {
                maior = this.valores[i];
            }
        }
        return maior;
    }

    //Crie um método chamado maior que retorne o elemento de maior valor;
    //Com a lista ordenada...
    public int _maior() {
        if (vazio()) {
            return -1;
        }
        return this.valores[this.valores.length - 1];
    }

    //Crie um método chamado menor que retorne o elemento de menor valor;
    public int menor() {
        if (vazio()) {
            return -1;
        }
        int menor = this.valores[0];
        for (int i = 1; i < this.valores.length; i++) {
            if (this.valores[i] < menor) {
                menor = this.valores[i];
            }
        }
        return menor;
    }

    public void InsereNaFrente(int valor) {
        int sup[] = this.valores;
        this.valores = new int[this.valores.length + 1];
        this.valores[0] = valor;
        for (int i = 0; i < sup.length; i++) {
            this.valores[i+1] = sup[i];
        }
        
    }

    public int _menor() {
        if (vazio()) {
            return -1;
        }
        return this.valores[0];
    }

    //Crie um método que retorne a média dos elementos da lista;
    public double media() {
        if (vazio()) {
            return 0;
        }
        double meme = 0;
        for (int i = 0; i < this.valores.length; i++) {
            meme += this.valores[i];
        }
        return (meme / this.valores.length);
    }

    //Crie um método que receba um valor boolean como parâmetro, caso o valor recebido seja verdadeiro retorne um vetor contendo 
    //os valores pares da lista, caso o valor seja falso retorne um vetor contendo os valores ímpares da lista.
    public int[] par_impar(boolean tipo) {
        if (vazio()) {
            return null;
        }
        int conta = 0;
        for (int i = 0; i < this.valores.length; i++) {
            if (tipo && this.valores[i] % 2 == 0) {
                conta++;
            }
            if (!tipo && this.valores[i] % 2 != 0) {
                conta++;
            }
        }
        if (conta == 0) {
            return null;
        }
        int volta[] = new int[conta];
        conta = 0;
        for (int i = 0; i < this.valores.length; i++) {
            if (tipo && this.valores[i] % 2 == 0) {
                volta[conta] = this.valores[i];
                conta++;
            }
            if (!tipo && this.valores[i] % 2 != 0) {
                volta[conta] = this.valores[i];
                conta++;
            }
        }
        return volta;
    }

}
