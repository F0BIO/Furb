public class matriz {

public static void main(String[] args) {

        char matriz[][] = new char[3][3];

        matriz[0][0] = 'X';
        matriz[0][1] = 'O';
        matriz[0][2] = 'X';
        matriz[1][0] = 'O';
        matriz[1][1] = 'X';
        matriz[1][2] = 'O';
        matriz[2][0] = 'X';
        matriz[2][1] = 'O';
        matriz[2][2] = 'X';

        // Imprimindo a matriz
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                System.out.print(matriz[linha][coluna] + " ");
            }
            System.out.println(); // pula para a próxima linha
        }
    }
}
