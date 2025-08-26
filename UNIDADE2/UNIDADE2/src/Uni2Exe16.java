import java.util.Scanner;
/*Uma fábrica de refrigerantes vende seu produto em 
três formatos: lata de 350 ml, garrafa de 600 ml e 
garrafa de 2 litros. Se um comerciante compra uma 
determinada quantidade de cada formato, informe 
quantos litros de refrigerante ele comprou.*/
public class Uni2Exe16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Imfome quantas latas deseja comprar: ");
        double qtdLata = sc.nextDouble();

        System.out.println("Imfome quantas garrafas de 600ml deseja comprar: ");
        double qtdGarrafa600 = sc.nextInt();

        System.out.println("Imfome quantas garradas de 2L deseja comprar: ");
        double qtdGarrafas2L = sc.nextInt();

        double totalLitros = (qtdLata * 0.35) + (qtdGarrafa600 * 0.6) + (qtdGarrafas2L * 2);

        System.out.println("No total foram comprados "+ totalLitros+" Litros");
        sc.close();
    
    }

/*Testes:
 * 
 * Entradas: 3, 5, 3
 * Saidas: 10.05
 * 
 * Entradas: 6, 4, 6
 * Saidas: 16.5
 * 
 * Entradas: 10, 5, 20
 * Saidas: 46.5
*/
}
