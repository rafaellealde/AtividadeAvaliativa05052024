public class Estagiario extends Funcionario implements Trabalhavel {

    // atributos
    private double horasDeTrabalho;
    private String supervisor;

    // getters
    public double getHorasDeTrabalho() {
        return horasDeTrabalho;
    }

    public String getSupervisor() {
        return supervisor;
    }

    // setters
    public void setHorasDeTrabalho(double horasDeTrabalho) {
        this.horasDeTrabalho = horasDeTrabalho;
    }
    
    public void setSupervisor(String supervisor) {
        this.supervisor = supervisor;
    }

    // construtores
    public Estagiario() {
    }

    public Estagiario(double horasDeTrabalho, String supervisor) {
        this.horasDeTrabalho = horasDeTrabalho;
        this.supervisor = supervisor;
    }

    // metodos
    @Override
    public void trabalhar() {
        System.out.println("Estagiário " + getNome() + " está trabalhando.");
    }

    @Override
    public void relatarProgresso() {
        System.out.println("Estagiário " + getNome() + " está relatando progresso.");
    }
}
