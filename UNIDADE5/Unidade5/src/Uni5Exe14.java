import java.util.Scanner;

public class Uni5Exe14 {
    double PV, PC, lucro, lucroTotal, totalCompra, totalVenda,
    qtd10 = 0, 
    qtd10e20 = 0, 
    qtd20 = 0;
    public Uni5Exe14(){
        lucroMercadorias();
    }

    public static void main(String[] args) {
        new Uni5Exe14();
    }

    private void lucroMercadorias(){
        Scanner sc = new Scanner(System.in);
        

        for (int i = 1; i <= 20; i++){
            System.out.println("Mercadoria " + i);
            System.out.print("Preço de compra: ");
            PC = sc.nextDouble();

            System.out.print("Preço de venda: ");
            PV = sc.nextDouble();

            lucro = (PV - PC) / PC * 100;

            if(lucro < 10){
                qtd10++;
            }
            else if(10 <= lucro && lucro <= 20){
                qtd10e20++;
            }
            else{
                qtd20++;
            }

            totalCompra += PC;
            totalVenda += PV;
            lucroTotal += (PV - PC);
        }
        System.out.println("Mercadorias com lucro menor que 10%: "+ qtd10);
        System.out.println("Mercadorias com lucro entre 10% é 20%: "+ qtd10e20);
        System.out.println("Mercadorias com lucro maior que 20%: "+ qtd20);

        System.out.println("Valor total da compra: "+ totalCompra);
        System.out.println("Valor total da venda: "+ totalVenda);
        System.out.println("Valor total do lucro: "+ lucroTotal);
        sc.close();
    }
}
