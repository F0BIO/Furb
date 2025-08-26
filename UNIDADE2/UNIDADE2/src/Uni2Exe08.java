import java.util.Scanner;

public class Uni2Exe08 {
    /*Neste problema, deve-se ler o código de uma peça 1, o número de peças 1, 
    o valor unitário de cada peça 1, o código de uma peça 2, o número de peças 2 
    e o valor unitário de cada peça 2. Após, calcule e mostre o valor a ser 
    pago. */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o código da primeira peça: ");
        int peca1 = sc.nextInt();

        System.out.println("Informe quantas unidades desta peça: ");
        int quantidadePeca1 = sc.nextInt();

        System.out.println("Informe o valor unitário da primeira peça: ");
        int valorPeca1 = sc.nextInt();

        System.out.println("Informe o código da segunda peça: ");
        int peca2 = sc.nextInt();

        System.out.println("Informe quantas unidades desta peça: ");
        int quantidadePeca2 = sc.nextInt();

        System.out.println("Informe o valor unitário da segunda peça: ");
        int valorPeca2 = sc.nextInt();

        double total = (valorPeca1 * quantidadePeca1) + (valorPeca2 * quantidadePeca2);

        System.out.println("Valor da peça "+peca1+": R$"+valorPeca1 * quantidadePeca1+
                            "\nValor da peça "+peca2+": R$"+valorPeca2 * quantidadePeca2+
                            "\nO valor total a ser pago: R$"+total);
        
        sc.close();
    }
/*Testes:
 * 
 * Entradas: 12, 2, 10, 15, 3, 8
 * Saidas: 44.0
 * 
 * Entradas: 5, 3, 17, 8, 4, 20
 * Saidas: 131.0
 * 
 * Entradas: 10, 8, 30, 3, 6, 2
 * Saidas: 252.0
*/
}
