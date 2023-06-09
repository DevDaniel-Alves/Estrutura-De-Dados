/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetolistaligadadinamicapessoa;

/**
 *
 * @author 07556510140
 */
public class ListaLigadaDinamicaPessoa {

    private No primeiro;
    private No ultimo;
    private String nomeDaLista;

    //Construtor da classe Lista
    public ListaLigadaDinamicaPessoa(String nome) {
        nomeDaLista = nome;
        primeiro = ultimo = null;
    }

    public ListaLigadaDinamicaPessoa() {
        nomeDaLista = "Lista Teste";
        primeiro = ultimo = null;
    }

    private void InsereNaFrente(Pessoa item) {
        if (Vazia()) {
            primeiro = ultimo = new No(item);
        } else {
            primeiro = new No(item, primeiro);
        }
    }

    private void InsereNoFundo(Pessoa item) {
        if (Vazia()) {
            primeiro = ultimo = new No(item);
        } else {
            ultimo.setProx(new No(item));
            ultimo = ultimo.getProx();
        }
    }

    public void InsereOrdenado(Pessoa item) {
        if (Vazia()) {
            primeiro = ultimo = new No(item);
        } else {
            if (checaMenor(item, primeiro.getDado())) {
                InsereNaFrente(item);
            } else {
                if (checaMenor(ultimo.getDado(), item)) {
                    InsereNoFundo(item);
                } else {
                    No atual = primeiro;
                    while (checaMenor(atual.getProx().getDado(), item)) {
                        atual = atual.getProx();
                    }
                    atual.setProx(new No(item, atual.getProx()));
                }
            }
        }
    }

    private boolean checaMenor(Pessoa p1, Pessoa p2) {
        if (p1.getIdade() < p2.getIdade()) {
            return true;
        } else {
            if (p1.getIdade() == p2.getIdade()) {
                if (p1.getAltura() < p2.getAltura()) {
                    return true;
                } else {
                    if (p1.getAltura() == p2.getAltura() && p1.getPeso() < p2.getPeso()) {
                        return true;
                    }
                }
            }
        }
        return false;
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
            temp += atual.getDado().toString() + "\n\n";
            atual = atual.getProx();
        }
        temp += "\n";
        return temp;
    }

    public double mediaIdade() {
        double media = 0;
        int conta = 0;
        No atual = primeiro;
        while (atual != null) {
            media += atual.getDado().getIdade();
            conta++;
        }
        return media / conta;
    }

    public double mediaPeso() {
        double media = 0;
        int conta = 0;
        No atual = primeiro;
        while (atual != null) {
            media += atual.getDado().getPeso();
            conta++;
        }
        return media / conta;
    }

    public double mediaAltura() {
        double media = 0;
        int conta = 0;
        No atual = primeiro;
        while (atual != null) {
            media += atual.getDado().getAltura();
            conta++;
        }
        return media / conta;
    }

    private Pessoa[] aumentaVetor(Pessoa vet[], Pessoa item) {
        Pessoa aux[] = new Pessoa[vet.length + 1];
        for (int i = 0; i < vet.length; i++) {
            aux[i] = vet[i];
        }
        aux[vet.length] = item;
        return aux;
    }

    public Pessoa[] acimaDoPeso() {
        Pessoa[] ret = new Pessoa[0];
        No atual = primeiro;
        while (atual != null) {
            if (atual.getDado().calculaIMC() > 24.99) {
                ret = aumentaVetor(ret, atual.getDado());
            }
        }
        return ret;
    }

    public Pessoa[] abaixoDoPeso() {
        Pessoa[] ret = new Pessoa[0];
        No atual = primeiro;
        while (atual != null) {
            if (atual.getDado().calculaIMC() < 18.5) {
                ret = aumentaVetor(ret, atual.getDado());
            }
        }
        return ret;
    }

    public Pessoa[] pesoIdeal() {
        Pessoa[] ret = new Pessoa[0];
        No atual = primeiro;
        while (atual != null) {
            if (atual.getDado().calculaIMC() >= 18.5 && atual.getDado().calculaIMC() <= 24.99) {
                ret = aumentaVetor(ret, atual.getDado());
            }
        }
        return ret;
    }

    public String exibePrim() {
        if (primeiro == null) {
            return "Primeiro: null";
        } else {
            return "Primeiro: " + primeiro.toString();
        }

    }

    public String exibeUlt() {
        if (ultimo == null) {
            return "Ultimo: null";
        } else {
            return "Ultimo: " + ultimo.toString();
        }
    }

    public Pessoa RemoveDaFrente() {
        //Verifica se está vazia, s e sim, não faz nada e retorna nulo.
        if (Vazia()) {
            return null;
        }
        Pessoa item = primeiro.getDado();

        if (primeiro == ultimo) {
            primeiro = ultimo = null;
        } else {
            primeiro = primeiro.getProx();
        }
        return item;
    }

    public Pessoa RemoveDoFundo() {
        if (Vazia()) {
            return null;
        }
        Pessoa item = ultimo.getDado();
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
