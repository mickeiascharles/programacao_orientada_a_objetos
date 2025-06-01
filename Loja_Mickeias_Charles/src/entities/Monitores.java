package entities;

public class Monitores {
    private String nome;
    private String marca;
    private double tamanhoTelaPolegadas;
    private String resolucao;
    private int quantidadeEstoque;

    public Monitores(String nome, String marca, double tamanhoTelaPolegadas, String resolucao) {
        this.nome = nome;
        this.marca = marca;
        this.tamanhoTelaPolegadas = tamanhoTelaPolegadas;
        this.resolucao = resolucao;
        this.quantidadeEstoque = 0;
    }

    public String getNome() {
        return nome;
    }

    public String getMarca() {
        return marca;
    }

    public double getTamanhoTelaPolegadas() {
        return tamanhoTelaPolegadas;
    }

    public String getResolucao() {
        return resolucao;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void adicionarQuantidade(int quantidade) {
        if (quantidade > 0) {
            this.quantidadeEstoque += quantidade;
            System.out.println(quantidade + " unidade(s) do monitor '" + this.nome + "' adicionada(s) ao estoque.");
        } else {
            System.out.println("A quantidade a ser adicionada deve ser positiva.");
        }
    }

    public void removerQuantidade(int quantidade) {
        if (quantidade <= 0) {
            System.out.println("A quantidade a ser removida deve ser positiva.");
        } else if (this.quantidadeEstoque >= quantidade) {
            this.quantidadeEstoque -= quantidade;
            System.out.println(quantidade + " unidade(s) do monitor '" + this.nome + "' removida(s) do estoque.");
        } else {
            System.out.println("Não há quantidade suficiente em estoque para remover. Estoque atual: " + this.quantidadeEstoque);
        }
    }

    public void imprimirInformacoes() {
        System.out.println("\n--- Informações do Monitor ---");
        System.out.println("Nome: " + nome);
        System.out.println("Marca: " + marca);
        System.out.println("Tamanho da Tela: " + tamanhoTelaPolegadas + " polegadas");
        System.out.println("Resolução: " + resolucao);
        System.out.println("Quantidade em Estoque: " + quantidadeEstoque);
        System.out.println("------------------------------");
    }
}