package OOP4;

public class Planina {
    /*
    Napraviti klasu Planina koja ima vrednosti za naziv planine i njenu visinu.
     */
    private String nazivPlanine;
    private double visina;

    public Planina(String nazivPlanine, double visina) {
        this.nazivPlanine = nazivPlanine;
        this.visina = visina;
    }

    public String getNazivPlanine() {
        return nazivPlanine;
    }

    public void setNazivPlanine(String nazivPlanine) {
        this.nazivPlanine = nazivPlanine;
    }

    public double getVisina() {
        return visina;
    }

    public void setVisina(double visina) {
        this.visina = visina;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Naziv planine je: ").append(nazivPlanine).append(" i njena visina je: ").append(visina).append("\n");
        return sb.toString();
    }
}

