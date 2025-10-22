public class ExemploDoWhile2 {
    public static void main(String[] args) {
        int totalDeVidas = 3;

        do {
            System.out.println("Jogando...");
            System.out.println("Levei um tiro");
            totalDeVidas--;
            System.out.println("Vidas: "+ totalDeVidas);
        } while (totalDeVidas > 0);
        System.out.println("Game Over!");
    }
}
