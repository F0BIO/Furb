import java.util.Scanner;
public class Uni2Exe12 {
/*Leia os quatro valores correspondentes aos eixos x e y de dois pontos quaisquer 
no plano, p1(x1,y1) e p2(x2,y2) e calcule a distância entre eles, mostrando 
4 casas decimais após a vírgula, segundo a fórmula: */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o eixo x do ponto 1: ");
        double x1 = sc.nextInt();

        System.out.println("Informe o eixo y do ponto 1: ");
        double y1 = sc.nextInt();

        System.out.println("Informe o eixo x do ponto 2: ");
        double x2 = sc.nextInt();

        System.out.println("Informe o eixo y do ponto 2: ");
        double y2 = sc.nextInt();

        double distanciaPontos = Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2));

        System.out.printf("A distacia entre os dois pontos é: %.4f%n", distanciaPontos);

        sc.close();

    }
}
