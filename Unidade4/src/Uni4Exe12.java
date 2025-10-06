import java.util.Scanner;

public class Uni4Exe12 {
    int lado1;
    int lado2;
    int lado3;
    Scanner sc = new Scanner(System.in);
    public Uni4Exe12() {
        System.out.println("Informe o cumprimento dos 3 lados de um triângulo: ");
        lado1 = sc.nextInt();
        lado2 = sc.nextInt();
        lado3 = sc.nextInt();

        if (lado1 < (lado2+lado3) && lado2 < (lado1 + lado3) && lado3 < (lado1 + lado2)) {
            if (lado1 == lado2 && lado1 == lado3) {
                System.out.println("É equilatero");
            }
            else{ if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3){
                    System.out.println("É isósceles");
                }
                else{
                    System.out.println("É escaleno");
                }
            }
        }
        else{
            System.out.println("Não formam um triângulo");
        }
    }
    public static void main(String[] args) {
        new Uni4Exe12();
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