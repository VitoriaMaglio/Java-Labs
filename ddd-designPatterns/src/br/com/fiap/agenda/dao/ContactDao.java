package br.com.fiap.agenda.dao;

import br.com.fiap.agenda.models.Contact;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class ContactDao {
    //Toda classe DAO é responsável pelo CRUD: métodos de create read update delete dados
    private Connection conexao;

    public void cadastrarContato(Contact contact){
        conexao = ConnectionFactory.getConnection();
        PreparedStatement comandoSQL = null;
}}
