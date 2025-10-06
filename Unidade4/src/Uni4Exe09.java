import java.util.Scanner;

public class Uni4Exe09 {
    int valor;
    int valor2;
    Scanner sc = new Scanner(System.in);
    public Uni4Exe09() {
        lerValores();
        eMultiplo();
    }
    public static void main(String[] args) {
        new Uni4Exe09();
    }

    private void lerValores() {
        System.out.println("Informe dois valores: ");
        valor = sc.nextInt();
        valor2 = sc.nextInt();
    }

    private void eMultiplo(){
        if (valor % valor2 == 0 || valor2 % valor == 0) {
            System.out.println("Os valores são múltiplos.");
        }
        else {
            System.out.println("Os valores não são múltiplos.");
        }
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
