package OOP6;

public class Main {
    public static void main(String[] args) {

        Biologija biologija1 = new Biologija(5);
        Matematika matematika1 = new Matematika(5);
        Srpski srpski1 = new Srpski(5);

        Biologija biologija2 = new Biologija(5);
        Matematika matematika2 = new Matematika(2);
        Srpski srpski2 = new Srpski(5);

        Biologija biologija3 = new Biologija(3);
        Matematika matematika3 = new Matematika(5);
        Srpski srpski3 = new Srpski(4);

        // Kreiramo učenike
        Ucenik ucenik1 = new Ucenik("Milica Markovic", 1);
        ucenik1.dodajPredmet(biologija1);
        ucenik1.dodajPredmet(matematika1);
        ucenik1.dodajPredmet(srpski1);

        Ucenik ucenik2 = new Ucenik("Ivan Ivanovic", 2);
        ucenik2.dodajPredmet(biologija2);
        ucenik2.dodajPredmet(matematika2);
        ucenik2.dodajPredmet(srpski2);

        Ucenik ucenik3 = new Ucenik("Petar Petrovic", 1);
        ucenik3.dodajPredmet(biologija3);
        ucenik3.dodajPredmet(matematika3);
        ucenik3.dodajPredmet(srpski3);

        // Kreiramo školu
        Skola skola = new Skola();
        skola.dodajUcenika(ucenik1);
        skola.dodajUcenika(ucenik2);
        skola.dodajUcenika(ucenik3);

        // Testiranje metoda
        System.out.println("Prosek za godinu 1: " + skola.prosekZaGodinu(1));
        System.out.println("Prosek za godinu 2: " + skola.prosekZaGodinu(2));
        System.out.println("Prosek za predmet Biologija: " + skola.prosekZaPredmet("Biologija"));
        System.out.println("Prosek za predmet Matematika: " + skola.prosekZaPredmet("Matematika"));
        System.out.println("Prosek za predmet Srpski: " + skola.prosekZaPredmet("Srpski"));

        Ucenik najmanjiProsek = skola.najmanjiProsek();
        System.out.println("Učenik sa najmanjim prosekom: " + najmanjiProsek.imeIPrezime);
    }
}



