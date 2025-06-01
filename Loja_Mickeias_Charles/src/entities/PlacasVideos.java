package entities;

public class PlacasVideos {
    private String nome;
    private String marca;
    private int memoriaVRAM_GB;
    private int quantidadeEstoque;

    public PlacasVideos(String nome, String marca,int memoriaVRAM_GB) {
        this.nome = nome;
        this.marca = marca;
        this.memoriaVRAM_GB = memoriaVRAM_GB;
        this.quantidadeEstoque = 0;
    }

    public String getNome() {
        return nome;
    }

    public String getMarca() {
        return marca;
    }

    public int getMemoriaVRAM_GB() {
        return memoriaVRAM_GB;
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
            System.out.println(quantidade + " unidade(s) da placa de vídeo '" + this.nome + "' adicionada(s) ao estoque.");
        } else {
            System.out.println("A quantidade a ser adicionada deve ser positiva.");
        }
    }

    public void removerQuantidade(int quantidade) {
        if (quantidade <= 0) {
            System.out.println("A quantidade a ser removida deve ser positiva.");
        } else if (this.quantidadeEstoque >= quantidade) {
            this.quantidadeEstoque -= quantidade;
            System.out.println(quantidade + " unidade(s) da placa de vídeo '" + this.nome + "' removida(s) do estoque.");
        } else {
            System.out.println("Não há quantidade suficiente em estoque para remover. Estoque atual: " + this.quantidadeEstoque);
        }
    }

    public void imprimirInformacoes() {
        System.out.println("\n--- Informações da Placa de Vídeo ---");
        System.out.println("Nome: " + nome);
        System.out.println("Marca: " + marca);
        System.out.println("Memória VRAM: " + memoriaVRAM_GB + " GB");
        System.out.println("Quantidade em Estoque: " + quantidadeEstoque);
        System.out.println("-------------------------------------");
    }
}