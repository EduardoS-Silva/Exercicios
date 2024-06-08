import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero inteiro para descobrir se ele é par ou impar");
        int numero = sc.nextInt();

        if (numero % 2 == 0) {
            System.out.println("O numero digitado é par:" + numero);
        } else {
            System.out.println("O numero é digitado é par:" + numero);

            sc.close();
        }
    }
}