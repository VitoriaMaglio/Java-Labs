package br.curso.com.models;

public class IntPooContFisica extends IntPooContribuintes {

    private double gastoSaude;

    public IntPooContFisica(String nome, double rendaAnual, double gastoSaude) {
        super(nome, rendaAnual);
        this.gastoSaude = gastoSaude;
    }

    public double getGastoSaude() {
        return gastoSaude;
    }

    public void setGastoSaude(double gastoSaude) {
        this.gastoSaude = gastoSaude;
    }

    public double renda() {
        if (super.getRendaAnual() < 20000.00 && gastoSaude == 0.0){
            return (super.getRendaAnual() * 0.25);
        } else {
            return (super.getRendaAnual() * 0.25) - (gastoSaude * 0.5);
        }
    }
}