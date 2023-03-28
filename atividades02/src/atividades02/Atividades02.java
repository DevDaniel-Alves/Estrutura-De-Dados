/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividades02;

/**
 *
 * @author 07556510140
 */
public class Atividades02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Funcionarios f1 = new Funcionarios();
        f1.setNomes ("Danilo");
        f1.setSalarios(100);
        
        Funcionarios f2 = new Funcionarios();
        f2.setNomes("Danilo");
        f2.setSalarios(100);
        if(f1 == f2){
            System.out.println("Iguais");
        }else{
            System.out.println("Diferentes");
        }
    }
}
