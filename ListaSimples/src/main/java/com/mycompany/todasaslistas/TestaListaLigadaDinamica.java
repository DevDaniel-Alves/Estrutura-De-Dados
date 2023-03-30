/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.todasaslistas;

/**
 *
 * @author 2084007
 */
public class TestaListaLigadaDinamica {

    public static void main(String[] args) {
        ListaLigadaDinamica lista = new ListaLigadaDinamica();
        lista.InsereNaFrente("no1");
        lista.InsereNaFrente("no2");
        lista.InsereNoFundo("no3");
        System.out.print(lista.EscreveLista());
        lista.RemoveDaFrente();
        lista.RemoveDoFundo();
        System.out.print(lista.EscreveLista());
    }

}
