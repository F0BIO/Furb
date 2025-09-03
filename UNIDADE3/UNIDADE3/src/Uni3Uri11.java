import java.util.Scanner;

public class Uni3Uri11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int distaciaCarroY = sc.nextInt();
        int tempoMinutos = distaciaCarroY*2;

        System.out.println(tempoMinutos+" minutos");
        sc.close();
    }
}
