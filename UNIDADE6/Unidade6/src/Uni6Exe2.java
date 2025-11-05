import java.util.Scanner;

public class Uni6Exe2 {
    Scanner sc = new Scanner(System.in);
    public Uni6Exe2(){
        double numerosReais[] = new double[12];
        obterNumeroDoUsuario(numerosReais);
        double media = calcularMedia(numerosReais);
        exibirNumerosMaiorQueMedia(numerosReais, media);

    }

    public void obterNumeroDoUsuario(double[] numerosReais)
    {
        for(int i=0; i < numerosReais.length; i++){
            System.out.println("Digite o numero real "+ i);
            numerosReais[i] = sc.nextDouble();
        }
    }

    public double calcularMedia(double[] numerosReais)
    {
        double soma = 0;
        for(int i=0; i < numerosReais.length; i++)
        {
            soma += numerosReais[i];
        }
        return soma / numerosReais.length;
    }

    public void exibirNumerosMaiorQueMedia(double[] numerosReais, double media)
    {
        System.out.println("A media dos valores é "+ media);
        for(int i = 0; i < numerosReais.length; i++){
            System.out.println("Posição "+i+": " + numerosReais[i]);
        }
    }
    public static void main(String[] args) {
        new Uni6Exe2();
    }
}
