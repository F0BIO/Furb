import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Scanner;

public class Uni3Exe11 {
/*Descreva um programa que dado uma temperatura em °C informe o seu valor em °F. Fórmula:

°F = (9/5) °C + 32 */

    public static void main(String[] args) throws Exception {
        converterCEmF();
    }
    public static void converterCEmF(){
        Scanner sc = new Scanner(System.in);
        DecimalFormatSymbols simbolos = new DecimalFormatSymbols(Locale.US);
        DecimalFormat df = new DecimalFormat("0.00", simbolos);
        System.out.println("Imforme a temperatura(°C):");
        double celsius = sc.nextDouble();

        double fahrenheit = (celsius*9/5) + 32;

        System.out.println(celsius+" °C são "+df.format(fahrenheit)+" °F");
        sc.close();
    }
/*Testes:
 * 
 * Entradas: 10
 * Saídas: 50.00
 * 
 * Entradas: 27
 * Saídas: 80.60
 * 
 * Entradas: 38
 * Saídas: 100.40
*/
}
