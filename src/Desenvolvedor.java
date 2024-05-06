import java.util.ArrayList;

public class Desenvolvedor extends Funcionario implements Trabalhavel {

    // atributos
    private ArrayList<String> tecnologiaQueDomina;

    // getters
    public ArrayList<String> getTecnologiaQueDomina() {
        return tecnologiaQueDomina;
    }

    // setters
    public void setTecnologiaQueDomina(ArrayList<String> tecnologiaQueDomina) {
        this.tecnologiaQueDomina = tecnologiaQueDomina;
    }

    // construtores
    public Desenvolvedor() {
    }

    public Desenvolvedor(ArrayList<String> tecnologiaQueDomina) {
        this.tecnologiaQueDomina = tecnologiaQueDomina;
    }

    // metodos
    public void addTec(String tecnologia) {
        tecnologiaQueDomina.add(tecnologia);
    }

    public void removeTec(String tecnologia) {
        tecnologiaQueDomina.remove(tecnologia);
    }

    @Override
    public void trabalhar() {
        System.out.println("Desenvolvedor " + getNome() + "/n(Trabalhando)");
    }

    @Override
    public void relatarProgresso() {
        System.out.println("Desenvolvedor " + getNome() + "\n(Relatando Progresso)");
    }
}
