package OOP7;

import java.util.ArrayList;

public class Korpa {
    // Zadatak:
    //  Napisati klasu Korpa koja ima atribute:
    //  - ArrayList<Namirnice>
    //  - double cenaKorpe



    private ArrayList<Namirnica> namirnice;
    private double cenaKorpe;



    // Zadatak:
    // Napisati podrazumevani konstruktor koji postavlja ArrayListu na novu ArrayListu i cenaKorpe na 0.

    // podrazumevani konstruktor nema parametre
    public Korpa() {
        this.namirnice = new ArrayList<>();
        this.cenaKorpe = 0;
    }



    // Zadatak: Napisati sve gettere i settere!!!



    public ArrayList<Namirnica> getNamirnice() {
        return namirnice;
    }

    public void setNamirnice(ArrayList<Namirnica> namirnice) {
        this.namirnice = namirnice;
    }

    public double getCenaKorpe() {
        return cenaKorpe;
    }

    public void setCenaKorpe(double cenaKorpe) {
        this.cenaKorpe = cenaKorpe;
    }



    // Zadatak

    // 1. i 2. METODA

    // dodajUkorpu(Namirnica n) - koja dodaje u korpu neku namirnicu n i dodaje na cenuKorpe odgovarajucu cenu namirnice
    // nema povratnu vrednost -> void

    public void dodajUkorpu(Namirnica n){
        namirnice.add(n);
        cenaKorpe = cenaKorpe + n.getCena();
    }

    // dodajUkorpu(Namirnica n, int k)
    // - koja dodaje u korpu neku namirnicu n k puta i dodaje na cenuKorpe odgovarajucu cenu svih tih namirnica.

    public void dodajUKorpu(Namirnica namirnica, int kolicina){

        for (int i = 0; i < kolicina; i++) { // k puta dodaje namernicu koju je uneo korisnik
            namirnice.add(namirnica);
        }
        cenaKorpe = cenaKorpe + ( namirnica.getCena() * kolicina );
    }


    // 3. i 4. METODA

    //3. ukloniIzKorpe(Namirnica n) - koja prima referencu na neku Namirnicu uklanja iz korpe jednu
    //                                kopiju takve namirnice. Oduzeti od ceneKorpe cenu tog artikla. Ukoliko nema tog
    //                                artikla u korpi, uraditi nista.

    public void ukloniIzKorpe(Namirnica n){

        for (int i = 0; i < namirnice.size(); i++) {

            if (namirnice.get(i).getIme().equals(n.getIme()) && namirnice.get(i).getCena() == n.getCena()){

                cenaKorpe = cenaKorpe - n.getCena();
                namirnice.remove(i);
                break;
            }
        }
    }

    //4. ukloniIzKorpe(Namirnica n, int k)
    //   - koja radi kao metoda 3, s time sto brise k kopija takve namirnice. Ukoliko u korpi ima manje od k broja

    public void ukloniIzKorpe(Namirnica n, int k){

        while (k-- > 0){
            ukloniIzKorpe(n);
        }
    }

    // 5. METODA

    // 5. ukloniIzKorpeSveNamirniceN(Namirnica n)
    // - radi kao 3. metoda, s time sto uklanja sve kopije takve namirnice.

    public void ukloniIzKorpeSveNamirniceN(Namirnica n){

        int counter = 0;

        while (namirnice.contains(n)){
            ukloniIzKorpe(n);
        }
    }

    // 6. METODA

    //6. isprazniKorpu - koja prazni korpu i postavlja cenuKorpe na odgovarajucu vrednos.

    public void isprazniKorpu(){
        namirnice.clear();
        cenaKorpe = 0;
    }

    // 7. METODA

    // 7. cenaKrope - koja vraca ukupnu cenu korpe
    public double cenaKrope(){
        return cenaKorpe;
    }



    // Zadatak :

    // Overridovati toString() metod na sledeci nacin:

    // "<imeNamirnice1> | <brojKopijaNamirnice1> | <cenaSvihNamirnica1>
    // ...
    // <imeNamirniceN> | <brojKopijaNamirniceN> | <cenaSvihNamirnicaN>
    // Cena korpe je: <cenaKopre>"

    // Generisemo automatski i koristimo StringBuilder

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (Namirnica namirnica: namirnice){
            sb.append(namirnica.toString()).append("\n");
        }

        sb.append("Cena korpe je: ").append(cenaKorpe);
        return sb.toString();
    }
}


