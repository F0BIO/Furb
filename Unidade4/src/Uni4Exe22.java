import java.util.Scanner;

public class Uni4Exe22 {
    Scanner sc = new Scanner(System.in);
    public Uni4Exe22(){
        System.out.println("Escolha o curso digitando o número correspondente:");
        System.out.println("1 - Ciência da Computação");
        System.out.println("2 - Licenciatura em Computação");
        System.out.println("3 - Sistemas de Informação");

        // Leitura da opção
        System.out.print("Digite sua opção: ");
        int opcao = sc.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Você receberá o título: Bacharel em Ciência da Computação");
                break;
            case 2:
                System.out.println("Você receberá o título: Licenciado em Computação");
                break;
            case 3:
                System.out.println("Você receberá o título: Bacharel em Sistemas de Informação");
                break;
            default:
                System.out.println("Opção inválida. Por favor, escolha 1, 2 ou 3.");
        }
    }
    public static void main(String[] args) {
        new Uni4Exe22();
    }
}
