import java.util.Scanner;

public class NutricaoQ1 {
    Scanner sc = new Scanner(System.in);
    double altura, peso;
    public NutricaoQ1(){
        ImformarPesoAltura();
        calculoNutricao();
    }
    public static void main(String[] args) {
        new NutricaoQ1();
    }

    private void ImformarPesoAltura(){
        System.out.println("Informe a altura: ");
        altura = sc.nextDouble();

        System.out.println("Informe o peso: ");
        peso = sc.nextDouble();
    };

    private void calculoNutricao() {
        if (altura > 1.00 && peso > 50) {
            if(altura > 5.00 || peso > 300){
                System.out.println("Pegar medidas novamente");
            }
            else{
                System.out.println("nomal");
            }
        }
        else{
            System.out.println("Subnutrido");
            System.out.println("Perigo de Vida");
        }
        System.out.println("fim");
    }
}
