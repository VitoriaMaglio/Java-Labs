package br.curso.com.models.entities;

import java.util.Scanner;

public class IntPooStudent {
    //Ler dados mostrar dados, dizer se está aprovado ou não, quantos pontos faltam para o aluno passar.
    //primeiro tri vale 30 e segundo e terceiro 35

    //Atributtes
    private String aluno;
    private double nota1;
    private double nota2;
    private double nota3;
    public IntPooStudent(String aluno, double nota1, double nota2, double nota3) {
        this.aluno = aluno;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public String getAluno() {return aluno;}
    public void setAluno(String aluno) {this.aluno = aluno;}
    public void setNota1(double nota1) {this.nota1 = nota1;}
    public double getNota2() {return nota2;}
    public void setNota2(double nota2) {this.nota2 = nota2;}
    public double getNota3() {return nota3;}
    public void setNota3(double nota3) {this.nota3 = nota3;}

    public double media(){
        double media = nota1 + nota2 + nota3;
        return media;
    }
    public double missisnPoint() {
        double missing = 60 - media();
        if (media() < 60) {
            System.out.println("Final grade: " + media());
            System.out.println("FAILED");
            System.out.println("Missing " + missing);
        } else {
            System.out.println("Final grade: " + media());
            System.out.println("PASS");
        }
        return 0.0;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Name: ");
        String aluno = sc.nextLine();
        System.out.println("Nota 1: ");
        double nota1 = sc.nextDouble();
        System.out.println("Nota 2: ");
        double nota2 = sc.nextDouble();
        System.out.println("Nota 3: ");
        double nota3 = sc.nextDouble();
        IntPooStudent student = new IntPooStudent(aluno,nota1,nota2,nota3);
        System.out.println(student.media());
        System.out.println(student.missisnPoint());
    }
}
