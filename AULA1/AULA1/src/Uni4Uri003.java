import java.util.Scanner;

public class Uni4Uri003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("DIGITE O NOME DO ALUNO");
        String aluno = sc.nextLine();

        double nota1, nota2, nota3;
        double media;

        System.out.println("DIGITE AS NOTA DOS ALUNOS");
        nota1 = sc.nextDouble();
        nota2 = sc.nextDouble();
        nota3 = sc.nextDouble();
        
        media = (nota1 + nota2 + nota3) / 3;

        System.out.println(String.format("A MEDIA DO ALUNO %s É %.2f", aluno, media));
        
    }
}
