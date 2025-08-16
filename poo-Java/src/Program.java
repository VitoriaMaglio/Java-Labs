import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Product product = new Product();
        System.out.println("Enter product data: ");
        System.out.println("name : ");
        product.setName(sc.nextLine()); //aqui vc guarda o nome do produto na variavel nome
        System.out.println("Price: ");
        product.price = sc.nextDouble();
        System.out.println("Quantity in stock: ");
        product.quantity = sc.nextInt();
        System.out.println(product.getName() + " ;" + product.price + " ;"+product.quantity);

    }
}
