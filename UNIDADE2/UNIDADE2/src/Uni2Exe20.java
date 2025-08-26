import java.util.Scanner;
public class Uni2Exe20 {
    /*Considere que você tenha um papel quadrado e o dobre varias vezes 
    sempre em um número par de dobra no meio do quadrado. Ao abrir a folha 
    de papel é possível verificar a marcação de novos quadrados. Baseado nisso 
    leia o número de dobras (lembre que sempre é um número par) feitas no papel 
    e escreva quantos quadrados podem ser vistos após desdobrá-lo.*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas vezes deseja dobra o papel?");
        int dobras = sc.nextInt();

        if (dobras % 2 != 0) {
            System.out.println("O número de dobras deve ser par.");
            sc.close();
            return;
        }

        int quadradosVisiveis = (int) Math.pow(4, dobras / 2);

        System.out.println("O número de quadrados que podem ser vistos após desdobrá-lo é: " + quadradosVisiveis);
        
        sc.close();
    }
/*Testes:
 * 
 * Entradas: 4
 * Saidas: 16
 * 
 * Entradas: 14
 * Saidas: 16384
 * 
 * Entradas: 6
 * Saidas: 64
*/
}
