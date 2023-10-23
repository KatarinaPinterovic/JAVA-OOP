package OOP5;

import java.util.List;

public class BMW extends Automobil{
    public BMW(List<Tocak> listaTockova, int godisteAutomobila, double cenaAutomobila) {
        super(listaTockova, godisteAutomobila, cenaAutomobila);

        super.setNaziv("BMW");

    }

    public BMW(int godisteAutomobila, double cenaAutomobila) {
        super(godisteAutomobila, cenaAutomobila);
        super.setNaziv("BMW");
    }

    public BMW() {
    }

    @Override
    public boolean vratiOstecene() {
        boolean daLiJeTocakOstecen = false;
        for(Tocak tocak : getListaTockova()){
            if(tocak.getTrajanjeTocka()>60){
                return true;
            }
        }
        return daLiJeTocakOstecen;
    }

    @Override
    public boolean vratiOstecene(Tocak t) {
        boolean daLiJeTocakOstecen = false;
        if (t.getTrajanjeTocka() > 100){
            return true;
        }
        return daLiJeTocakOstecen;
    }

    @Override
    public void zameniTocak() {
        for (Tocak tocak : getListaTockova()) {
            if (tocak.getTrajanjeTocka() > 100) {
                getListaTockova().remove(tocak);
                Tocak t = new Tocak(0, 110);
                getListaTockova().add(t);
            }
        }
    }

    @Override
    public int cenaTockova() {
        return 4 * 100;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(getNaziv()).append(" ").append(super.toString());
        return sb.toString();
    }
}

