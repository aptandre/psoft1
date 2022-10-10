import java.util.ArrayList;

public class ProdutoService {

    private ProdutosRepository repository;

    public ProdutoService() {
        this.repository = new ProdutosRepository();
    }


    public void createProduct(String nome, String fabricante, double preco) {
        Produto novoProduto = new Produto(nome, fabricante, preco);
        if (novoProduto != null) {
            this.repository.createProduto(novoProduto);
        } else {
            System.out.println("Produto nulo");
        }
    }

    public ArrayList<String> listarProduto() {
        return this.repository.listarProdutos();
    }
}
