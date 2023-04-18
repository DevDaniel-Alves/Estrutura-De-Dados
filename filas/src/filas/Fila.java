package filas;

public class Fila {

    private No primeiro;
    private No ultimo;
    private String nomeDaFila;

    public Fila(String nome) {
        nomeDaFila = nome;

        primeiro = ultimo = null;
    }

    public Fila() {
        nomeDaFila = "Fila Teste";
        primeiro = ultimo = null;
    }

    public void Enfileira(String item) {
        if (Vazia()) {
            primeiro = ultimo = new No(item);
        } else {
            ultimo.setProx(new No(item));
            ultimo = ultimo.getProx();
        }
    }

    public String Desenfileira() {

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

    public boolean Vazia() {
        return primeiro == null;
    }
}
