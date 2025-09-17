import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num = sc.nextInt();
        System.out.println("Digite uma operação: ");
        String operacao = sc.next();
        System.out.println("Digite outro número : ");
        int num2 = sc.nextInt();

        switch (operacao) {
            case "+":
                System.out.println(somar(num, num2));          
                break;

            case "-":
                System.out.println(subtrair(num, num2));
                break;

            case "*", "x", "X":
                System.out.println(multiplicar(num, num2));
                break;

            case "/":
                System.out.println(dividir(num, num2));   
                break;
            
                default:
                System.out.println("Operação inválida");
                    break;
            }
            sc.close();
    }

    public static int somar(int num1, int num2){
        return num1 + num2;
    }

    public static int subtrair(int num1, int num2){
        return num1 - num2;
    }

    public static int multiplicar(int num1, int num2){
        return num1 * num2;
    }

    public static double dividir(double num1, double num2) {
        return  num1 / num2;
    }
}



