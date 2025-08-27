package br.curso.com.models.services;

import br.curso.com.models.entities.CarRental;
import br.curso.com.models.entities.Invoice;

import java.time.Duration;

public class RentalServices {
    private double pricePerHour;
    private double getPricePerday;

    private TaxService taxServices;

    public RentalServices(double pricePerHour, double getPricePerday, BrazilTaxServices taxServices) {
        this.pricePerHour = pricePerHour;
        this.getPricePerday = getPricePerday;
        this.taxServices = taxServices;
    }

    public void processInvoice(CarRental carRental){
        double minutes = Duration.between(carRental.getStart(),carRental.getFinish()).toMinutes();
        double hours = minutes / 60.0;
        double basicPayment;
        if (hours <= 12.0){
            basicPayment = pricePerHour * Math.ceil(hours);
        }else{
            basicPayment = getPricePerday * Math.ceil(hours / 24.0);
        }
        double tax = taxServices.tax(basicPayment);
        carRental.setInvoice(new Invoice(basicPayment,tax));
    }
}
