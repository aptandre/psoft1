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
        Produto novoProduto = new Produto(nome, fabricante, preco);
        this.produtoService.createProduct(novoProduto);
    }

    public ArrayList<Produto> listarProdutos() {
        return this.produtoService.ListarProduto();
    }

    public void criarLote(String nome, String fabricante, double preco, int quantidade, Date dataValidade) {
        Produto produto = new Produto(nome, fabricante, preco);
        Lote novoLote = new Lote(produto, quantidade, dataValidade);
        this.loteService.createLote(novoLote);
    }

    public ArrayList<String> listarLotes() {
        return this.loteService.listarLotes();
    }
}
