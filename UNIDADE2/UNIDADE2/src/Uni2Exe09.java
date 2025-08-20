import java.util.Scanner;

public class Uni2Exe09 {
/*Uma pessoa foi até uma casa de câmbio trocar dólares por reais. 
Para isto ela entregou um valor em dólares para o atendente. 
Considerando que o atendente tem a cotação do dólar, 
calcule quantos reais o atendente deve devolver para a pessoa. */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe quantos dóleres deseja converter para reais: ");
        double dolar = sc.nextDouble();
        
        double reais = dolar * 5.5;

        System.out.println("USD $"+dolar+" são R$"+ reais);
        sc.close();
    }
}
