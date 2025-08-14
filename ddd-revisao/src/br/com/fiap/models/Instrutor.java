package br.com.fiap.models;

public class Instrutor {
    //attributes
    private String nome;
    private String especialidade;
    private String registroProfissional;

    //getters and setters

    public String getNome() {return nome;}
//toString faz para formatar o objeto
    //methods
    public Instrutor(String nome, String registroProfisional, String especialidade){
        this.nome = nome;
        this.registroProfissional = registroProfisional;
        this.especialidade = especialidade;
    }

    public String toString(){
    return nome + "-" + especialidade + "(Registro: "+ registroProfissional + ")";
    }

}
