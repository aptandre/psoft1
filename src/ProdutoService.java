import java.util.ArrayList;

public class ProdutoService implements ProdutoInterface {

    private ProdutosRepository repository;

    public ProdutoService() {
        this.repository = new ProdutosRepository();
    }


    @Override
    public void createProduct(Produto produto) {
        if (produto != null) {
            this.repository.createProduto(produto);
        } else {
            System.out.println("Produto nulo");
        }
    }

    @Override
    public ArrayList<Produto> ListarProduto() {
        return this.repository.getProdutos();
    }
}
