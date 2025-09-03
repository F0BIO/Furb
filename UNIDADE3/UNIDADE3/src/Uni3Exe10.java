import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Scanner;

public class Uni3Exe10 {
/*Descreva um programa que leia o comprimento dos catetos de um triângulo 
retângulo e calcule o comprimento da hipotenusa.
Fórmula: */

    public static void main(String[] args) throws Exception {
        calculoHipotenusa();
    }

        public static void calculoHipotenusa(){
        Scanner sc = new Scanner(System.in);
        DecimalFormatSymbols simbolos = new DecimalFormatSymbols(Locale.US);
        DecimalFormat df_2 = new DecimalFormat("0.00", simbolos);
        System.out.print("Imforme o cateto oposto: ");
        double catetoOposto = sc.nextDouble();
        System.out.print("Imforme o cateto adjacente: ");
        double catetoAdjacente = sc.nextDouble();

        double hipotenusa2 = Math.pow(catetoOposto, 2) + Math.pow(catetoAdjacente, 2);

        double hipotenusa = Math.sqrt(hipotenusa2);
        System.out.println("A hipotenusa é: "+ df_2.format(hipotenusa));
        sc.close();
    }
/*Testes:
 * 
 * Entradas: 5 | 9
 * Saídas: A hipotenusa é: 10.30
 * 
 * Entradas: 10 | 16
 * Saídas: A hipotenusa é: 18.87
 * 
 * Entradas: 8 | 12
 * Saídas: A hipotenusa é: 14.42
*/
}
