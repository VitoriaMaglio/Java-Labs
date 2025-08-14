package br.com.fiap.models;

import java.util.ArrayList;
import java.util.List;

public class Modalidade {
    //atributes
    private String nome;
    private Instrutor instrutor;//atributo do tipo Instrutor
    private List<Aluno> listaAlunos = new ArrayList<>(); // lista de alunos por modalidade

    //getters and setters

    public Instrutor getInstrutor() {return instrutor;}
    public String getNome() {return nome;}

    //methods

    public Modalidade(String nome, Instrutor instrutor){
        this.nome = nome;
        this.instrutor = instrutor;
    }
    public void adicionarAluno(Aluno aluno){
        listaAlunos.add(aluno);//adicionando aluno nalista

    }
    public void listarAlunos(){
        if(listaAlunos.isEmpty()){//verifica se a lista está vazia
            System.out.println("Nenhum aluno matriculado nesta modalidade.");
        }else{
            System.out.println("Alunos matriculados em " + nome + ":");
            for (Aluno aluno : listaAlunos){
                System.out.println(" - "+ aluno);
            }
        }
    }
    public int getQuantidadeAlunos(){
        return listaAlunos.size();//retorna tamanho de uma lista
    }
    public String toString(){
        return nome + " - Instrutor: " + instrutor.getNome() + "(Alunos matriculados: " + getQuantidadeAlunos() + ")";
    }

}
