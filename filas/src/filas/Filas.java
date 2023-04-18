package filas;

public class Filas {

    public static void main(String[] args) {
        Fila f1 = new Fila();
        f1.Enfileira("el01 ");
        f1.Enfileira("el02 ");
        f1.Enfileira("el03 ");
        f1.Enfileira("el04 ");
        Fila f2 = new Fila();
        f2.Enfileira("a10");
        f2.Enfileira("a11");
        f2.Enfileira("a12");
        f2.Enfileira("a13");
        System.out.print(f1.Desenfileira());
        System.out.println(f2.Desenfileira());
    }

}
