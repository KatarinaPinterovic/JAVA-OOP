package OOP6;

import java.util.ArrayList;
import java.util.List;

public class Ucenik {
    public String imeIPrezime;
    private int godinaSkolovanja;
    public List<Predmet> predmeti = new ArrayList<>();

    public Ucenik(String imeIPrezime, int godinaSkolovanja) {
        this.imeIPrezime = imeIPrezime;
        this.godinaSkolovanja = godinaSkolovanja;
    }

    public void dodajPredmet(Predmet predmet) {
        predmeti.add(predmet);
    }

    public double izracunajProsek() {
        if (predmeti.isEmpty()) {
            return 0.0;
        }

        int sumaOcena = 0;
        int brojPredmeta = predmeti.size();

        for (Predmet predmet : predmeti) {
            sumaOcena += predmet.getOcena();
        }

        return (double) sumaOcena / brojPredmeta;
    }

    public int getGodinaSkolovanja() {
        return godinaSkolovanja;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Ime i prezime: ").append(imeIPrezime).append("\n");
        sb.append("Godina školovanja: ").append(godinaSkolovanja).append("\n");
        sb.append("Predmeti:\n");
        for (Predmet predmet : predmeti) {
            sb.append("- ").append(predmet).append("\n");
        }
        return sb.toString();
    }
}


