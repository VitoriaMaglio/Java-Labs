package br.curso.com.tests;

import br.curso.com.models.IntPooContFisica;
import br.curso.com.models.IntPooContJuridica;
import br.curso.com.models.IntPooContribuintes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainContribuintes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<IntPooContribuintes> contribuintesList = new ArrayList<>();
        System.out.println("Digite a quantidade de contribuintes: ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0 ; i<n;i++){
            System.out.println("Digite o nome:");
            String nome = sc.nextLine();
            System.out.println("Digite sua renda anual: ");
            double rendaAnual = sc.nextDouble();
            sc.nextLine();
            System.out.println("Pessoa física ou jurídica? ");
            String resp = sc.nextLine();
            IntPooContribuintes contribuintes;
            if (resp.equalsIgnoreCase("Fisica")){
                System.out.println("Digite o gasto com saúde: ");
                double gastoSaude = sc.nextDouble();
                sc.nextLine();
                contribuintes = new IntPooContFisica(nome,rendaAnual,gastoSaude);
            }else{
                System.out.println("Digite o número de funcionários: ");
                int numFuncion = sc.nextInt();
                sc.nextLine();
                contribuintes = new IntPooContJuridica(nome,rendaAnual,numFuncion);
            }
            contribuintesList.add(contribuintes);
        }
        System.out.println("Taxes Paid: ");
        for (IntPooContribuintes salarios : contribuintesList){
            System.out.println(salarios.getNome() + String.format("%.2f",salarios.renda()));
        }

        sc.close();
    }}
