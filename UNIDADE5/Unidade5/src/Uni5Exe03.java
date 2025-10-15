public class Uni5Exe03 {
    double soma = 0;
    public Uni5Exe03(){
        somaDosTermos();
    }

    public static void main(String[] args) {
        new Uni5Exe03();
    }

    private void somaDosTermos(){
        for (double i = 1; i <= 100;i++){
            soma += 1/i;
        }
        System.out.printf("%.6f", soma);
    }
}
