public class JogoDaVelha {
    public static void main(String[] args) {
        for(int linha = 2; linha >=0; linha--){
            for (int coluna = 0; coluna < 3;coluna++){
                if (linha >= 1) {
                    if (coluna < 2) {
                        System.out.print("__|");
                    }
                    else{
                    System.out.print("__");
                    }
                }
                else{ if (coluna < 2) {
                    System.out.print("  |");
                    }
                    else{
                        System.out.println("  ");
                    }
                }
            }
            System.out.println("");
        }
    }
}
