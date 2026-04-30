import java.util.ArrayList;

public class Contas {

    private ArrayList<Pagavel> contas;

    public Contas() {
        contas = new ArrayList<>();
    }

    public void incluirConta(Pagavel conta){
        contas.add(conta);
    }


    public void getContas(){
        for (Pagavel conta : contas){
            System.out.println(conta);
        }
    }

    public double calcularTotalContas(){
        double totalContas = 0;
        for (Pagavel conta : contas) {
            totalContas += conta.calcularValorPagar();
        }  
        return totalContas;
    }
}
