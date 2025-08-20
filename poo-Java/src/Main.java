import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Aluno> lista = new ArrayList<>();
        //adicionar elemento pronto em uma lista, e imprimir seus dados
        //lista.add(new Aluno("aba","5413131")); //método mais correto
        //lista.add(new Aluno("aba","5413131"));
        //lista.add(new Aluno("aba","5413131"));
        //System.out.println(lista);
        //for (int i = 0; i<lista.size(); i++){
        //     System.out.println("Aluno " + i);
        //    System.out.println(lista.get(i));//imprime o endereço de memória
        //  System.out.println(lista.get(i).getNome());//i pega a posição e depois od dados de certa posição
        //  System.out.println(lista.get(i).getCpf());


        //MAIN é um método estático, ent qualquer método feito na classe main, o proprio main deve ser instanciado

        //adicionar com Scanner
        Scanner sc = new Scanner(System.in);
        for (int i = 0;i<5;i++) {
            System.out.println("Adicone aluno: ");
            System.out.println("Nome");
            String nome = sc.nextLine();
            System.out.println("CPF:");
            String cpf = sc.nextLine();
            lista.add(new Aluno(nome, cpf));
        }



    }



    }

