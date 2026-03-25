public class Bairro {
    private String nome;
    private double coeficienteIptu;

    public Bairro(String nome, double coeficienteIptu){
        super();
        this.nome = nome;
        this.coeficienteIptu = coeficienteIptu;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.isEmpty()) {
            throw new IllegalArgumentException("Obrigatorio informar um nome");
        }
        this.nome = nome;
    }

    public double getCoeficienteIptu() {
        return this.coeficienteIptu;
    }

    public void setCoeficienteIptu(double  coeficienteIptu) {
        if (coeficienteIptu < 0) {
            throw new IllegalArgumentException("Coeficiente Iptu inválido");
        }
        this.coeficienteIptu = coeficienteIptu;
    }

}
