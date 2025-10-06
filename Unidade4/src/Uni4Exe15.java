import java.util.Scanner;

public class Uni4Exe15 {
    Scanner sc = new Scanner(System.in);
    public Uni4Exe15(){
        System.out.print("Digite o salário atual do funcionário: R$ ");
        double salario = sc.nextDouble();

        System.out.print("Digite há quantos meses o funcionário foi admitido: ");
        int mesesAdmissao = sc.nextInt();

        double reajuste = 0.0;

        if (mesesAdmissao >= 0 && mesesAdmissao <= 12) {
            reajuste = salario * 0.05;
        } else if (mesesAdmissao >= 13 && mesesAdmissao <= 48) {
            reajuste = salario * 0.07;
        }

        if (reajuste > 0) {
            System.out.printf("O funcionário receberá um reajuste de R$ %.2f%n", reajuste);
            System.out.printf("Novo salário: R$ %.2f%n", salario + reajuste);
        } else {
            System.out.println("O funcionário não tem direito a reajuste.");
        }

    }
    public static void main(String[] args) {
        new Uni4Exe15();
    }
}
