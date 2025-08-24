package br.curso.com.models;

import java.util.Scanner;

public class IntPooEmployee {
    //Ler dados, mostrar. Aumentar salário do funcionário com base em uma porcetagem dada e mostrar os dados.
    //Atributtes
    private String name;
    private double grossSalary;
    private double tax;

    public IntPooEmployee(String name, double grossSalary, double tax) {
        this.name = name;
        this.grossSalary = grossSalary;
        this.tax = tax;
    }

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public double getTax() {return tax;}
    public void setTax(double tax) {this.tax = tax;}
    public double getGrossSalary() {return grossSalary;}
    public void setGrossSalary(double grossSalary) {this.grossSalary = grossSalary;}

    //Methods
    public String toString(){
        return "Employee: " + getName() + " $ " + netSalary();
    }
    public double netSalary(){
        return grossSalary - tax;
    }
    public void increaseSalary(double percentage) {
        grossSalary += grossSalary * percentage / 100.0;
        //somente o salário bruto tem que mudar ent vc pega o salário bruto e faz ele receber ele mesmo mais ele multiplicado pela porcentagem do aumento dele
        //a porcentagem tem que ser divida por 100.0
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Name: ");
        String name = sc.nextLine();
        System.out.println("Gross salary: ");
        double grossSalary = sc.nextDouble();
        System.out.println("Tax: ");
        double tax = sc.nextDouble();
        IntPooEmployee employee = new IntPooEmployee(name,grossSalary,tax);
        System.out.println(employee.toString());
        System.out.println("Which percentage to increase salary? ");
        double increase = sc.nextDouble();
        employee.increaseSalary(increase);
        System.out.println("Updated data: " + employee);
        //Quando você concatena um objeto (employee) com uma String, o Java automaticamente chama o método toString() da classe para transformar o objeto em texto.
    }
}
