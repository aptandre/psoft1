import java.util.ArrayList;
import java.util.Date;

public class LoteRepository {

    private ArrayList<Lote> lotes;

    public LoteRepository() {
        this.lotes = new ArrayList<Lote>();
    }

    public void createLote(Lote lote) {
        if (lote != null) {
            this.lotes.add(lote);
        }
        lotes.add(lote);
    }
    public ArrayList<Lote> getLotes() {
        return this.lotes;
    }

    public ArrayList<String> listarLotes() {
        ArrayList<String> newLotes = new ArrayList<>();
        for (Lote lote : this.lotes
             ) {
            newLotes.add(lote.toString());
        }
        return newLotes;
    }
}
