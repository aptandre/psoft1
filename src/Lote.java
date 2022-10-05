import java.util.Date;

public class Lote {

    private Produto produto;
    private int quantidade;
    private Date dataValidade;

    public Lote(Produto produto, int quantidade, Date dataValidade) {
        this.produto = produto;
        this.quantidade = quantidade;
        this.dataValidade = dataValidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public Date getDataValidade() {
        return dataValidade;
    }

    @Override
    public String toString() {
        return "Lote de produto: " + this.produto.toString() + " quantidade " + this.quantidade + " data de validade: " + this.dataValidade.toString();
    }
}
