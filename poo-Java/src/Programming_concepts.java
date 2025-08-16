public class Programming_concepts {
    /*
    Algoritmo é uma sequência finita de instruções para resolver um problema
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

     Var deve ser declarada; escopo de uma var é a parte do projeto onde a var tem um valor que é válido.



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
Math.abs tira o sinal negativo quando existe.

ESTRUTURA CONDICIONAL:
EXPRESSÕES COMPARATIVAS COMPARAM coisas com outras >< <= >= !=
EXPRESSÕES LÓGICAS RESULTAM EM TRUE  && (e) , || (OU) ,   !(==) (Não : inverte a condição)
Condicional são estruturas de controle que direcionam o fluxo do programa
if(){
 }else{                 LEMBRAR DE IDENTAR O CÓDIGO
}
 Pode encadear ifs e elses dentro do primeiro else


swith-case -> várias opções de fluxo a serem tratadas com base no valor de uma var
lê var, declara outra var e faz switch case
1= domingo, 2=seg,3=ter...

int num;
sout("Digite num:")
num=scanner
String dia;
switch(x){
case 1:
dia="domingo";
break;
case 2:
dia ="seg";
break;
default:
inválido}

Condicional ternária (condicao) ? valor_se_vdd : valor_se_false  -> substituir if-else

a += b -> a = a + b(var recebe ela mesma e outra var)
Para não rodar o programa inteiro vc pode colocar um break point.

    ESTRUTURA REPETITIVA WHILE enquanto uma condição for verdadeira ela executa(usar quando não sabe a quant de repetições q será realizada)
    while(condição){
    }     v-> executa e volta f-> não executa


    ESTRUTURA REPETITIVA FOR quando se sabe a quant de repetições ou intervalo de valores
    for(inicio,condição,incremento){}inicio executa somente na primeira vez e o incremento executa toda vez depois de voltar
    boa para fazer repetição baseada em contagem

    do{}while(); primeiro executa o comando depois faz a condição

Operadores bitwise : realizam operações bit a bit,verificar rede de bits, começa da direita para esquerda
Funções Strings:                          ("demo" significa criar uma demonstração do seu sistema, código ou produto para mostrar como ele funciona.))
toLowerCase, toUpperCase, trim(elimina espaços em branco no final da string)
substring(arg1, arg2) corta a string de acordo com as posições q vc colocar
replace('','') trocar
indexOf("") primeira ocorrência de uma string
lastIndxOf("") última
split() recorta e gera um vetor que guarda os strings  declarar vetor String[] vect  = s.split(" ");
                                                                   sout(vect[0]); vai imprimir o primeiro elemento do seu string
FUNÇÕES(sintaxe) procedimentos que tem significado. vantagens-> modularização,delegação de responsabilidades e reaproveitamento ; em POO são chamados de métodos

exemplo:Fazer um programa que le três num e imprime o maior. Ao invés de fazer um if(a>b && a>c) você cria um método com parâmetros e implemeta a lógica

Início de POO ;)

Classe é um tipo estruturado que pode conter atributos e métodos; ela é a representação de um objeto
instanciar objeto(alocação dinâmica de memória) duas área de memória Stack(est´tico) e Heap(dinâmicos)
x.(atributos,métodos desse objeto)

Toda classe em Java é uma subclasse da classe Object que possui métodos:
getClass: retorna tipo do obj
equals: compara obj
hashCode: retorna codigo hash do obj
toString: converte o obj para string

Membros estáticos: atributos e métodos fazem sentido independentemente de objetos, chamados a partir do nome da classe.
uma classe só com membros estáticos não pode ser instanciada
Constante estática declarada com letra MAIÚScula: public static final double PI =3.14159;

CONSTRUTORES é executada no momemnto que vc instancia objeto.
Quando vc instancia um obj, seus atributos recebm um valor padrão null e 0, porém não faz sentido .Assim, para tornar obrigatório a entrada de dados usar construtuor

public nomeClasse(String atributo,int atributoo){
this.atributo = atributo;//aqui vc está atribuindo o q u user digita para os atributos do objeto
}
Só instanciar o obj depois de receber os dados com sout e scanner/ e instanciar o obj com parâmetros

palavra THIS-> é uma referência para o próprio objeto
diferenciar atributos de variáveis locais; passar o próprio obj como argumento na chamada de um método ou construtor

Sobrecarga mais de uma operação com mesmo nome, só q com parâmetros diferentes.

Encapsulamento esconder detalhes da implementação de uma classe, expondo apenas operações seguras
Atributos devem sempre ter modificadores de acesso private e devem ser acessados por métodos get e set.
MODIFICADORES DE acesso:
private: só a própria classe tem acesso
default:padrão, só pode ser acessado nas classes do mesmo pacote
protected:acessado no mesmo pacote e subclasses
public:todas as classes

                      Quando você tem atributos privados e precisa armazenar dados do input neles, vc faz .setName(sc.scanner()) e depois ao printar vc fasz .getName


qUANDO COLOCAMOS NEW são atribuídos valores null ou padrão.
Tipos referência: classe, variáveis são ponteiros.
Tipos primitivos: variáves são caixas
Desalocação de memória:
Garbage collector monitora os objetos alocados dinamicamente (no heap),desalocando aqueles que não estão mais
 sendo utilizados.

Desalocação por escopo imediatamente assim que seu escopo local sai de execução
VETORES->
SÃO ARRANJOS UNIDIMENSIONAIS
Array : homogênea(do mesmo tipo), alocada em um bloco contíguo de memória, acessado por índices, acesso imediato
criar vetor:

 int n = scanner(indica a quantidade de numeros q o user vai digitar)

 tipo[] vect = new tipo[tamanho]  //tamanho são as posições ent 3 é (0,1,2)
 Para armazenar valores no vetor usar for:
 for(int i = 0; i>n; i++){           //percorre o vetor i>n ou vect.length que é a quantidade de elementos de um vetor
 vect[i]=scanner
 }


 Criar um vetor de Classe
 nomeClasse[] vet = new nomeClasse[tamanho]
 for(){
 //precisa fazer o vector apontar para as características do objeto
 vect[i] = new nomeClasse(parâmetros);












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


15/08
Manipulação de arquivos json

Método static é para que não precise declarar um objeto

     */

}
