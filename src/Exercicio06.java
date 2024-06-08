import java.util.Scanner;

public class Exercicio06 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a sua idade");
        int idade = sc.nextInt();

        if (idade >0 && idade <=13){
            System.out.println("Você é criança:" + idade);
        }else if (idade >13 && idade <=17){
            System.out.println("Você é adolescente:" + idade);
        }else if (idade >18 && idade <=59){
            System.out.println("Você é adulto:" + idade);
        }else
            System.out.println("Você é idoso" + idade);
        }
    }



// 0 a 12 = criança, 13 a 17 = adolescente, 18 a 59 = adulto e 60+ = idoso