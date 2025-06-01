package application;

import entities.Pessoas;
import entities.Graduacao_Mickeias_Tallys;
import entities.PosGraduacao_Mickeias_Tallys;

import java.util.Scanner;


public class Programa_Mickeias_Tallys {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pessoas[] cadastros = new Pessoas[10];
        int contadorCadastros = 0;
        int opcao;

        do {
            System.out.println("\n--- MENU PRINCIPAL ---");
            System.out.println("1 – Cadastro Graduação");
            System.out.println("2 – Cadastro Pós-Graduação");
            System.out.println("3 – Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    if (contadorCadastros < 10) {
                        System.out.println("\n--- Cadastro Graduação ---");
                        System.out.print("Nome: ");
                        String nomeGrad = sc.nextLine();
                        System.out.print("CPF: ");
                        String cpfGrad = sc.nextLine();
                        System.out.print("Matrícula: ");
                        String matGrad = sc.nextLine();
                        System.out.print("Curso de Graduação: ");
                        String cursoGrad = sc.nextLine();

                        cadastros[contadorCadastros] = new Graduacao_Mickeias_Tallys(nomeGrad, cpfGrad, matGrad, cursoGrad);
                        contadorCadastros++;
                        System.out.println("Cadastro de Graduação realizado com sucesso!");
                    } else {
                        System.out.println("Limite máximo de 10 cadastros atingido.");
                    }
                    break;
                case 2:
                    if (contadorCadastros < 10) {
                        System.out.println("\n--- Cadastro Pós-Graduação ---");
                        System.out.print("Nome: ");
                        String nomePos = sc.nextLine();
                        System.out.print("CPF: ");
                        String cpfPos = sc.nextLine();
                        System.out.print("Matrícula: ");
                        String matPos = sc.nextLine();
                        System.out.print("Curso de Pós-Graduação: ");
                        String cursoPos = sc.nextLine();

                        cadastros[contadorCadastros] = new PosGraduacao_Mickeias_Tallys(nomePos, cpfPos, matPos, cursoPos);
                        contadorCadastros++;
                        System.out.println("Cadastro de Pós-Graduação realizado com sucesso!");
                    } else {
                        System.out.println("Limite máximo de 10 cadastros atingido.");
                    }
                    break;
                case 3:
                    System.out.println("\nSaindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 3);

        if (contadorCadastros > 0) {
            System.out.println("\n--- CADASTROS REALIZADOS ---");
            for (int i = 0; i < contadorCadastros; i++) {
                System.out.println(cadastros[i].toString());
                System.out.println("--------------------");
            }
        } else {
            System.out.println("\nNenhum cadastro foi realizado.");
        }

        sc.close();
    }
}