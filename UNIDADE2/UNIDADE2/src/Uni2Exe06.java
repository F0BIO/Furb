import java.util.Scanner;

public class Uni2Exe06 {
/*Escreva um programa que leia o número de um funcionário, seu número 
de horas trabalhadas, o valor que recebe por hora e calcula o salário 
desse funcionário. A seguir, mostre o número e o salário do funcionário, 
com duas casas decimais. */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Informe o ID do funcionário: ");
        int id = sc.nextInt();

        System.out.println("Informe as horas trabalhadas: ");
        double horas = sc.nextDouble();

        System.out.println("Informe o valor recebido por hora: ");
        double valorHora = sc.nextDouble();

        double salario = valorHora * horas;

        System.out.printf("Funcionario: "+id+
                            "\nSalário: %.2f%n", salario);

        sc.close();
    }
}
