public class Uni5Exe02 {
    int somaPar = 0;
    int somaImpar = 0;
    public Uni5Exe02(){
        somaParEImpar();
    }
    public static void main(String[] args) {
        new Uni5Exe02();
    }

    private void somaParEImpar(){
            for (int i = 1; i <= 100;i++) {
                if (i % 2 == 0){
                    somaPar += i;
                }
                else{
                    somaImpar += i;
                }
            }
            System.out.println("Soma dos numeros pares: "+  somaPar);
            System.out.println("Soma dos numeros ímpares: " + somaImpar);
    }
}
