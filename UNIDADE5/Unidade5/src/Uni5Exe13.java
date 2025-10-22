import java.util.Scanner;

public class Uni5Exe13 {
    public Uni5Exe13(){
        Abastecimento();
    }

    public static void main(String[] args) {
        new Uni5Exe13();
    }

    private void Abastecimento(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe o número total de reabastecimentos::");
        float reabastecimentos = sc.nextFloat();

        if (reabastecimentos % 1 != 0 && reabastecimentos < 0) {
            System.out.println("Número inválido.");
            System.out.print("Total de reabastecimentos deve ser inteiro maior que 0: ");
            reabastecimentos = sc.nextFloat();
        }
        for (int i = 1; i <= reabastecimentos; i++){
            System.out.println("Informe a distância até a "+i+"º parada");
            float quilometragem = sc.nextFloat();
            System.out.println("Informe a quantidade de combustível abastecido na "+i+"º parada");
            float combustivel = sc.nextFloat();

            float kmPorLitro = quilometragem / combustivel;

            System.out.println("Parada "+i+": "+kmPorLitro+" km por litro");

            float somakmPLitro =+ kmPorLitro;
        }
        sc.close();
    }
}
