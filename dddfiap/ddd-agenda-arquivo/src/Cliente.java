import java.io.*;
import java.util.Scanner;

public class Cliente {

    //Atributtes
    private int cod;
    private String nome;
    private String celular;
    private String email;
    private String instagram;
    private Tipo tipo;
    private Endereco endereco;

    //Getters,Setters,Construtor

    public int getCod() {return cod;}

    public void setCod(int cod) {this.cod = cod;}

    public Endereco getEndereco() {return endereco;}

    public void setEndereco(Endereco endereco) {this.endereco = endereco;}


    public Tipo getTipo() {return tipo;}

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public String getInstagram() {
        return instagram;}

    public void setInstagram(String instagram) {
        this.instagram = instagram;}

    public String getEmail() {
        return email;}

    public void setEmail(String email) {
        this.email = email;}

    public String getCelular() {
        return celular;}

    public void setCelular(String celular) {
        this.celular = celular;}

    public String getNome() {
        return nome;}

    public void setNome(String nome) {
        this.nome = nome;}

    public Cliente(int cod, Endereco endereco, Tipo tipo, String instagram, String email, String nome, String celular) {
        this.cod = cod;
        this.endereco = endereco;
        this.tipo = tipo;
        this.instagram = instagram;
        this.email = email;
        this.nome = nome;
        this.celular = celular;
    }

    public String toString(){
        return cod+ " - "+ nome +"(" + tipo + ")";
    }

    //GERAR ARQUIVO PARA ESCREVER OS CLIENTES
    public static void escrita(String path) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(path));
        String linha;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escreva o nome de um cliente: ");
        linha=entrada.nextLine();
        writer.append(linha + "\n");
        writer.close();
    }

    //LER ARQUIVO
    public static void leitura(String path) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(path));
        String linha ="";
        while (true){
            if(linha != null){
                System.out.println(linha);
            }
            else{
                break;//forçar saida do laço infinito
            }
            linha = reader.readLine();//ler linha por linha nessa var linha
        }
    }
}
