/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.todasaslistas;

/**
 *
 * @author laurentino
 */
public class TestaListaSimples {
    public static void main(String[] args) {
        //Instancie um objeto da classe Lista2 e teste todos os métodos criados.
        Lista2 lista = new Lista2();
        lista.insere(4);
        lista.insere(1);
        lista.insere(10);
        lista.insere(8);
        System.out.println(lista.toString());
        System.out.println("");
        System.out.println("Lista de números pares");
        int vet[] = lista.par_impar(true);
        if (vet != null){
            for (int i =0; i< vet.length; i++){
                System.out.println((i+1) +".o elemento: " + vet[i]);
            }
        } else {
            System.out.println("A lista não possui números pares!!!");
        }
        System.out.println("");
        System.out.println("Lista de números ímpares");
        vet = lista.par_impar(false);
        if (vet != null){
            for (int i =0; i< vet.length; i++){
                System.out.println((i+1) +".o elemento: " + vet[i]);
            }
        } else {
            System.out.println("A lista não possui números ímpares!!!");
        }
        
        System.out.println("\nMaior Elemento: " + lista.maior());    
        System.out.println("Menor Elemento: " + lista.menor());    
        System.out.println("Média dos Valores: " + lista.media());    
        System.out.println("Maior Elemento: " + lista._maior());    
        System.out.println("Menor Elemento: " + lista._menor());  
    }
    
}
