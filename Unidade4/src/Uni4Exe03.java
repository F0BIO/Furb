import java.util.Scanner;

public class Uni4Exe03 {
    Scanner sc = new Scanner(System.in);
    int valor, valor2;
    public Uni4Exe03(){
        informarDoisNumeros();
        maiorNumero();
    }
    public static void main(String[] args) {
        new Uni4Exe03();
    }

    private void informarDoisNumeros() {
        System.out.println("Digite um valor inteiro: ");
        valor = sc.nextInt();

        System.out.println("Digite outro valor inteiro: ");
        valor2 = sc.nextInt();
    }

    private void maiorNumero() {
        if (valor > valor2) {
            System.out.println("O valor "+valor+" é maior do que o valor "+valor2);
        }
        else { if (valor == valor2) {
                System.out.println("Os valores são iguais");
            }
            else {
                System.out.println("O valor "+valor2+" é maior do que o valor "+valor);
            }
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
