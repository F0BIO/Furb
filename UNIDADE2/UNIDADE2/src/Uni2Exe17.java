import java.util.Scanner;
/*Uma empresa tem para um funcionário os seguintes dados: o nome, o número de horas 
trabalhadas mensais e o número de dependentes. A empresa paga R$ 10,00 por hora 
(valor para cálculo do salário trabalho) e R$ 60,00 por dependente 
(valor para cálculo do salário família) e são feitos descontos de 8,5% sobre o salário 
trabalho para o INSS e de 5% sobre o salário trabalho para o imposto de renda. Ao final 
informe o nome, o salário bruto e o salário líquido do funcionário.*/
public class Uni2Exe17 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Imforme o nome do funcionário: ");
        String nome = sc.next();

        System.out.println("Imforme as horas trabalhadas do funcionário: ");
        double horasTrab = sc.nextDouble();

        System.out.println("Imforme quantos dependentes o funcionário possui: ");
        int dependentes = sc.nextInt();

        double salarioTrab = (horasTrab * 10);
        double salarioFamilia = (dependentes * 60);

        double salarioBruto = salarioTrab + salarioFamilia;
        double salarioliquido = ((salarioTrab - (salarioTrab * 0.085)) - salarioTrab * 0.05) + salarioFamilia;

        System.out.println("Nome:"+nome+
                        "\nSalario Bruto: "+ salarioBruto +
                            "\nSalario Líquido: "+ salarioliquido);

        sc.close();
    
    }
/*Testes:
 * 
 * Entradas: Cleiton, 32, 2
 * Saidas: 440.0, 396,8
 * 
 * Entradas: Romario, 46, 3
 * Saidas: 640.0, 577.9
 * 
 * Entradas: Roger, 50, 4
 * Saidas: 740.0, 672.5
*/
}
