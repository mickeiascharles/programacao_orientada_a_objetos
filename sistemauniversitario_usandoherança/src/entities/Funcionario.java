package entities;

public class Funcionario extends Pessoas{
    private String setor;
    private boolean trabalhando;

    public void mudarTrabalho(){
        this.trabalhando = !this.trabalhando;
    }

    public boolean getTrabalhando() {
        return trabalhando;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }
    public String toString() {
        return "Funcionario [nome=" + getNome() + ", idade=" + getIdade() + ", genero=" + getGenero() + ", setor=" + setor + ", trabalhando=" + (trabalhando ? "Sim" : "Não") + "]";
    }
}
