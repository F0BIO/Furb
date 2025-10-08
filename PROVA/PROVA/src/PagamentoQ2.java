
import java.util.Scanner;

public class PagamentoQ2 {
    double duracaoHoras, pagamentoHoras, horaChegada, horaPartida;
    String tarifas;
    public PagamentoQ2(){
        lerHora();
        valorPorHora();
    }
    public static void main(String[] args) {
        new PagamentoQ2();
    }

    private void lerHora(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a hora de chegada: ");
        horaChegada = sc.nextDouble();
        System.out.println("Informe a hora de partida: ");
        horaPartida = sc.nextDouble();
        sc.close();
    }
    private void valorPorHora() {
        if (horaChegada < horaPartida) {
            duracaoHoras = horaPartida - horaChegada;
            double horas = duracaoHoras / 1;
            double minutos = (duracaoHoras % 1) / 60;
            if (horas < 1) {
                tarifas = "R$10";
            }
            else if (horas < 3 && minutos < 30) {
                tarifas = "R$10";
            }
            else if (horas < 3 && minutos >= 30) {
                tarifas = "R$15";
            }
            else if (horas == 3 && minutos < 30) {
                tarifas = "R$15";
            }
            else if (horas >= 3 && minutos > 30) {
                tarifas = "R$20";
            }
            else if (horas >= 4) {
                tarifas = "R$20";
            }

            switch (tarifas) {
                case "R$10":
                    if (horas < 1) {
                        pagamentoHoras = 10;
                    }
                    else {
                        pagamentoHoras = 10 * horas;
                    }
                    break;

                case "R$15":
                    if (horas < 3 && minutos >= 30){
                        pagamentoHoras = 10 * (horas+1);
                    }
                    else{
                        pagamentoHoras = 20 + 15;
                    }
                    break;
                case "R$20":
                    if (horas >= 3 && minutos > 30){
                        pagamentoHoras = 35 + 20;
                    }
                    else{
                        pagamentoHoras = 35 + 20 * (horas-3);
                    }
                    break;
            }
        }
        System.out.println(pagamentoHoras);
    }
}
