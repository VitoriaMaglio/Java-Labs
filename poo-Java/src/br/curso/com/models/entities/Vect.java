package br.curso.com.models.entities;

import java.util.List;
import java.util.Scanner;

public class Vect {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Programa que leia um num n e depois N num inteiros e armazene-os em vetor.Depois mostre todos os negativos lidos.

        System.out.println("Digite um num inteiro: ");
        int n = sc.nextInt();
        int[] vect = new int[n];
        for (int i = 0; i < vect.length; i++) {
            System.out.println("Digite um num inteiro: ");
            vect[i] = sc.nextInt();
        }
        //imprimir dados específicos de um vetor conforme uma condição : primeiro você percorre o vetor e cria um if para a condiçõ e imprime o vect dntro da condição
        System.out.println("Numeros negativos: ");
        for (int i = 0; i < n; i++) {
            if (vect[i] < 0)
                System.out.println(vect[i]);
        }

        //Programa que le nome,idade e altura de N pessoas.Printar a altura média das pessoas e mostrar a porcentagem de pessoas com menos de 16 anods, bem como os nomes dessas pessaos.
        //criar um vetor para cada informação, pois não tem como guardar todas as informações em um só pois são de tipos diferentes.
        //sempre que usar vetor dentro do for é preciso indicar a posição [i] da var inicializadora
        System.out.println("Digite a quantidade de pessoas a serem cadastradas: ");
        int N = sc.nextInt();

        String[] nomes = new String[N]; // armazena o nome
        int[] idades = new int[]{sc.nextInt()}; //armazena a idade
        double[] alturas = new double[N]; //armazena a altura

        for (int i = 0; i < N; i++) {
            System.out.println("Nome : ");
            nomes[i] = sc.nextLine();
            sc.nextLine();
            System.out.println("Idade : ");
            idades[i] = sc.nextInt();
            System.out.println("Altura : ");
            alturas[i] = sc.nextDouble();
        }
        double sum = 0;
        for (int i = 0; i < N; i++) {
            sum += alturas[i];
        }
        double media = sum / N;
        System.out.println(media);

        int cont = 0;
        for (int i = 0; i < N; i++) {
            if (idades[i] < 16)
                cont += 1;
        }
        double percent = cont * 100.0 / N;
        System.out.println(percent);
        for (int i = 0; i < N; i++) {
            if (idades[i] < 16) {
                System.out.println(nomes[i]);
            }
        }

        //Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida, mostre na
        //tela todos os números pares, e também a quantidade de números pares.

        System.out.println("Enter the quantity of numbers you want to digit: ");
        int q = sc.nextInt();

        int[] vetc = new int[q];

        for (int i = 0; i<q ; i++){
            System.out.println("Enter the number:");
            vetc[i]=sc.nextInt();
        }
        int som=0;
        for (int i = 0; i <q;i++){
            if (vetc[i] % 2 == 0){
                System.out.println(vetc[i]);
                som++;
            }else{
                System.out.println(vect[i] + "Número ímpar");
            }
            System.out.println("Quantidade de pares"+som);
        }



        }

    }

