public class Aluno {
    String nome;
    int idade;
    int numeroMatricula;
    char sexo;
    final int numeroDaEscola = 12345;
    int anoNascimento, mesNascimento, diaNascimento;

    public Aluno(){
        estudar();
    }

    public int informarNumeroDeMatricula(){
        return this.numeroMatricula;
    }


    public void estudar() {
        System.out.println("Estudando");
    }

    public static void main(String[] args) {
        new Aluno();
    }
}
