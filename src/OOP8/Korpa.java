package OOP8;

import java.util.ArrayList;
import java.util.List;

public class Korpa {
    private List<String> namirnice;


    public Korpa() {
        namirnice = new ArrayList<>();
    }


    public void dodajNamirnicu(String namirnica) {
        namirnice.add(namirnica);
    }


    public boolean sadrziNamirnicu(String namirnica) {
        return namirnice.contains(namirnica);
    }


    public double cenaKorpe() {
        double cena = namirnice.size() * 70.0;
        return cena;
    }


    public void izlistaj() {
        for (String namirnica : namirnice) {
            System.out.println(namirnica);
        }
    }


    public List<String> getNamirnice() {
        return namirnice;
    }


    public void setNamirnice(List<String> namirnice) {
        this.namirnice = namirnice;
    }


    @Override
    public String toString() {
        return "Korpa sa " + namirnice.size() + " namirnica";
    }

}

