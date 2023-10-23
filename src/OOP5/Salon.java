package OOP5;

import java.util.List;

public class Salon {
    private List<Automobil> listAutomobila;

    public Salon(List<Automobil> listAutomobila) {
        this.listAutomobila = listAutomobila;
    }

    public List<Automobil> getListAutomobila() {
        return listAutomobila;
    }

    public void setListAutomobila(List<Automobil> listAutomobila) {
        this.listAutomobila = listAutomobila;
    }

    public Salon() {
    }


    public Automobil vratiNajstariji() {
        int najnizeGodiste = 2023;
        Automobil a = null;
        for (Automobil auto : listAutomobila) {
            int godisteAutomobila = auto.getGodisteAutomobila();
            if (godisteAutomobila < najnizeGodiste) {
                najnizeGodiste = godisteAutomobila;
                a = auto;
            }
        }
        return a;
    }

    public Automobil vratiNajskuplji() {
        double najvecaCena = 0;
        Automobil najskupljiAutomobil = null;
        for (Automobil auto : listAutomobila) {
            double cenaAutomobila = auto.getCenaAutomobila();
            if (cenaAutomobila > najvecaCena) {
                najvecaCena = cenaAutomobila;
                najskupljiAutomobil = auto;

            }
        }
        return najskupljiAutomobil;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(Automobil auto : listAutomobila){
            sb.append(auto.toString()).append("\n");
        }
        return  sb.toString();
    }
}
