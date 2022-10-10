import java.util.ArrayList;
import java.util.Date;

public class LoteService {

    private LoteRepository repository;

    public LoteService() {
        this.repository = new LoteRepository();
    }

    public void createLote(String nome, String fabricante, double preco, int quantidade, Date dataValidade) {
        Produto produtoLote = new Produto(nome, fabricante, preco);
        Lote lote = new Lote(produtoLote, quantidade, dataValidade);
        if (lote != null) {
            this.repository.createLote(lote);
        }
    }

    public ArrayList<String> listarLotes() {
        return this.repository.listarLotes();
    }
}
