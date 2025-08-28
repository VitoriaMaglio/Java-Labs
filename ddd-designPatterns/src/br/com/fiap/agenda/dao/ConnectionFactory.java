package br.com.fiap.agenda.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {//estabelecer conexão com o bd e vai devolver essa conexão, fazendo a ponte entre Java e SQl
    public static Connection getConnection(){
        Connection connection = null;//objeto do tipo Conexão e vai devolver esse obj
        try{
            //código que pode dar erro
            connection = DriverManager.getConnection("jdbc:oracle:thin:@oracle.fiap.com.br:1521:orcl",
            "rm563509","140607");//buscando uma conexão no DriverManager na url do servidor do bd
        }catch (SQLException erro){
            erro.printStackTrace();
        }return connection;
// a classe DriverManager é a oracle dbc para acessar bd

    }
}
