/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication2;

/**
 *
 * @author 07556510140
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Conta c2;
        c2 = new Conta(200, "Antonio de Souza");
        System.out.println(c2.toString());
        Conta c1 = new Conta(100, "Maria da Silva");
        Conta c3 = c1;
        System.out.println("C1 " + c1.toString());
        System.out.println("C3 " + c3.toString());
        c1.deposita(1000);
        System.out.println("C1 " + c1.toString());
        System.out.println("C3 " + c3.toString());
        Conta c4 = new Conta();
        System.out.println("C4 " + c4.toString());
        c4.setDono("Marilda de Oliveira");
        c4.setNumero(1000);
        c4.setNumero(5000);
        c4.setLimite(3000);
        System.out.println("C4 "+ c4.toString());
        
        
        //System.out.println("Criou a conta e depositou R$ 1000,00");
        //System.out.println(c1.toString());
        //c1.limite = 2000;
    }
}
