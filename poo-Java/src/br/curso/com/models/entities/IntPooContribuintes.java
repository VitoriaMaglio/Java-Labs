package br.curso.com.models.entities;

public class IntPooContribuintes {

    private String nome;
    private double rendaAnual;

    public IntPooContribuintes(String nome, double rendaAnual) {
        this.nome = nome;
        this.rendaAnual = rendaAnual;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getRendaAnual() {
        return rendaAnual;
    }

    public void setRendaAnual(double rendaAnual) {
        this.rendaAnual = rendaAnual;
    }
    public double renda(){
        return rendaAnual * 0.25 ;
    }


}
