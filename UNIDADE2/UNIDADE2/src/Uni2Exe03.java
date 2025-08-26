import java.util.Scanner;

public class Uni2Exe03 {
/*Calcule a área da circunferência elevando o valor de raio ao quadrado 
e multiplicando por π (π = 3.14159). */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        System.out.println("Informe o valor do raio: ");
        double raio = sc.nextDouble();
        double raioAoQuadrado = Math.pow(raio, 2);

        double pi = 3.14159;
        double area = raioAoQuadrado * pi;

        System.out.println("A área da circunferência é: " + area);

        sc.close();
   }
/*Testes:
 * 
 * Entradas: 5
 * Saidas: 78.53975
 * 
 * Entradas: 7
 * Saidas: 153.93791
 * 
 * Entradas: 2
 * Saidas: 12.56636
*/
}
