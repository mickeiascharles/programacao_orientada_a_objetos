package application;

import entities.Aluno;
import entities.Funcionario;
import entities.Pessoas;
import entities.Professor;

import java.util.Scanner;

public class ProjetoPessoas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;
        Pessoas[] pessoas = new Pessoas[100]; // Ajuste o tamanho conforme necessário
        int count = 0;

        do {
            System.out.println("Escolha o tipo de cadastro:");
            System.out.println("1. Aluno");
            System.out.println("2. Professor");
            System.out.println("3. Funcionario");
            System.out.println("4. Sair");

            opcao = sc.nextInt();
            sc.nextLine(); // Consume newline left-over

            if (opcao == 4) {
                break;
            }

            System.out.println("Digite o nome:");
            String nome = sc.nextLine();

            System.out.println("Digite a idade:");
            int idade = sc.nextInt();

            System.out.println("Digite o genero:");
            String genero = sc.next();

            switch (opcao) {
                case 1:
                    Aluno aluno = new Aluno();
                    aluno.setNome(nome);
                    aluno.setIdade(idade);
                    aluno.setGenero(genero);

                    System.out.println("Digite a matricula:");
                    int matricula = sc.nextInt();
                    aluno.setMatricula(matricula);

                    System.out.println("Digite o curso:");
                    sc.nextLine(); // Consume newline left-over
                    String curso = sc.nextLine();
                    aluno.setCurso(curso);

                    pessoas[count] = aluno;
                    count++;
                    break;
                case 2:
                    Professor professor = new Professor();
                    professor.setNome(nome);
                    professor.setIdade(idade);
                    professor.setGenero(genero);

                    System.out.println("Digite a especialidade:");
                    sc.nextLine(); // Consume newline left-over
                    String especialidade = sc.nextLine();
                    professor.setEspecialidade(especialidade);

                    System.out.println("Digite o salário:");
                    float salario = sc.nextFloat();
                    professor.setSalario(salario);

                    pessoas[count] = professor;
                    count++;
                    break;
                case 3:
                    Funcionario funcionario = new Funcionario();
                    funcionario.setNome(nome);
                    funcionario.setIdade(idade);
                    funcionario.setGenero(genero);

                    System.out.println("Digite o setor:");
                    sc.nextLine();  // Consume newline left-over
                    String setor = sc.nextLine();
                    funcionario.setSetor(setor);

                    System.out.println("O funcionário está trabalhando? (true para sim, false para não):");
                    boolean trabalhando = sc.nextBoolean();
                    funcionario.setTrabalhando(trabalhando);

                    pessoas[count] = funcionario;
                    count++;
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 4);

        for (int i = 0; i < count; i++) {
            System.out.println(pessoas[i].toString());
        }

        sc.close();
    }
}
