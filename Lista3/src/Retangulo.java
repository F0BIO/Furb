public class Retangulo {

    private int altura;
    private int comprimento;

     /**
     * Construtor padrão da classe Retangulo.
     * Cria um retângulo com altura e comprimento iguais a 0.
     */
    public Retangulo(){
        super();
        this.altura = 0;
        this.comprimento = 0;
    }

    /**
     *Construtor que cria um retângulo com valores definidos pelos parâmetros.
     *
     * altura do retângulo
     * comprimento comprimento do retângulo
     */
    public Retangulo(int altura, int comprimento){
        super();
        this.altura = altura;
        this.comprimento = comprimento;
    }

    public void setAltura(int altura){
        if (altura <= 0) {
            throw new RuntimeException("Valor incorreto para altura: " + altura);
        }
        this.altura = altura;
    }

    public int getAltura(){
        return this.altura;
    }

    public int getComprimento(){
        return this.comprimento;
    }

    public void setComprimento(int comprimento){
        if (comprimento <= 0) {
            throw new RuntimeException("Valor incorreto para comprimento: " + comprimento);
        }
        this.comprimento = comprimento;
    }

     /**
     * Calcula o perímetro do retângulo.
     * O perímetro é a soma de todos os lados.
     *
     * Retorna o valor do perímetro do retângulo
     */
    public int calcularPerimetro(){
        return 2 * (this.altura + this.comprimento);
    }

    /**
     * Calcula a área do retângulo.
     *
     * Retorna o valor da área do retângulo
     */
    public int calcularArea(){
        return this.altura * this.comprimento;
    }
}
