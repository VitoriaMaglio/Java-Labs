import java.util.Scanner;

public class Day1 {

    //Programa que lê número e diz se é ímpar ou par
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Digite um número: ");
        num = sc.nextInt();
        if (num % 2 == 0){
            System.out.println("Número par");
        }else{
            System.out.println("Número ímpar");
        }
//Primeiro declarar a var e depois ler com Scanner

    //Programa q faz fatorial de um número
        int n;
        System.out.println("Digite um número: ");
        n = sc.nextInt();
        int contador = n;
        int resultado = 1;
        while (contador > 1){
                resultado = resultado * contador;
                contador -= 1;
                System.out.println(resultado);
        }
        //While() condição for falsa na primeira verificação, o bloco não executa nenhuma vez.
        //do{-}while() Executa o bloco pelo menos uma vez, antes de verificar a condição.

    //Programa que recebe tres números e encontra o maior
    int x,y,z;
        System.out.println("Digite um número: ");
        x=sc.nextInt();
        System.out.println("Digite um número: ");
        y=sc.nextInt();
        System.out.println("Digite um número: ");
        z=sc.nextInt();
        if (x>z && x>y){
            System.out.println("O número " + x + " é maior");
        }else if (z>x && z>y) {
            System.out.println("O número " + z + " é maior");
        }else{
            System.out.println("O número " + y + " é maior");
        }
    }
}
