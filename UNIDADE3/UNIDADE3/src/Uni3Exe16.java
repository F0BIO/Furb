import java.util.Scanner;

public class Uni3Exe16 {
/*Suponha que um caixa disponha apenas de notas de 100, 10 e 1 reais. 
Considerando que alguém está pagando uma compra, faça um programa que 
determine e escreva o número mínimo de notas que o caixa deve fornecer como troco. 
Escreva também o número de cada tipo de nota a ser fornecido como troco. 
Suponha que o sistema monetário não utilize centavos.*/

    public static void main(String[] args) throws Exception {
        calculoTroco();
    }

    public static void calculoTroco(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Valor total da compra: ");
        int valor = sc.nextInt();

        int notas100 = valor / 100;
        int resto = valor % 100;
        int notas10 = resto / 10;
        resto = resto % 10;
        int notas1 = resto;

        int totalNotas = notas100 + notas10 + notas1;

        System.out.println("O número mínimo de notas de troco é: " + totalNotas);
        System.out.println("Quantidade de notas de 100 necessárias é: " + notas100);
        System.out.println("Quantidade de notas de 10 necessárias é: " + notas10);
        System.out.println("Quantidade de notas de 1 necessárias é: " + notas1);

        sc.close();
    }
/*Testes:
 * 
 * Entradas: 602
 * Saídas: O número mínimo de notas de troco é: 8 | Quantidade de notas de 100 necessárias é: 6 | Quantidade de notas de 10 necessárias é: 0 | Quantidade de notas de 1 necessárias é: 2
 * 
 * Entradas: 1540
 * Saídas: O número mínimo de notas de troco é: 19 | Quantidade de notas de 100 necessárias é: 15 | Quantidade de notas de 10 necessárias é: 4 | Quantidade de notas de 1 necessárias é: 0
 * 
 * Entradas: 2000
 * Saídas: O número mínimo de notas de troco é: 20 | Quantidade de notas de 100 necessárias é: 20 | Quantidade de notas de 10 necessárias é: 0 | Quantidade de notas de 1 necessárias é: 0
*/
}
