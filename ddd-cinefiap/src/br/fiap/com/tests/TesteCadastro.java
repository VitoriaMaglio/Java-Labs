package br.fiap.com.tests;

import br.fiap.com.dao.FilmeDao;
import br.fiap.com.models.Filme;

import java.util.Scanner;

public class TesteCadastro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Filme filme = new Filme();
        FilmeDao dao = new FilmeDao();
        System.out.println("Digite o id do filme: ");
        filme.setId(sc.nextLong());
        System.out.println("Digite a avaliação: ");
        filme.setAvaliacao(sc.nextDouble());
        System.out.println("Digite a duração: ");
        filme.setDuracao(sc.);
        dao.cadastrarFilme(filme);
        dao.buscarFilmeId(id);
    }
}
