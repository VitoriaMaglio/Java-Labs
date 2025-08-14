public class Programming_concepts {
    /*Algoritmo é uma sequência finita de instruções para resolver um problema
    Automação é o processo de utilizar máquinas para executar o procedimento desejado de forma automática
     Computador é uma máquina que automatiza a execução de algoritmos.
     Linguagem de programação são regras léxicas e sintáticas para se escrever o programa
     IDE: Ambiente Integrado de Desenvolvimento = software para editar e testar.
     Compilador:software para transformar o código fonte em código objeto.
     Máquina virtual: software que permite que o programa seja executado. JVM
     Código fonte é o código escrito em uma linguaguem de programação
     Compilação é a linguagem que o computador entende: código fonte->código objeto->código executável
     Interpretação transforma automaticamente o código fonte em executável
     Abordagem híbrida -> código fonte é compilado, transformado em bytecode que é interpretado por uma máquina virtual.
     LTS=LONG TERM SUPPORT, não precisa ficar atualizando toda hora
     Java foi criado na década 1990 pela Sun Microsystems, adquirida pela Oracle Corporation em 2010.
     Compilação Just in time; JVM máquina virtual do java que executa os sistesmas de java, um compilador gera um código executável específico para cada sistema;
     o bytecode que é gerado na compilação roda em JVM nos sistemas computacionais.
     JAVA é uma linguagem orientada a objetos:
     todos os conceitos devem estar dentro de uma Classe;
     package são agrupamentos lógicos de classes;
     módulo são agrupamentos de pacotes relacionados;
     aplicação é um agrupamento de módulos.
     Programa em Java só roda com main declarado.
Estrutura sequencial:
variáveis são porções de memória RAM que armazenam dados durante a execução de programas.
declarar var:
<tipo> <nome> = <valor>;
int/double/boolean/char/ nomeVar = valor
char é um caractere Unicode
String é uma cadeia de caracteres(Classe)
Entrada de dados ->processamento ->Saída de dados

PROCESSAMENTO DE DADOS
atribuição =
casting é a conversão explícita de tipo de dados

int a,b
double resultado
resultado = (double) a*b
PQ SEM ESSE double o resultado seria em int

double x;
int y;
a = 5.0;
b = a ;  -> b = (int) a

ENTRADA DE DADOS é feita com Scanner; lembrar de fechar o scanner com scanner.close();
String x;
sout()
x = scanner.nextLine(); nextInt(); nextDouble(); next().charAt(0) esse zero é o primeiro caractere q vc digitar
nextLine lê até a quebra de linha(enter)

QUEBRA DE LINHA PENDENTE = ESPAÇO NO BUFFER acontece quando vc quer ler um int e depois um nextLine, uma vez que
quando vc dá o enter do string esse nextLine consome a quebra de linha , e será absorvida pelo nextLine, ent vc deve fazer dois nextLine para limpar o buffer de leitura(consumir a quebra de linha pendente)

FUNÇÕES MATEMÁTICAS
Math.sqrt(x) raiz quadrada
Math.pow(x,y) numero elevado a tal
Math.abs tira o sinal negativo quando existe




















13/08/2025
Tratamento de exceções

Exceção é um evento insperado que ocorre durante a execução do programa e interrompe o fluxo normal como divisão por zero
entrada inválida do user.
Tipos de exceções
 CHECKED EXCEPTIONS são exceções previstas pelo compilador, devem ser tratadas.
 UNCHECKED EXCEPTIONS são exceções que podem acontecem em tempo de execução e não precisam ser tratadas

TRY..CATCH
try{linhas de código que podem vir a
 lançar uma exceção
}
catch (tipo_excessao e) {ação que ocorrerá quando a
 exceção for capturada.
} finally{sempre é executado, independentemente de ocorrer
ou não uma exceção }

Exemplos de erros: ArithmeticException,  NumberFormatException

O throw é usado para lançar uma exceção manualmente no seu código.
throw newTipoDaExcecao("mensagem de erro");
• É como se você dissesse: "Aqui aconteceu um problema, e eu quero avisar disso", o programa para imediatamente nesse ponto

 throw: lançaaexceçãonaquele exato momento (dentro do método).
 throws: declara que o método pode lançar exceções, deixando para quem chamar o método
 decidir se vai tratar.

Exceções próprias -> classe que extends Exception
     */

}
