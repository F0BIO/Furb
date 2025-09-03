import java.util.Scanner;

public class Uni3Uri13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int duracaoEvento = sc.nextInt();

        int horas = duracaoEvento / 3600;
        int minutos = (duracaoEvento % 3600) / 60;
        int segundos = duracaoEvento % 60;

        System.out.println(horas + ":" + minutos + ":" + segundos);
        
        sc.close();
    }
}
