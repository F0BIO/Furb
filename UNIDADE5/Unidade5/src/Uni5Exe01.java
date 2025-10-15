import java.util.Scanner;

public class Uni5Exe01 {

    public Uni5Exe01(){
        parOUImpar();
    }
    public static void main(String[] args) {
        new Uni5Exe01();
    }

    private void parOUImpar(){
        Scanner sc = new Scanner(System.in);
            for (int i = 1; i <= 20;i++) {
                System.out.println("Digite o "+i+"º número: ");
                int num = sc.nextInt();
                if (i % 2 == 0){
                    System.out.println("O número "+num+" é par");
                }
                else{
                    System.out.println("O número "+num+" é impar");
                }
            }
        sc.close();
    }
}
