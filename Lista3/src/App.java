import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Retangulo retangulo = new Retangulo();
            
            System.out.print("Imforme a altura do retângulo: ");
            retangulo.setAltura(scanner.nextInt());

            System.out.print("Imforme o comprimento do retângulo: ");
            retangulo.setComprimento(scanner.nextInt());


            System.out.println("Área do retângulo: " + retangulo.calcularArea());
            System.out.println("Perímetro do retângulo: " + retangulo.calcularPerimetro());

        scanner.close();
    }
}
