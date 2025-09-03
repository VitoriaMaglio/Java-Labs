package br.curso.com.models.entities;

import java.util.Scanner;

public class Matriz {

    //Fazer um programa para ler um número inteiro N e uma matriz de ordem N.Em seguida, mostrar a diagonal principal e a quantidade de valores negativos da matriz.
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();//le a ordem da matriz
        int [][] mat=new int [n][n];
        //Para mostrar os elementos da matriz precisa de dois for, um para as linhas e outro para cada coluna de cada inha.
        for (int i = 0;i<n;i++){
            for (int j =0; j<n; j++){
                mat[i][j]= sc.nextInt();
            }
        }
        //diagonal principal, valor de i e j igual
        for (int i= 0 ; i<n; i++){
            System.out.println(mat[i][i]);
        }
        //quant de números negativos
        int sum=0;
        for (int i = 0; i<n; i++){
            for (int j =0; j<n; j++){
                if(mat[i][j] < 0){
                   sum ++;
                }
            }
        }
        System.out.println(sum);

    }
}
