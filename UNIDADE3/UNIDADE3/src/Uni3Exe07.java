import java.util.Scanner;

public class Uni3Exe07 {
/*Uma fábrica de refrigerantes vende seu produto em três 
formatos: lata de 350 ml, garrafa de 600 ml e garrafa de 2 litros. 
Se um comerciante compra uma determinada quantidade de cada formato, 
faça um programa para calcular quantos litros de refrigerante ele comprou.*/

    public static void main(String[] args) throws Exception {
        calcularLitros();
    }

    public static void calcularLitros(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantidade de 350ml: ");
        double qtdLata = sc.nextDouble();

        System.out.println("Quantidade de 600ml: ");
        double qtdGarrafa600 = sc.nextInt();

        System.out.println("Quantidade de 2L: ");
        double qtdGarrafas2L = sc.nextInt();

        double totalLitros = (qtdLata * 0.35) + (qtdGarrafa600 * 0.6) + (qtdGarrafas2L * 2);

        System.out.printf("O cliente comprou ao total %.2f litros.", totalLitros);
        sc.close();
    }
/*Testes:
 * 
 * Entradas: 20 | 60 | 200
 * Saídas: O cliente comprou ao total 443,00 litros.
 * 
 * Entradas: 45 | 90 | 136
 * Saídas: O cliente comprou ao total 341,75 litros.
 * 
 * Entradas: 100 | 145 | 200
 * Saídas: O cliente comprou ao total 522,00 litros.
*/
}
