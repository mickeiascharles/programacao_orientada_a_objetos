import java.util.Scanner;

public class SistemaEscola {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome do(a) professor(a): ");
        String nomeProfessor = sc.nextLine();

        System.out.print("Digite o nome do(a) estudante: ");
        String nomeAluno = sc.nextLine();

        System.out.print("Digite a primeira nota: ");
        double nota1 = sc.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = sc.nextDouble();

        double media = (nota1 + nota2) / 2;

        System.out.println("\n--- RESULTADO ---");
        System.out.println("Professor(a): " + nomeProfessor);
        System.out.println("NOME: " + nomeAluno);
        System.out.println("NOTA 1: " + nota1);
        System.out.println("NOTA 2: " + nota2);
        System.out.println("MÉDIA: " + media);

        sc.close();
    }
}
