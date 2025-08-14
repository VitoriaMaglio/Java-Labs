package br.com.fiap.models;
//Uma academia de esportes quer criar um sistema para suas modalidades, instrutores e alunos
//além de possuir alunos. O sistema deve cadastrar,listar e buscar eles e deve ser possível matricular um aluno em uma modalidade
//e consultar a lista de alunos matriculados.

public class Aluno {
    //attributes
    private String nome;
    private int idade;
    private String matricula;

    //getters ans setters
    public String getNome() {return nome;}

    public String getMatricula() {return matricula;}


    //methods

    //+Aluno(nome: String, idade:int,matricula:String) ->CONSTRUTOR tem o mesmo nome da classe , primeiro o tipo depois o parâmetro
    public Aluno(String nome,int idade, String matricula){
        this.nome = nome;
        this.idade = idade;
        this.matricula = matricula;
    }
//sobrescrito
    public String toString(){
        return nome + "-" + idade + "-" + matricula;
    }



}
