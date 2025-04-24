package br.com.fiap.models;

public class Funcionario {
    private String nome;
    private double salario;

    public double calcularBonificacao() {
       double novo = (salario * 0.3);
       return novo;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
