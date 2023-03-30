/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.todasaslistas;

/**
 *
 * @author 2084007
 */
public class NoPessoa {

    private Pessoa dado;
    private NoPessoa prox;

    public NoPessoa getProx() {
        return this.prox;
    }

    public void setProx(NoPessoa prox) {
        this.prox = prox;
    }

    public Pessoa getDado() {
        return this.dado;
    }
//Construtor da classe No

    public NoPessoa(Pessoa dadonovo) {
        dado = dadonovo;
        prox = null;
    }

    public NoPessoa(Pessoa dadonovo, NoPessoa ligacao) {
        dado = dadonovo;
        prox = ligacao;
    }
}
