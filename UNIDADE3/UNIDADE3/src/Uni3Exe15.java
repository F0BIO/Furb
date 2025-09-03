import java.util.Scanner;

public class Uni3Exe15 {
/*Construa um programa para ler um número inteiro (assuma até 3 dígitos) 
e imprima a saída da seguinte forma:

X centena(s)  Y dezena(s) K unidade(s)  
Exemplo, se for submetido o número 384, o programa deverá exibir:

3 centena(s)  8 dezena(s) 4 unidade(s)  */

    public static void main(String[] args) throws Exception {
        casasDecimal();
    }

    public static void casasDecimal() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = sc.nextInt();

        int centenas = num / 100;
            int dezenas = (num % 100) / 10;
            int unidades = num % 10;

            // Saída formatada
            System.out.printf("%d centena(s)  %d dezena(s)  %d unidade(s)%n", centenas, dezenas, unidades);
        sc.close();
    }
/*Testes:
 * 
 * Entradas: 622
 * Saídas: 6 centena(s)  2 dezena(s)  2 unidade(s)
 * 
 * Entradas: 279
 * Saídas: 2 centena(s)  7 dezena(s)  9 unidade(s)
 * 
 * Entradas: 765
 * Saídas: 7 centena(s)  6 dezena(s)  5 unidade(s)
*/
}
