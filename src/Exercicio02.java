import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero e informe se ele é positivo, negativo ou zero.");
        int numero = sc.nextInt();

        if (numero <0){
            System.out.println("O numero é negativo:" + numero);
            }else if (numero >0){
            System.out.println("O numero é positivo:" + numero);
        }else{
            System.out.println("O numero é zero" + numero);

            sc.close();
        }
        }
    }
