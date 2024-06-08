import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor da compra: ");
        double valorCompra = scanner.nextDouble();

        System.out.println("Digite a categoria do cliente (1 para comum, 2 para associado, 3 para VIP): ");
        int categoriaCliente = scanner.nextInt();

        double valorFinal = valorCompra;

        switch (categoriaCliente) {
            case 1:

                break;
            case 2:

                valorFinal = valorCompra * 0.90;
                break;
            case 3:

                valorFinal = valorCompra * 0.80;
                break;
            default:
                System.out.println("Categoria inválida.");
                return;
        }

        System.out.printf("O valor final da compra é: R$ %.2f\n", valorFinal);

        scanner.close();
    }
}
