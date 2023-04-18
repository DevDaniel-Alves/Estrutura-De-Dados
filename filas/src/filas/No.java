package filas;

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
//Construtor da classe No

    public No(String dadonovo) {
        dado = dadonovo;
        prox = null;
    }

    public No(String dadonovo, No ligacao) {
        dado = dadonovo;
        prox = ligacao;
    }
}
