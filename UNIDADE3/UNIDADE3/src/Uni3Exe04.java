import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Scanner;

public class Uni3Exe04 {
/*Faça um programa para ler três notas de um aluno em uma 
disciplina e imprimira sua média ponderada 
(as notas tem pesos respectivos de 5, 3 e 2).*/

    public static void main(String[] args) throws Exception {
        mediaPonderada();
    }

    public static void mediaPonderada(){
        Scanner sc = new Scanner(System.in);
        DecimalFormatSymbols simbolos = new DecimalFormatSymbols(Locale.US);
        DecimalFormat df_2 = new DecimalFormat("0.00", simbolos);
        System.out.println("Digite as notas dos alunos: ");
        double nota1 = sc.nextDouble();
        double nota2 = sc.nextDouble();
        double nota3 = sc.nextDouble();

        double media = (nota1*0.5)+(nota2*0.3)+(nota3*0.2);
        System.out.println("Média: "+ df_2.format(media));

        sc.close();
    }
/*Testes:
 * 
 * Entradas: 9 | 5 | 10
 * Saídas: 8.00
 * 
 * Entradas: 7 | 8 | 4
 * Saídas: 6.70
 * 
 * Entradas: 2 | 10 | 7
 * Saídas: 5.40
*/
}
