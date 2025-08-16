package br.curso.com.models;

public class Account {

    //Atributtes
    private String name;
    private int number;
    private double valueTotal;

    //Constructor
    public Account(String name, int number) {
        this.name = name;
        this.number = number;
    }
    public Account(String name, double initialDeposit, int number) {
        this.number = number;
        this.name = name;
        enterValue(initialDeposit);//se a regra de depósito mudar, o construtor vai mudar tbm, assim vc precisa usar só o  método

    }

    //Getters and Setters
    public double getValueTotal() {return valueTotal;}
    public void setValueTotal(double valueTotal) {this.valueTotal = valueTotal;}
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public int getNumber() {return number;}
    public void setNumber(int number) {this.number = number;}
    //quando algo não pode ser alterado, não usar set.

    //Methods
    public String toString(){
        return "Account "+number +","+ " Holder: "+name+ ", " + " Balance: $"+ String.format("%.2f", valueTotal);
    }
    public void enterValue(double amount){
        this.valueTotal += amount;//fazendo depósito: pega o valortotal e add ele mesmo e o depósito
    }
    public void withdrawValue(double amount){
        valueTotal -= amount + 5.0;//aqui vc ta abatendo do saldo uma quant
    }

}
