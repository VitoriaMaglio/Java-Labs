package br.com.fiap.agenda.tests;

import br.com.fiap.agenda.dao.ContactDao;
import br.com.fiap.agenda.dao.ContactDao;
import br.com.fiap.agenda.models.Contact;
import br.com.fiap.agenda.models.Contact;

public class TesteContato {
    public static void main(String[] args) {
        Contact contact = new Contact();
        ContactDao dao = new ContactDao();
        contact.setNome("Maria");
        dao.cadastrarContato(contact);

    }
}
