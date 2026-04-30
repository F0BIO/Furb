public abstract class Investimento implements Pagavel{
    private double saldo;

    public double getSaldo(){
        return this.saldo;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
}
