import java.util.Scanner;

public class Uni5Exe07 {
    double num;
    public Uni5Exe07(){
        maiorEMenor();
    }

    public static void main(String[] args) {
        new Uni5Exe07();
    }

    private void maiorEMenor(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe n:");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Número inválido.");
            System.out.print("n deve ser maior que 0: ");
            n = sc.nextInt();
        }
        else {
            System.out.print("Informe o 1º número: ");
            num = sc.nextDouble();
        }
        double maiorNum = num; 
        double menorNum = num;
        for (int i = 2; i <= n; i++){
            System.out.print("Informe o "+i+"º número: ");
            num = sc.nextDouble();
            
            if (num >= maiorNum) {
                maiorNum = num;
            }
            if (num <= menorNum) {
                menorNum = num;
            }
        }
        System.out.println("Maior número: " + maiorNum);
        System.out.println("Menor número: " + menorNum);
        sc.close();
    }
}
