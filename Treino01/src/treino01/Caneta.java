/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package treino01;

public class Caneta {

    String modelo;
    String cor;
    double ponta;

    public void Status() {
        System.out.println("Modelo: " + this.modelo );
        System.out.println("Cor: " + this.cor);
        System.out.println("Ponta: " + this.ponta);
    }
    public Caneta(String m, String c, double p){
        this.modelo = m;
        this.cor = c;
        this.ponta = p;
    }

}
