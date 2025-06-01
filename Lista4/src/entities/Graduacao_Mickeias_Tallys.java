package entities;

public class Graduacao_Mickeias_Tallys extends Pessoas {
    private String cursoGraduacao;

    public Graduacao_Mickeias_Tallys(String nome, String cpf, String matricula, String cursoGraduacao) {
        super(nome, cpf, matricula);
        this.cursoGraduacao = cursoGraduacao;
    }

    public String getCursoGraduacao() {
        return cursoGraduacao;
    }

    public void setCursoGraduacao(String cursoGraduacao) {
        this.cursoGraduacao = cursoGraduacao;
    }

    @Override
    public String toString() {
        return "Tipo: Graduação\n" +
                "Nome: " + getNome() + "\n" +
                "CPF: " + getCpf() + "\n" +
                "Matrícula: " + getMatricula() + "\n" +
                "Curso de Graduação: " + cursoGraduacao + "\n";
    }
}