import java.util.Scanner;

public class Uni3Uri06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numFuncionario = sc.nextInt();
        float horasTrabalhadas = sc.nextFloat();
        float valorHora = sc.nextFloat();

        float salario = valorHora * horasTrabalhadas;

        System.out.println("NUMBER = " + numFuncionario);
        System.out.printf("SALARY = U$ %.2f%n", salario);

        sc.close();
    }
}
