public class Gerente extends Funcionario implements Trabalhavel {

    // atributos
    private double bonusAnual;
    private String equipeSobGerencia;

    // getters
    public double getBonusAnual() {
        return bonusAnual;
    }

    public String getEquipeSobGerencia() {
        return equipeSobGerencia;
    }

    // setters
    public void setBonusAnual(double bonusAnual) {
        this.bonusAnual = bonusAnual;
    }
    
    public void setEquipeSobGerencia(String equipeSobGerencia) {
        this.equipeSobGerencia = equipeSobGerencia;
    }

    // construtores
    public Gerente() {
    }

    public Gerente(double bonusAnual, String equipeSobGerencia) {
        this.bonusAnual = bonusAnual;
        this.equipeSobGerencia = equipeSobGerencia;
    }

    // metodos
    @Override
    public void trabalhar() {
        System.out.println("Gerente " + getNome() + "/n(Trabalhando)");
    }

    @Override
    public void relatarProgresso() {
        System.out.println("Gerente " + getNome() + "\n(Relatando Progresso)");
    }
    
}
