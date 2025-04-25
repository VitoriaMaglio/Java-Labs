package br.com.fiap.models;

import java.util.Scanner;

//SuperClasse, logo as outras classes vão herdar os atributos e métodos dela
//É uma classe abstrata pq não representa o objeto no mundo real.
public abstract class Despesa {

    private String descricao;
    private double valorTotal;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public void cadastrarDespesa(){
        valorTotal = 0;
        Scanner leitor = new Scanner(System.in);
        System.out.printf("Descreva a despesa: ");
        descricao = leitor.nextline();
    }

    public abstract void calcularDespesa();
    public abstract void listarDespesa();
    }




}
