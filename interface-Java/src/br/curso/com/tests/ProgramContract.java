package br.curso.com.tests;

import br.curso.com.models.entities.Contract;
import br.curso.com.models.entities.Installment;
import br.curso.com.models.services.ContractService;
import br.curso.com.models.services.OnlinePaymentService;
import br.curso.com.models.services.PaypalService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class ProgramContract {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);//define o ponto como separador de números
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");//padrão para ler a data
        Scanner sc = new Scanner(System.in);

        //Criando a fatura
        System.out.println("Entre os dados do contrato:");
        System.out.print("Numero: ");
        int number = sc.nextInt();
        System.out.print("Data (dd/MM/yyyy): ");
        LocalDate date = LocalDate.parse(sc.next(), fmt);//ler a data que o user vai digitar, criar um padrão
        System.out.print("Valor do contrato: ");
        double totalValue = sc.nextDouble();

        Contract obj = new Contract(number, date, totalValue);//instanciar a classe Contract depois de receber todos os seus atributos.

        System.out.print("Entre com o numero de parcelas: ");
        int n = sc.nextInt();

        ContractService contractService = new ContractService((OnlinePaymentService) new PaypalService());

        contractService.processContract(obj, n);

        System.out.println("Parcelas:");
        for (Installment installment : obj.getInstallments()) {
            System.out.println(installment);
        }

        sc.close();
    }
}
