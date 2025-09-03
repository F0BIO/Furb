import java.util.Scanner;

public class Uni3Exe06 {
/*Um restaurante cobra R$ 25,00 por cada quilo de refeição. 
Escreva um programa que leia o peso do prato montado pelo cliente 
(em quilos) e imprima o valor a pagar. O peso do prato é de 750 gramas.*/

    public static void main(String[] args) throws Exception {
        calculoValorPrato();
    }

    public static void calculoValorPrato(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Imforme o peso do prato(em KG):");
        double pesoDoPrato = sc.nextFloat();

        double totalPagamento = 25 * (pesoDoPrato-0.75);

        System.out.printf("O valor do prato do cliente é R$%.2f%n",totalPagamento);
        sc.close();
    }


/*Testes:
 * 
 * Entradas: 1,5
 * Saídas: O valor do prato do cliente é R$18,75
 * 
 * Entradas: 2
 * Saídas: O valor do prato do cliente é R$31,25
 * 
 * Entradas: 2,5
 * Saídas: O valor do prato do cliente é R$43,75
*/
}
