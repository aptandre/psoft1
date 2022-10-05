import java.util.ArrayList;

public class ProdutosRepository {

    private ArrayList<Produto> produtos;

    public ProdutosRepository() {
        this.produtos = new ArrayList<Produto>();
    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    public ArrayList<String> listarProdutos() {
        ArrayList<String> listaDeProdutos = new ArrayList<>();
        for (Produto produto: this.produtos
             ) {
            listaDeProdutos.add(produto.toString());
        }
        return listaDeProdutos;
    }

    public void createProduto(Produto produto) {
        if (produto != null) {
            this.produtos.add(produto);
        } else {
            System.out.println("Produto nulo!");
        }
    }
}
