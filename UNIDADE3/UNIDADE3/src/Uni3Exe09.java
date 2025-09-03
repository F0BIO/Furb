import java.util.Scanner;

public class Uni3Exe09 {
/*Descreva um programa que calcule o volume de uma lata de óleo. Fórmula:
 * Quantas casas decimais devo usar para o número Pi?
 */

    public static void main(String[] args) throws Exception {
        calcularVolume();
    }

    public static void calcularVolume(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Raio: ");
        double raio = sc.nextDouble();
        System.out.print("Altura: ");
        double altura = sc.nextDouble();

        double pi = Math.PI;
        double volume = pi * Math.pow(raio, 2) * altura;

        System.out.printf("O volume da lata de óleo é: %.2f%n", volume);
        sc.close();
    }
/*Testes:
 * 
 * Entradas: 10 | 15
 * Saídas: O volume da lata de óleo é: 4712,39
 * 
 * Entradas: 5 | 12
 * Saídas: O volume da lata de óleo é: 942,48
 * 
 * Entradas: 20 | 14
 * Saídas: O volume da lata de óleo é: 17592,92
*/
}
