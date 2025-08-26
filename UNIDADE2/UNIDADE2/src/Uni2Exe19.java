import java.util.Scanner;

public class Uni2Exe19 {
    /*Num sistema de equações o valor de A equivale ao valor de B e o valor de C 
    equivale ao valor de D. Leia os valores de B, C e D e calcule o valor de A.*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor de B: ");
        double B = sc.nextDouble();

        System.out.print("Digite o valor de C: ");
        double C = sc.nextDouble();

        System.out.print("Digite o valor de D: ");
        double D = sc.nextDouble();

        double A = B;

        System.out.println("O valor de A é: " + A);

        sc.close();
    }

/*Testes:
 * 
 * Entradas: 6, 5, 9
 * Saidas: 6.0
 * 
 * Entradas: 2, 9, 5
 * Saidas: 2.0
 * 
 * Entradas: 10, 7, 8
 * Saidas: 10.0
*/
}
