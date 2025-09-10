import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean calculadoraAtiva;

        while(calculadoraAtiva = true){
            System.out.println("Digite um número: ");
            int num = sc.nextInt();
            System.out.println("Digite uma operação: ");
            String operacao = sc.next();
            System.out.println("Digite outro número : ");
            int num2 = sc.nextInt();

            switch (operacao) {
                case "+":
                    somar(num, num2);
                            
                    break;

                case "-":
                    subtrair(num, num2);
                    break;

                case "*", "x", "X":
                    multiplicar(num, num2);
                    break;

                case "/":
                    dividir(num, num2);   
                    break;
            
                default:
                System.out.println("Operação inválida");
                    break;
            }

            if (num == 0 && num2 == 0) {
                calculadoraAtiva = false;
                break;
            }
        }
        sc.close();
    }

    public static void somar(int num1, int num2){
        int soma = num1 + num2;
        System.out.println(soma);
    }

    public static int subtrair(int num1, int num2){
        return num1 - num2;
    }

    public static int multiplicar(int num1, int num2){
        return num1 * num2;
    }

    public static double dividir(double num1, double num2) {
        return num1 / num2;
    }
}



