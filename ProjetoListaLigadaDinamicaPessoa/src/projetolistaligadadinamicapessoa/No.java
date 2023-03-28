package projetolistaligadadinamicapessoa;

/**
 *
 * @author 07556510140
 */
public class No {

    private Pessoa dado;
    private No prox; // aponta para um proximo no

    //Propriedades da classe
    public No getProx() {
        return this.prox;
    }

    public void setProx(No prox) {
        this.prox = prox;
    }

    public Pessoa getDado() {
        return this.dado;
    }
//Construtor da classe No

    public No(Pessoa dadonovo) {
        dado = dadonovo;
        prox = null;
    }

    public No(Pessoa dadonovo, No ligacao) {
        dado = dadonovo;
        prox = ligacao;
    }
}
