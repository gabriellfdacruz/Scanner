import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);

        System.out.println("Qual seu nome ?");

        System.out.println("Digite seu nome: ");
        String nome = valor.nextLine();

        System.out.println("Voce digitou: " + nome);

        valor.close();
        
    }
}