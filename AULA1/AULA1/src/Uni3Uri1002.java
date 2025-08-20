import java.util.Scanner;
import java.text.DecimalFormat;

public class Uni3Uri1002 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    DecimalFormat df_4 = new DecimalFormat("0.0000");

    double pi = 3.14159; 
    double raio = teclado.nextDouble();

    double area = pi * Math.pow(raio, 2);

    System.out.println("A=" + df_4.format(area));
    teclado.close();
  }
}
