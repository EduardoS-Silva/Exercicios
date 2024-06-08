import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        System.out.println("Digite a nota1:" );
        float nota1 = Sc.nextFloat();

        System.out.println("Digite a nota2:" );
        float nota2 = Sc.nextFloat();

        System.out.println("Digite a nota3:" );
        float nota3 = Sc.nextFloat();

        float media = (nota1 + nota2 + nota3 )/3;

        if (media >= 7) {
            System.out.println("O aluno foi aprovado:" +media);
        } else if ( media <5 &&  media < 7 ){
            System.out.println("O aluno está de recuperação:" +media);
        } else{
            System.out.println("O aluno foi reprovado:" +media);

        }
    }
}