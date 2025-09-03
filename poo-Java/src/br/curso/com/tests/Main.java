package br.curso.com.tests;

import br.curso.com.models.entities.Account;

import java.util.Locale;
import java.util.Scanner;
//Quando você precisar
public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Account account; //aqui declara um obj sem instancia-lo, para depois vc usar o nome dele e instanciar conforme a necessidade dos construuores.

        Locale.setDefault(Locale.US);
        System.out.println("Enter account number: ");
        int number=reader.nextInt();
        reader.nextLine();//consumindo quebra de linha
        System.out.println("Enter account holder: ");
        String name=reader.nextLine();
        System.out.println("Is there a initial deposit (y/n)?");
        String deposit = reader.nextLine();
        if (deposit.equalsIgnoreCase("y")) {
            System.out.print("Enter initial deposit value: ");
            double initialDeposit = reader.nextDouble();
            account = new Account(name, initialDeposit, number);
        } else {
            account = new Account(name, number);
        }
        System.out.println(account.toString());

        System.out.println("Enter a deposit value: ");
        double depositValue = reader.nextDouble();
        account.enterValue(depositValue);
        System.out.println("Updated account data:");
        System.out.println(account.toString());

        System.out.println("Enter a withdraw value: ");
        double withdraw = reader.nextDouble();
        account.withdrawValue(withdraw);
        System.out.println("Updated account data:");
        System.out.println(account.toString());

        reader.close();
    }
}
//Como eu tenho dois construtores que dependem do depósito inicial, preciso declara o obj simples, sem parâmetros, e dentro do escopo
//do if-else eu declaro com os parâmetros necessários
//Quando faço isso, não tem como usar os métodos do objeto fora, então é preciso criar variáveis momentâneas para ler o nome e o número da cota.