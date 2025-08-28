package br.com.fiap.agenda.tests;

import br.com.fiap.agenda.interfaces.ContatoBD;
import br.com.fiap.agenda.models.Contact;


import java.util.List;

public class ManipulandoJson implements ContatoBD {
    @Override
    public void cadastrar(Contact contato) {

    }

    @Override
    public Contact buscarContato(String nome) {
        return null;
    }

    @Override
    public List<Contact> listar() {
        return null;
    }
}
