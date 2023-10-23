package OOP5;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        Audi audi = new Audi(2009, 8000);
        BMW bmw = new BMW(2005, 6500);
        Mercedes mercedes = new Mercedes(2012, 13000);

        Tocak t1 = new Tocak(65, 110);
        Tocak t2 = new Tocak(60, 120);
        Tocak t3 = new Tocak(65, 110);
        Tocak t4 = new Tocak(60, 120);

        List<Tocak> listaTockova = new ArrayList<>(List.of(t1, t2, t3, t4));
        List<Automobil> listaAutomobila = new ArrayList<>(List.of(audi, bmw, mercedes));

        audi.setListaTockova(listaTockova);

        bmw.setListaTockova(listaTockova);

        mercedes.setListaTockova(listaTockova);


        Salon s = new Salon(listaAutomobila);
        System.out.println(s);

        System.out.println("Lista automobila u salonu:\n" + s);
        System.out.println("Najstariji automobil:\n" + s.vratiNajstariji());
        System.out.println("Najskuplji automobil:\n" + s.vratiNajskuplji());
        System.out.println("=======");

        for (Automobil automobil : listaAutomobila) {
            System.out.println("Cena tockova za automobil " + automobil + ": " + automobil.cenaTockova());
        }

        System.out.println("Zamenjeni tockovi:");
        for (Automobil automobil : listaAutomobila) {
            List<Tocak> tockovi = automobil.getListaTockova();
            List<Tocak> noviTockovi = new ArrayList<>();

            for (Tocak tocak : tockovi) {
                if (automobil.vratiOstecene(tocak)) {
                    Tocak noviTocak = new Tocak(0, automobil instanceof BMW ? 100.0 : automobil instanceof Mercedes ? 120.0 : 110.0);
                    noviTockovi.add(noviTocak);
                } else {
                    noviTockovi.add(tocak);
                }
            }

            automobil.setListaTockova(noviTockovi);

        }
    }
}


