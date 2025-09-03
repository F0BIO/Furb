import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    
    boolean ativa = true;
    while (ativa == true) {
        System.out.print("Numero: ");
        double Num = scanner.nextDouble();

        System.out.print("Operação: ");
        String opera = scanner.next();

        System.out.print("Numero: ");
        double Num2 = scanner.nextDouble();

        switch (opera) {
            case "+" :
            System.out.println("\nResultado: " + (Num + Num2));
                break;
            case "-":
            System.out.println("\nResultado: " + (Num - Num2));
                break;
            case "*":
            System.out.println("\nResultado: " + (Num * Num2));
                break;
            case "/":
            System.out.println("\nResultado: " + (Num / Num2));
                break;
            case "all":
            System.out.println("\nResultado: " + "Soma: " + (Num + Num2) + "\nSubtração: " + (Num - Num2) + "\nMultiplicação: " + (Num * Num2) + "\nDivisão: " + (Num / Num2));
                break;
           
            default:
            System.out.println("Operação invalida");
                break;
            }
        System.out.println("Continuar? (s/n)");
        String nvopera = scanner.next();

        if (nvopera.equals("n")) {
            ativa = false;
        }
    }

    scanner.close();
    }
}
