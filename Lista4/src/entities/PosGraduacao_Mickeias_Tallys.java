package entities;

public class PosGraduacao_Mickeias_Tallys extends Pessoas {
    private String cursoPosgraduacao;

    public PosGraduacao_Mickeias_Tallys(String nome, String cpf, String matricula, String cursoPosgraduacao) {
        super(nome, cpf, matricula);
        this.cursoPosgraduacao = cursoPosgraduacao;
    }

    public String getCursoPosgraduacao() {
        return cursoPosgraduacao;
    }

    public void setCursoPosgraduacao(String cursoPosgraduacao) {
        this.cursoPosgraduacao = cursoPosgraduacao;
    }

    @Override
    public String toString() {
        return "Tipo: Pós-Graduação\n" +
                "Nome: " + getNome() + "\n" +
                "CPF: " + getCpf() + "\n" +
                "Matrícula: " + getMatricula() + "\n" +
                "Curso de Pós-Graduação: " + cursoPosgraduacao + "\n";
    }
}