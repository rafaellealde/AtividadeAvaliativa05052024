public abstract class Funcionario {

    // atributos
    protected String nome;
    protected String matricula;

    // getters
    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }

    // setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    // metodos
    public abstract double calcularSalario();
}
