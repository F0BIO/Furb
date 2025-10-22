public class Uni5Exe10 {

    public Uni5Exe10(){
       DezPrimeirosNaturaiz();
    }
    public static void main(String[] args) {
        new Uni5Exe10();
    }

    private void DezPrimeirosNaturaiz(){
        int contador = 0;
        for(int num1=1; num1 <= 10000; num1++){
            for(int num2=1; num2 <= 10000; num2++){
                int soma = num1+num2;
                int potencia = soma * soma;
                String numCombinado = num1+""+num2;
                String potenciaStr = potencia+"";
                if (numCombinado.equals(potenciaStr)) {
                    contador++;
                    System.out.println("["+contador+"] "+num1 + "+" + num2 + " = " + soma + " " + soma + "^2 = "+ potencia);
                }
                if (contador == 10) {
                    break;
                }
            }
            if (contador == 10) {
                    break;
            }
        }
    }
}
