package br.curso.com.models.entities;

public class IntPooContJuridica extends IntPooContribuintes {

    private int numFuncion;

    public IntPooContJuridica(String nome, double rendaAnual, int numFuncion) {
        super(nome, rendaAnual);
        this.numFuncion = numFuncion;
    }

    public int getNumFuncion() {
        return numFuncion;
    }

    public void setNumFuncion(int numFuncion) {
        this.numFuncion = numFuncion;
    }
    public double renda(){
        if (numFuncion > 10){
            return (super.getRendaAnual() * 0.14);
        } else {
            return (super.getRendaAnual() * 0.16);
        }
    }
}
