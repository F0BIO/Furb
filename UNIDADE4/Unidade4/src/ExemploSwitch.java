import java.util.Scanner;

public class ExemploSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número de 0 a 6 para o dia da semana: ");
        String nomeDodia = sc.next();
        int diaDaSemana;

        // switch (diaDaSemana) {
        //     case 0:
        //         nomeDodia = "Domingo";
        //         break;

        //     case 1:
        //         nomeDodia = "Segunda"; 
        //         break;

        //     case 2:
        //         nomeDodia = "Segunda";
        //         break;

        //     case 3:
        //         nomeDodia = "Quarta";
        //         break;

        //     case 4:
        //         nomeDodia = "Quinta";
        //         break;

        //     case 5:
        //         nomeDodia = "Sexta";
        //         break;

        //     case 6:
        //         nomeDodia = "Sábado";
        //         break;
        
        //     default:
        //     nomeDodia = "Dia inválido";
        //         break;
        // }

        
        switch (nomeDodia) {
            case "Domingo":
                diaDaSemana = 0;
                break;

            case "Segunda":
                diaDaSemana = 1; 
                break;

            case "Terça":
                diaDaSemana = 2;
                break;

            case "Quarta":
                diaDaSemana = 3;
                break;

            case "Quinta":
                diaDaSemana = 4;
                break;

            case "Sexta":
                diaDaSemana = 5;
                break;

            case "Sábado":
                diaDaSemana = 6;
                break;
        
            default:
                diaDaSemana = -1;
                break;

        }
        if (diaDaSemana == -1){
            System.err.println("Dia inválido");
        }
        else{
            System.out.println("O dia da semana é: "+diaDaSemana);
        }
        sc.close();
    }
}
