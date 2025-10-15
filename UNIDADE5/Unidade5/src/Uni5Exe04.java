public class Uni5Exe04 {
    double S, numerador, denominador;
    public Uni5Exe04(){
        System.out.println("3   5    7    9   11  ");
        System.out.println("_ + _ + __ + __ + __ + ...");
        System.out.println("2   6   12   20   30   ");
        System.out.printf("Resultado: %.6f", calcularS());
    }

    public static void main(String[] args) {
        new Uni5Exe04();
    }

    private double calcularS(){
        for(int i = 1; i <=20; i++){
            numerador = 2 * i + 1;
            denominador = i * (i + 1);
            S = numerador / denominador;
        }
        return S;
    }
}
