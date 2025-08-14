package br.com.fiap.models;

import java.io.*;
import java.util.Scanner;

public class ArquivoCupom {
    //throws não trata a exceção, só passa para frente//com o seg erro mudou para IOException pois é a superclasse

    public static void leitor(String path) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(path));//abre o arquivo no caminho do path, quando acha o FileReader le os caracteres e coloca um buffer que faz o arquivo ser lido mais rápido.
        String linha = "";
        while (true){
            if(linha != null){
                System.out.println(linha);
            }
            else{
                break;//forçar saida do laço infinito
            }
            linha = reader.readLine();//ler linha por linha nessa var linha
        }
    }
    //toda vez que trabalhar com escritae leitura de arquivos dá erro, pois é um CheckExceptions

    public static void escrita(String path) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(path));//BufferedWriter é uma das classes que inscreve em arquivos
        String linha;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escreva algo: ");
        linha=entrada.nextLine();
        writer.append(linha + "\n");//escreve no arquivo a linha escrita do user, e colocar um \n para o cursor ir para a linha de baixo
        writer.close();//salvar o q está escrito
    }
}
