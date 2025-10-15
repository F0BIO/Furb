import java.util.Scanner;

public class Uni5Exe06 {
    double altura, somaAlturas, mediaAltura;
    public Uni5Exe06(){
        mediaAltura();
    }

    public static void main(String[] args) {
        new Uni5Exe06();
    }

    private void mediaAltura(){
        Scanner sc = new Scanner(System.in);
            for (int i = 1; i <= 20;i++) {
                System.out.println("Digite a altura da "+i+"º pessoa: ");
                altura = sc.nextDouble();
                somaAlturas =+ altura;
            }

            mediaAltura = somaAlturas / 20;

            System.out.println("A média das alturas é: "+ mediaAltura);
        sc.close();
    }
}
