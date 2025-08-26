import java.util.Scanner;
public class Uni2Exe15 {
    /*Leia um valor de ponto flutuante com duas casas decimais. 
    Este valor representa um valor monetário. A seguir, calcule o menor 
    número de notas e moedas possíveis no qual o valor pode ser decomposto. 
    As notas consideradas são de 100, 50, 20, 10, 5, 2. As moedas possíveis 
    são de 1, 0.50, 0.25, 0.10, 0.05 e 0.01. A seguir mostre a relação de notas 
    necessárias. */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um valor em R$ a ser dividido: ");
        float valor = sc.nextFloat();
        int centavos = (int) Math.round(valor * 100);

        int nota100 = centavos / 10000;
        centavos = centavos % 10000;
        System.out.println("Notas de 100,00: " + nota100);

        int nota50 = centavos / 5000;
        centavos = centavos % 5000;
        System.out.println("Notas de 50,00: " + nota50);

        int nota20 = centavos / 2000;
        centavos = centavos % 2000;
        System.out.println("Notas de 20,00: " + nota20);

        int nota10 = centavos / 1000;
        centavos = centavos % 1000;
        System.out.println("Notas de 10,00: " + nota10);

        int nota5 = centavos / 500;
        centavos = centavos % 500;
        System.out.println("Notas de 5,00: " + nota5);

        int nota2 = centavos / 200;
        centavos = centavos % 200;
        System.out.println("Notas de 2,00: " + nota2);

        int moeda1 = centavos / 100;
        centavos = centavos % 100;
        System.out.println("Moedas de 1,00: " + moeda1);

        int moeda05 = centavos / 50;
        centavos = centavos % 50;
        System.out.println("Moedas de 0,50: " + moeda05);

        int moeda025 = centavos / 25;
        centavos = centavos % 25;
        System.out.println("Moedas de 0,25: " + moeda025);

        int moeda010 = centavos / 10;
        centavos = centavos % 10;
        System.out.println("Moedas de 0,10: " + moeda010);

        int moeda005 = centavos / 5;
        centavos = centavos % 5;
        System.out.println("Moedas de 0,05: " + moeda005);

        int moeda001 = centavos / 1;
        centavos = centavos % 1;
        System.out.println("Moedas de 0,01: " + moeda001);

        sc.close();
    
    }

/*Testes:
 * 
 * Entradas: 1455
 * Saidas: 14, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0
 * 
 * Entradas: 945
 * Saidas: 9, 0, 2, 0, 1, 0, 0, 0, 0, 0, 0, 0
 * 
 * Entradas: 6645
 * Saidas: 66, 0, 2, 0, 1, 0, 0, 0, 0, 0, 0, 0
*/
}
