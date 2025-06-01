package application;

import entities.Impressoras;
import entities.Monitores;
import entities.PlacasVideos;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Programa {

    //pause do menu
    private static void pausar(Scanner scanner) {
        System.out.print("\nPressione Enter para continuar...");
        scanner.nextLine();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcaoMenu;

        Monitores monitorAtual = null;
        Impressoras impressoraAtual = null;
        PlacasVideos placaVideoAtual = null;

        do {
            System.out.println("\n======= MENU DE CADASTRO DA LOJA =======");
            System.out.println("1. Cadastrar e Gerenciar Monitor");
            System.out.println("2. Cadastrar e Gerenciar Impressora");
            System.out.println("3. Cadastrar e Gerenciar Placa de Vídeo");
            System.out.println("4. Imprimir Todas as Informações dos Produtos Cadastrados");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");

            try {
                opcaoMenu = sc.nextInt();
                sc.nextLine();

                switch (opcaoMenu) {
                    case 1:
                        System.out.println("\n--- Cadastro de Monitor ---");
                        System.out.print("Nome do Monitor: ");
                        String nomeMonitor = sc.nextLine();
                        System.out.print("Marca: ");
                        String marcaMonitor = sc.nextLine();
                        System.out.print("Tamanho da Tela (polegadas): ");
                        double tamanhoTela = sc.nextDouble();
                        sc.nextLine();
                        System.out.print("Resolução (ex: 1920x1080): ");
                        String resolucaoMonitor = sc.nextLine();

                        monitorAtual = new Monitores(nomeMonitor, marcaMonitor, tamanhoTela, resolucaoMonitor);
                        System.out.println("Monitor '" + monitorAtual.getNome() + "' cadastrado com sucesso!");
                        monitorAtual.imprimirInformacoes();

                        System.out.print("\nDigite a quantidade inicial para adicionar ao estoque do monitor: ");
                        int qtdAddMonitor = sc.nextInt();
                        sc.nextLine();
                        monitorAtual.adicionarQuantidade(qtdAddMonitor);
                        monitorAtual.imprimirInformacoes();

                        System.out.print("\nDigite a quantidade para remover do estoque do monitor: ");
                        int qtdRemMonitor = sc.nextInt();
                        sc.nextLine();
                        monitorAtual.removerQuantidade(qtdRemMonitor);
                        monitorAtual.imprimirInformacoes();

                        System.out.print("\nDigite o novo nome para o monitor: ");
                        String novoNomeMonitor = sc.nextLine();
                        monitorAtual.setNome(novoNomeMonitor);
                        System.out.println("Nome do monitor alterado com sucesso!");
                        monitorAtual.imprimirInformacoes();
                        break;

                    case 2:
                        System.out.println("\n--- Cadastro de Impressora ---");
                        System.out.print("Nome da Impressora: ");
                        String nomeImpressora = sc.nextLine();
                        System.out.print("Marca: ");
                        String marcaImpressora = sc.nextLine();
                        System.out.print("Tipo (Jato de Tinta, Laser, etc.): ");
                        String tipoImpressora = sc.nextLine();
                        System.out.print("É colorida? (true/false): ");
                        boolean coloridaImpressora = sc.nextBoolean();
                        sc.nextLine();

                        impressoraAtual = new Impressoras(nomeImpressora, marcaImpressora, tipoImpressora, coloridaImpressora);
                        System.out.println("Impressora '" + impressoraAtual.getNome() + "' cadastrada com sucesso!");
                        impressoraAtual.imprimirInformacoes();

                        System.out.print("\nDigite a quantidade inicial para adicionar ao estoque da impressora: ");
                        int qtdAddImpressora = sc.nextInt();
                        sc.nextLine();
                        impressoraAtual.adicionarQuantidade(qtdAddImpressora);
                        impressoraAtual.imprimirInformacoes();

                        System.out.print("\nDigite a quantidade para remover do estoque da impressora: ");
                        int qtdRemImpressora = sc.nextInt();
                        sc.nextLine();
                        impressoraAtual.removerQuantidade(qtdRemImpressora);
                        impressoraAtual.imprimirInformacoes();

                        System.out.print("\nDigite o novo nome para a impressora: ");
                        String novoNomeImpressora = sc.nextLine();
                        impressoraAtual.setNome(novoNomeImpressora);
                        System.out.println("Nome da impressora alterado com sucesso!");
                        impressoraAtual.imprimirInformacoes();
                        break;

                    case 3:
                        System.out.println("\n--- Cadastro de Placa de Vídeo ---");
                        System.out.print("Nome da Placa de Vídeo: ");
                        String nomePlaca = sc.nextLine();
                        System.out.print("Marca: ");
                        String marcaPlaca = sc.nextLine();
                        System.out.print("Memória VRAM (GB): ");
                        int vramPlaca = sc.nextInt();
                        sc.nextLine();

                        placaVideoAtual = new PlacasVideos(nomePlaca, marcaPlaca, vramPlaca);
                        System.out.println("Placa de Vídeo '" + placaVideoAtual.getNome() + "' cadastrada com sucesso!");
                        placaVideoAtual.imprimirInformacoes();

                        System.out.print("\nDigite a quantidade inicial para adicionar ao estoque da placa de vídeo: ");
                        int qtdAddPlaca = sc.nextInt();
                        sc.nextLine();
                        placaVideoAtual.adicionarQuantidade(qtdAddPlaca);
                        placaVideoAtual.imprimirInformacoes();

                        System.out.print("\nDigite a quantidade para remover do estoque da placa de vídeo: ");
                        int qtdRemPlaca = sc.nextInt();
                        sc.nextLine();
                        placaVideoAtual.removerQuantidade(qtdRemPlaca);
                        placaVideoAtual.imprimirInformacoes();

                        System.out.print("\nDigite o novo nome para a placa de vídeo: ");
                        String novoNomePlaca = sc.nextLine();
                        placaVideoAtual.setNome(novoNomePlaca);
                        System.out.println("Nome da placa de vídeo alterado com sucesso!");
                        placaVideoAtual.imprimirInformacoes();
                        break;

                    case 4:
                        System.out.println("\n--- Informações de Todos os Produtos Cadastrados ---");
                        boolean algumProdutoImpresso = false;

                        if (monitorAtual != null) {
                            monitorAtual.imprimirInformacoes();
                            algumProdutoImpresso = true;

                            if (impressoraAtual != null || placaVideoAtual != null || (impressoraAtual == null && placaVideoAtual == null)) {
                                pausar(sc);
                            }
                        }
                        if (impressoraAtual != null) {
                            impressoraAtual.imprimirInformacoes();
                            algumProdutoImpresso = true;

                            if (placaVideoAtual != null || (monitorAtual != null && placaVideoAtual == null) || (monitorAtual == null && placaVideoAtual == null)) {
                                pausar(sc);
                            }
                        }
                        if (placaVideoAtual != null) {
                            placaVideoAtual.imprimirInformacoes();
                            algumProdutoImpresso = true;
                            pausar(sc);
                        }

                        if (!algumProdutoImpresso) {
                            System.out.println("Nenhum produto cadastrado ainda.");
                        }
                        System.out.println("----------------------------------------------------");
                        break;

                    case 0:
                        System.out.println("Saindo do programa...");
                        break;

                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Erro: Entrada inválida. Por favor, insira um número para a opção do menu.");
                sc.nextLine();
                opcaoMenu = -1;
            } catch (Exception e) {
                System.out.println("Ocorreu um erro inesperado: " + e.getMessage());
                e.printStackTrace();
                opcaoMenu = -1;
            }

        } while (opcaoMenu != 0);

        sc.close();
        System.out.println("Programa finalizado.");
    }
}
