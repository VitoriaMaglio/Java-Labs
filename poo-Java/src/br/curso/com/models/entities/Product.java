package br.curso.com.models.entities;

public class Product {

    //Atributtes
    private String name;
    public double price;
    public int quantity;

    //Methods
    //+TotalValueInStock():double
    public double totalValueInStock(){
        return price*quantity;
    }
    public void addProducts(int quantity){
        this.quantity += quantity;//pega o atributo da classe e adiciona uma quantidade
    }

    public void removeProducts(int quantity){
        this.quantity -=quantity;
    }

    public String toString(){
        return name+price+quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;//faz com q o atributo receba o valor
    }
}
