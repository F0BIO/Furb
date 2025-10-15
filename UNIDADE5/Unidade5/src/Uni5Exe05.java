import java.util.Scanner;

public class Uni5Exe05 {
    int n;
    public Uni5Exe05(){
        calculoSequencia();
    }

    public static void main(String[] args) {
        new Uni5Exe05();
    }

    private void calculoSequencia(){
       Scanner sc = new Scanner(System.in);
        System.out.println("Imforme até qual termo deve ser calculado(termos > 2): ");
        n = sc.nextInt();

        for (int i = 3; i <=n; i++){
            int termo = (int) Math.pow(2, i);
            int termo2 = (int) Math.pow(2, i) + 2;
            System.out.print(termo + " " + termo2 + " ");
        }
        sc.close();
    }
}
