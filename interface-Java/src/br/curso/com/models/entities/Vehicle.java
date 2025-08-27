package br.curso.com.models.entities;
//Valor por hora de até 12 horas. Se passar de 12hrs o valor é cobrado por dia.
//Além do valor da locação é acrescido no preço do imposto 20% para valores de até 100.00 ou 15% para valores acima de 100.00
//Lê os dados da locação bem como valor por hora e valor diário.Gerar a nota de pagamento informando os dados na tela.
//veículo-aluguel-fatura
public class Vehicle {

    private String model;

    public Vehicle() {
    }

    public Vehicle(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
