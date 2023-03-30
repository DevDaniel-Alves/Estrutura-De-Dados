/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.todasaslistas;

/**
 *
 * @author laurentino
 */
public class ListaLigadaDinamica {

    private No primeiro;
    private No ultimo;
    private String nomeDaLista;

    //Construtor da classe Lista
    public ListaLigadaDinamica(String nome) {
        nomeDaLista = nome;
        primeiro = ultimo = null;
    }

    public ListaLigadaDinamica() {
        nomeDaLista = "Lista Teste";
        primeiro = ultimo = null;
    }

    public void InsereNaFrente(String item) {
        if (Vazia()) {
            primeiro = ultimo = new No(item);
        } else {
            primeiro = new No(item, primeiro);
        }
    }

    public void InsereNoFundo(String item) {
        if (Vazia()) {
            primeiro = ultimo = new No(item);
        } else {
            ultimo.setProx(new No(item));
            ultimo = ultimo.getProx();
        }
    }

    public boolean Vazia() {
        return primeiro == null;
    }

    public String EscreveLista() {
        String temp = "";
        if (Vazia()) {
            temp += "Vazia " + nomeDaLista;
            return temp;
        }//if vazia
        temp += "A " + nomeDaLista + " contem \n\n";
        No atual = primeiro;
        while (atual != null) {
            temp += atual.getDado() + ", ";
            atual = atual.getProx();
        }
        temp += "\n";
        return temp;
    }

    public String exibePrim() {
        if (primeiro == null) {
            return "Primeiro: null";
        } else {
            return "Primeiro: " + primeiro.getDado();
        }

    }

    public String exibeUlt() {
        if (ultimo == null) {
            return "Ultimo: null";
        } else {
            return "Ultimo: " + ultimo.getDado();
        }
    }

    public String[] vetMaior(int valor) {
        String temp = "";
        No atual = primeiro;

        int contador = 0;
        while (atual != null) {
            if (atual.getDado().length() >= valor) {
                contador++;
            }
            atual = atual.getProx();
        }
        String aux[] = new String[contador];
        
        for(int i = 0; i>contador; i++){
            aux[i] = atual.getDado();
        }
        return aux;
    }

    public String RemoveDaFrente() {
        if (Vazia()) {
            return null;
        }
        String item = primeiro.getDado();
        if (primeiro == ultimo) {
            primeiro = ultimo = null;
        } else {
            primeiro = primeiro.getProx();
        }
        return item;
    }

    public String RemoveDoFundo() {
        if (Vazia()) {
            return null;
        }
        String item = ultimo.getDado();
        if (primeiro == ultimo) {
            primeiro = ultimo = null;
        } else {
            No atual = primeiro;
            while (atual.getProx() != ultimo) {
                atual = atual.getProx();
            }
            ultimo = atual;
            atual.setProx(null);
        }
        return item;
    }

}
