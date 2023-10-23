package OOP6;

import java.util.ArrayList;
import java.util.List;

public class Skola {
    private List<Ucenik> ucenici = new ArrayList<>();

    public void dodajUcenika(Ucenik ucenik) {
        ucenici.add(ucenik);
    }

    public double prosekZaGodinu(int godina) {
        if (ucenici.isEmpty()) {
            return 0.0;
        }

        int sumaProsek = 0;
        int brojUcenika = 0;

        for (Ucenik ucenik : ucenici) {
            if (ucenik.getGodinaSkolovanja() == godina) {
                sumaProsek += ucenik.izracunajProsek();
                brojUcenika++;
            }
        }

        if (brojUcenika > 0) {
            return (double) sumaProsek / brojUcenika;
        } else {
            return 0.0;
        }
    }

    public double prosekZaPredmet(String nazivPredmeta) {
        if (ucenici.isEmpty()) {
            return 0.0;
        }

        int sumaProsek = 0;
        int brojUcenika = 0;

        for (Ucenik ucenik : ucenici) {
            for (Predmet predmet : ucenik.predmeti) {
                if (predmet.getNazivPredmeta().equals(nazivPredmeta)) {
                    sumaProsek += ucenik.izracunajProsek();
                    brojUcenika++;
                    break;
                }
            }
        }

        if (brojUcenika > 0) {
            return (double) sumaProsek / brojUcenika;
        } else {
            return 0.0;
        }
    }

    public Ucenik najmanjiProsek() {
        if (ucenici.isEmpty()) {
            return null;
        }

        Ucenik ucenikSaNajmanjimProsekom = ucenici.get(0);
        double najmanjiProsek = ucenikSaNajmanjimProsekom.izracunajProsek();

        for (Ucenik ucenik : ucenici) {
            double trenutniProsek = ucenik.izracunajProsek();
            if (trenutniProsek < najmanjiProsek) {
                najmanjiProsek = trenutniProsek;
                ucenikSaNajmanjimProsekom = ucenik;
            }
        }

        return ucenikSaNajmanjimProsekom;
    }
}

