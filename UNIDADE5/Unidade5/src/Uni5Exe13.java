import java.util.Scanner;

public class Uni5Exe13 {
    float kmPorLitro, somakmPLitro, parada1, parada2, parada3;
    public Uni5Exe13(){
        Abastecimento();
    }

    public static void main(String[] args) {
        new Uni5Exe13();
    }

    private void Abastecimento(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe o número total de reabastecimentos: ");
        float reabastecimentos = sc.nextFloat();

        if (reabastecimentos % 1 != 0 && reabastecimentos < 0) {
            System.out.println("Número inválido.");
            System.out.print("Total de reabastecimentos deve ser inteiro maior que 0: ");
            reabastecimentos = sc.nextFloat();
        }
        for (int i = 1; i <= reabastecimentos; i++){
            System.out.println("Informe a distância até a "+i+"º parada");
            float quilometragem = sc.nextFloat(); System.out.println("Km");
            System.out.println("Informe a quantidade de combustível abastecido na "+i+"º parada");
            float combustivel = sc.nextFloat();

            kmPorLitro = quilometragem / combustivel;

            somakmPLitro += kmPorLitro;

            if (i==1) {
                parada1 = kmPorLitro;
            }
            else if (i==2){
                parada2 = kmPorLitro;
            }
            else{
                parada3 = kmPorLitro;
            }
        }

        float media = somakmPLitro / reabastecimentos;
        System.out.println("Parada 1: "+parada1+" km por litro");
        System.out.println("Parada 2: "+parada2+" km por litro");
        System.out.println("Parada 3: "+parada3+" km por litro");
        System.out.println("Quilometragem média obtida por litro: "+ media);
        sc.close();
    }
}
