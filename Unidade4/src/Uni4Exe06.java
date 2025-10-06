import java.util.Scanner;

public class Uni4Exe06 {
    char genero;
    char generoMaiúsculo;
    Scanner sc = new Scanner(System.in);
    public Uni4Exe06() {
        lerGenero();
        verificacaoDoGenero();
    }
    public static void main(String[] args) {
        new Uni4Exe06();  
    }

    private void lerGenero() {
        System.out.println("Informe o gênero (M/F/I)");
        genero = sc.next().charAt(0);
        generoMaiúsculo = Character.toUpperCase(genero);
    }

    private void verificacaoDoGenero(){
        if (generoMaiúsculo == 'M'){
            System.out.println("Masculino");
        }
        else{
            if (generoMaiúsculo == 'F'){
                System.out.println("Feminino");
            }
            else{
                if (genero == 'i' || genero == 'I') {
                    System.out.println("Não informado");
                }
                else{
                    System.out.println("Entrada incorreta");
                }
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
