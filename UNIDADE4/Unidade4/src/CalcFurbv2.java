import java.util.Scanner;


public class CalcFurbv2 {
    Scanner sc = new Scanner(System.in);
    double num1, num2, resultado; 
    public CalcFurbv2(){
        System.out.println("|Bem Vindo a Calculadora|");
        inicializar();
        finalizar();
    }
    private void inicializar() {
        informarDoisNumeros();
        escolherOpcao();
        retornarResultado();
    }

    private void finalizar() {
        System.out.println("Deseja continuar calculando?");
        System.out.println("1 - Sim");
        System.out.println("2 - Não");
        int opcao = sc.nextInt();
        if (opcao == 1) {
            inicializar();
            finalizar();
        }
        else {
            System.out.println("Obrigado por usar a Calculadora");
            sc.close();
        }
    }

    private void retornarResultado() {
        System.out.println("O resultado é: " + resultado);
    }

    private void escolherOpcao() {
        System.out.println("Escolha uma opção");
        System.out.println("1 - Somar");
        System.out.println("2 - Subrair");
        System.out.println("3 - Multiplicar");
        System.out.println("4 - Dividir");


        int opcao = sc.nextInt();

        switch (opcao) {
            case 1:
                resultado = somar();          
                break;

            case 2:
                resultado = subtrair();
                break;

            case 3:
                resultado = multiplicar();
                break;

            case 4:
                resultado = dividir();   
                break;
            
                default:
                System.out.println("Operação inválida");
                escolherOpcao();
                    break;
            }
    }

    private void informarDoisNumeros() {
        System.out.println("Informe o primeiro número: ");
        num1 = sc.nextDouble();
        System.out.println("Informe o segundo número: ");
        num2 = sc.nextDouble();
    }

    public static void main(String[] args) {
        new CalcFurbv2();
    }

    private double somar(){
        return num1 + num2;
    }

    private double subtrair(){
        return num1 - num2;
    }

    private double multiplicar(){
        return num1 * num2;
    }

    private double dividir() {
        if (num2 > 0) {
            return  num1 / num2;
        } else {
            return 0;
        }
    }
}
