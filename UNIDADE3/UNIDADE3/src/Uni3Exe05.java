import java.util.Scanner;

public class Uni3Exe05 {
/*Uma granja possui um controle automatizado de cada frango da sua produção. 
No pé direito do frango há um anel com um chip de identificação; no pé esquerdo 
são dois anéis para indicar o tipo de alimento que ele deve consumir. 
Sabendo que o anel com chip custa R$ 4,00 e o anel de alimento custa R$ 3,50, 
faça um programa para calcular o gasto total da granja para marcar todos os seus frangos. */

    public static void main(String[] args) throws Exception {
        marcarFrango();
    }

    public static void marcarFrango(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a quantidade de frangos: ");
        int qtdFrango = sc.nextInt();

        double gastoTotal = qtdFrango * (4 + (3.5 * 2));

        System.out.println("O gasto total para marcar "+qtdFrango+" é R$"+ gastoTotal);
        sc.close();
    }
/*Testes:
 * 
 * Entradas: 50
 * Saídas: 	O gasto total para marcar 50 é R$550.0
 * 
 * Entradas: 100
 * Saídas: 	O gasto total para marcar 100 é R$1100.0
 * 
 * Entradas: 200
 * Saídas: 	O gasto total para marcar 200 é R$2200.0
*/
}
