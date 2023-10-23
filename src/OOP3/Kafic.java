package OOP3;

import java.util.List;

public class Kafic extends UgostiteljskiObjekat{

    /*
    * Napisati klasu Kafic koja nasledjuje klasu UgostiteljskiObjekat i ima sledece atribute:
- double zarada; //Ukupna zarada kafica

Za svaki nadkonstruktor napisati jedan konstruktor koji postavlja ukupnu zaradu na 0.0

Enkapsulirati sve podatke i napisati gettere i settere za sva polja

Implementovati sve metode na sledeci nacin:
- public void ugosti(Osoba o)
* //Prodaje kafu osobi.
* Cena kafe iznosi 20 * <k>,
*  gde je k zbir duzine karaktera u imenu i prezimenu osobe kojoj se prodaje kafa
- public void ugostiSve(List<Osoba> o) //
* Prodaje kafu svim osobama iz liste na isti nacin kao gore definisan
- public void ugostiSve(Osoba ... o) //
* Prodaje kafu svim prosledjenim osoba na isti nacin kao gore definisan.
- public double bruto() // Vraca bruto zaradu Kafica.
* Bruto zarada se racuna kao zbir svih kafa prodatih do tog momenta.
- public double neto() // Vraca neto zaradu Kafica.
* Neto zarada se racuna kada se od bruto zarade oduzme porez od 1_000.

Serilizovati klasu na sledeci nacin:
"Kafic: <naziv>
 Do sada prodato: <brojKafaProdatih>"
    * */
    private double zarada;
    private int brojKafaProdatih;

    public Kafic(String naziv, List<Radnik> radnici) {
        super(naziv, radnici);
    }

    public Kafic(String naziv) {
        super(naziv);
    }

    public Kafic(List<Radnik> radnici) {
        super(radnici);
    }

    public double getZarada() {
        return zarada;
    }

    public void setZarada(double zarada) {
        this.zarada = zarada;
    }

    @Override
    public double bruto() {
        return zarada;
    }

    @Override
    public double neto() {
        return bruto() - 1_000;
    }

    private double izracunajCena(Osoba o) {
        return 20 * (o.getIme().length() + o.getPrezime().length());
    }

    @Override
    public void usluzi(Osoba o) {
        zarada += izracunajCena(o);
        brojKafaProdatih++;
    }

    @Override
    public void usluziSve(List<Osoba> osobe) {
        for (Osoba o : osobe)
            zarada += izracunajCena(o);
        brojKafaProdatih += osobe.size();
    }

    @Override
    public void usluziSve(Osoba... osobe) {
        for (Osoba o : osobe)
            zarada += izracunajCena(o);
        brojKafaProdatih += osobe.length;
    }

    /*
    * Serilizovati klasu na sledeci nacin:
"Kafic: <naziv>
 Do sada prodato: <brojKafaProdatih>"
    * */

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Kafic: ").append(getNaziv()).append("\n");
        sb.append("Do sada prodato: ").append(brojKafaProdatih);

        return sb.toString();
    }
}

