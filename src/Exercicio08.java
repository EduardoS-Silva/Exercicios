import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a sua nota");

        int nota = sc.nextInt();

        if ( nota >=9){
            System.out.println("Sua Nota é A:" + nota);
        }else if( nota <=7 && nota <=9){
            System.out.println("Sua Nota é B:" + nota);
        }else if ( nota <=5 && nota <=7){
            System.out.println("Sua Nota é C:" + nota);
        }else if ( nota <=3 && nota <=5){
            System.out.println("Sua Nota é D:" + nota);
        }else{
            System.out.println("Sua Nota é F:" + nota);
        }
    }
}



//Escreva um programa que leia a nota de um aluno e converta-a para conceito:
// A (nota >= 9), B (7 <= nota < 9), C (5 <= nota < 7), D (3 <= nota < 5) e F (nota < 3).