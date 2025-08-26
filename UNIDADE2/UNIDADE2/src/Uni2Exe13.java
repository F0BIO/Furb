import java.util.Scanner;

public class Uni2Exe13 {
    /* Dois carros (X e Y) partem em uma mesma direção. O carro X sai com 
    velocidade constante de 60 Km/h e o carro Y sai com velocidade constante 
    de 90 Km/h. Em uma hora (60 minutos) o carro Y consegue se distanciar 30 
    quilômetros do carro X, ou seja, consegue se afastar um quilômetro a cada 
    2 minutos. Leia a distância (em Km) e calcule quanto tempo leva (em minutos) 
    para o carro Y tomar essa distância do outro carro.*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a distância percorrida pelo carro Y (em KM): ");
        int distaciaCarroY = sc.nextInt();

        int tempoMinutos = distaciaCarroY*2;

        System.out.println("O carro Y leva "+tempoMinutos+" minutos para se distanciar "+distaciaCarroY+"KM do carro X");

        sc.close();
        

    }

/*Testes:
 * 
 * Entradas: 10
 * Saidas: 20
 * 
 * Entradas: 5
 * Saidas: 10
 * 
 * Entradas: 50
 * Saidas: 100
*/
}
