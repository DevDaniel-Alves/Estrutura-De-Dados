/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividades01;

/**
 *
 * @author 07556510140
 */
public class Funcionarios {

    private String nomes;
    private String departamentos;
    private double salarios;
    private String dataEntradaBancos;
    private String RG;

    public Funcionarios(String nomes, String departamentos, double salarios, String dataEntradaBancos, String RG) {
        this.nomes = nomes;
        this.departamentos = departamentos;
        this.salarios = salarios;
        this.dataEntradaBancos = dataEntradaBancos;
        this.RG = RG;
    }

    public String getNomes() {
        return nomes;
    }

    public void setNomes(String nome) {
        this.nomes = nomes;
    }

    public String  getDepartamentos() {
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

    public void setDataEntradaBanco(String dataEntradaBanco) {
        this.dataEntradaBancos = dataEntradaBancos;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public void recebeAumentos(double aumentos) {
        salarios += aumentos;
    }

    public double calculaGanhoAnual() {
        return salarios * 12;
    }
}
