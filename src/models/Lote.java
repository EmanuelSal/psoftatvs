package models;
import java.sql.Date;

public class Lote {
    
    private int quantidade;
    private Produto produto;
    private Date dataDeValidade;


    public Lote(int quantidade, Produto produto, Date dataDeValidade) {
        this.quantidade = quantidade;
        this.produto = produto;
        this.dataDeValidade = dataDeValidade;
    }

    public int getQuantidade() {
        return this.quantidade;
    }

    public Produto getProduto() {
        return this.produto;
    }

    public Date getDataDeValidade() {
        return this.dataDeValidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public void setDataDeValidade(Date dataDeValidade) {
        this.dataDeValidade = dataDeValidade;
    }

    public String toString() {
        return "Quantidade: " + this.quantidade + "\nProduto: " + this.produto + "\nData de validade: " + this.dataDeValidade;
    }


    public boolean equals(Lote lote) {
        return this.quantidade == lote.getQuantidade() && this.produto.equals(lote.getProduto()) && this.dataDeValidade.equals(lote.getDataDeValidade());
    }


}
