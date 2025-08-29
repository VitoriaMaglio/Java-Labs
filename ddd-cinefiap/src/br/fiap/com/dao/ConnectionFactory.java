package br.fiap.com.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    //criar um método estático Connection para fazer a conexão
    public static Connection obterConexao(){
        Connection conexao = null;
        try{
            conexao = DriverManager.getConnection("jdbc:oracle:thin:@oracle.fiap.com.br:1521:orcl",
                    "rm563509", "140607");
        }catch (SQLException e){
            e.printStackTrace();
        }
        return conexao;
    }
}
