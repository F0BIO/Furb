import java.util.Scanner;

public class Uni4Exe01 {

    public Uni4Exe01(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o número de horas trabalhadas no mês: ");
        double horasTrab = sc.nextDouble();

        System.out.println("Informe o valor recebido por hora trabalhada: ");
        double valorHora = sc.nextDouble();
        double total = calculoSalario(horasTrab, valorHora);
        System.out.printf("O salário total é: %.2f%n", total);

        sc.close();
    }
    public static void main(String[] args) {
        new Uni4Exe01();
    }

    private double calculoSalario(double horasTrab, double valorHora) {
        double salarioTotal = horasTrab * valorHora;
        if (horasTrab > 160) {
            double salarioExtra = (horasTrab - 160) * (valorHora / 2);
            salarioTotal += salarioExtra;
        }
        return salarioTotal;
    }
}

/*Testes:
 * 
 * Entradas: 
 * Saídas: 	
 * 
 * Entradas: 
 * Saídas: 	
 * 
 * Entradas: 
 * Saídas: 	
*/