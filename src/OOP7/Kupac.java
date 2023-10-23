package OOP7;

import java.util.ArrayList;

public class Kupac extends Osoba {
    //    Zadatak:
//
//    Napisati klasu Kupac koji prosiruje klasu Osoba i ima atribute:
//    - Korpa korpa
//    - ArrayList<Namirnice> kupljeneNamirnice
//    - double novac



    private Korpa korpa;
    private ArrayList<Namirnica> kupljeneNamirnice;
    private double novac;


    //Zadatak:
    //
    //Napisati konstruktor koji prima double n i postavlja novac na n,
    //i kreira novu praznu korpu, i novu praznu ArrayListu kupljenih namirnica.
    //Ukoliko je n nepozitivan broj, postaviti ga na 100.


    public Kupac(String ime, String prezime,int godina, double n) {

        super(ime, prezime, godina);                         // nasledjuje od osobe !

        this.korpa = new Korpa();                    // i kreira novu praznu korpu
        this.kupljeneNamirnice = new ArrayList<>();  // i novu praznu ArrayListu kupljenih namirnica

        if (n < 0) this.novac = 100;                 // Ukoliko je n nepozitivan broj, postaviti ga na 100.
        else this.novac = n;
    }


    // Zadatak: Napisati sve gettere i settere!!!



    public Korpa getKorpa() {
        return korpa;
    }

    public void setKorpa(Korpa korpa) {
        this.korpa = korpa;
    }

    public ArrayList<Namirnica> getKupljeneNamirnice() {
        return kupljeneNamirnice;
    }

    public void setKupljeneNamirnice(ArrayList<Namirnica> kupljeneNamirnice) {
        this.kupljeneNamirnice = kupljeneNamirnice;
    }

    public double getNovac() {
        return novac;
    }

    public void setNovac(double novac) {
        this.novac = novac;
    }



    // Zadatak

    // Ovde pozivamo metode koje su definisane u klasi KORPA,
    // na taj nacin je copy-paste metode iz klase KORPA, u klasu Kupac !!!

    // 1. dodajUkorpu(Namirnica n)
    //    - koja dodaje u korpu neku namirnicu n i dodaje na cenuKorpe odgovarajucu cenu namirnice

    public void dodajUkorpu(Namirnica n){
        korpa.dodajUkorpu(n);
    }

    // 2. dodajUkorpu(Namirnica n, int k)
    //    - koja dodaje u korpu neku namirnicu n k puta i dodaje na cenuKorpe odgovarajucu cenu svih tih namirnica.

    public void dodajUkorpu(Namirnica n, int k){
        korpa.dodajUKorpu(n,k);
    }

    //3. ukloniIzKorpe(Namirnica n) - koja prima referencu na neku Namirnicu uklanja iz korpe jednu
    //                                kopiju takve namirnice. Oduzeti od ceneKorpe cenu tog artikla. Ukoliko nema tog
    //                                artikla u korpi, uraditi nista.

    public void ukloniIzKorpe(Namirnica n){
        korpa.ukloniIzKorpe(n);
    }

    // 4. ukloniIzKorpe(Namirnica n, int k)
    //    - koja radi kao metoda 3, s time sto brise k kopija takve namirnice. Ukoliko u korpi ima manje od k broja

    public void ukloniIzKorpe(Namirnica n, int k){
        korpa.ukloniIzKorpe(n,k);
    }

    // 5. ukloniIzKorpeSveNamirniceN(Namirnica n) - radi kao 3. metoda, s time sto uklanja sve kopije takve namirnice.

    public void ukloniIzKorpeSveNamirniceN(Namirnica n){
        korpa.ukloniIzKorpeSveNamirniceN(n);
    }

    // 6. isprazniKorpu - koja prazni korpu i postavlja cenuKorpe na odgovarajucu vrednos.

    public void isprazniKorpu(){
        korpa.isprazniKorpu();
    }

    // 7. cenaKrope - koja vraca ukupnu cenu korpe

    public double cenaKorpe(){
        return korpa.cenaKrope();
    }


    // 8. kupi - koja kupuje sve namirnice iz korpe. Tj.
    //           prvo proverava da li kupac ima dovoljno novca.

    //           Ukoliko nema ispisati poruku "Nemate dovoljno novca".

    //           Ukoliko ima dovoljno novca, isprazniti mu citavu korpu
    //           i dodati te namirnice u ArrayListu kupljenih namirnica i oduzeti od novca cenu korpe.

    public boolean kupi(){

        if (novac >= korpa.cenaKrope()){ // Ukoliko ima dovoljno novca !!!

            kupljeneNamirnice.addAll(korpa.getNamirnice()); // ako ima novca dodajemo sve namernice iz korpe u listu kupljeneNamirnice!
            return true;
        }
        return false;
    }



    // Zadatak :

    // Overridovati toString() metod na sledeci nacin:

    //"Kupac <ime> <prezime> <brGodina> ima u korpi:
    // <imeNamirnice1> | <brojKopijaNamirnice1> | <cenaSvihNamirnica1>
    // ...
    // <imeNamirniceN> | <brojKopijaNamirniceN> | <cenaSvihNamirnicaN>
    // Cena korpe je: <cenaKopre>
    // --------------------------
    // Od kupljenih namirnica ima:
    // <imeNamirnice1> | <brojKopijaNamirnice1>
    // ...
    // <imeNamirniceN> | <brojKopijaNamirniceN>
    // Ukupna cena kupljenih namimirnica je je: <cenaKupljenih namirnica>

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        //"Kupac <ime> <prezime> <brGodina> ima u korpi:
        sb.append("Kupac ").append(getIme()).append(" ").append(getPrezime()).append(" ").append(getGodina()).append(" ima u korpi: ").append("\n");

        sb.append(korpa.toString()).append("\n");
        sb.append("---------------------------------").append("\n");

        if (!kupi()) sb.append("Nemate dovoljno novca");
        else {



            // Od kupljenih namirnica ima:
            sb.append("Od kupljenih namirnica ima:").append("\n");

            double cenaNamernica = 0.0;

            for (Namirnica namernica: kupljeneNamirnice){

                sb.append(namernica.toString()).append("\n");
                cenaNamernica = cenaNamernica + namernica.getCena();
            }

            sb.append("Ukupna cena kupljenih namimirnica je je: ").append(cenaNamernica);
        }

        return sb.toString();
    }
}



