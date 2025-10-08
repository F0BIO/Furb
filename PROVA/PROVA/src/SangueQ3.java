import java.util.Scanner;

public class SangueQ3 {
    char tipoSanguineo;
    public SangueQ3(){
        lerTipoSanguineo();
        caracteristicaSangue();
    }
    public static void main(String[] args) {
        new SangueQ3();
    }

    private void lerTipoSanguineo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Imforme o tipo sanguíneo");
        tipoSanguineo = sc.next().charAt(0);
        tipoSanguineo = Character.toUpperCase(tipoSanguineo);
        sc.close();
    };

    private void caracteristicaSangue() {
        if (tipoSanguineo == 'A') {
            System.out.println("Azul");
        }
        else if (tipoSanguineo == 'B'){
            System.out.println("Vermelho");
        }
        else if (tipoSanguineo == 'O'){
            System.out.println("Universal");
        }
        else{
            System.out.println("Tipo incorreto");
        }
    }
}

