import java.util.Scanner;

public class Uni5Exe08 {
    int num, somaNum, menorNumNegativo, divisao;
    public Uni5Exe08(){
        mediaPosiMenorNeg();
    }

    public static void main(String[] args) {
        new Uni5Exe08();
    }

    private void mediaPosiMenorNeg(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe n:");
        int n = sc.nextInt();

        if (n % 1 != 0 && n < 0) {
            System.out.println("Número inválido.");
            System.out.print("n deve ser inteiro maior que 0: ");
            n = sc.nextInt();
        }

        for (int i = 1; i <= n; i++){
            System.out.print("Informe o "+i+"º número: ");
            num = sc.nextInt();
            
            if (num < 0 && num < menorNumNegativo) {
                menorNumNegativo = num;
            }
            if (num > 0){
                somaNum = somaNum + num;
                divisao += 1;
            }

        }
        int media = somaNum / divisao;
        System.out.println("Média dos números positivos: " + media);

        if (menorNumNegativo == 0) {
            System.out.println("A sequância não tem valores negativos");
        }
        else{
            System.out.println("Menor número negativo: " + menorNumNegativo);
        }
        sc.close();
    }
}
