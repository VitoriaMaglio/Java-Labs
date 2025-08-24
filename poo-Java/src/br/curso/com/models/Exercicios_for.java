package br.curso.com.models;

import java.util.Scanner;

public class Exercicios_for {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //leia N int que é a quant de valores inteiros q serão lidos em seguida;Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando
        //essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo).
//CONSEGUI
        int N;//armazena a quantidade de num a ser digitado
        int somaa = 0;
        int somaaa = 0;
        System.out.println("Digite a quant de numeros inteiros que vc quer escrever:");//para q o user digite uma quantidade de num a ser digitada depois, vc precisa fazer o for e colocar a condição c menor que o número de quant digitada pelo
        // user e incrementar mais um, ai vc declara uma nova var dentro do for para armazenar os valores.
        N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            int r = sc.nextInt();//armazena os valores
            if (r >= 10 && r <= 20) {
                somaa += 1;
            } else {
                somaaa += 1;
            }
        }
        System.out.println(somaa + " in");
        System.out.println(somaaa + " out");

        //programa q le um int e depois n números inteiros, mostrar a soma dos n lidos.
        int n;
        int soma = 0;
        System.out.println("Digite a quant de numeros inteiros que vc quer escrever:");
        n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int f = sc.nextInt();
            soma += f;
        }
        System.out.println(soma);

        //leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o
        //X, se for o caso.

        int x;
        System.out.println("Digite um número: ");
        x = sc.nextInt();
        for (int i = 1; i <= x; i++) {//i = 1 pq se for igual a zero não entra no if pq zero n é ímpar, 1 é ent pelo menos eles seria impresso.
            if (i % 2 != 0) {
                System.out.println(i);
            }


        }


    }}

