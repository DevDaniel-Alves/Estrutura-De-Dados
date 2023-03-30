/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.todasaslistas;

/**
 *
 * @author 2084007
 */
public class TestaListaPessoa {
    public static void main(String[] args) {
        ListaLigadaDinamicaPessoa lista = new ListaLigadaDinamicaPessoa();
        lista.InsereOrdenado(new Pessoa("Andrea",25,56,1.62));
        lista.InsereOrdenado(new Pessoa("Sandra",18,63,1.67));
        lista.InsereOrdenado(new Pessoa("Patrícia",21,60,1.63));
        lista.InsereOrdenado(new Pessoa("Lorena",17,58,1.61));
        lista.InsereOrdenado(new Pessoa("Paula",28,54,1.60));
        lista.InsereOrdenado(new Pessoa("Silvana",27,56,1.64));
        System.out.println(lista.EscreveLista());
        
    }
    
}
