import java.util.Scanner;

public class Uni2Exe04 {
/*Leia dois valores de ponto flutuante e calcule a média ponderada sabendo que 
a nota A tem peso 3.5 e nota B 7.5 (a soma dos pesos é 11), sendo que a 
nota vai de 0.0 a 10.0. */
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Digite a primeira nota: ");
            float nota1 = sc.nextFloat();

            System.out.print("Digite a segunda nota: ");
            float nota2 = sc.nextFloat();

            float meida = ((nota1 * 3.5f) + (nota2 * 7.5f)) / 11;
            System.out.println("A média é: "+ meida);

            sc.close();

        }
}
