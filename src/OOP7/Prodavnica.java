package OOP7;

import java.util.ArrayList;

public class Prodavnica {


    // Zadatak:

    // Napisati klasu Prodavnica koja ima atribute
    // - String ime
    // - ArrayList<Namirnica> namirnice


    private String name;
    private ArrayList<Namirnica> namirnice;



    //    Napisati konstruktore:
    //    1. Jedan koji prima sve argumente i Arraylistu namirnica duboko kopira
    //    2. Jedan koji prima ime i postavlja Arraylistu na novu praznu ArrayListu.
    //    3. Jedan koji prima ime i niz Namirnica preko ...


    public Prodavnica(String name, ArrayList<Namirnica> namirnice) {
        this.name = name;

        for (Namirnica n: namirnice){
            this.namirnice.add(n);
        }
    }

    public Prodavnica(String name) {
        this.name = name;
        this.namirnice = new ArrayList<>();
    }

    /** GETERI I SETERI*/

    // Zadatak: Napisati sve gettere i settere!!!

    // Generisemo ih automatski precicom:
    // ALT + INSERT -> GETTER AND SETTER


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Namirnica> getNamernice() {
        return namirnice;
    }

    public void setNamirnice(ArrayList<Namirnica> namirnice) {
        this.namirnice = namirnice;
    }


    //  Zadatak:

    //  Napisati metode:
    //  1. dodajNamirnicu - koja dodaje namirnicu u listu namirnica
    //  2. ukoloniNamirnicu - koja uklanja namirnicu iz liste namirnica

    // 1. nema povratnu vredost metoda -> zato stavljamo VOID // add() -> dodajemo na listu
    public void dodajNamernicu(Namirnica namirnica){
        namirnice.add(namirnica);
    }

    // 2. nema povratnu vredost metoda
    public void ukloniNamirnicu(Namirnica namirnica){
        namirnice.remove(namirnica);
    }


    // Zadatak

//    Overridovati toString() metod na sledeci nacin:
//            Prodavnica <ime> ima sledece namirnice:" +
//            <imeNamirnice1> | <cenaNamirnice1> " +
//            ...
//            <imeNamirniceN> | <cenaNamirniceN>"

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("Prodavnica ").append(name).append(" ima sledece namirnice: ").append("\n");

        for (Namirnica namirnica: namirnice){
            sb.append(namirnica.toString()).append("\n");
        }

        return sb.toString();
    }
}


