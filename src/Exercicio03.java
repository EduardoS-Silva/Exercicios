import java.util.Scanner;

public class Exercicio03 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero");
        int numero1 = sc.nextInt();

        System.out.println("Digite ou numero");
        int numero2 = sc.nextInt();

        if (numero1 > numero2) {
            System.out.println("O primeiro numero é maior que o segundo.");
        } else if (numero1 < numero2) {
            System.out.println("O segundo numero é maior que o primeiro.");
        } else {
            System.out.println("Os dois numeros são iguais.");
        }

        sc.close();
    }
}
