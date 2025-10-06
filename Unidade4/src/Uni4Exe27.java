import java.util.Scanner;

public class Uni4Exe27 {
    Scanner sc = new Scanner(System.in);
    public Uni4Exe27(){
    int horaChegada, minChegada, horaSaida, minSaida;

        System.out.print("Digite a hora de chegada (0 a 23): ");
        horaChegada = sc.nextInt();
        System.out.print("Digite os minutos de chegada (0 a 59): ");
        minChegada = sc.nextInt();

        System.out.print("Digite a hora de saída (0 a 23): ");
        horaSaida = sc.nextInt();
        System.out.print("Digite os minutos de saída (0 a 59): ");
        minSaida = sc.nextInt();

        if (horaChegada < 0 || horaChegada > 23 || horaSaida < 0 || horaSaida > 23 ||
            minChegada < 0 || minChegada > 59 || minSaida < 0 || minSaida > 59) {
            System.out.println("Horário inválido!");
            return;
        }

        int chegadaMin = horaChegada * 60 + minChegada;
        int saidaMin = horaSaida * 60 + minSaida;

        if (saidaMin < chegadaMin) {
            System.out.println("A saída não pode ser antes da chegada!");
            return;
        }

        int tempoTotal = saidaMin - chegadaMin;
        int horas = tempoTotal / 60;
        int minutos = tempoTotal % 60;

        if (minutos <= 29) {
        } else {
            horas++;
        }

        if (horas == 0) {
            horas = 1;
        }

        double valor = 0;

        if (horas <= 2) {
            valor = horas * 5.0;
        } else if (horas <= 4) {
            valor = 2 * 5.0 + (horas - 2) * 7.5;
        } else {
            valor = 2 * 5.0 + 2 * 7.5 + (horas - 4) * 10.0;
        }

        System.out.println("\nTempo estacionado: " + horas + " hora(s)");
        System.out.printf("Valor a pagar: R$ %.2f\n", valor);

    }
    public static void main(String[] args) {
        new Uni4Exe27();
    }
}
