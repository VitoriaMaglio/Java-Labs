package br.curso.com.models.entities;

import java.util.ArrayList;
import java.util.List;

public class IntPooFuncionario {
    //Exercício para treinar herança e polimorfismo
    //Para cada funcionario deseja registrar nome, horas trabalhadas e valor por hora.Tercerizados possuem uma despesa adicional
//Pagamento - valorHora * horas   Tercerizados com bônus de 110% da despesa adicional
//Ler dados de N funcionários  e armazenalos em uma lista. Depois mostrar nome e pagamento de cada funcionario
    //Var name,hours e valuePerHour e método payment.
    //OutsourcedEmployee que herda a classe Funcionários
    //Main o fluxo deve ser "Enter the number of employess:"
    //Outsorced?
    //Name, Hours,Value per hour
    //Payments dos funcionários cadastrados

    //Atributtes
    private String name;
    private int hours;
    private double valuePerHour;

    //Construtor

    public IntPooFuncionario() {
    }
    public IntPooFuncionario(String name, int hours, double valuePerHour) {
        this.name = name;
        this.hours = hours;
        this.valuePerHour = valuePerHour;
    }

    //Methods getters and setters

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public int getHours() {return hours;}
    public void setHours(int hours) {this.hours = hours;}
    public double getValuePerHour() {return valuePerHour;}
    public void setValuePerHour(double valuePerHour) {this.valuePerHour = valuePerHour;}

    //Methods
    public double payment(){
        return valuePerHour * hours;
    }










}