package OOP2;

import java.util.ArrayList;

public class Prodavnica {
    /*
    Napraviti klasu Prodavnica koja ima listu Artikla i naziv. Ova klasa takodje ima metodu:
-zarada() - koja vraca ukupnu zaradu od svih artikala
     */
    private ArrayList<Artikl> artikli;
    private String naziv;

    public Prodavnica(ArrayList<Artikl> artikli, String naziv) {
        this.artikli = artikli;
        this.naziv = naziv;
    }

    public Prodavnica() {
    }

    public ArrayList<Artikl> getArtikli() {
        return artikli;
    }

    public void setArtikli(ArrayList<Artikl> artikli) {
        this.artikli = artikli;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }
    public double zarada(){
        double suma = 0.0;
        for(Artikl a: artikli){
            suma += a.getCena();

        }
        return suma;
    }
}


