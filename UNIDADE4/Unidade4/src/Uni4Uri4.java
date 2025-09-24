import java.util.Scanner;

public class Uni4Uri4 {

    Scanner sc = new Scanner(System.in);
    public Uni4Uri4() {
        int valor = sc.nextInt();
        int valor2 = sc.nextInt();
        int valor3 = sc.nextInt();

        if (valor < valor2 && valor < valor3 && valor2 < valor3) {
            System.out.println(valor);
            System.out.println(valor2);
            System.out.println(valor3+"\n");

            System.out.println(valor);
            System.out.println(valor2);
            System.out.println(valor3);
        }
        else if (valor < valor2 && valor < valor3 && valor2 > valor3) {
            System.out.println(valor);
            System.out.println(valor3);
            System.out.println(valor2+"\n");

            System.out.println(valor);
            System.out.println(valor2);
            System.out.println(valor3);
        }
        else if (valor2 < valor && valor2 < valor3 && valor < valor3) {
            System.out.println(valor2);
            System.out.println(valor);
            System.out.println(valor3+"\n");

            System.out.println(valor);
            System.out.println(valor2);
            System.out.println(valor3);
        }
        else if (valor2 < valor && valor2 < valor3 && valor > valor3) {
            System.out.println(valor2);
            System.out.println(valor3);
            System.out.println(valor+"\n");

            System.out.println(valor);
            System.out.println(valor2);
            System.out.println(valor3);
        }
        else if (valor3 < valor2 && valor3 < valor && valor2 > valor) {
            System.out.println(valor3);
            System.out.println(valor);
            System.out.println(valor2+"\n");

            System.out.println(valor);
            System.out.println(valor2);
            System.out.println(valor3);
        }
        else {
            System.out.println(valor3);
            System.out.println(valor2);
            System.out.println(valor+"\n");

            System.out.println(valor);
            System.out.println(valor2);
            System.out.println(valor3);
        }
    }
    public static void main(String[] args) {
        new Uni4Uri4();
    }
}
