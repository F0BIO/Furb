import java.util.Scanner;

public class Uni4Exe21 {
    Scanner sc = new Scanner(System.in);
    public Uni4Exe21(){
        System.out.print("Digite a massa (em kg): ");
        double massa = sc.nextDouble();

        System.out.print("Digite a altura (em metros): ");
        double altura = sc.nextDouble();

        if (massa <= 0 || altura <= 0) {
            System.out.println("Massa e altura devem ser maiores que zero.");
            return;
        }

        double imc = massa / (altura * altura);

        String classificacao;

        if (imc < 18.5) {
            classificacao = "Magreza";
        } else if (imc < 25.0) {
            classificacao = "Saudável";
        } else if (imc < 30.0) {
            classificacao = "Sobrepeso";
        } else if (imc < 35.0) {
            classificacao = "Obesidade Grau I";
        } else if (imc < 40.0) {
            classificacao = "Obesidade Grau II (severa)";
        } else {
            classificacao = "Obesidade Grau III (mórbida)";
        }

        System.out.printf("Seu IMC é: %.2f%n", imc);
        System.out.println("Classificação: " + classificacao);
    }
    public static void main(String[] args) {
        new Uni4Exe21();
    }
}
