public class Listas {
    /*Array sempre começa na posição 0
    é um vetor,uma lista é uma estrutura de dados dinâmica que permite armazenar
     elementos de forma ordenada e acessar por índice.

     ArrayList<Tipo> nome = new ArrayList<Tipo>();
     consegue armazenar vários objetos do mesmo tipo em uma lista.
     .add() ->adicionar elementos
     .size() -> retorna o tamanho do ArrayList

     imprimir posições do ArrayList
     sout(nomeLista.get(índice);
     imprimira última posição
     int ultimapos = nomeLista.size() -1;  É o tamanho menos um pq
     sout(ultimapos);
     imprimir toda ArrayList
     for(int i = 0; i<nomeLista.size(); i++){
     sout(nomeLista.get(i)
     }

     ou
     for(Tipodalista var : nomeLista){
     sout(var)
     }

     Em ArrayList não pode passar tipos primitivos e sim, Classes.


     Stream API permite processar coleções de dados(listas e coleções) de forma funcional

     Método de busca um dado dentro do ArrayList
     primeiro criar um fluxo dentro do array com .stream
     depois filtrar os elementos com base em uma condição .filter
     .findFirst retorna o primeiro elemento q passar no filtro
     .orElse(null) retorna null se nenhum dado da lista for encontrado.
     .max encontra o maior dado
      ComparatorClasse usada para comparar objetos com base em critérios
      .max(Comparator.comparingInt(x::ydex))
      .ifPresent(modalidade -> { ... })    Executa um bloco apenas se o Optional tem valor

     */
}
