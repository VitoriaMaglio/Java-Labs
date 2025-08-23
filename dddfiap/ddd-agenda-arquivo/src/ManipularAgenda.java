import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ManipularAgenda {
    List <Cliente> clientes = new ArrayList<>();
    public void adicionarCliente(Cliente cliente) {

        clientes.add(cliente);
    }
    //Esse método escreve a lista no arquivo
    public void escrever(List<Cliente> clientes) {
        try (FileWriter writer = new FileWriter("agenda.txt")) {
            for (Cliente cliente : clientes) {
                writer.write(cliente.toString() + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //Método que lê o arquivo e exibe os dados na tela
    public void leitura() {
        try (BufferedReader reader = new BufferedReader(new FileReader("agenda.txt"))){
            String linha;
            linha = reader.readLine();
            while ( linha !=null){
                System.out.println(linha);
                linha = reader.readLine();
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }
    public void leituraVip() {
        try (BufferedReader reader = new BufferedReader(new FileReader("agenda.txt"))){
            String linha;
            linha = reader.readLine();
            while ( linha !=null){
                if (linha.contains("VIP"))
                System.out.println(linha);
                linha = reader.readLine();
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }
    public void leituraPremium() {
        try (BufferedReader reader = new BufferedReader(new FileReader("agenda.txt"))){
            String linha;
            linha = reader.readLine();
            while ( linha !=null){
                if (linha.contains("PREMIUM"))
                    System.out.println(linha);
                linha = reader.readLine();
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }
}
