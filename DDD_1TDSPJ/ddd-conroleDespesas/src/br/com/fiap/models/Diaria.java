package br.com.fiap.models;

import java.util.Scanner;

public class Diaria extends Despesa{
    private double qtdeDiaria;

    @Override
    public void cadastrarDespesa() {
        super.cadastrarDespesa();
        Scanner leior = new Scanner(System.in);
        System.out.println("Quantidade de diárias: ");
        qtdeDiaria = leior.nextInt();
    }

    @Override
    public void calcularDespesa() {
       setValorTotal(qtdeDiaria *50);


    }

    @Override
    public void listarDespesa() {
        System.out.printf("Relatório de despesa: ");
        System.out.printf("\n ======================");
        System.out.printf("\nDescrição: " + getDescricao());
        System.out.println("\nQuantidade de diarias: " + qtdeDiaria);
        System.out.println("");

    }



}
