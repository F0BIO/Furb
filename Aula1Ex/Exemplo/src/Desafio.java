import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        double divisaoA = (5.0/9.0);
        double parte1 = Math.pow(divisaoA, 3);

        double parte2 = ((((1.0/12.0) * 47.41) / 12.0) * 4.0) + 1.0;

        double parte3 = (3.0/100.0) * Math.pow(0.4, 12.0);

        double resultado = parte1 + parte2 - parte3;

        System.out.println("Resultado: " + resultado);
    }
}
