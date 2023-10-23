package OOP6;

public class Predmet {
    private String nazivPredmeta;
    private int ocena;

    public Predmet(String nazivPredmeta, int ocena) {
        this.nazivPredmeta = nazivPredmeta;
        this.ocena = ocena;
    }

    public int getOcena() {
        return ocena;
    }

    public String getNazivPredmeta() {
        return nazivPredmeta;
    }

    @Override
    public String toString() {
        return nazivPredmeta + " (" + ocena + ")";
    }
}

