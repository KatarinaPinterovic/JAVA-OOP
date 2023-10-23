package OOP1;

import java.util.ArrayList;

public class Knjizara {
    private ArrayList<Knjiga> knjigeKojeKojeSuNaStanju;
    private ArrayList<Osoba> zaposleni;
    private ArrayList<Autor> autoreKojeIzdaju;

    public Knjizara() {

        knjigeKojeKojeSuNaStanju = new ArrayList<>();
        zaposleni = new ArrayList<>();
        autoreKojeIzdaju = new ArrayList<>();
    }

    public ArrayList<Knjiga> getKnjigeKojeKojeSuNaStanju() {
        return knjigeKojeKojeSuNaStanju;
    }

    public void setKnjigeKojeKojeSuNaStanju(ArrayList<Knjiga> knjigeKojeKojeSuNaStanju) {
        this.knjigeKojeKojeSuNaStanju = knjigeKojeKojeSuNaStanju;
    }

    public ArrayList<Osoba> getZaposleni() {
        return zaposleni;
    }

    public void setZaposleni(ArrayList<Osoba> zaposleni) {
        this.zaposleni = zaposleni;
    }

    public ArrayList<Autor> getAutoreKojeIzdaju() {
        return autoreKojeIzdaju;
    }

    public void setAutoreKojeIzdaju(ArrayList<Autor> autoreKojeIzdaju) {
        this.autoreKojeIzdaju = autoreKojeIzdaju;
    }

    public double ukupnaCena(){

        double sum = 0.0;

        for (Knjiga k: knjigeKojeKojeSuNaStanju){
            sum += k.getCena();
        }

        return sum;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();

        sb.append("Knjizara Info:").append("\n").append("# Zaposleni: ").append("\n");

        for (int i = 0; i < zaposleni.size()-1; i++) {
            sb.append(zaposleni.get(i).getIme()).append(" ").append(zaposleni.get(i).getPrezime()).append(", ");
        }
        sb.append(zaposleni.get(zaposleni.size()-1).getIme()).append(" ").append(zaposleni.get(zaposleni.size()-1).getPrezime());

        sb.append("\n# Autori: ").append("\n");

        for (int i = 0; i < zaposleni.size(); i++) {

            String ime = autoreKojeIzdaju.get(i).getIme();
            String prezime = autoreKojeIzdaju.get(i).getPrezime();

            sb.append(ime).append(" ").append(prezime).append(": ");

            for (Knjiga k: knjigeKojeKojeSuNaStanju){
                if (k.getAutor().getIme().equals(ime) && k.getAutor().getPrezime().equals(prezime)){
                    sb.append("\"").append(k.getNaziv()).append("\"").append(" ");
                }
            }
            sb.append("\n");
        }

        return sb.toString();
    }
}


