import java.util.Scanner;

public class Uni3Exe14 {
/*Descreva um programa que a partir da distância percorrida e o do tempo 
gasto por um motorista durante uma viagem de final de semana, 
calcule a velocidade média e a quantidade de combustível gasto na viagem, 
sabendo que o automóvel faz 12 km por litro.*/

    public static void main(String[] args) throws Exception {
        calculoVelocidaCombustivel();
    }

    public static void calculoVelocidaCombustivel() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Distância(em km): ");
        double distancia = sc.nextDouble();

        System.out.print("Tempo(em horas): ");
        double tempo = sc.nextDouble();

        double velocidadeMedia = distancia / tempo;
        double combustivelGasto = distancia / 12.0;

        System.out.printf("A velocidade média foi de %.2f km/h e a quantidade de combustível usado foi %.2f litros.", velocidadeMedia, combustivelGasto);

        sc.close();
    }
/*Testes:
 * 
 * Entradas: 300 | 5
 * Saídas: A velocidade média foi de 60,00 km/h e a quantidade de combustível usado foi 25,00 litros.
 * 
 * Entradas: 220 | 3
 * Saídas: A velocidade média foi de 73,33 km/h e a quantidade de combustível usado foi 18,33 litros.
 * 
 * Entradas: 280 | 4
 * Saídas: A velocidade média foi de 70,00 km/h e a quantidade de combustível usado foi 23,33 litros.
*/
}
