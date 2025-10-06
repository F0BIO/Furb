import java.util.Scanner;

public class Uni4Exe20 {
    Scanner sc = new Scanner(System.in);
    public Uni4Exe20(){
        System.out.print("Digite a nota da prova 1: ");
        double nota1 = sc.nextDouble();

        System.out.print("Digite a nota da prova 2: ");
        double nota2 = sc.nextDouble();

        System.out.print("Digite a nota da prova 3: ");
        double nota3 = sc.nextDouble();

        System.out.print("Digite a média dos exercícios: ");
        double mediaExercicios = sc.nextDouble();

        // Cálculo da média de aproveitamento
        double media = (nota1 + 2 * nota2 + 3 * nota3 + mediaExercicios) / 7.0;

        char conceito;
        String status;

        if (media >= 9.0) {
            conceito = 'A';
            status = "Aprovado";
        } else if (media >= 7.5) {
            conceito = 'B';
            status = "Aprovado";
        } else if (media >= 6.0) {
            conceito = 'C';
            status = "Aprovado";
        } else if (media >= 4.0) {
            conceito = 'D';
            status = "Reprovado";
        } else {
            conceito = 'E';
            status = "Reprovado";
        }

        System.out.printf("Média de aproveitamento: %.2f%n", media);
        System.out.println("Conceito: " + conceito);
        System.out.println("Situação: " + status);
    }
    public static void main(String[] args) {
        new Uni4Exe20();
    }
}
