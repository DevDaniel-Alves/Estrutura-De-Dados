/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projetolistaligadadinamicapessoa;

/**
 *
 * @author 07556510140
 */
public class ProjetoListaLigadaDinamicaPessoa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Marcos", 35, 80, 1.85);
        Pessoa p2 = new Pessoa("Gabriel", 25, 72, 1.82);
        Pessoa p3 = new Pessoa("Gabriel Prates", 15, 60,1.60);
        ListaLigadaDinamicaPessoa lista = new ListaLigadaDinamicaPessoa("Minha Lista");
        System.out.println(lista.EscreveLista());
        lista.InsereOrdenado(p1);
        lista.InsereOrdenado(p2);
        lista.InsereOrdenado(p3);
        lista.InsereOrdenado(new Pessoa("Daniel", 20, 74, 1.74));
        System.out.println(lista.EscreveLista());
        
    }
    
}
