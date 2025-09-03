package br.com.fiap.agenda.dao;

import br.com.fiap.agenda.models.Contact;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ContactDao {
    //Toda classe DAO é responsável pelo CRUD: métodos de create read update delete dados
    private Connection conexao;

    public void cadastrarContato(Contact contact){
        conexao = ConnectionFactory.getConnection();
        PreparedStatement comandoSQL = null;//declarar um obj do tipo PreparedStatement
        try{
            String sql = "INSERT INTO TBL_CONTATO (ID_CONTATO, nome_contato, celular_contato, email_contato, instagram, tipo) \n" +
                    "VALUES (?,?,?,?,?,?)";
            comandoSQL=conexao.prepareStatement(sql);//colocar o índice do parâmetro para mostar qual lugar da memória o valor tem q entrar.
            comandoSQL.setInt(1,contact.getId());
            comandoSQL.setString(2,contact.getNome());
            comandoSQL.setString(3,contact.getCelular());
            comandoSQL.setString(4,contact.getEmail());
            comandoSQL.setString(5,contact.getInstagram());
            comandoSQL.setString(6,contact.getTipo().toString());
            comandoSQL.executeUpdate();
            comandoSQL.executeUpdate();
            //colocar ? nos campos de valores de cada informação e depois preparar a String sql para ser executada na conexão.

        }catch (SQLException e){

        }
}}
