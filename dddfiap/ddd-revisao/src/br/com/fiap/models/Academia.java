package br.com.fiap.models;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Academia {
    //attributes
    Scanner scanner = new Scanner(System.in);
    private List<Aluno> alunos = new ArrayList<>();
    private List<Instrutor> instrutores = new ArrayList<>();
    private List<Modalidade> modalidades = new ArrayList<>();

    //getters and setters
    public List<Aluno> getAlunos() {
        return alunos;
    }

    public List<Instrutor> getInstrutores() {
        return instrutores;
    }

    public List<Modalidade> getModalidades() {
        return modalidades;
    }


    //methods
    public void cadastrarAluno(Aluno aluno){
        alunos.add(aluno);

    };
    public void cadastrarInstrutor(Instrutor instrutor){
        instrutores.add(instrutor);
    };
    public void cadastrarModalidade(Modalidade modalidade){
        modalidades.add(modalidade);
    };
    public Aluno buscarAlunoPorMatricula(String matricula) {
        return alunos.stream()
                .filter(aluno -> aluno.getMatricula().equalsIgnoreCase(matricula))
                .findFirst()
                .orElse(null);
        //ou
        //for (Aluno aluno : alunos) {
           // if (aluno.getMatricula().equalsIgnoreCase(matricula)){
            //    return aluno;
            //}
        //}
        //return null;
    }
    public Modalidade buscarModalidadePorNome(String matricula){
        return modalidades.stream()
                .filter(modalidade -> modalidade.getNome().equalsIgnoreCase(nome))
                .findFirst()
                .orElse(null);
    }
    public void listarModalidades(){
        if (modalidades.isEmpty()) {
        System.out.println("Nenhuma modalidade cadastrada.");
    } else {
        modalidades.stream()
                .forEach(System.out::println);
    }
    }

    public void listarInstrutores(){
        if (instrutores.isEmpty()) {
            System.out.println("Nenhum instrutor cadastrado.");
        } else {
            instrutores.stream()
                    .forEach(System.out::println);
        }
    };
    public void listarAlunos(){if (alunos.isEmpty()) {
        System.out.println("Nenhum aluno cadastrado.");
    } else {
        alunos.stream()
                .forEach(System.out::println);
    }

    };//for
    public void relatorioModalidadeComMaisAlunos(){ if (modalidades.isEmpty()) {
        System.out.println("Não há modalidades cadastradas.");
        return;
    }

        modalidades.stream()
                .max(Comparator.comparingInt(Modalidade::getQuantidadeAlunos))
                .ifPresent(modalidade ->
                        System.out.println("Modalidade com mais alunos: "
                                + modalidade.getNome() + " ("
                                + modalidade.getQuantidadeAlunos() + " alunos)")
                );
    }

    }

