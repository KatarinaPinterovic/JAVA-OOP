package OOP5;

import java.util.List;

abstract class Automobil {
    private List<Tocak> listaTockova;

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    private int godisteAutomobila;
    private String naziv;
    private double cenaAutomobila;

    public Automobil(List<Tocak> listaTockova, int godisteAutomobila, double cenaAutomobila) {
        this.listaTockova = listaTockova;
        this.godisteAutomobila = godisteAutomobila;
        this.cenaAutomobila = cenaAutomobila;
        this.naziv = "";
    }

    public Automobil(int godisteAutomobila, double cenaAutomobila) {
        this.godisteAutomobila = godisteAutomobila;
        this.cenaAutomobila = cenaAutomobila;
    }

    public String getNaziv() {
        return naziv;
    }

    public Automobil() {
    }

    public List<Tocak> getListaTockova() {
        return listaTockova;
    }

    public void setListaTockova(List<Tocak> listaTockova) {
        this.listaTockova = listaTockova;
    }

    public int getGodisteAutomobila() {
        return godisteAutomobila;
    }

    public void setGodisteAutomobila(int godisteAutomobila) {
        this.godisteAutomobila = godisteAutomobila;
    }

    public double getCenaAutomobila() {
        return cenaAutomobila;
    }

    public void setCenaAutomobila(double cenaAutomobila) {
        this.cenaAutomobila = cenaAutomobila;
    }


    public abstract boolean vratiOstecene();

    public abstract boolean vratiOstecene(Tocak t);

    public abstract void zameniTocak();

    public abstract int cenaTockova();

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(godisteAutomobila).append(" ").append("Cena automobila: ").append(cenaAutomobila);
        return sb.toString();
    }
}
