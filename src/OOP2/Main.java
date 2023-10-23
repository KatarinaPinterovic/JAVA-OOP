package OOP2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Artikl a = new Artikl("Majica", 200);
        Artikl a1 = new Artikl("Duks", 700);
        Artikl a2 = new Artikl("Nakit", 2000);
        Artikl a3 = new Artikl("Patike", 3000);

        ArrayList<Artikl> artikli = new ArrayList<>();
        artikli.add(a);
        artikli.add(a1);
        artikli.add(a2);
        artikli.add(a3);

        Prodavnica zara = new Prodavnica(artikli, "Zara");
        System.out.println(zara.zarada());
        ArrayList<Prodavnica> prodavnice = new ArrayList<>();
        prodavnice.add(zara);

        TrzniCentar tc = new TrzniCentar("Usce", prodavnice);
        tc.izlistaj();
        System.out.println(tc.ukupnaZarada());
        tc.masovniPopust();
        tc.izlistaj();




    }



}


