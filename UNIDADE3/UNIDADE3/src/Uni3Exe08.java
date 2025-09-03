import java.util.Scanner;

public class Uni3Exe08 {
/*Uma pessoa foi até uma casa de câmbio trocar dólares por reais. 
Para isto ela entregou um valor em dólares para o atendente. 
Considerando que o atendente tem a cotação do dólar, 
descreva um programa para calcular quantos reais o atendente deve devolver para a pessoa.*/

    public static void main(String[] args) throws Exception {
        dolarParaReal();
    }

    public static void dolarParaReal(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Valor em dólares recebido pelo cliente:");
        double dolar = sc.nextDouble();
        
        System.out.println("Cotação do dólar hoje: ");
        double cotacaoDolar = sc.nextDouble();

        double reais = dolar * cotacaoDolar;

        System.out.printf("O atendente deve devolver R$%.2f  para o cliente.",reais);
        sc.close();
    }
/*Testes:
 * 
 * Entradas: 1000 | 5,65
 * Saídas: O atendente deve devolver R$5650,00 para o cliente.
 * 
 * Entradas: 750 | 5,65
 * Saídas: O atendente deve devolver R$4237,50 para o cliente.
 * 
 * Entradas: 400 | 6
 * Saídas: O atendente deve devolver R$2400,00 para o cliente.
*/
}
