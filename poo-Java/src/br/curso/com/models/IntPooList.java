package br.curso.com.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IntPooList {
    //Fazer um programa para ler um número inteiro N e depois od dados id,nome esalary de n funcionários.Não deve ter repetição de id
    //Efetuar aumento X no salario de um determinado funcionario para isso o programa deve ser um id e o valor.
    //Se o id não existir, mostrar uma mensagem e abortar operação; mostrar a lista dos funcionários.

    private int id;
    private String nome;
    private double salary;

    public IntPooList() {
    }

    public IntPooList(int id, String nome, double salary) {
        this.id = id;
        this.nome = nome;
        this.salary = salary;
    }

    public int getId() {return id;}
    public void setId(int id) {this.id = id;}
    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}
    public double getSalary() {return salary;}
    public void setSalary(double salary) {this.salary = salary;}

    public void increaseSalary(double percentage){
        salary += salary * percentage / 100.00;//this. usar quando tiver ambíguidade
    }
    public String toString(){
        return id + nome + salary;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many employees will be registered? ");
        int X = sc.nextInt();
        List<IntPooList> employees = new ArrayList<>();
        //instanciar employees e adicionar na lista
        for (int i = 0; i<X; i++){
            System.out.println("Employee " + (i+1));
            System.out.println("Id");
            int id = sc.nextInt();
            IntPooList idd = employees.stream().filter(x-> x.getId() == id).findFirst().orElse(null);
            if (idd != null) {
                System.out.println("This id already exist!");
            } else {
            sc.nextLine();
            System.out.println("Name: ");
            String nome = sc.nextLine();
            System.out.println("Salary: ");
            double salary = sc.nextDouble();
            IntPooList emp = new IntPooList(id,nome,salary);
            employees.add(emp);
        }}
        System.out.println("Enter the employee id that will have salary increase:");
        int idsalary = sc.nextInt();
        IntPooList emp = employees.stream()//transforma a lista em um fluxo de dados
                .filter(e-> e.getId() == idsalary)//faz o filtro
                .findFirst()// pega o primeiro que encontrar
                .orElse(null);// se não achar, retorna null
        if (emp == null) {
            System.out.println("This id does not exist!");
        } else {
            System.out.println("Enter the percentage:");
            double percentage = sc.nextDouble();
            emp.increaseSalary(percentage);
        }
        System.out.println("List of employees:");
        for (IntPooList e : employees) System.out.println(emp);
    }




}
