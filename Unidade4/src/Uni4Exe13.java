import java.util.Scanner;

public class Uni4Exe13 {
    Scanner sc = new Scanner(System.in);
    public Uni4Exe13(){
        System.out.println("Informe as 3 cartas: ");
        int carta1 = sc.nextInt();
        int carta2 = sc.nextInt();
        int carta3 = sc.nextInt();
        
        int qtdCartasBoas = 0;

        if (carta1 == 1 || carta1 == 2 || carta1 == 3) {
            qtdCartasBoas++;
        }

        if (carta2 == 1 || carta2 == 2 || carta2 == 3) {
            qtdCartasBoas++;
        }

        if (carta3 == 1 || carta3 == 2 || carta3 == 3) {
            qtdCartasBoas++;
        }

        // Impressão do resultado com base na quantidade de boas
        if (qtdCartasBoas == 1) {
            System.out.println("TRUCO");
        } else if (qtdCartasBoas == 2) {
            System.out.println("SEIS");
        } else if (qtdCartasBoas == 3) {
            System.out.println("NOVE");
        }

    }
    public static void main(String[] args) {
        new Uni4Exe13();
    }
}
