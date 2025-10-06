import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Scanner;

public class Uni4Exe07 {
    int peso;
    double valorPagar;
    Scanner sc = new Scanner(System.in);
    public Uni4Exe07() {
        lerPeso();
        valorPagamento();
    }

    public static void main(String[] args) {
        new Uni4Exe07();
    }

    private void lerPeso() {
        System.out.println("Imforme o peso da carta: ");
        peso = sc.nextInt();
    }

    private void valorPagamento() {
        DecimalFormatSymbols simbolos = new DecimalFormatSymbols(Locale.US);
        DecimalFormat df = new DecimalFormat("0.####", simbolos);
        if (peso <= 50) {
            valorPagar = 0.45;
        }
        else {
            float pesoExcedido = peso - 50;
            float qtAdicional = (pesoExcedido / 20) + 1;
            valorPagar = 0.45f + 0.45f * qtAdicional;
        }

        System.out.println("Custo do selo: "+ df.format(valorPagar));
    }
}

/*Testes:
 * 
 * Entradas: 
 * Saídas: 	
 * 
 * Entradas: 
 * Saídas: 	
 * 
 * Entradas: 
 * Saídas: 	
*/
