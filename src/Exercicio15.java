import java.util.Scanner;

public class Exercicio15 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a sua altura em Cm:");
        float altura = sc.nextFloat();

        System.out.println("Digite seu peso em Kg:");
        float peso = sc.nextFloat();

        float imc = peso/ (altura * altura);

        if(imc <18.5){
            System.out.println("você está abaixo do peso:" + imc);
        }else if ( imc >=18.5 & imc < 24.9){
            System.out.println("Seu Peso está normal:" + imc);
        } else if( imc >=25 & imc < 29.9){
            System.out.println("Você está com sobrepeso:" + imc);
        }else if ( imc >=30 & imc <34.9){
            System.out.println("Você está com obesidade grau I:" + imc);
        }else if (imc >=35 & imc < 39.9){
            System.out.println("VocÊ está com obesidade grau II:" + imc);
        }else{
            System.out.println("Você está com obesidade grau III:" + imc);
        }
    }
}
