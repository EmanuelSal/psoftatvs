package models;
public class Produto {


    private String nome;
    private String descricao;
    private double preco;


    public Produto(String nome, String descricao, double preco) {
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
    }


    public String getNome() {
        return this.nome;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public double getPreco() {
        return this.preco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String toString() {
        return "Nome: " + this.nome + "\nDescricao: " + this.descricao + "\nPreco: " + this.preco;
    }

    public boolean equals(Produto produto) {
        return this.nome.equals(produto.getNome()) && this.descricao.equals(produto.getDescricao()) && this.preco == produto.getPreco();
    }

}
