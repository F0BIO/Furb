import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Scanner;

public class Uni3Exe03 {
/*Um motorista deseja abastecer seu tanque de combustível. 
Escreva um programa para ler o preço do litro da gasolina 
e o valor do pagamento e exibir quantos litros ele conseguiu 
colocar no tanque. */

    public static void main(String[] args) throws Exception {
        precoAbastecer();
    }

    public static void precoAbastecer(){
        Scanner sc = new Scanner(System.in);
        DecimalFormatSymbols simbolos = new DecimalFormatSymbols(Locale.US);
        DecimalFormat df = new DecimalFormat("0.00", simbolos);
        System.out.println("Preço do litro de gasolina: ");
        double precoLitro = sc.nextDouble();

        System.out.println("Valor do pagamento: ");
        double pagamento = sc.nextDouble();

        double litrosAbastecidos = pagamento / precoLitro;

        System.out.println("O motorista conseguiu colocar: "+ df.format(litrosAbastecidos) + " litros.");
        sc.close();
    }
/*Testes:
 * 
 * Entradas: 6 | 50
 * Saídas: O motorista conseguiu colocar: 8.33 litros.
 * 
 * Entradas: 6,20 | 100
 * Saídas: O motorista conseguiu colocar: 16.13 litros.
 * 
 * Entradas: 5,5 | 200
 * Saídas: O motorista conseguiu colocar: 36.36 litros.
*/
}
