public class Aluno {

    private int matricula;
    private String nome;
    private double notaEnem;

    public Aluno(){

    }
    public Aluno(int matricula, String nome, double notaEnem){
        super();
        this.matricula = matricula;
        this.nome = nome;
        this.notaEnem = notaEnem;
    }

    public int  getMatricula() {
        return this.matricula;
    }

    public void setMatricula(int  matricula) {
        if (matricula <= 0) {
            throw new RuntimeException("Matrícula inválida");
        }
        this.matricula = matricula;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome == " ") {
            throw new RuntimeException("Obrigatorio informar um nome");
        }
        this.nome = nome;
    }

    public double getNotaEnem() {
        return this.notaEnem;
    }

    public void setNotaEnem(double notaEnem) {
        if (notaEnem < 0 || notaEnem > 1000){
            throw new RuntimeException("Nota inválida");
        }
        this.notaEnem = notaEnem;
    }
}
