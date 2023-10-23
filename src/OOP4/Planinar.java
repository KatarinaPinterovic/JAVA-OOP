package OOP4;

import java.util.ArrayList;
import java.util.List;

public class Planinar {
    /*
   Kreirati apstraktnu klasu Planinar koja ima atribute za ime planinara,
    listu planina i maksimalnu visinu na koju planinar moze da se popne. Ova klasa takodje ima metode:
-popniSe(Planina p) - Ukoliko planina nije previse visoka za planinara i nije u njegovoj listi, dodati je.
-crnaLista() - Vraca listu planina iz planinarovog spiska, na koje on ne moze da se popne.
-ukupnoMetara() - Vraca ukupnu visinu svih planina na koje se planinar popeo.
    */
    private String imePlaninara;
    private List<Planina> planine;
    private double maksVisina;

    public Planinar(String imePlaninara, List<Planina> planine, double maksVisina) {
        this.imePlaninara = imePlaninara;
        this.planine = planine;
        this.maksVisina = maksVisina;
    }

    public String getImePlaninara() {
        return imePlaninara;
    }

    public void setImePlaninara(String imePlaninara) {
        this.imePlaninara = imePlaninara;
    }

    public List<Planina> getPlanine() {
        return planine;
    }

    public void setPlanine(List<Planina> planine) {
        this.planine = planine;
    }

    public double getMaksVisina() {
        return maksVisina;
    }

    public void setMaksVisina(double maksVisina) {
        this.maksVisina = maksVisina;
    }
    public void popniSe(Planina planina) {
        if (planina.getVisina() <= maksVisina && !planine.contains(planina)) {
            planine.add(planina);
        }

    }
    public List<Planina> crnaLista() {
        List<Planina> crnaLista = new ArrayList<>();
        for (Planina planina : planine) {
            if (planina.getVisina() > maksVisina) {
                crnaLista.add(planina);
            }
        }
        return crnaLista;
    }

    public int ukupnoMetara() {
        int ukupnaVisina = 0;
        for (Planina planina : planine) {
            ukupnaVisina += planina.getVisina();
        }
        return ukupnaVisina;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Ime planinara je: ").append(imePlaninara).append("\n");
        sb.append("Maksimalna visina: ").append(maksVisina).append("\n");
        sb.append("Lista planina: ").append(planine).append("\n");
        return sb.toString();
    }
}


