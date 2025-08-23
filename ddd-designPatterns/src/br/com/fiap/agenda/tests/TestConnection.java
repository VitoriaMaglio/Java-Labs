package br.com.fiap.agenda.tests;

import br.com.fiap.agenda.dao.ConnectionFactory;

public class TestConnection {
    //testar a conexão com o banco
    public static void main(String[] args) {
        System.out.println("Testando a conexão com o banco");
        if (ConnectionFactory.getConnection() == null){
            System.out.println("Erro ao estabelecer conexão");
        }else{
            System.out.println("Conexão estabelecida.");
        }
    }
}
