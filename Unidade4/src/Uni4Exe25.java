import java.util.Scanner;

public class Uni4Exe25 {
    Scanner sc = new Scanner(System.in);
    public Uni4Exe25(){
        System.out.println("Escolha uma opção:");
        System.out.println("1 - Soma de dois números.");
        System.out.println("2 - Diferença entre dois números.");
        System.out.println("3 - Produto entre dois números.");
        System.out.println("4 - Divisão entre dois números (o denominador não pode ser zero).");

        System.out.print("Digite a opção desejada: ");
        int opcao = sc.nextInt();

        double num1, num2, resultado;

        switch (opcao) {
            case 1:
                System.out.print("Digite o primeiro número: ");
                num1 = sc.nextDouble();
                System.out.print("Digite o segundo número: ");
                num2 = sc.nextDouble();
                resultado = num1 + num2;
                System.out.println("Resultado da soma: " + resultado);
                break;
            case 2:
                System.out.print("Digite o primeiro número: ");
                num1 = sc.nextDouble();
                System.out.print("Digite o segundo número: ");
                num2 = sc.nextDouble();
                resultado = num1 - num2;
                System.out.println("Resultado da diferença: " + resultado);
                break;
            case 3:
                System.out.print("Digite o primeiro número: ");
                num1 = sc.nextDouble();
                System.out.print("Digite o segundo número: ");
                num2 = sc.nextDouble();
                resultado = num1 * num2;
                System.out.println("Resultado do produto: " + resultado);
                break;
            case 4:
                System.out.print("Digite o numerador: ");
                num1 = sc.nextDouble();
                System.out.print("Digite o denominador: ");
                num2 = sc.nextDouble();
                if (num2 == 0) {
                    System.out.println("Erro: Divisão por zero não é permitida.");
                } else {
                    resultado = num1 / num2;
                    System.out.println("Resultado da divisão: " + resultado);
                }
                break;
            default:
                System.out.println("Opção inválida. Por favor, escolha de 1 a 4.");
        }
    }
    public static void main(String[] args) {
        new Uni4Exe25();
    }
}
