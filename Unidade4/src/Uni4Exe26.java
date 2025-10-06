import java.util.Scanner;

public class Uni4Exe26 {
    Scanner sc = new Scanner(System.in);
    public Uni4Exe26(){
        System.out.println("Escolha uma opção:");
        System.out.println("T - Triângulo");
        System.out.println("Q - Quadrado");
        System.out.println("R - Retângulo");
        System.out.println("C - Círculo");
        System.out.print("Opção: ");
        char opcao = sc.next().toUpperCase().charAt(0);

        double area = 0;

        switch (opcao) {
            case 'T':
                System.out.print("Digite a base do triângulo: ");
                double baseT = sc.nextDouble();
                System.out.print("Digite a altura do triângulo: ");
                double alturaT = sc.nextDouble();
                area = (baseT * alturaT) / 2;
                System.out.println("Área do triângulo: " + area);
                break;

            case 'Q':
                System.out.print("Digite o lado do quadrado: ");
                double ladoQ = sc.nextDouble();
                area = ladoQ * ladoQ;
                System.out.println("Área do quadrado: " + area);
                break;

            case 'R':
                System.out.print("Digite a base do retângulo: ");
                double baseR = sc.nextDouble();
                System.out.print("Digite a altura do retângulo: ");
                double alturaR = sc.nextDouble();
                area = baseR * alturaR;
                System.out.println("Área do retângulo: " + area);
                break;

            case 'C':
                System.out.print("Digite o raio do círculo: ");
                double raio = sc.nextDouble();
                area = Math.PI * Math.pow(raio, 2);
                System.out.println("Área do círculo: " + area);
                break;

            default:
                System.out.println("Opção inválida!");
        }

    }
    public static void main(String[] args) {
        new Uni4Exe26();
    }
}
