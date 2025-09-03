import java.util.Scanner;

public class MediaFinal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do aluno: ");
        String nomeAluno = scanner.next();

        System.out.print("Digite a nota da Prova 1: ");
        double nota1 = scanner.nextFloat();

        System.out.print("Digite a nota da Prova 2: ");
        double nota2 = scanner.nextFloat();

        System.out.print("Digite a nota do Projeto Final: ");
        double nota3 = scanner.nextFloat();

        double[] trabalhos = new double[6];

        for (int i = 0; i < trabalhos.length ;i++){

            System.out.print("Digite a nota do Trabalho "+(i+1)+": ");
            trabalhos[i] = scanner.nextDouble();
        }

        double soma = 0;
        for (int i = 0; i < trabalhos.length; i++) {
            soma += trabalhos[i];
        }

        double MediaTrabalho = soma / trabalhos.length;
        double mediafinal = ((nota1*0.2)+(nota2*0.3)+(nota3*0.3)+(MediaTrabalho*0.2));

        if (mediafinal >= 6) {
            System.out.printf("Aluno " + nomeAluno + 
                                " aprovado. Média: %.2f%n ", mediafinal);
        }
        else {
            System.out.printf("Aluno " + nomeAluno + 
                                " reprovado. Média: %.2f%n ", mediafinal);
        }

        scanner.close();
    }
}
