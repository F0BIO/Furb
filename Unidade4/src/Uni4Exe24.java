import java.util.Scanner;

public class Uni4Exe24 {
    Scanner sc = new Scanner(System.in);
    public Uni4Exe24(){
System.out.print("Digite o primeiro valor: ");
        int a = sc.nextInt();

        System.out.print("Digite o segundo valor: ");
        int b = sc.nextInt();

        System.out.print("Digite o terceiro valor: ");
        int c = sc.nextInt();

        // Leitura da opção
        System.out.println("\nEscolha uma opção:");
        System.out.println("1 - Ordem crescente");
        System.out.println("2 - Ordem decrescente");
        System.out.println("3 - Maior valor no meio");
        System.out.print("Digite a opção: ");
        int opcao = sc.nextInt();

        int maior, meio, menor;

        if (a >= b && a >= c) {
            maior = a;
            if (b >= c) {
                meio = b;
                menor = c;
            } else {
                meio = c;
                menor = b;
            }
        } else if (b >= a && b >= c) {
            maior = b;
            if (a >= c) {
                meio = a;
                menor = c;
            } else {
                meio = c;
                menor = a;
            }
        } else {
            maior = c;
            if (a >= b) {
                meio = a;
                menor = b;
            } else {
                meio = b;
                menor = a;
            }
        }

        System.out.print("\nResultado: ");
        switch (opcao) {
            case 1:
                System.out.println(menor + ", " + meio + ", " + maior);
                break;
            case 2:
                System.out.println(maior + ", " + meio + ", " + menor);
                break;
            case 3:
                System.out.println(menor + ", " + maior + ", " + meio);
                break;
            default:
                System.out.println("Opção inválida.");
        }
    }
    public static void main(String[] args) {
        new Uni4Exe24();
    }
}
