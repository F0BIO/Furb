import java.util.Scanner;

public class Uni4Exe02 {
    public Uni4Exe02(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um valor inteiro maior que 0: ");
        int valor = sc.nextInt();
        imparParMaiorQue0(valor);

        sc.close();
    }
        public static void main(String[] args) {
        new Uni4Exe02();
    }

    private void imparParMaiorQue0(int valor){
        if (valor <= 0) {
            System.out.println("O valor deve ser maior que 0!");
        }
        else {
            if (valor % 2 == 0) {
                System.out.println("Número é par");
            }
            else {
                System.out.println("Número é impar");
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