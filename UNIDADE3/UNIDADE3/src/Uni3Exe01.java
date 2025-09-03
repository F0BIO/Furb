import java.util.Scanner;

public class Uni3Exe01 {
/*Uma imobiliária vende apenas terrenos retangulares. 
Faça um programa para ler as dimensões de um terreno e 
depois exibir a área do terreno. */
    public static void main(String[] args) throws Exception {
     calculoTerreno();
    }

    public static void calculoTerreno(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o comprimento do terreno: ");
        int comprimento = sc.nextInt();

        System.out.println("Informe a largura do terreno: ");
        int largura = sc.nextInt();

        int area = comprimento * largura;
        System.out.println(area);
        sc.close();
    }
/*Testes:
 * 
 * Entradas: 4 | 8
 * Saídas: 32
 * 
 * Entradas: 2 | 30
 * Saídas: 60
 * 
 * Entradas: 5 | 16
 * Saídas: 80
*/
}
