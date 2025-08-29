package br.fiap.com.tests;

import br.fiap.com.dao.ConnectionFactory;

public class TesteConexao {
    public static void main(String[] args) {
        if(ConnectionFactory.obterConexao() == null){
            System.out.printf("Erro ao estabelecer conexão.");
        }else{
            System.out.println("Conexão estabelecida.");
        }
    }
}
