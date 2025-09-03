import java.util.Scanner;

public class Uni3Uri07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nomeFuncionario = sc.next();
        double salarioFixo = sc.nextDouble();
        double TotalVendas = sc.nextDouble();

        double salario = salarioFixo + (TotalVendas*0.15);

        System.out.printf("Nome: "+nomeFuncionario+"\nTOTAL = R$ %.2f%n", salario);

        sc.close();
    }
}
