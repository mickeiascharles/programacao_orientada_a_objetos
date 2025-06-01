package entities;

public class Impressoras {
    private String nome;
    private String marca;
    private String tipo; // Ex: "Jato de Tinta", "Laser"
    private boolean colorida;
    private int quantidadeEstoque;

    public Impressoras(String nome, String marca, String tipo, boolean colorida) {
        this.nome = nome;
        this.marca = marca;
        this.tipo = tipo;
        this.colorida = colorida;
        this.quantidadeEstoque = 0; // Inicializa com 0
    }

    public String getNome() {
        return nome;
    }

    public String getMarca() {
        return marca;
    }

    public String getTipo() {
        return tipo;
    }

    public boolean isColorida() {
        return colorida;
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
            System.out.println(quantidade + " unidade(s) da impressora '" + this.nome + "' adicionada(s) ao estoque.");
        } else {
            System.out.println("A quantidade a ser adicionada deve ser positiva.");
        }
    }

    public void removerQuantidade(int quantidade) {
        if (quantidade <= 0) {
            System.out.println("A quantidade a ser removida deve ser positiva.");
        } else if (this.quantidadeEstoque >= quantidade) {
            this.quantidadeEstoque -= quantidade;
            System.out.println(quantidade + " unidade(s) da impressora '" + this.nome + "' removida(s) do estoque.");
        } else {
            System.out.println("Não há quantidade suficiente em estoque para remover. Estoque atual: " + this.quantidadeEstoque);
        }
    }

    public void imprimirInformacoes() {
        System.out.println("\n--- Informações da Impressora ---");
        System.out.println("Nome: " + nome);
        System.out.println("Marca: " + marca);
        System.out.println("Tipo: " + tipo);
        System.out.println("Colorida: " + (colorida ? "Sim" : "Não"));
        System.out.println("Quantidade em Estoque: " + quantidadeEstoque);
        System.out.println("---------------------------------");
    }
}