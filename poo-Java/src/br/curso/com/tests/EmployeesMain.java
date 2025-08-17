package br.curso.com.tests;

import br.curso.com.models.Employees;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeesMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        List<Employees> list = new ArrayList<>();
        System.out.println("How many employees will be registered? ");
        n=sc.nextInt();

        for (int i = 0 ; i<n; i++){
            System.out.println("ID:");
            int id = sc.nextInt();//cria var locais para ler
            System.out.println("Name: ");
            sc.nextLine();
            String nome = sc.nextLine();

       System.out.println("Salary: ");
            double salario = sc.nextDouble();

            Employees emp = new Employees(id,nome,salario);

            list.add(new Employees(id, nome, salario));//adiciona na lista o que o user digitar
        }

        System.out.print("Enter the employee id that will have salary increase: ");
        int id = sc.nextInt();
        Employees emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);//Quando você precisa procurar um dado dentro da lista
        if (emp == null) {
            System.out.println("This id does not exist!");
        }
        else {
            System.out.print("Enter the percentage: ");
            double percentage = sc.nextDouble();
            emp.increaseSalary(percentage);
        }
        System.out.println();
        System.out.println("List of employees:");
        for (Employees obj : list) {
            System.out.println(obj);
        }

        sc.close();
    }

    public static boolean hasId(List<Employees> list, int id) {
        Employees emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return emp != null;
    }


    }

