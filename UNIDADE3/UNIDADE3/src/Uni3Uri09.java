import java.util.Scanner;

public class Uni3Uri09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();

        double areaDoTrianguloRetAngulo = (A * C) / 2;
        System.out.printf("TRIANGULO: %.3f%n", areaDoTrianguloRetAngulo);

        double pi = 3.14159;
        double areaDoCirculo  = pi *  Math.pow(C, 2);
        System.out.printf("CIRCULO: %.3f%n", areaDoCirculo);

        double areaDoTrapezio  = (A + B) * C / 2 ;
        System.out.printf("TRAPEZIO: %.3f%n", areaDoTrapezio);

        double areaDoQuadrado  = Math.pow(B, 2) ;
        System.out.printf("QUADRADO: %.3f%n", areaDoQuadrado);

        double areaDoRetangulo  = A * B ;
        System.out.printf("RETANGULO: %.3f%n", areaDoRetangulo);

        sc.close();
    }
}
