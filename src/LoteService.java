import java.util.ArrayList;
import java.util.Date;

public class LoteService implements LoteInterface {

    private LoteRepository repository;

    public LoteService() {
        this.repository = new LoteRepository();
    }

    @Override
    public void createLote(Lote lote) {
        if (lote != null) {
            this.repository.createLote(lote);
        }
    }

    @Override
    public ArrayList<String> listarLotes() {
        return this.repository.listarLotes();
    }
}
