public class Bog {
    String ISBN;
    String Titel;
    int År;


    public Bog(String ISBN, String Titel, int År) {
        this.ISBN = ISBN;
        this.Titel = Titel;
        this.År = År;
    }


    public String getISBN() {
        return ISBN;
    }

    public String getTitel() {
        return Titel;
    }

    public int getÅr() {
        return År;
    }


    @Override
    public String toString() {
        return "ISBN: " + ISBN + " " + "Titel: " + Titel + " " + "Udgivelsesår: " + År;
    }


    public boolean equalsISBN1(String ISBN1) {
        if (this.ISBN.equals(ISBN1)) {
            return true;
        }
        return false;
    }
}



