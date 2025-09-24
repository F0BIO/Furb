import java.util.Scanner;

public class Uni4Uri5 {
    int duracao;
    Scanner sc = new Scanner(System.in);
    public Uni4Uri5(){
        int horaInicial = sc.nextInt();
        int horaFinal = sc.nextInt();

        if (horaInicial < horaFinal) {
            duracao = horaFinal - horaInicial;
            System.out.println("O JOGO DUROU "+duracao+" HORA(S)");
        }
        else {
            duracao = 24 - horaInicial + horaFinal;
        }

        if (duracao == 0) {
            System.out.println("O JOGO DUROU 24 HORA(S)");
        }
    }
    public static void main(String[] args) {
        new Uni4Uri5();
    }
}
