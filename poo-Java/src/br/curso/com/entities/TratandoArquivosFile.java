package br.curso.com.entities;

public class TratandoArquivosFile {
    //Ler um caminho de um arquivo .csv contendo daos de itens vendidos, sendo que cada item possui um preço unitário e quantidade.
    //gerar um novo arquivo chamado summary.csv localizado em um sub pasta chamada out a partir da original com o nome e valor total do item

    private String name;
    private double price;
    private int quantity;

    public TratandoArquivosFile(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;}

    public void setName(String name) {
        this.name = name;}

    public double getPrice() {
        return price;}

    public void setPrice(double price) {
        this.price = price;}

    public int getQuantity() {
        return quantity;}

    public void setQuantity(int quantity) {
        this.quantity = quantity;}

    public double total(){
        return price * quantity;
    }
}
