import java.util.Scanner;

public class Uni5Exe07 {
    double maiorNum, menorNum;
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

        for (int i = 1; i <= n; i++){
            System.out.println("Informe o "+i+"º número: ");
            double num = sc.nextDouble();
            if (num >= maiorNum) {
                maiorNum = num;
            }
            else{
                menorNum = num;
            }
        }
        System.out.println("Maior número: " + maiorNum);
        System.out.println("Menor número: " + menorNum);
        sc.close();
    }
}
