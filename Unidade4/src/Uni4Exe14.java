import java.util.Scanner;

public class Uni4Exe14 {

    Scanner sc = new Scanner(System.in);
    public Uni4Exe14(){
        System.out.print("Digite o dia: ");
        int dia = sc.nextInt();

        System.out.print("Digite o mês: ");
        int mes = sc.nextInt();

        System.out.print("Digite o ano: ");
        int ano = sc.nextInt();

        boolean dataValida = false;

        if (mes >= 1 && mes <= 12) {
            int diasNoMes;

            switch (mes) {
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    diasNoMes = 31;
                    break;
                case 4: case 6: case 9: case 11:
                    diasNoMes = 30;
                    break;
                case 2:
                    // Verifica se é ano bissexto
                    if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
                        diasNoMes = 29;
                    } else {
                        diasNoMes = 28;
                    }
                    break;
                default:
                    diasNoMes = 0;
            }

            if (dia >= 1 && dia <= diasNoMes) {
                dataValida = true;
            }
        }

        if (dataValida) {
            System.out.println("Data válida!");
        } else {
            System.out.println("Data inválida!");
        }
    }
    public static void main(String[] args) {
        new Uni4Exe14();
    }
}
