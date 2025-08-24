import br.curso.com.models.Account;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class IntPooAccount {
    //Banco que receb numero da conta, nome, deposito inicial opcional
    //Saldo só aumenta com depósitos e diminui por saques; cada saque é cobrado uma taxa de 5,00
    //Realize o cadastro de uma conta, com deposito opcional, depois um saque mostrando os dados da conta após cada operação.

//Deu errado pois antes de cada projeto eu preciso fazer o raciocínio do código
//Eu preciso ter variáveis que armazenam o id, name e conta(atualizar o saldo)
//O depósito inicial vai ser conta += value
//O depósito é conta += depositValue
//O saque é conta - withdraw+5.00
    private int id;
    private String name;
    private double balance;

    public IntPooAccount(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public IntPooAccount(int id, String name, double initialDeposit) {
        this.id = id;
        this.name = name;
        deposit(initialDeposit);//aqui se a regra do depósito mudar o construtor também vai mudar
    }//Centralização da lógica, Se você decidir que cada depósito deve ter alguma regra (ex: cobrança de taxa, validação de valor mínimo, registro em histórico), você só precisa alterar o método deposit.
    //O construtor automaticamente já seguirá essa regra, porque chama deposit(initialDeposit).
    public int getId() {return id;}
    public void setId(int id) {this.id = id;}
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public double getBalance() {return balance;}
    public void setBalance(double balance) {this.balance = balance;}

    public void initialDeposit(double value){
        this.balance += value;
    }
    public void deposit(double depositValue){
        this.balance += depositValue;
    }
    public void withdraw(double withdrawValue) {
        this.balance -= (withdrawValue + 5.00);
    }
    public String toString(){
        return "Account data:" + "\n"+ "Account: " + getId() + "Holder: " + getName() + "Balance: " + getBalance();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        IntPooAccount account;//aqui vc só declara e não instancia pois vc vai precisar de dois objetos com parâmetros diferents conforme a regra de negócio.

        System.out.println("Enter account number: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter account holder: ");
        String name = sc.nextLine();
        System.out.println("Is there a initial deposit? ");
        String resp = sc.nextLine();

        if(resp.equalsIgnoreCase("y")){
            System.out.println("Enter initial deposit: ");
            double initialDeposit = sc.nextDouble();
            account = new IntPooAccount(id,name,initialDeposit);//aqui vc inicia a conta com o depósito inicial
        }
        else {
            //se não tiver depósito inicial vc não inicia a conta com ele, etn usar o construtor de dois argumentos.
            account = new IntPooAccount(id,name);
        }
        System.out.println(account.toString());
        System.out.println("Enter a deposit value: ");
        double depositValue = sc.nextDouble();
        account.deposit(depositValue);
        System.out.println("Enter a withdrawt value: ");
        double withdrawValue = sc.nextDouble();
        account.withdraw(withdrawValue);
        System.out.println(account.toString());


        //arrumar formatação no terminal


    }
}
