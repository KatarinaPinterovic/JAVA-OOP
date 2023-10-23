package OOP3;

import java.util.ArrayList;
import java.util.List;

public abstract class UgostiteljskiObjekat implements Ugostiljivo{

    /*
    * Napisati abstraktnu klasu UgostiteljskiObjekat koji implementira interfejs Ugostljivo i ima naredne atribute:
- String naziv
- List<Radnik> radnici

Napisati konstruktore:
- Jedan potpun konstruktor koji prima sve argumente
- Jedan konstruktor koji prima String naziv a radnike postavlja na novu praznu ArrayList-u
- Jedan konstruktor koji prima Listu radnika a naziv postavlja na prazan String

Enkapsulirati sve podatke i napisati gettere i settere za sva polja

Napisati metode:
- public String ispisiRadnike() //Za svakog radnika vrsi njegovu serilizaciju. Serilizaciju svakog radnika vrsiti u novom redu po principu:
"<Serilizacija 1. radnika>
 <Serilizacija 2. radnika>
 ....
 <Serilizacija N. radnika>"
- public double ukupnaPlata() //Vraca ukupnu platu svih svojih radnika

Napisati abstraktne metode:
- public abstract double bruto(); //Vraca bruto zaradu UgostiteljskogObjekta
- public abstract double neto(); //Vraca neto zaradu UgostiteljskogObjekta

Serilizovati klasu na sledeci nacin:
"<naziv> | brojZaposlenih: <brojZaposlenihRadnika>"
    *
    * */

    private String naziv;
    private List<Radnik> radnici;

    public UgostiteljskiObjekat(String naziv, List<Radnik> radnici) {
        this.naziv = naziv;
        this.radnici = radnici;
    }

    public UgostiteljskiObjekat(String naziv) {
        this.naziv = naziv;
        radnici = new ArrayList<>();
    }

    public UgostiteljskiObjekat(List<Radnik> radnici) {
        this.radnici = radnici;
        naziv = "";
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public List<Radnik> getRadnici() {
        return radnici;
    }

    public void setRadnici(List<Radnik> radnici) {
        this.radnici = radnici;
    }

    //metode:
    /*
    * - public String ispisiRadnike() //Za svakog radnika vrsi njegovu serilizaciju.
    * Serilizaciju svakog radnika vrsiti u novom redu po principu:
"<Serilizacija 1. radnika>
 <Serilizacija 2. radnika>
 ....
 <Serilizacija N. radnika>"
    * */

    public String ispisiRadnike() {
        StringBuilder sb = new StringBuilder();
        //I nacin
        /* (Radnik r : radnici) {
            sb.append(r.toString()).append("\n");
        }
        return sb.toString().substring(0, sb.toString().length() - 1);*/
        //II nacin
        for (int i = 0; i < radnici.size() - 1; i++) {
            sb.append(radnici.get(i).toString()).append("\n");
        }
        sb.append(radnici.get(radnici.size() - 1).toString());
        return sb.toString();
    }

    //- public double ukupnaPlata() //Vraca ukupnu platu svih svojih radnika
    public double ukupnaPlata() {
        double sum = 0;
        for (Radnik r : radnici)
            sum += r.getPlata();
        return sum;
    }


    //Serilizovati klasu na sledeci nacin:
    //"<naziv> | brojZaposlenih: <brojZaposlenihRadnika>"


    @Override
    public String toString() {
        return naziv + " | brojZaposlenih: " + radnici.size();
    }

    public abstract double bruto();

    public abstract double neto();

    @Override
    public void usluzi(Osoba o) {

    }

    @Override
    public void usluziSve(List<Osoba> osobe) {

    }

    @Override
    public void usluziSve(Osoba... osobe) {

    }
}


