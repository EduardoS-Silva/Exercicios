import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        if (numero >= 10 && numero <= 20) {
            System.out.println("O número " + numero + " está no intervalo de 10 a 20.");
        } else {
            System.out.println("O número " + numero + " não está no intervalo de 10 a 20.");
        }

        scanner.close();
    }
}
