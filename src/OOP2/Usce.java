package OOP2;

import java.util.ArrayList;

public class Usce extends TrzniCentar{

    /*
    Klasa Usce daje masovni popust samo na najskuplji artikl, i to 50% popusta.
     */

    public Usce(String naziv, ArrayList<Prodavnica> prodavnice) {
        super(naziv, prodavnice);
    }

    public Usce() {
    }

    @Override
    public void masovniPopust() {
        Artikl a = najskuplji();
        for (Prodavnica p : getProdavnice()) {
            for (Artikl art : p.getArtikli()) {
                if (art.equals(a)) {
                    a.setCena(a.getCena() * 0.5);
                }
            }
        }
    }
}


