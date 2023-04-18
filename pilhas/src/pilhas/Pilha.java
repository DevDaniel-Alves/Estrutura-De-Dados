/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pilhas;

/**
 *
 * @author 07556510140
 */
public class Pilha {

    private No base;
    private No topo;
    private String nomeDaPilha;

    public Pilha(String nome) {
        nomeDaPilha = nome;
        base = topo = null;
    }

    public Pilha() {
        nomeDaPilha = "Pilha Teste";
        base = topo = null;
    }

    public void Empilha(String item) {
        if (Vazia()) {
            base = topo = new No(item);
        } else {
            topo.setProx(new No(item));
            topo = topo.getProx();
        }
    }

    public String Desempilha() {
        if (Vazia()) {
            return null;
        }
        String item = topo.getDado();
        if (base == topo) {
            base = topo = null;
        } else {
            No atual = base;
            while (atual.getProx() != topo) {
                atual = atual.getProx();
            }
            topo = atual;
            atual.setProx(null);
        }
        return item;
    }

    public boolean Vazia() {

        return base == null;
    }
}
