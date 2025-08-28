package br.com.fiap.agenda.interfaces;

import br.com.fiap.agenda.models.Contact;


import java.util.List;

public interface ContatoBD {
    void cadastrar(Contact contato); //Cadastrar os contatos em um arquivo
    Contact buscarContato(String nome); //Buscar no arquivo nome
    List<Contact> listar(); //Listar todos os contatos

}
