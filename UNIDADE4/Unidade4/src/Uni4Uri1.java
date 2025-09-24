import java.util.Scanner;

public class Uni4Uri1 {
    Scanner sc = new Scanner(System.in);
    public Uni4Uri1(){
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();
        
        if (B > C && D > A && (C + D) > (A + B) && C > 0 && D > 0 && A % 2 == 0) {
            System.out.println("Valores aceitos");
        }
        else{
            System.out.println("Valores nao aceitos");
        }
    }
    public static void main(String[] args) {
        new Uni4Uri1();
    }
}
