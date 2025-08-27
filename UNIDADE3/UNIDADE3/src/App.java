import java.text.DecimalFormat;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        escreverNaTela();
        escreverNaTela();
        escrevaUmTextoNaTela("Novo texto");
        escrevaUmTextoNaTela("Semana que vem é feriado");
        somarDoisNumeros(2, 2);
        somarDoisNumeros(-2, -2);
        int resultado = multiplicarDoisNumeros(2, 4);
        escrevaUmTextoNaTela(""+resultado);
        double resultadoDivisao = dividirDoisNumeros(3, 7);
        escreverFormatado(resultadoDivisao);
    }

    private static void escreverFormatado(double resultadoDivisao) {
        DecimalFormat df = new DecimalFormat("0.0000");
        System.out.println(df.format(resultadoDivisao));
    }

    private static void escrevaUmTextoNaTela(String texto) {
        System.out.println(texto);
    }

    public static void escreverNaTela() {
        System.out.println("Escrevendo na tela");
    }

    public static void somarDoisNumeros(int num1, int num2){
        int soma = num1 + num2;
        System.out.println(soma);
    }

    public static int multiplicarDoisNumeros(int num1, int num2){
        return num1 * num2;
    }

    public static double dividirDoisNumeros(double num1, double num2) {
        return num1 / num2;
    }
}
