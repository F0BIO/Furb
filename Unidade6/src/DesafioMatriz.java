import java.util.Random;

public class DesafioMatriz {
    int[][] matriz = new int[50][50];
        Random random = new Random();

        int somaTotal = 0;
        int[] somaLinhas = new int[50];
        int[] somaColunas = new int[50];
        int somaDiagonalPrincipal = 0;
        int somaDiagonalSecundaria = 0;

        int maiorValor = Integer.MIN_VALUE;
        int posLinha = -1, posColuna = -1;
        int linha, coluna;
    public DesafioMatriz(){
        
        popularMatriz(matriz);
        somaMatriz();
        // Imprimindo a matriz
        System.out.println("Matriz 50 x 50:\n");
        for (int linha = 0; linha < 50; linha++) {
            for (int coluna = 0; coluna < 50; coluna++) {
                System.out.print(matriz[linha][coluna] + "\t");
            }
            System.out.println();
        }

        // Imprimir resultados
        System.out.println("\n===== RESULTADOS =====");
        System.out.println("Soma total da matriz: " + somaTotal);

        System.out.println("\nSoma das linhas:");
        for (int i = 0; i < 50; i++)
            System.out.println("Linha " + i + ": " + somaLinhas[i]);

        System.out.println("\nSoma das colunas:");
        for (int i = 0; i < 50; i++)
            System.out.println("Coluna " + i + ": " + somaColunas[i]);

        System.out.println("\nSoma da diagonal principal: " + somaDiagonalPrincipal);
        System.out.println("Soma da diagonal secundária: " + somaDiagonalSecundaria);

        System.out.println("\nMaior valor encontrado: " + maiorValor);
        System.out.println("Posição na matriz: linha " + posLinha + ", coluna " + posColuna);
    }

    public void popularMatriz(int[][] matriz){
        Random random = new Random();
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                matriz[linha][coluna] = random.nextInt(-500, 500);
            }
        }
    }

    public void somaMatriz(){
        for(int linha = 0; linha < matriz.length; linha++){
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                int valor = matriz[linha][coluna];
                        somaTotal += valor;
                        somaLinhas[linha] += valor;
                        somaColunas[coluna] += valor;

                        if (linha == coluna)
                            somaDiagonalPrincipal += valor;

                        if (linha + coluna == 49)
                            somaDiagonalSecundaria += valor;

                        if (valor > maiorValor) {
                            maiorValor = valor;
                            posLinha = linha;
                            posColuna = coluna;
                        }
                }
            }
    }
    public static void main(String[] args) {
        new DesafioMatriz();
    }
}
