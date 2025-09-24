import java.util.Scanner;

public class Uni4Uri3 {
    Scanner sc = new Scanner(System.in);
    public Uni4Uri3(){
        float x = sc.nextFloat();
        float y = sc.nextFloat();

        if (x == 0 && y == 0) {
            System.out.println("Origem");
        }
        else if (x > 0 && y > 0) {
            System.out.println("Q1");
        } 
        else if (x < 0 && y > 0) {
            System.out.println("Q2");
        }
        else if (x < 0 && y < 0) {
            System.out.println("Q3");
        }
        else if (x > 0 && y < 0) {
            System.out.println("Q4");
        }
        else if (x == 0){
            System.out.println("Eixo Y");
        }
        else{
            System.out.println("Eixo X");
        }
    }
    public static void main(String[] args) {
        new Uni4Uri3();
    }
}
