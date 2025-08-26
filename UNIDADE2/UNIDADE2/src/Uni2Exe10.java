import java.util.Scanner;
public class Uni2Exe10 {
    /*Leia um valor inteiro, que é o tempo de duração em segundos de um 
    determinado evento em uma fábrica, e informe-o expresso no formato 
    horas:minutos:segundos. */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o tempo de duração do evento em segundos: ");
        int duracaoEvento = sc.nextInt();

        int horas = duracaoEvento / 3600;
        int minutos = (duracaoEvento % 3600) / 60;
        int segundos = duracaoEvento % 60;

        System.out.printf("Duração: %02d:%02d:%02d\n", horas,minutos,segundos);
        
        sc.close();
    }
/*Testes:
 * 
 * Entradas: 10000
 * Saidas: 02:46:40
 * 
 * Entradas: 5000
 * Saidas: 01:23:20
 * 
 * Entradas: 1000
 * Saidas: 00:16:40
*/
}
