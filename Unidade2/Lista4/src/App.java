public class App {
    public static void main(String[] args) throws Exception {
        Professor professor = new Professor(
                "Carlos Silva",
                "carlos@gmail.com",
                Titulacao.MESTRADO
        );

        Aluno aluno1 = new Aluno(1, "Fabio", 750);
        Aluno aluno2 = new Aluno(2, "Gustavo", 820);
        Aluno aluno3 = new Aluno(3, "Sebastião", 690);

        Turma turma = new Turma("Programação Orientada a Objetos");

        turma.setProfessor(professor);
        turma.setTurno(Turno.NOTURNO);

        turma.incluirAluno(aluno1);
        turma.incluirAluno(aluno2);
        turma.incluirAluno(aluno3);

        System.out.println("Lista de alunos:");
        turma.getAlunos();

        Aluno melhor = turma.obterAlunoMelhorNotaEnem();

        System.out.println("\nAluno com maior nota no ENEM:");
        System.out.println("Matricula: " + melhor.getMatricula());
        System.out.println("Nome: " + melhor.getNome());
        System.out.println("Nota: " + melhor.getNotaEnem());

        // turma.removerAluno(aluno3);
        // System.out.println("Lista de alunos:");
        // turma.getAlunos();
    }
}
