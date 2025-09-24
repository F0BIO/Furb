import java.util.Scanner;

public class Uni4Exe11 {
    int idadeIrmao;
    int idadeIrmao2;
    int idadeIrmao3;
    Scanner sc = new Scanner(System.in);
    public Uni4Exe11() {
        lerIdadeIrmaos();
        irmaosGemeos();
    }
    public static void main(String[] args) {
        new Uni4Exe11();
    }

    private void lerIdadeIrmaos(){
        System.out.println("Imforme a idade de 3 irmãos: ");
        idadeIrmao = sc.nextInt();
        idadeIrmao2 = sc.nextInt();
        idadeIrmao3 = sc.nextInt();
    }
    private void irmaosGemeos() {
        if (idadeIrmao == idadeIrmao2 && idadeIrmao == idadeIrmao3) {
            System.out.println("TRIGÊMEOS");
        }
        else { if (idadeIrmao == idadeIrmao2 || idadeIrmao == idadeIrmao3) {
                System.out.println("GÊMEOS");
            }
            else {
                System.out.println("APENAS IRMÃOS");
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
