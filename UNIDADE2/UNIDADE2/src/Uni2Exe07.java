import java.util.Scanner;
public class Uni2Exe07 {
/*Faça um programa que leia o nome de um vendedor, o seu salário fixo e o total 
de vendas efetuadas por ele no mês (em dinheiro). Sabendo que este vendedor 
ganha 15% de comissão sobre suas vendas efetuadas, informar o total a receber 
no final do mês, com duas casas decimais. */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
                
        System.out.println("Informe o nome do vendedor: ");
        String nome = sc.next();

        System.out.println("Informe o salário do vendedor: ");
        double salario = sc.nextDouble();

        System.out.println("Informe o valor total da vendas realizadas: ");
        double valorVendas = sc.nextDouble();

        double comissao = valorVendas * 0.15;

        double total = comissao + salario;

        System.out.printf("O vendedor "+nome+" tem um total a receber de R$%.2f%n", total);


        sc.close();
    }
}
