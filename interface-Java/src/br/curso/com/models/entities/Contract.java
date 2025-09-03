package br.curso.com.models.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contract {

    private int number;
    private Date date;
    private double totalValue;
//um contrato tem várias parcelas -> relacionamento um para muitos.
    private List<Installment> installments = new ArrayList<>();


    public Contract(int number, LocalDate date, double totalValue) {
    }

    public Contract(int number, Date date, double totalValue) {
        this.number = number;
        this.date = date;
        this.totalValue = totalValue;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(double totalValue) {
        this.totalValue = totalValue;
    }

    public List<Installment> getInstallments() {
        return installments;
    }

    //Vc não dá set em lista, pois isso permite trocar a lista inteira sobrescrevendo-a, vc não quer atribuir um valor a um valor já estabelecido na lista.
    //Só usa get para manipular com add,remove...

    //public void setInstallments(List<Installment> installments) {
    //    this.installments = installments;
    //}
}
