package OOP3;

public class Radnik extends Osoba{


    /*
    * Napisati klasu Radnik koja prosiruje klasu Osoba i ima atribute:
- int id
- double plata

Zagarantovati da svaki Radnik ima svoj jedinstveni id broj!

Napisati za svaki nadkonstrukor jedan konstruktor koji prima double platu.
* Uzeti da je podrazumevana plata 0.0

Enkapsulirati sve podatke i napisati gettere i settere za sva polja

Ovveridovati metode:
- public boolean jednaki(Osoba o) // Vraca true ako je prosledjena osoba ista kao ovaj (this)
* radnik. Ovaj radnik je isti kao Osoba o ako je o instanca klase Radnik i ako imaju isti id.

Serilizovati klasu na sledeci nacin:
"<ime> <prezime> (<brojGodina>) [<id>]"
    * */

    private static int ID = 0;

    private int id;
    private double plata;

    public Radnik(String ime, String prezime, int brojGodina, double plata) {
        super(ime, prezime, brojGodina);
        id = ID;
        ID++;
        this.plata = plata;
    }

    public Radnik(double plata) {
        id = ID;
        ID++;
        this.plata = plata;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPlata() {
        return plata;
    }

    public void setPlata(double plata) {
        this.plata = plata;
    }


    @Override
    public boolean jednaki(Osoba o) {
        if (! (o instanceof Radnik)) return false;
        Radnik r = (Radnik) o;
        return this.id == r.id;
    }

    @Override
    public String toString() {
        return super.toString() + " [" + id + "]";
    }


}


