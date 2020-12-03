import java.util.ArrayList;
import java.util.List;

public class Bibliotek {
    private List<Bog> bøger;


    public Bibliotek() {
        bøger = new ArrayList<>();
    }

    public boolean tjekForBog(Bog bog) {
        for (Bog objekt : bøger) {
            if (bog.equalsISBN1(objekt.getISBN())){
                return true;
            }
        }
        return false;
    }

    public List<Bog> getBøger() {
        return bøger;
    }

    public void setBøger(List<Bog> bøger) {
        this.bøger = bøger;
    }
}
