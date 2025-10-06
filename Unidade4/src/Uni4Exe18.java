import java.util.Scanner;

public class Uni4Exe18 {
    Scanner sc = new Scanner(System.in);
    public Uni4Exe18(){
         System.out.print("Digite o dia do vencimento (1 a 10): ");
        int diaVencimento = sc.nextInt();

        System.out.print("Digite o dia do pagamento (1 a 31): ");
        int diaPagamento = sc.nextInt();

        System.out.print("Digite o valor da prestação: R$ ");
        double valorPrestacao = sc.nextDouble();

        int diasAtraso = diaPagamento - diaVencimento;
        double valorFinal = valorPrestacao;

        if (diasAtraso < 0) {
            valorFinal = valorPrestacao * 0.90;
            System.out.println("Pagamento em dia (antecipado). Desconto de 10% aplicado.");
        } else if (diasAtraso == 0) {
            valorFinal = valorPrestacao * 0.90;
            System.out.println("Pagamento em dia. Desconto de 10% aplicado.");
        } else if (diasAtraso <= 5) {
            System.out.println("Pagamento com pequeno atraso. Sem desconto.");
        } else {

            double multa = valorPrestacao * 0.02 * diasAtraso;
            valorFinal = valorPrestacao + multa;
            System.out.println("Pagamento com atraso. Multa de 2% ao dia aplicada.");
            System.out.printf("Dias de atraso: %d - Multa total: R$ %.2f%n", diasAtraso, multa);
        }


        System.out.printf("Valor a ser pago: R$ %.2f%n", valorFinal);
    }
    public static void main(String[] args) {
        new Uni4Exe18();
    }
}
