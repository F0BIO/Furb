public class Uni5Exe03 {
    double soma = 0;
    public Uni5Exe03(){
        System.out.println("1   1   1   1          1");
        System.out.println("_ + _ + _ + _ + ... + ___");
        System.out.println("1   2   3   4         100");
        System.out.printf("Resultado: %.6f", somaDosTermos());
    }

    public static void main(String[] args) {
        new Uni5Exe03();
    }

    private double somaDosTermos(){
        for (double i = 1; i <= 100;i++){
            soma += 1/i;
        }
        return soma;
    }
}
