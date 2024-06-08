import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro lado do triângulo:");
        double lado1 = sc.nextDouble();

        System.out.println("Digite o segundo lado do triângulo:");
        double lado2 = sc.nextDouble();

        System.out.println("Digite o terceiro lado do triângulo:");
        double lado3 = sc.nextDouble();

        if ((lado1 + lado2 > lado3) && (lado1 + lado3 > lado2) && (lado2 + lado3 > lado1)) {
            System.out.println("Os lados formam um triângulo válido.");
        } else {
            System.out.println("Os lados não formam um triângulo válido.");
        }

        sc.close();
    }
}