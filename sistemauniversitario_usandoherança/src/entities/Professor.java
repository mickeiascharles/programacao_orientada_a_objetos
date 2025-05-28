package entities;

public class Professor extends Pessoas{ //herança da classe pessoas
    private String especialidade;
    private double  salario;

    public String getEspecialidade() {
        return especialidade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public void receberAumento(float aumento){
        this.salario += aumento;
    }
    public String toString() {
        return "Professor [nome=" + getNome() + ", idade=" + getIdade() + ", genero=" + getGenero() + ", especialidade=" + especialidade + ", salario=" + salario + "]";
    }
}
