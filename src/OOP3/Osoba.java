package OOP3;

public class Osoba {


    /*
    * Napisati klasu Osoba koja ima atribute:
- String ime, prezime;
- int brojGodina;

Napisati jedan potpun konstruktor koji prima sve argumente i jedan prazan konstruktor koji postavlja ime i prezime na prazan String a brojGodina na 18

Enkapsulirati sve podatke i napisati gettere i settere za sva polja

Napisati metode:
- public boolean jednaki(Osoba o) // Vraca true ako je prosledjena osoba jednaka ovoj (this) osobi. Dve osobe su jednake ako su im svi atributi isti

Serilizovati klasu na sledeci nacin:
"<ime> <prezime> (<brojGodina>)"
    * */

    private String ime, prezime;
    private int brojGodina;

    public Osoba(String ime, String prezime, int brojGodina) {
        this.ime = ime;
        this.prezime = prezime;
        this.brojGodina = brojGodina;
    }

    public Osoba() {
        ime = "";
        prezime = "";
        brojGodina = 18;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public int getBrojGodina() {
        return brojGodina;
    }

    public void setBrojGodina(int brojGodina) {
        this.brojGodina = brojGodina;
    }

    public boolean jednaki(Osoba o) {
        if (this == o) return true;

        return this.ime.equals(o.getIme()) &&
                this.prezime.equals(o.getPrezime()) &&
                this.brojGodina == o.getBrojGodina();
    }

    @Override
    public String toString() {
        return ime + " " + prezime + "(" + brojGodina + ")";
    }
}


