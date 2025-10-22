import java.util.Scanner;

public class Uni5Exe12 {

    public Uni5Exe12(){
        TrianguloDeFloyd();
    }
    public static void main(String[] args) {
        new Uni5Exe12();
    }

    private void TrianguloDeFloyd(){
int contador = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe n:");
        int n = sc.nextInt();

        if (n % 1 != 0 && n < 0) {
            System.out.println("Número inválido.");
            System.out.print("n deve ser inteiro maior que 0: ");
            n = sc.nextInt();
        }
        System.out.println("");

        for(int linha = 1; linha <= n; linha++){
            for (int coluna = 1; coluna <= linha; coluna++){
                System.out.print(contador + " ");
                contador ++;
            }
            System.out.println();
        }
        sc.close();
    }
}

