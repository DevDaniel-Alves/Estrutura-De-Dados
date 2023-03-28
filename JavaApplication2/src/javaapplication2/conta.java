/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2;

/**
 *
 * @author 07556510140
 */
public class conta {
      
  int numero;
  String dono;
  double saldo;
  double limite;
  public conta(int numero, String dono){
    this.dono = dono;
    this.numero = numero;
    saldo = 0;
    limite = 0;
  }
  public conta(){
    this.dono = "Sem Nome";
    this.numero = 0;
    saldo = 0;
    limite = 0;
  }

  public void deposita (double valor){
    if (valor > 0) {
      this.saldo += valor;
    }
  }

  public boolean saca (double valor){
    if (valor > (this.saldo + this.limite)){
      return false;
    }
    this.saldo -= valor;
    return true;
  }

  public String toString(){
    return ("Numero: " + this.numero + "\n Dono: " + this.dono + "\n Saldo: " + this.saldo + "\n Limite: " + + this.limite);
  }
 
}