import java.util.Scanner;

public class Uni4Exe08 {
    char letra;
    Scanner sc = new Scanner(System.in);
    public Uni4Exe08() {
        lerLetra();
        eVogal();
    }
    public static void main(String[] args) {
        new Uni4Exe08();
    }

    private void lerLetra() {
        System.out.println("Informe a letra: ");
        letra = sc.next().charAt(0);
    }

    private void eVogal() {
        letra = Character.toLowerCase(letra);
        if (letra == 'a'||letra == 'e'||letra == 'i'||letra == 'o'||letra == 'u') {
            System.out.println("É vogal");
        }
        else {
            System.out.println("NÃO é vogal");
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
