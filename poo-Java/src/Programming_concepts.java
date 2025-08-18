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

Boxing é o processo de conversão de um objeto tipo valor para um objeto tipo referência compatível.
Unboxing é o processo contrário.
Wrapper classes são classes equivalentes aos tipos primitivos, aceitam o valor nulo.

Laço for each: percorrer todos os elementos de uma coleção
for(tipo apelido : coleção){
sout(apelido0
}

Listas-Arrays
Homogênea,ordenada
Interface é um tipo que define apenas o que uma classe deve fazer, mas não como
List é uma Interface,Contém apenas métodos abstratos (sem corpo) e constantes.
Tamanho variável, acesso sequencial aos elementos. ArrayList é uma implementação otimizada de lista.
Declarar lista: List <Tipo> nome = new ArrayList<>();

A Lista não aceita tipos primitivos, apenas wrapper classes

Tamanho da lista:list.size()
Inserir elementos na lista:list.add(""); em certa posição list.add(posição,"")

list.indexOf() ; quando não encontra o elemento ele retorna -1
Remover elemento: list.remove; remover elementos com predicado list.removeIf( x -> x.charAt(0) == 'm')
Isso é uma função lambda                                                      tal que
Fazer um filtro em uma lista para deixar na lista somennte os elementos que começam com M

Criar uma nova lista, pegar a lista original,converter para stream, filtrar, e voltar para lista.
List<String> resul = list.stream().filter( x -> x.charAt(0) == 'm').collect(Collectors.toList())

Encontrar o primeiro elmento que começa com um predicado
Declarar a var = list.stream().filter( x -> x.charAt(0) == 'm').findFirst().orElse(null)
se esse elemento não existir ele retorna nulo.

percorrer lista
for(String nome : nomes{
sout(nome)}

Matriz são arranjos bidimensionais(linha,coluna)
mat.length é a quant de linhas n que o user digita; para as colunas vc acessa os elementos de uma linha e assim é a quantidade de colunas;
mat[i].length

Tratando data-hora em java: para integração com database
data-[hora] local: ano-mês-dia[hora];armazenada sem fuso horário ANO-MES-DIATHORA.SEG
Usar quando mometo exato do arquivo não interresa a pessoas de outro fuso.

data-hora global: ano-mês-dia-hora;com fuso ANO-MES-DIATHORAZ-FUSO
Usar quando o momento interessa a pessoas de outro fuso
duração:tempo decorrido entre duas data-horas.

Timezone UTC
GMT: Greenwich Mean Time = fuso horário de Londres
Letra z : horário de Londres
São Paulo:GMT-3
Portugal:GMT+1

Padrão ISO 8601 = como representar data em formato de texto(FORMATO;Armazena no gmt).

Operações->
Instanciar objeto do tipo Data-Hora
 Instanciar obj Data-hora do momento agora:

 LocalDate d01 = LocalData.now();
 LocalDateTime d02 = LocalDateTime.now(); gera com a hora local do seu pc
 Instant d03 = Instant.now(); indica o gmt de Londres

 ISO 8601 para objeto Data-Hora

 LocalDate d04 = LocalDate.parse("2022-07-20");
 LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
 Instant d06 = LocalDateTime.parse("2022-07-20T01:30:26Z");
 Instant d07 = LocalDateTime.parse("2022-07-20T01:30:26-03:00"); fazendo com horário que vc indica em Londres

 Texto customizado para virar data-hora: converter de string para data-hora
 DateTimeFormatter fmt1 = DateTimeFormater.ofPattern("dd/MM/yyyy"); Vc cria um padrão para que sja convertido string para data-hora
 LocalDate d08 = LocalDataparse("20/05/2000",fmt1);


 Informações soltas em Data-hora:
 LocalDate d09 = LocalDate.of(2000,4,14);

 Formatar uma Data-Hora: Tem uma data-hora e transformar para texto
 DateTimeFormatter fmt1 = DateTimeFormater.ofPattern("dd/MM/yyyy");
 sout(d04.format(fmt1));  assim vai transformar para uma string pois vc chamou o objeto formatado com o padrão
 sout(fmt1.format(d04));

 Instant(é uma data-hora global) não tem o método format; logo vc precisa criar um padrão com .withZone(ZoneId.systemDefault()) isso para o gmt do pc do user
 Isso mostra a data-hora equivalente do pc do user.

 Tbm já tem padrões prontos na documentação;


 Converter data-hora global para local(tbm tem q informar o timezone)
 Instant d06 = LocalDateTime.parse("2022-07-20T01:30:26Z");
 LocalDate r1 = LocalDateTime.ofInstant(d06,ZoneId.systemDefault()); esse zone indica os fusos
 Fazer a mesma coisa com o LocalDateTime

 Obter dados de uma data-hora local:
 LocalDate d04 = LocalDate.parse("2022-07-20");
 sout(d04.getDayOfMonth());get.MonthValue();getYear();
 LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
 sout(d05.getHour()); getMinute();

 Cálculos +/-, saber a duração
 Data-Hora são objetos imutáveis.
 LocalDate pastweek = d04.minusDays(7); subtraindo 7 dias
 LocalDate nextweek = d04.plusDays(); adicionadno 7 dias nesse novo objeto , + 7 dias do obj d04

 Instant pastweek = d06.minus(7, ChoroUnit.DAYS); VC INSTANCIA UMA UNIDADE DIAS.

 Duração entre duas data-horas:
 Duration t1 = Durantion.between(pastweek , d04);
 sout(t1.toDays());

Enumerações e composições:
Enumerações tipo especial que específica um conjunto de constantes relacionadas; ENUM
Ciclo de vida de um objeto, ou estados de um objeto.

Converte String para ENUM:
.valueOf("")
Ent vc tem um enum, e na main vc chama o enum com esse método e dentro do parenterses vc coloca a var da entrada do user que sera convertidapra um dos estados do enum.

DESIGN: tem vários tipodes de classes para representar objetos
Entities são entidades de negócio, uma classe que normalmente representa um objeto persistido em banco de dados
em que Cada entidade tem um identificador único (id
Services são serviços associados entrei si para cumprir uma funcionalidade do sistema.

ASSOCIAÇÕES
Composição tipo de associação forte que permite que um objeto contenha outro, todo-parte e tem-um/tem-muitos
Símbolo é um diamante preto, a classe que está perto dele representa o todo e a que está com a seta representa as partes
Tbm tem uma relação tem-um

    EXEMPLOS:
    tem-um (1:1) -> Um Carro tem um Motor.
    class Motor {
    private String modelo;

    public Motor(String modelo) {
        this.modelo = modelo;
    }
}

    class Carro {
    private Motor motor; // tem-um Motor

    public Carro(String modeloMotor) {
        this.motor = new Motor(modeloMotor);
    }
}
Em um exercícios de associação vc declara uma Lista para uma composição tem-muitos
    tem-muitos (1:N); Um Pedido tem muitos Itens.
    class Item {
    private String nome;
    private double preco;

    public Item(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return nome + " - R$" + preco;
    }
}

    class Pedido {
    private List<Item> itens = new ArrayList<>(); // composição tem-muitos

    public void adicionarItem(String nome, double preco) {
        itens.add(new Item(nome, preco)); // Pedido cria e controla os itens
    }

    public void mostrarItens() {
        for (Item i : itens) {
            System.out.println(i);
        }
    }
}


HERANÇA É um tipo de associação que permite que uma classe herde todosdados e comportamentos de outra ;  class A extends B
Herança permite o reuso de atributos e métodos (dados e comportamento) a CLASSE QUE TEM SETA BRANCA É A MÃE, a classe que tem a saída da seta é a que herda
super(); Construtor da super classe, executar a lógica do construtor da classe mãe.
Modificador de acesso protected: subclasse pode acessar, então n hora de delarar os atributos da superclassse não colocar private(só a própria classe tem acesso ) e sim protected
Herança é uma relação -é-um
Generalização/especialização
Extensão
Associação entre Classes, um objeto com ações iguais e diferentes)

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
 ADICIONAR ALGO EM UMA LISTA
 DECLARA
 CRIA UM MÉTODO e passa nomeLista
 lista.add (nomeLista )

15/08
Manipulação de arquivos json

Método static é para que não precise declarar um objeto

     */

}
