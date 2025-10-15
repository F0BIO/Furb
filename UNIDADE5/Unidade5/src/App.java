public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        int qtdPar = 0;
        int qtdImpar = 0;
        for (int i = 0; i <= 100;i++) {
            if (i % 2 == 0){
                qtdPar ++;
            }
            else{
                qtdImpar ++;
            }
        }
        System.out.println("Qtd de pares: " + qtdPar);
        System.out.println("Qtd de impares: " + qtdImpar);
    }
}
