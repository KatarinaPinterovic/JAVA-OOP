package OOP8;

public class Main {
    public static void main(String[] args) {
        Korpa korpa = new Korpa();
        korpa.dodajNamirnicu("Jogurt");
        korpa.dodajNamirnicu("Mleko");
        korpa.dodajNamirnicu("Sok");

        System.out.println("Da li korpa sadrži mleko? " + korpa.sadrziNamirnicu("Mleko"));
        System.out.println("Da li korpa sadrži jogurt? " + korpa.sadrziNamirnicu("Jogurt"));
        System.out.println("Da li korpa sadrži sok? " + korpa.sadrziNamirnicu("Sok"));
        System.out.println("Da li korpa sadrži voce? " + korpa.sadrziNamirnicu("Voce"));
        System.out.println();
        System.out.println("Ukupna cena korpe: " + korpa.cenaKorpe() + " dinara");
        System.out.println();
        korpa.izlistaj();
    }
}

