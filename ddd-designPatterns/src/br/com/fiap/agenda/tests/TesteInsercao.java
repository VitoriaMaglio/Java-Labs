package br.com.fiap.agenda.tests;

import br.com.fiap.agenda.dao.ContactDao;
import br.com.fiap.agenda.models.Contact;

import java.util.Scanner;

public class TesteInsercao {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        Scanner leitorTexto = new Scanner(System.in);

        Contact contato = new Contact();
        ContactDao dao = new ContactDao();

        System.out.println("Digite o código do contato: ");
        contato.setId(leitor.nextInt());
        System.out.println("Digite o nome do contato: ");
        contato.setNome(leitorTexto.nextLine());
        System.out.println("Digite o celular do contato: ");
        contato.setCelular(leitorTexto.nextLine());
        System.out.println("Digite o email do contato: ");
        contato.setEmail(leitorTexto.nextLine());
        System.out.println("Digite o instagram do contato: ");
        contato.setInstagram(leitorTexto.nextLine());
        System.out.println("Selecione o tipo do contato:");
        contato.setTipo("AMIGO");
        dao.cadastrarContato(contato);
        System.out.println("Contato foi adicionado com sucesso!");

    }
}