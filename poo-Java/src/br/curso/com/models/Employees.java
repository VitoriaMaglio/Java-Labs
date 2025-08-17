package br.curso.com.models;

public class Employees {

    //Programa que le um N e depois os dados(id,nome,salario) de n funcionários. Fazer o aumento X pr cento no salario de um funcionario.
    //Para isso o prg deve ler id e valor X, se o id não existir abortar operação.Ao final mostrar a lista atualizada.

    //Atributtes

    private int id;
    private String nome;
    private double salario;

    public Employees(int id, String nome,double salario){
        this.id=id;
        this.nome=nome;
        this.salario=salario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void increaseSalary(double percentage) {
        salario += salario * percentage / 100.0;
    }
}
