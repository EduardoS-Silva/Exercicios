import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o codigo para saber a categoria do produto");
        int codigo = sc.nextInt();

        if( codigo >=1 && codigo <=10) {
            System.out.println("O produto é um Alimento não perecível:" + codigo);
        }else if ( codigo >=11 && codigo <=20){
            System.out.println("O produto é um Alimento perecível:" + codigo);
        }else if (codigo >=21 && codigo <=30){
            System.out.println("O produto é um Vestuário:" + codigo);
        }else if( codigo >=31 && codigo <=40){
            System.out.println("O produto é um Eletrônico:" + codigo);
        }else{
            System.out.println("O código é invalido");
        }
    }
}