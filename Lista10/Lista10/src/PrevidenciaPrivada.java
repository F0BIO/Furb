public class PrevidenciaPrivada extends Investimento {
    private double valor;

    public void setValor(double valor){
        this.valor = valor;
    }

    public void investir(){
        setSaldo(getSaldo() + valor);
    }

    public double calcularValorPagar() {
        return valor;
    }
}
