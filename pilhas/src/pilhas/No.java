/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pilhas;

/**
 *
 * @author 07556510140
 */
public class No {

    private String dado;
    private No prox;

    public No getProx() {
        return this.prox;
    }

    public void setProx(No prox) {
        this.prox = prox;
    }

    public String getDado() {
        return this.dado;
    }
    

    public No(String dadonovo) {
        dado = dadonovo;
        prox = null;
    }

    public No(String dadonovo, No ligacao) {
        dado = dadonovo;
        prox = ligacao;
    }
}
