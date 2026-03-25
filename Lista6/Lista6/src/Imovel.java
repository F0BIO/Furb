public class Imovel {
    private String endereco;
    private int area;
    private Bairro bairro;
    private Finalidade finalidade;

    public Imovel(String endereco, int area){
        super();
        this.endereco = endereco;
        this.area = area;
        // this.bairro = bairro;
        // this.finalidade = finalidade;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public void setEndereco(String endereco) {
        if (endereco == null || endereco.isEmpty()) {
            throw new IllegalArgumentException("Obrigatorio informar o endereço");
        }
        this.endereco = endereco;
    }

    public int  getArea() {
        return this.area;
    }

    public void setArea(int area) {
        if (area <= 0) {
            throw new IllegalArgumentException("Obrigatorio informar a área");
        }
        this.area = area;
    }

    public Bairro getBairro() {
        return this.bairro;
    }

    public void setBairro(Bairro bairro) {
        if (bairro == null) {
            throw new IllegalArgumentException("Obrigatorio informar o bairro");
        }
        this.bairro = bairro;
    }

    public Finalidade getFinalidade() {
        return this.finalidade;
    }

    public void setFinalidade(Finalidade finalidade) {
        if (finalidade == null) {
            throw new IllegalArgumentException("Obrigatorio informar a finalidade");
        }
        this.finalidade = finalidade;
    }

    public double calcularIptu() {
        if (bairro == null) {
            throw new IllegalStateException("Bairro não definido.");
        }

        if (bairro.getCoeficienteIptu() < 0) {
            throw new IllegalStateException("Coeficiente do bairro inválido.");
        }

        if (finalidade == null) {
            throw new IllegalStateException("Finalidade não definida.");
        }

        double valorBase = 0;

        switch (finalidade) {
            case RESIDENCIAL:
                valorBase = area * 1.0;
                break;

            case COMERCIAL:
                if (area <= 100) {
                    valorBase = 500.0;
                } else if (area <= 400) {
                    valorBase = 1000.0;
                } else {
                    valorBase = area * 2.55;
                }
                break;

            case INDUSTRIAL:
                if (area <= 2000) {
                    valorBase = 1000.0;
                } else {
                    valorBase = area * 0.55;
                }
                break;
        }
        return valorBase * bairro.getCoeficienteIptu();
    }
}
