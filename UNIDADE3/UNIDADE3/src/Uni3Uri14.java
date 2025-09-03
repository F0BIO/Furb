import java.util.Scanner;

public class Uni3Uri14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float valor = sc.nextFloat();
        int centavos = (int) Math.round(valor * 100);

        System.out.println("NOTAS:");
        int nota100 = centavos / 10000;
        centavos = centavos % 10000;
        System.out.println(nota100 + " nota(s) de R$ 100.00");

        int nota50 = centavos / 5000;
        centavos = centavos % 5000;
        System.out.println(nota50 + " nota(s) de R$ 50.00");

        int nota20 = centavos / 2000;
        centavos = centavos % 2000;
        System.out.println(nota20 + " nota(s) de R$ 20.00");

        int nota10 = centavos / 1000;
        centavos = centavos % 1000;
        System.out.println(nota10 + " nota(s) de R$ 10.00");

        int nota5 = centavos / 500;
        centavos = centavos % 500;
        System.out.println(nota5 + " nota(s) de R$ 5.00");

        int nota2 = centavos / 200;
        centavos = centavos % 200;
        System.out.println(nota2 + " nota(s) de R$ 2.00");

        System.out.println("MOEDAS:");
        int moeda1 = centavos / 100;
        centavos = centavos % 100;
        System.out.println(moeda1 + " moeda(s) de R$ 1.00");

        int moeda05 = centavos / 50;
        centavos = centavos % 50;
        System.out.println(moeda05 + " moeda(s) de R$ 0.50");

        int moeda025 = centavos / 25;
        centavos = centavos % 25;
        System.out.println(moeda025 + " moeda(s) de R$ 0.25");

        int moeda010 = centavos / 10;
        centavos = centavos % 10;
        System.out.println(moeda010 + " moeda(s) de R$ 0.10");

        int moeda005 = centavos / 5;
        centavos = centavos % 5;
        System.out.println(moeda005 + " moeda(s) de R$ 0.05");

        int moeda001 = centavos / 1;
        centavos = centavos % 1;
        System.out.println(moeda001 + " moeda(s) de R$ 0.01");
        
        sc.close();
    }
}

