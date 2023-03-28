/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividades03;

/**
 *
 * @author 07556510140
 */
public class Funcionarios {
    private String nomes;
    private String departamentos;
    private double salarios;
    private String dataEntradaBancos;
    private String RGs;
    private Boolean On = true;

    public Funcionarios (String nomes, String departamentos, double salarios, String dataEntradaBancos, String RGs) {
        this.nomes = nomes;
        this.departamentos = departamentos;
        this.salarios = salarios;
        this.dataEntradaBancos = dataEntradaBancos;
        this.RGs = RGs;
    }

    public String getNomes() {
        return nomes;
    }

    public void setNomes(String nomes) {
        this.nomes = nomes;
    }

    public String getDepartamentos() {
        return departamentos;
    }

    public void setDepartamentos(String departamentos) {
        this.departamentos = departamentos;
    }

    public double getSalarios() {
        return salarios;
    }

    public void setSalarios(double salarios) {
        this.salarios = salarios;
    }

    public String getDataEntradaBancos() {
        return dataEntradaBancos;
    }

    public void setDataEntradaBancos(String dataEntradaBancos) {
        this.dataEntradaBancos = dataEntradaBancos;
    }

    public String getRGs() {
        return RGs;
    }

    public void setRGs(String RGs) {
        this.RGs = RGs;
    }

    public void recebeAumentos(double aumentos) {
        salarios += aumentos;
    }

    public double calculaGanhoAnual() {
        return salarios * 12;
    }
    
    public void estaNaEmpresas(boolean On) {
        this.On = On;
    }
    
    public void demitidos() {
        System.out.println("Funcionário " + nomes + " foi demitido.");
    }
}
