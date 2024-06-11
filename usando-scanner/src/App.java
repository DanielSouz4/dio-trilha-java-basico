
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite as suas informações:");

        System.out.print("Digite seu nome: ");
        String nome = scanner.next();



        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.print("Digite sua altura: ");
        double altura = scanner.nextDouble();

        System.out.println("Olá, meu nome é "+nome+ ", Tenho "+idade+" anos de idade e "+altura+" de altura");
    }
}
