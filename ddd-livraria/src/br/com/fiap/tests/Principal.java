package br.com.fiap.tests;

import br.com.fiap.models.ArquivoCupom;

import java.io.IOException;

public class Principal {
    public static void main(String[] args) {
        String path = "C:\\Users\\PICHAU\\OneDrive\\Desktop\\Java-1TDSPJ\\2sem\\ddd-livraria\\cupom.txt";
        try {
            ArquivoCupom.escrita(path);
            ArquivoCupom.leitor(path);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
