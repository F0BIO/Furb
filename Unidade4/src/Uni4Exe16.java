import java.util.Scanner;

public class Uni4Exe16 {
    Scanner sc = new Scanner(System.in);
    public Uni4Exe16(){
        System.out.print("Digite a idade do primeiro homem: ");
        int homem1 = sc.nextInt();

        System.out.print("Digite a idade do segundo homem: ");
        int homem2 = sc.nextInt();

        if (homem1 == homem2) {
            System.out.println("As idades dos homens devem ser diferentes.");
            return;
        }

        System.out.print("Digite a idade da primeira mulher: ");
        int mulher1 = sc.nextInt();

        System.out.print("Digite a idade da segunda mulher: ");
        int mulher2 = sc.nextInt();

        if (mulher1 == mulher2) {
            System.out.println("As idades das mulheres devem ser diferentes.");
            return;
        }

        int homemMaisVelho = Math.max(homem1, homem2);
        int homemMaisNovo = Math.min(homem1, homem2);

        int mulherMaisVelha = Math.max(mulher1, mulher2);
        int mulherMaisNova = Math.min(mulher1, mulher2);

        int soma = homemMaisVelho + mulherMaisNova;
        int produto = homemMaisNovo * mulherMaisVelha;

        System.out.println("Soma do homem mais velho com a mulher mais nova: " + soma);
        System.out.println("Produto do homem mais novo com a mulher mais velha: " + produto);

    }
    public static void main(String[] args) {
        new Uni4Exe16();
    }
}
