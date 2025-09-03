package br.curso.com.tests;

import br.curso.com.models.entities.IntPooFuncionario;
import br.curso.com.models.entities.OutsourcedFuncionario;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainFuncionario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Lista que vai armazenar os funcionários
        List<IntPooFuncionario> funcionarioList = new ArrayList<>();

        System.out.println("Enter the number of employees: ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0;i<n;i++){
            System.out.println("Employee " + (i+1) +"data: ");
            System.out.println("Outsorced?");
            String resp = sc.nextLine();
                System.out.println("Name: ");
                String name = sc.nextLine();
                System.out.println("Hours: ");
                int hours = sc.nextInt();
                System.out.println("Value per hour: ");
                double valuePerHour = sc.nextDouble();
                sc.nextLine();
                //primeiro vc recebe todos os dados em comum dos dois objetos
            IntPooFuncionario funcionario;
            if (resp.equalsIgnoreCase("y")){
                System.out.println("Additional Charge: ");
                double additionalCharge = sc.nextDouble();
                sc.nextLine();
                funcionario = new OutsourcedFuncionario(name, hours, valuePerHour, additionalCharge);// aqui usamos POLIMORFISMO
                //declarar um objeto do tipo funcionario só que com parâmetros da subclasse com o parâmetro específico
                }
            else{
                funcionario = new IntPooFuncionario(name, hours, valuePerHour);//aqui declara um obj do tipo funcionario sem o parâmetro

            }
            funcionarioList.add(funcionario);
            System.out.println("Payments:");
            for (IntPooFuncionario pagamentos : funcionarioList){
                System.out.println(pagamentos.getName() + " - $ " + pagamentos.payment());
            }//a var funcionario guarda apenas o ultimo fun que cadastrei//qundo usa pagamentos(variavel do for) acessa o abjeto atual da lista

        }
    }
}
