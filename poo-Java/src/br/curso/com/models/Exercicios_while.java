package br.curso.com.models;

import java.util.Scanner;

public class Exercicios_while {

    //programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha
    //incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser
    //impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002.
    public static void main(String[] args) {
        int  x;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite sua senha : ");
        x = sc.nextInt();
        while (x != 2002){
            System.out.println("Senha inválida!");
            x = sc.nextInt();
        }
        System.out.println("Acesso permitido");

        int z,y;
        System.out.println("Digite uma coordenada: ");
        z = sc.nextInt();
        System.out.println("Digite uma coordenada: ");
        y = sc.nextInt();
        while (z!= 0 && y!=0){
            if (z > 0 && y>0){
                System.out.println("primeiro quadrante");
            } else if (z<0 && y>0) {
                System.out.println("segundo quadrante");
            } else if (x<0 && y<0) {
                System.out.println("terceiro quadrante");
            }else{
                System.out.println("quarto quadrante");
            }
            z= sc.nextInt();
            y = sc.nextInt();
        }
        // programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema
        //cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo
        //menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).



//Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva
//um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel
//4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até
//que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a
//mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme
//exemplo.
        int c;
        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;
        System.out.println("Digite um número: ");
        c=sc.nextInt();
        while(c != 4){
            if (c == 1) {
                alcool = alcool + 1;
            }
            else if (c == 2) {
                gasolina = gasolina + 1;
            }
            else if (c == 3) {
                diesel = diesel + 1;
            }
            c = sc.nextInt();
        }
            System.out.println("MUITO OBRIGADO");
            System.out.println("Alcool: " + alcool);
            System.out.println("Gasolina: " + gasolina);
            System.out.println("Diesel: " + diesel);


        sc.close();

    }
}
