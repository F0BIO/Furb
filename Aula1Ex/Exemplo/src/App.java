import java.util.Scanner;

     public class App {
         public static void main(String[] args) throws Exception {
            Scanner scanner = new Scanner(System.in);
            int num1 = 5;
            int num2 = 10;

            int soma = num1 + num2;
            System.out.println("Soma: " + soma);

            int subtração = num1 - num2;
            System.out.println("Subtração: " + subtração);

            int multiplicação = num1 * num2;
            System.out.println("Multiplicação: " + multiplicação);

            float divisão = (float)num1 / num2;
            System.out.println("Divisão: " + divisão);

            int resto = num1 % num2;
            System.out.println("Resto da divisão: " + resto);

            float val1 = 4.34f;
            float val2 = 3.14f;
            float resultado = val1 / val2;
            System.out.println("Resultado é: " + resultado);

            System.out.println(Math.round(resultado));
            System.out.println(Math.floor(resultado));
            System.out.println(Math.ceil(resultado));
            System.out.printf("%.2f%n", resultado);
            System.out.printf("%.3f%n", resultado);
            System.out.printf("%.4f%n", resultado);

            int base = 5;
            int expoente = 2;
            double potencia = Math.pow(base, expoente);
            System.out.println("Resultado da potencia: " + potencia);

            double raizQuadrada = Math.sqrt(16);
            System.out.println("Raiz quadrada de 16: " + raizQuadrada);

            double raizCubica = Math.cbrt(125);
            System.out.println("Raiz cúbica de 16: " + raizCubica);

            double pi = Math.PI;
            System.out.println("Valor de PI: " + pi);
            double pi1 = 3.1416;

            scanner.close();
         }
 }
