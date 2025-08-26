import java.util.Scanner;
public class Uni2Exe18 {
    /*Numa loja de materiais de construção, um azulejo estampado custa R$ 12,50. 
    Leia o comprimento e altura de uma parede (em metros) e escreva o valor 
    gasto com a compra de azulejos. Considere que um metro quadrado é formado por 9 azulejos.*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Imfome a altura da parede em metros: ");
        double altura = sc.nextDouble();

        System.out.println("Imfome a comprimento da parede em metros: ");
        double comprimento = sc.nextDouble();

        double area = comprimento * altura;
        double azulejosMetroQuadrado = 9;
        double precoAzulejo = 12.50;

        double totalAzulejos = area * azulejosMetroQuadrado;
        double valorTotal = totalAzulejos * precoAzulejo;

        System.out.printf("Quantidade de azulejos: %.0f%n", Math.ceil(totalAzulejos));
        System.out.printf("Valor total a pagar: R$ %.2f%n", valorTotal);

        sc.close();
    }

/*Testes:
 * 
 * Entradas: 5 | 8
 * Saidas: 4500,00
 * 
 * Entradas: 3 | 10
 * Saidas: 3375,00
 * 
 * Entradas: 10 | 20
 * Saidas: 22500,00
*/
}
