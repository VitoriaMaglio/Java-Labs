package br.curso.com.tests;

import br.curso.com.models.entities.CarRental;
import br.curso.com.models.entities.Vehicle;


import br.curso.com.models.services.BrazilTaxServices;
import br.curso.com.models.services.RentalServices;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");//não instanciar
        System.out.println("Entre com os dados do carro");
        System.out.println("MOdelo: ");
        String carModel=sc.nextLine();
        System.out.println("Retirada");
        LocalDateTime start = LocalDateTime.parse(sc.nextLine(),fmt);
        System.out.println("Retorno");
        LocalDateTime finish = LocalDateTime.parse(sc.nextLine(),fmt);
        CarRental cr = new CarRental(start,finish,new Vehicle(carModel));

        BrazilTaxServices taxService = new BrazilTaxServices();
        //System.out.println(taxServices.tax(50.0));
        System.out.println("Entre preço hora");
        double pricePerhour = sc.nextDouble();
        System.out.println("Entre preço day");
        double pricePerday = sc.nextDouble();

        RentalServices rentalServices = new RentalServices(pricePerhour,pricePerday, new BrazilTaxServices());
        rentalServices.processInvoice(cr);

        System.out.println("FATURA");
        System.out.println("Pagamento básico");
        System.out.println(cr.getInvoice().getBasicPayment());
        System.out.println(cr.getInvoice().getTax());
        System.out.println(cr.getInvoice().getTotalPayment());

    }
}
