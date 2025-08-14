import java.util.Scanner;

public class Day2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
        //mensagem explicativa

        int a,b;
        int soma;
        System.out.println("Digite um número inteiro: ");
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("Digite um número inteiro: ");
        soma = a + b ;
        System.out.println("SOMA = "+soma);


        //ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
        //casas decimais conforme exemplos
        double r;
        double pi = 3.14159;
        double area;
        System.out.println("Digite um valor de um raio de um círculo :");
        r = sc.nextDouble();
        area = pi * r * r;
        System.out.printf("A= %.4f%n", area);

        //ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
        //de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).

        int A,B,C,D;
        int diferenca;
        System.out.println("Digite um número inteiro:");
        A=sc.nextInt();
        System.out.println("Digite um número inteiro:");
        B=sc.nextInt();
        System.out.println("Digite um número inteiro:");
        C=sc.nextInt();
        System.out.println("Digite um número inteiro:");
        D=sc.nextInt();
        diferenca= (A*B - C * D);
        System.out.println("DIFERENCA = " + diferenca);

        // leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
        //hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
        //decimais.

        String num;
        int hrs;
        double valor;
        double salario;
        System.out.println("Digite seu número de telefone: ");
        num=sc.nextLine();
        System.out.println("Digite o número de horas trabalhadas: ");
        hrs= sc.nextInt();
        System.out.println("Digite o valor que você recebe por hora: ");
        valor=sc.nextDouble();
        salario = hrs * valor;
        System.out.printf("NUMBER = " + num + "\n" + "SALARY = U$ %.2f%n", salario );

        // ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
        //código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.
        int codigo1; int codigo2;
        int pecas1;double va1;
        int pecas2;double va2;
        double valorPagar;
        System.out.println(" código de uma peça 1");
        codigo1= sc.nextInt();
        System.out.println(" código de uma peça 2");
        codigo2= sc.nextInt();
        System.out.println(" número de peças 1");
        pecas1= sc.nextInt();
        System.out.println(" número de peças 2");
        pecas2= sc.nextInt();
        System.out.println(" valor unitário de cada peça 1");
        va1=sc.nextDouble();
        System.out.println(" valor unitário de cada peça 2");
        va2=sc.nextDouble();
        valorPagar= pecas1*va1 + pecas2*va2;
        System.out.printf("VALOR A PAGAR: %.2f%n",valorPagar);




    }
}
