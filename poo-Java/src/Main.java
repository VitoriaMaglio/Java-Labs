

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Word!");
        /*println tem uma quebra de linha no final
        * para definir casas decimais usar printf %.quant de casas f%n
        * para mudar a separação(,) para a separação (.) Locale.setDefault(Locale.US);
        * concatenar + ; igualdade ++
        * \n quebra de linha
        * %f = ponto flutuante   São marcadores de variáveis
           %d = inteiro
           %s = texto
           %n = quebra de linha
           * */

        int y = 32;
        System.out.println(y);
        double x = 10.35745;
        System.out.printf("%.4f%n", x);
        System.out.printf("%.4f%n", x);
        Locale.setDefault(Locale.US);
        System.out.printf("%.4f%n", x);
        String nome = "Maria";
        int idade = 31;
        double renda = 4000.0;
        System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);




    }
}
