import java.util.Scanner;

public class Uni4Exe03 {

    public Uni4Exe03(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um valor inteiro: ");
        int valor = sc.nextInt();

        System.out.println("Digite outro valor inteiro: ");
        int valor2 = sc.nextInt();

        if (valor > valor2) {
                System.out.println("O valor "+valor+" é maior do que o valor "+valor2);
            }
        else {
            System.out.println("O valor "+valor2+" é maior do que o valor "+valor);
        }

        sc.close();
    }
    public static void main(String[] args) {
        new Uni4Exe03();
    }
}
