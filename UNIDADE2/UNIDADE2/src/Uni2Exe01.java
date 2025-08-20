import java.util.Scanner;

public class Uni2Exe01 {
// Leia 2 valores inteiros e imprima sua soma.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num1 = sc.nextInt();

        System.out.println("Digite outro número: ");
        int num2 = sc.nextInt();

        int soma = num1 + num2;

        System.out.println("A soma dos números informados é: " + soma);

        sc.close();
    }


}
