import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escreva o nome do aluno :");
        String aluno = sc.nextLine();

        Double prova1, prova2, projetoFinal, trabExec1, trabExec2, trabExec3, trabExec4, trabExec5, trabExec6,  media;

        System.err.println("DIGITE AS NOTAS DA PROVAS");
        System.err.println("PROVA 1");
        prova1 = sc.nextDouble();

        System.err.println("PROVA 2");
        prova2 = sc.nextDouble();
        

        System.err.println("PROJETO FINAL");
        projetoFinal = sc.nextDouble();

        System.out.println("TRABALHOS EXERCICIOS");
        trabExec1 = sc.nextDouble();
        trabExec2 = sc.nextDouble();
        trabExec3 = sc.nextDouble();
        trabExec4 = sc.nextDouble();
        trabExec5 = sc.nextDouble();
        trabExec6 = sc.nextDouble();

        media = (prova1 * 0.2) + (prova2 * 0.3) + (projetoFinal * 0.3) + ((trabExec1 +trabExec2 + trabExec3+ trabExec4 + trabExec5 + trabExec6 )/6 * 0.2);

        System.out.println(String.format("A Média do aluno %s é: %.2f",aluno, media));
        sc.close();
        
    }
}
