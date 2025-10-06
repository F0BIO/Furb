import java.util.Scanner;

public class Uni4Exe04 {
    Scanner sc = new Scanner(System.in);
    float num;
    public Uni4Exe04(){
        System.out.println("Digite um número: ");
        num = sc.nextFloat();
        casaDecimal();
    }
    public static void main(String[] args) {
        new Uni4Exe04();
    }

    private void casaDecimal() {
        if (num > 0){
            // numero % (int)numero !=
            // numero % Math.floor(numero != 0)
            if (num == Math.round(num)) {
                System.out.println("Casas decimais não foram digitadas.");
            }
            else {
                System.out.println("Casas decimais foram digitadas.");
            }
        }
        else{
            System.out.println("Número inválido");
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