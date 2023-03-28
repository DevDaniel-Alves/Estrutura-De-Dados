/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listasencadeadas;

/**
 *
 * @author 07556510140
 */
class No {

    private Pessoa nomePessoa;
    private No prox;
//Propriedades da classe

    public No getProx() {
        return this.prox;
    }

    public void setProx(No prox) {
        this.prox = prox;
    }

    public Pessoa getDado() {
        return this.nomePessoa;
    }

    public No(Pessoa dadonovo) {
        nomePessoa = dadonovo;
        prox = null;
    }

    public No(Pessoa dadonovo, No ligacao) {
        nomePessoa = dadonovo;
        prox = ligacao;
    }
}
