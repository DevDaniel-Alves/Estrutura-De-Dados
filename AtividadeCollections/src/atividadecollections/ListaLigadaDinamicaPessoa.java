package atividadecollections;

import java.util.ArrayList;

public class ListaLigadaDinamicaPessoa {
    private ArrayList<Pessoa> listaPessoas;
    private String nomeDaLista;

    //Construtor da classe Lista
    public ListaLigadaDinamicaPessoa(String nome) {
        nomeDaLista = nome;
        listaPessoas = new ArrayList<>();
    }

    public ListaLigadaDinamicaPessoa() {
        nomeDaLista = "Lista Teste";
        listaPessoas = new ArrayList<>();
    }

    private void InsereNaFrente(Pessoa item) {
        if (Vazia()) {
            listaPessoas.add(item);
        } else {
            listaPessoas.add(0, item);
        }
    }

    private void InsereNoFundo(Pessoa item) {
        listaPessoas.add(item);
    }

    public void InsereOrdenado(Pessoa item) {
        if (Vazia()) {
            listaPessoas.add(item);
        } else {
            if (checaMenor(item, listaPessoas.get(0))) {
                InsereNaFrente(item);
            } else {
                if (checaMenor(listaPessoas.get(listaPessoas.size() - 1), item)) {
                    InsereNoFundo(item);
                } else {
                    int index = 0;
                    while (checaMenor(listaPessoas.get(index + 1), item)) {
                        index++;
                    }
                    listaPessoas.add(index + 1, item);
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
        return listaPessoas.isEmpty();
    }

    public String EscreveLista() {
        String temp = "";
        if (Vazia()) {
            temp += "Vazia " + nomeDaLista;
            return temp;
        }
        temp += "A " + nomeDaLista + " contem \n\n";
        for (Pessoa pessoa : listaPessoas) {
            temp += pessoa.toString() + "\n\n";
        }
        temp += "\n";
        return temp;
    }

    public double mediaIdade() {
        double media = 0;
        int conta = listaPessoas.size();
        for (Pessoa pessoa : listaPessoas) {
            media += pessoa.getIdade();
        }
        return media / conta;
    }

    public double mediaPeso() {
        double media = 0;
        int conta = listaPessoas.size();
        for (Pessoa pessoa : listaPessoas) {
            media += pessoa.getPeso();
        }
        return media / conta;
    }

    public double mediaAltura() {
        double media = 0;
        int conta = listaPessoas.size();
        for (Pessoa pessoa : listaPessoas) {
            media += pessoa.getAltura();
        }
        return media / conta;
    }

    public Pessoa[] acimaDoPeso() {
        ArrayList<Pessoa> ret = new ArrayList<>();
        for (Pessoa pessoa : listaPessoas) {
            if (pessoa.calculaIMC() > 24.99) {
                ret.add(pessoa);
            }
        }
        return ret.toArray(new Pessoa[0]);
    }

    public Pessoa[] abaixoDoPeso() {
        ArrayList<Pessoa> ret = new ArrayList<>();
        for (Pessoa pessoa : listaPessoas) {
            if (pessoa.calculaIMC() < 18.5) {
                ret.add(pessoa);
            }
        }
        return ret.toArray(new Pessoa[0]);
    }

    public Pessoa[] pesoIdeal() {
        ArrayList<Pessoa> ret = new ArrayList<>();
        for (Pessoa pessoa : listaPessoas) {
            double imc = pessoa.calculaIMC();
            if (imc >= 18.5 && imc <= 24.99) {
                ret.add(pessoa);
            }
        }
        return ret.toArray(new Pessoa[0]);
    }

    public String exibePrim() {
        if (listaPessoas.isEmpty()) {
            return "Primeiro: null";
        } else {
            return "Primeiro: " + listaPessoas.get(0).toString();
        }
    }

    public String exibeUlt() {
        if (listaPessoas.isEmpty()) {
            return "Ultimo: null";
        } else {
            return "Ultimo: " + listaPessoas.get(listaPessoas.size() - 1).toString();
        }
    }

    public Pessoa RemoveDaFrente() {
        if (Vazia()) {
            return null;
        }
        Pessoa item = listaPessoas.get(0);
        listaPessoas.remove(0);
        return item;
    }

    public Pessoa RemoveDoFundo() {
        if (Vazia()) {
            return null;
        }
        Pessoa item = listaPessoas.get(listaPessoas.size() - 1);
        listaPessoas.remove(listaPessoas.size() - 1);
        return item;
    }
}
