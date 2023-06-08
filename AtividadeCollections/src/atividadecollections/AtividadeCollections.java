package atividadecollections;

public class AtividadeCollections {

    public static void main(String[] args) {
        ListaLigadaDinamicaPessoa lista = new ListaLigadaDinamicaPessoa("Lista Teste");

        // Criando algumas pessoas para teste
        Pessoa pessoa1 = new Pessoa("Joao", 25, 70, 1.75);
        Pessoa pessoa2 = new Pessoa("Maria", 30, 65, 1.60);
        Pessoa pessoa3 = new Pessoa("Pedro", 20, 80, 1.80);

        // Inserindo pessoas na lista
        lista.InsereOrdenado(pessoa1);
        lista.InsereOrdenado(pessoa2);
        lista.InsereOrdenado(pessoa3);

        // Testando os métodos atualizados
        System.out.println("Lista vazia? " + lista.Vazia());
        System.out.println(lista.EscreveLista());
        System.out.println("Media de idade: " + lista.mediaIdade());
        System.out.println("Media de peso: " + lista.mediaPeso());
        System.out.println("Media de altura: " + lista.mediaAltura());
        System.out.println("Pessoas acima do peso:");
        Pessoa[] acimaDoPeso = lista.acimaDoPeso();
        for (Pessoa pessoa : acimaDoPeso) {
            System.out.println(pessoa.toString());
        }
        System.out.println("Pessoas abaixo do peso:");
        Pessoa[] abaixoDoPeso = lista.abaixoDoPeso();
        for (Pessoa pessoa : abaixoDoPeso) {
            System.out.println(pessoa.toString());
        }
        System.out.println("Pessoas com peso ideal:");
        Pessoa[] pesoIdeal = lista.pesoIdeal();
        for (Pessoa pessoa : pesoIdeal) {
            System.out.println(pessoa.toString());
        }
        System.out.println(lista.exibePrim());
        System.out.println(lista.exibeUlt());

        // Removendo pessoas da frente e do fundo da lista
        Pessoa pessoaRemovida1 = lista.RemoveDaFrente();
        Pessoa pessoaRemovida2 = lista.RemoveDoFundo();

        System.out.println("Pessoa removida da frente: " + pessoaRemovida1.toString());
        System.out.println("Pessoa removida do fundo: " + pessoaRemovida2.toString());

        System.out.println(lista.EscreveLista());
    }
}
    
