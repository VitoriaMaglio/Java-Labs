package br.com.fiap.models;

public class Gerente extends Funcionario{

    private double gratificacao(){
        return super.calcularBonificacao() + 1000;


    }


}
