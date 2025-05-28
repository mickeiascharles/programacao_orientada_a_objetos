package entities;

public class Aluno extends Pessoas{
    private int matricula;
    private String curso;

    public void cancelarMatricula(){
        System.out.println("Matricula será cancelada");
    }

    public int getMatricula() {
        return matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    public String toString() {
        return "Aluno [nome=" + getNome() + ", idade=" + getIdade() + ", genero=" + getGenero() + ", matricula=" + matricula + ", curso=" + curso + "]";
    }
}
