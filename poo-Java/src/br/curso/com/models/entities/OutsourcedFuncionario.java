package br.curso.com.models.entities;

public class OutsourcedFuncionario extends IntPooFuncionario {

    //atributte
    private double additionalCharge;

    //Construtor

    public OutsourcedFuncionario(double additionalCharge) {
        this.additionalCharge = additionalCharge;
    }
    public OutsourcedFuncionario(String name, int hours, double valuePerHour, double additionalCharge) {
        super(name, hours, valuePerHour);//reune a lógica do construtor da superclasse.
        this.additionalCharge = additionalCharge;
    }

    //Getter and Setter
    public double getAdditionalCharge() {
        return additionalCharge;
    }
    public void setAdditionalCharge(double additionalCharge) {
        this.additionalCharge = additionalCharge;
    }

     public double payment(){
         return super.payment() + additionalCharge * 1.1;
     }
}
