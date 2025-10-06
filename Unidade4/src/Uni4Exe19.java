import java.util.Scanner;

public class Uni4Exe19 {
    Scanner sc = new Scanner(System.in);
    public Uni4Exe19(){
        System.out.print("Digite a coordenada X: ");
        int x = sc.nextInt();

        System.out.print("Digite a coordenada Y: ");
        int y = sc.nextInt();

        int quadrante;

        if (x == 0 && y == 0) {
            quadrante = 0;
        } else if (x > 0 && y > 0) {
            quadrante = 1;
        } else if (x < 0 && y > 0) {
            quadrante = 2;
        } else if (x < 0 && y < 0) {
            quadrante = 3;
        } else if (x > 0 && y < 0) {
            quadrante = 4;
        } else {
            quadrante = -1;
        }

        if (quadrante == -1) {
            System.out.println("O ponto está sobre um dos eixos e não pertence a nenhum quadrante definido.");
        } else {
            System.out.println("O ponto está no quadrante: " + quadrante);
        }

    }
    public static void main(String[] args) {
        new Uni4Exe19();
    }
}
