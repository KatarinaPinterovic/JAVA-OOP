package OOP3;

import java.util.ArrayList;
import java.util.List;

public class Restoran extends UgostiteljskiObjekat{
    private final int brojStolova;
    private double cenaRucka;
    private double zarada;
    private List<Osoba> gosti;

    public Restoran(String naziv, List<Radnik> radnici, int brojStolova, double cenaRucka) {
        super(naziv, radnici);
        this.brojStolova = brojStolova;
        this.cenaRucka = cenaRucka;
        gosti = new ArrayList<>();
        // zarada = 0.0; // ovo java radi automatski
    }

    public Restoran(String naziv, int brojStolova, double cenaRucka) {
        super(naziv);
        this.brojStolova = brojStolova;
        this.cenaRucka = cenaRucka;
        gosti = new ArrayList<>();
    }

    public Restoran(List<Radnik> radnici, int brojStolova, double cenaRucka) {
        super(radnici);
        this.brojStolova = brojStolova;
        this.cenaRucka = cenaRucka;
        gosti = new ArrayList<>();
    }

    public int getBrojStolova() {
        return brojStolova;
    }

    public double getCenaRucka() {
        return cenaRucka;
    }

    public double getZarada() {
        return zarada;
    }

    public List<Osoba> getGosti() {
        return gosti;
    }

    public void setCenaRucka(double cenaRucka) {
        this.cenaRucka = cenaRucka;
    }

    public void setZarada(double zarada) {
        this.zarada = zarada;
    }

    public void setGosti(List<Osoba> gosti) {
        this.gosti = gosti;
    }

    @Override
    public double bruto() {
        return zarada;
    }

    @Override
    public double neto() {
        return bruto() - ukupnaPlata() - 1_000;
    }

    @Override
    public void usluzi(Osoba o) {
        if (brojStolova > gosti.size()) {
            gosti.add(o);
            zarada += cenaRucka;

        }
    }

    @Override
    public void usluziSve(List<Osoba> osobe) {
        if (brojStolova - gosti.size() >= osobe.size()) {
            gosti.addAll(osobe);
            zarada += cenaRucka * osobe.size();
        }
    }

    @Override
    public void usluziSve(Osoba... osobe) { //usluziOsobe(o1, o2); usluziOsobe(o1, o2, o3, o4);
        for (Osoba o : osobe) {//[]
            if (brojStolova == gosti.size())
                return;
            usluzi(o);
        }
    }


    public void odjaviOsobu(Osoba o) {
        for (int i = 0; i < gosti.size(); i++) {
            if (gosti.get(i).jednaki(o)) {
                gosti.remove(i);
                return;
            }
        }
    }

    /*
    * Serilizovati klasu na sledeci nacin:
"Restoran: <naziv>
 Meni: Rucak | <cenaRucka>"
    * */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Restoran: ").append(getNaziv()).append("\n");
        sb.append("Meni: Rucak | ").append(cenaRucka);

        return sb.toString();
    }

}


