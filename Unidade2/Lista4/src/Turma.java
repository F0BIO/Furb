import java.util.ArrayList;

public class Turma {

    private String disciplina;
    private Professor professor;
    private ArrayList<Aluno> alunos;
    private Turno turno;

    public Turma(String disciplina){
        super();
        this.disciplina = disciplina;
        alunos = new ArrayList<>();
    }

    public String getDisciplina(){
        return this.disciplina;
    }

    public void setDisciplina(){
        if (disciplina == null || disciplina == "") {
            throw new RuntimeException("Obrigatorio informar a disciplina");
        }
        this.disciplina = disciplina;
    }

    public Professor getProfessor() {
        return this.professor;
    }

    public void setProfessor(Professor professor){
        if (professor == null) {
            throw new RuntimeException("Obrigatorio informar o professor");
        }
        this.professor = professor;
    }
    
    public Turno getTurno() {
        return this.turno;
    }

    public void setTurno(Turno turno){
        if (turno == null) {
            throw new RuntimeException("Obrigatorio informar o turno");
        }
        this.turno = turno;
    }

    public void getAlunos() {
        for (Aluno aluno : alunos) {
            System.out.println(aluno.getMatricula());
            System.out.println(aluno.getNome());
            System.out.println(aluno.getNotaEnem());
        }
    }

    public void incluirAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public void removerAluno(Aluno aluno) {
        alunos.remove(aluno);
    }

    public Aluno obterAlunoMelhorNotaEnem(){}
}
