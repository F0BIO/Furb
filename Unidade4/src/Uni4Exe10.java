import java.util.Scanner;

public class Uni4Exe10 {
    int idadeMarquinhos;
    int idadeZezinho;
    int idadeLuluzinha;
    Scanner sc = new Scanner(System.in);
    public Uni4Exe10() {
        lerIdade();
        quemECacula();
    }
    public static void main(String[] args) {
        new Uni4Exe10();
    }

    private void lerIdade() {
        System.out.println("Informe a idade do Marquinhos: ");
        idadeMarquinhos = sc.nextInt();
        System.out.println("Informe a idade do Zezinho: ");
        idadeZezinho = sc.nextInt();
        System.out.println("Informe a idade do Luluzinha: ");
        idadeLuluzinha = sc.nextInt();
    }

    private void quemECacula(){
        if (idadeMarquinhos < idadeLuluzinha && idadeMarquinhos < idadeZezinho) {
            System.out.println("O Marquinhos é o caçula");
        }
        else {if (idadeLuluzinha < idadeMarquinhos && idadeLuluzinha < idadeZezinho) {
                System.out.println("A Luluzinha é a caçula");
            }
            else {
                System.out.println("O Zezinho é o caçula");
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
