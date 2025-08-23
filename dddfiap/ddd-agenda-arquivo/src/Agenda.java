import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Agenda {

    public static void main(String[] args) {
        //Lista de clientes
        ManipularAgenda ma = new ManipularAgenda();
        List <Cliente> clientes = new ArrayList<>();
        ma.adicionarCliente(new Cliente(1, "João Silva", "11987654321", "joao.silva@email.com", "@joaosilva", "Rua A, 123", TipoCliente.VIP));

        ma.adicionarCliente(new Cliente(2, "Maria Souza", "11912345678", "maria.souza@fiap.com.br", "@maria123", "Rua B, 456", TipoCliente.PREMIUM));
        ma.adicionarCliente(new Cliente(3, "Pedro Santos", "11955558888", "pedro.santos@email.com", "@pedrosantos", "Rua C, 789", TipoCliente.VIP));
        ma.adicionarCliente(new Cliente(4, "Ana Oliveira", "11933337777", "ana.oliveira@fiap.com.br", "@anaoliveira", "Rua D, 101", TipoCliente.PREMIUM));
        ma.adicionarCliente(new Cliente(5, "Carlos Lima", "11988884444", "carlos.lima@email.com", "@limac", "Rua E, 202", TipoCliente.COMUM));

        ma.escrever(clientes);

        System.out.println("\n--- Todos os clientes ---");
        ma.leitura();

        System.out.println("\n--- Clientes VIP ---");
        ma.leituraVip();

        System.out.println("\n--- Clientes Premium ---");
        ma.leituraPremium();



        //LEITURA
        // File file = new File("C:\\Users\\Pichau\\OneDrive\\Desktop\\Java-1TDSPJ\\Java-Labs\\ddd-agenda-arquivo\\arquivo.clientes");
        //  Scanner sc = null;
        // try {
        //    String linha = "";

       //     sc= new Scanner(file);
          //  while(linha != null){
        //        linha = sc.nextLine();
          //      System.out.println(linha);
        //  }
       // } catch (FileNotFoundException e) {
       //     throw new RuntimeException(e);
        //} finally {
        //    if (sc != null)
         //       sc.close();
        //}
    }
}
