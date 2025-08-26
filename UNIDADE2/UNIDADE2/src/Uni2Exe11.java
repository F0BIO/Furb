import java.util.Scanner;
public class Uni2Exe11 {
/* Escreva um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e mostre:
a) a área do triângulo retângulo que tem A por base e C por altura.
b) a área do círculo de raio C. (pi = 3.14159).
c) a área do trapézio que tem A e B por bases e C por altura.
d) a área do quadrado que tem lado B.
e) a área do retângulo que tem lados A e B.
 */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        double A = sc.nextDouble();

        System.out.print("Digite o valor de B: ");
        double B = sc.nextDouble();

        System.out.print("Digite o valor de C: ");
        double C = sc.nextDouble();

        double areaTR = (A*C)/2;
        System.out.println("A) a área do triângulo retângulo que tem A por base e C por altura é: "+ areaTR);

        double areaC = 3.14159*Math.pow(C,2);
        System.out.println("B) a área do círculo de raio C é: "+ areaC);

        double areaTra = ((A*B)*C)/2;
        System.out.println("C) a área do trapézio que tem A e B por bases e C por altura é: "+ areaTra);

        double areaQ = Math.pow(B,2);
        System.out.println("D) a área do quadrado que tem lado B é: "+ areaQ);

        double areaR = A * B;
        System.out.println("E) a área do retângulo que tem lados A e B é: "+ areaR);
        sc.close();

    }
/*Testes:
 * 
 * Entradas: 46, 63, 85
 * Saidas: 1955.0, 22697.98775, 123165.0, 3969.0, 2898.0
 * 
 * Entradas: 2, 6, 7
 * Saidas: 7.0, 153.93791, 42.0, 36.0, 12.0
 * 
 * Entradas: 100, 611, 345
 * Saidas: 17250.0, 373927.74974999996, 1.053975E7, 373321.0, 61100.0
*/
}
