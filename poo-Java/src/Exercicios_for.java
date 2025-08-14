import java.util.Scanner;

public class Exercicios_for {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        //programa q le um int e depois n números inteiros, mostrar a soma dos n lidos.
        int n;
        int soma = 0;
        System.out.println("Digite a quant de numeros inteiros que vc quer escrever:");
        n=sc.nextInt();

        for (int i = 0; i<n; i++){
            int f =sc.nextInt();
            soma += f;
        }
        System.out.println(soma);

        //leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o
        //X, se for o caso.
    }
}
