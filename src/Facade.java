import java.util.ArrayList;
import java.util.Date;

public class Facade {

    private ProdutoService produtoService;
    private LoteService loteService;

    public Facade() {
        this.produtoService = new ProdutoService();
        this.loteService = new LoteService();
    }

    public void criarProduto(String nome, String fabricante, double preco) {
        this.produtoService.createProduct(nome, fabricante, preco);
    }

    public ArrayList<String> listarProdutos() {
        return this.produtoService.listarProduto();
    }

    public void criarLote(String nome, String fabricante, double preco, int quantidade, Date dataValidade) {
        this.loteService.createLote(nome, fabricante, preco, quantidade, dataValidade);
    }

    public ArrayList<String> listarLotes() {
        return this.loteService.listarLotes();
    }
}
