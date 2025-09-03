import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Scanner;

public class Uni3Exe02 {
/*Uma loja de calçados está concedendo 12% de desconto nos 
produtos. Escreva um programa para calcular e exibir o valor 
de desconto a ser dado num par de sapatos e quanto deve custar 
o produto com o desconto. O preço do par de sapatos deve ser 
informado pelo usuário. Como resultado, o programa deverá 
exibir as seguintes mensagens:

O valor do desconto é de R$ xxx
O preço do par de sapatos com desconto é R$ xxx */

    public static void main(String[] args) throws Exception {
        descontoSapato();
    }

    public static void descontoSapato(){
        Scanner sc = new Scanner(System.in);
        DecimalFormatSymbols simbolos = new DecimalFormatSymbols(Locale.US);
        DecimalFormat df_2 = new DecimalFormat("0.0#", simbolos);
        System.out.println("Imforme o preço do sapato: ");
        float preco = sc.nextFloat();

        double desconto = preco * 0.12;
        double precoFinal = preco - desconto;

        System.out.println("O valor do desconto é de R$"+ df_2.format(desconto));
        System.out.printf("O preço do par de sapatos com desconto é R$%.2f%n", precoFinal);
        sc.close();
    }
/*Testes:
 * 
 * Entradas: 80
 * Saídas: 	O valor do desconto é de R$9.6 | O preço do par de sapatos com desconto é R$70,40
 * 
 * Entradas: 120
 * Saídas: 	O valor do desconto é de R$14.4 | O preço do par de sapatos com desconto é R$105,60
 * 
 * Entradas: 160
 * Saídas: 	O valor do desconto é de R$19.2 | O preço do par de sapatos com desconto é R$140,80
*/
}
