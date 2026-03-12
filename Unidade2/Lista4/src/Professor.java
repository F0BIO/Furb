public class Professor{

    private String nome;
    private String email;
    private Titulacao titulacao;

    public Professor(String nome, String email, Titulacao titulacao){
        super();
        this.nome = nome;
        this.email = email;
        this.titulacao = titulacao;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome == "") {
            throw new RuntimeException("Obrigatorio informar um nome");
        }
        this.nome = nome;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        if (email == null || email == "") {
            throw new RuntimeException("Obrigatorio informar um email");
        }
        this.email = email;
    }

    public Titulacao getTitulacao(){
        return this.titulacao;
    }

    public void setTitulacao(Titulacao titulacao) {
        if (titulacao == null) {
            throw new RuntimeException("Obrigatorio informar a titulação");
        }
        this.titulacao = titulacao;
    }
}
