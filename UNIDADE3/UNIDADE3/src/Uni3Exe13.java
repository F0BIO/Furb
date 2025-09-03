import java.util.Scanner;

public class Uni3Exe13 {
/*Numa loja de materiais de construção, um azulejo estampado custa R$ 12,50. 
Faça um programa para ler o comprimento e altura de uma parede (em metros), 
e depois escrever o valor gasto com a compra de azulejos. 
Considere que um metro quadrado é formado por 9 azulejos.*/

    public static void main(String[] args) throws Exception {
        calculoValorAzuleijo();
    }

    public static void calculoValorAzuleijo(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Altura: ");
        double altura = sc.nextDouble();

        System.out.print("Comprimento: ");
        double comprimento = sc.nextDouble();

        double area = comprimento * altura;
        double azulejosMetroQuadrado = 9;
        double precoAzulejo = 12.50;

        double totalAzulejos = area * azulejosMetroQuadrado;
        double valorTotal = totalAzulejos * precoAzulejo;

        System.out.printf("O valor final é R$%.2f%n", valorTotal);

        sc.close();
        
    }
/*Testes:
 * 
 * Entradas: 5 | 10
 * Saídas: O valor final é R$5625,00
 * 
 * Entradas: 12 | 16
 * Saídas: O valor final é R$21600,00
 * 
 * Entradas: 2,4 | 5,7
 * Saídas: O valor final é R$1539,00
*/
}
