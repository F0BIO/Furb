import java.util.Scanner;

public class Uni4Exe05 {
        
    Scanner sc = new Scanner(System.in);
    public Uni4Exe05(){
        System.out.println("A cor é azul?");
        boolean corAzul = sc.nextBoolean();

        if (corAzul == true) {
            System.out.println("Sim");
        }
        else {
            System.out.println("Não");
        }


    }

    public static void main(String[] args) {
        new Uni4Exe05();
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
