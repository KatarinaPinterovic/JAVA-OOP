package OOP7;

public class Namirnica {


    private String ime;
    private double cena;



    // 1. Jedan koji prima sve argumente.
    //    Ukoliko primi null za ime, postaviti ga na prazan string.
    //    Ukoliko primi negativnu vrednost za cenu postaviti je na 0.

    public Namirnica (String ime, double cena) {

        // ako je ime null -> ime = "", obrnuto, ako nije null, ime = uneto ime u konstruktoru;

        if (ime == null) this.ime = "";
        else this.ime = ime;

        // ako je cena negativna -> cena < 0, cena se postavlja na 0, obrnuto cena je jednaka unetoj ceni

        if (cena < 0) this.cena = 0; // ako
        else this.cena = cena;
    }

    // 2. - Podrazumevani konstruktor koji ne prima ni jedan argument i postavlja atribute na "" i 0

    public Namirnica() { // ne prima ni jedan argument -> ();
        this.ime = "";
        this.cena = 0;
    }


    // Zadatak: Napisati sve gettere i settere!!!



    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }



    // Zadatak : Overridovati toString() metod na sledeci nacin:
    //           "<ime> | <cena>" -> ovako treba da ispisuje namernice

    // Generisemo automatski i koristimo StringBuilder

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(ime).append(" | ").append(cena); // * "<ime> | <cena>" -> ovako treba da ispisuje namernice

        return sb.toString();
    }
}


