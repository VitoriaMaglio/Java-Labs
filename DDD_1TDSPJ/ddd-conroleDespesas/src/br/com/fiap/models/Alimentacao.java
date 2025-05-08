package br.com.fiap.models;

import java.util.Scanner;

public class Alimentacao extends Despesa{
    private String nomeRestaurante;
    private int quantidadeRefeicao;


    @Override
    public void cadastrarDespesa() {
        super.cadastrarDespesa();
        //setValorTotal() = 0.0;
        Scanner leitor = new Scanner(System.in);

        System.out.println("Nome do restaurante: ");
        nomeRestaurante = leitor.nextLine();
        System.out.println("Quantidade de refeições: ");
        quantidadeRefeicao = leitor.nextInt();
    }

    public void calcularDespesa(){
        Scanner leitor = new Scanner(System.in);
        double valorTotal = quantidadeRefeicao * 18;

        System.out.println("O valor total: ");
        valorTotal = leitor.nextDouble();

    }

    public void listarDespesa(){
        this


    }
}
