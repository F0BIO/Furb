import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do aluno: ");
        String nomeAluno = scanner.next();

        System.out.print("Digite a primeira nota: ");
        float nota1 = scanner.nextFloat();

        System.out.print("Digite a segunda nota: ");
        float nota2 = scanner.nextFloat();

        System.out.print("Digite a terceira nota: ");
        float nota3 = scanner.nextFloat();

        float media = (nota1 + nota2 + nota3) / 3;

        if (media >= 6) {
            System.out.println("Aluno " + nomeAluno + 
                                " aprovado. Média:" + media);
        }
        else {
            System.out.println("Aluno " + nomeAluno + 
                                " reprovado. Média:" + media);
        }

        scanner.close();
    }
}
