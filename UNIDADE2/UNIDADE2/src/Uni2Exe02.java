import java.util.Scanner;

public class Uni2Exe02 {
// Leia 2 valores inteiros e imprima sua multiplicação.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num1 = sc.nextInt();

        System.out.println("Digite outro número: ");
        int num2 = sc.nextInt();

        int multiplicacao = num1 * num2;

        System.out.println("A soma dos números informados é: " + multiplicacao);
        sc.close();
    }

}
