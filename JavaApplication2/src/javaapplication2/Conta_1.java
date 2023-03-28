/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2;

class Conta {
         
  int numero;
  String dono;
  double saldo;
  double limite;
  public Conta(int numero, String dono){
    this.dono = dono;
    this.numero = numero;
    saldo = 0;
    limite = 0;
  }
  public Conta(){
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

  @Override
  public String toString(){
    return ("Numero: " + this.numero + "\n Dono: " + this.dono + "\n Saldo: " + this.saldo + "\n Limite: " + + this.limite);
  }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
  
}
