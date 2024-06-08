import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        double numero = scanner.nextDouble();

        if (numero >= 0) {

            double raizQuadrada = Math.sqrt(numero);
            System.out.printf("O número é positivo. A raiz quadrada de %.2f é %.2f.\n", numero, raizQuadrada);
        } else {

            double aoQuadrado = Math.pow(numero, 2);
            System.out.printf("O número é negativo. %.2f ao quadrado é %.2f.\n", numero, aoQuadrado);
        }

        scanner.close();
    }
}
