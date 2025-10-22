public class ExemploWhile {
    public static void main(String[] args) {
        boolean oktoberFestHoje = true;
        int contador = 0;

        while (oktoberFestHoje) {
            System.out.println("Beba e não dirija");
            System.out.println("X alemão");
            System.out.println("Viva a oktoberfest");
            if (contador == 5) {
                oktoberFestHoje = false;
            }
            contador++;
        }
    }
}
