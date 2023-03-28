/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista;

/**
 *
 * @author 07556510140
 */
public class Listas {

    private int[] valores;
    private int tamanho;

    public Listas(int tamanho) {
        if (tamanho <= 0) {
            tamanho = 5;

        }
        this.tamanho = tamanho;
        this.valores = new int[tamanho];
    }

    public int insere(int valor, int pos) {
        if (pos >= 0 && pos < this.tamanho) {
            valores[pos] = valor;
            return pos;
        }
        return -1;
    }
    
    public int Remove(int pos) {
        int valor;
        if (pos > 0 && pos < valores.length) {
            valor = valores[pos];
            valores[pos] = 0;
            return valor;
        } else {
            return -1;
        }

    }

    public int verificacao(int verif) {
        for (int i = 0; i < valores.length; i++) {
            if (verif == valores[i]) {
                return 1;
            }
        }
        return -1;
    }

    public String setListas() {
        String val = "";
        for (int i = 0; i < valores.length; i++) {
            val += valores[i];
        }
     return "a";
    }
}
