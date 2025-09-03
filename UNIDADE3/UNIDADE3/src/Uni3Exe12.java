import java.util.Scanner;

public class Uni3Exe12 {
/*Uma empresa tem para um funcionário os seguintes dados: o nome, o número de horas 
trabalhadas mensais e o número de dependentes. A empresa paga R$ 10,00 por hora 
(valor para cálculo do salário trabalho) e R$ 60,00 por dependente 
(valor para cálculo do salário família) e são feitos descontos de 8,5% sobre 
o salário trabalho para o INSS e de 5% sobre o salário trabalho para o imposto de renda. 
Descreva um programa que informe o nome, o salário bruto e o salário líquido do funcionário. */

    public static void main(String[] args) throws Exception {
        calculoSalario();
    }

    public static void calculoSalario(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = sc.next();

        System.out.print("Quantidade de horas trabalhadas no mês: ");
        double horasTrab = sc.nextDouble();

        System.out.print("Imforme quantos dependentes o funcionário possui: ");
        int dependentes = sc.nextInt();

        double salarioTrab = (horasTrab * 10);
        double salarioFamilia = (dependentes * 60);

        double salarioBruto = salarioTrab + salarioFamilia;
        double salarioliquido = ((salarioTrab - (salarioTrab * 0.085)) - salarioTrab * 0.05) + salarioFamilia;

        System.out.printf("O funcionário "+nome+" possui um salário bruto de R$%.2f e um salário líquido de R$%.2f%n",salarioBruto, salarioliquido);

        sc.close();
    }
/*Testes:
 * 
 * Entradas: Pedro | 200 | 3
 * Saídas: O funcionário Pedro possui um salário bruto de R$2180,00 e um salário líquido de R$1910,00
 * 
 * Entradas: Robson | 180 | 1
 * Saídas: O funcionário Robson possui um salário bruto de R$1860,00 e um salário líquido de R$1617,00
 * 
 * Entradas: Nelson | 145 | 2
 * Saídas: O funcionário Nelson possui um salário bruto de R$1570,00 e um salário líquido de R$1374,25
*/
}
