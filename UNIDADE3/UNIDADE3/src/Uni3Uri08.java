import java.util.Scanner;

public class Uni3Uri08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int codigoPeca1 = sc.nextInt();
        int numPeca1 = sc.nextInt();
        float valorPeca1 = sc.nextFloat();


        int codigoPeca2 = sc.nextInt();
        int numPeca2 = sc.nextInt();
        float valorPeca2 = sc.nextFloat();

        float total = (valorPeca1 * numPeca1) + (valorPeca2 * numPeca2);

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);
        
        sc.close();
        }
}
