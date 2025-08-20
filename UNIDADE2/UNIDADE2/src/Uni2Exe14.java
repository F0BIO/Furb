import java.util.Scanner;
public class Uni2Exe14 {
/* Leia um valor inteiro. A seguir, calcule o menor número de notas possíveis 
(cédulas) no qual o valor pode ser decomposto. As notas consideradas são de 100, 
50, 20, 10, 5, 2 e 1. A seguir mostre o valor lido e a relação de notas necessárias.*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Escreva o valor em R$ a ser dividido: ");
        int dinheiro = sc.nextInt();

        System.out.println("Notas de 100,00: " + dinheiro / 100);
        dinheiro = dinheiro % 100;
        System.out.println("Notas de 50,00: " + dinheiro / 50);
        dinheiro = dinheiro % 50;
        System.out.println("Notas de 20,00: " + dinheiro / 20);
        dinheiro = dinheiro % 20;
        System.out.println("Notas de 10,00: " + dinheiro / 10);
        dinheiro = dinheiro % 10;
        System.out.println("Notas de 5,00: " + dinheiro / 5);
        dinheiro = dinheiro % 5;
        System.out.println("Notas de 2,00: " + dinheiro / 2);
        dinheiro = dinheiro % 2;
        System.out.println("Moedas de 1,00: " + dinheiro / 1);

        sc.close();
        

    }

}
