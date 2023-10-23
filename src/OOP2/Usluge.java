package OOP2;

public interface Usluge {

    /*
    Kreirati interfejs Usluge koja ima sledece metode:
-masovniPopust() - dodeljuje 20% popusta na sve artikle u svim prodavnicama
-nalaziSe(Artikl a) - vraca prodavnicu u kojoj se nalazi dati artikl
-eleminisi(Artikl a) - izbacuje dati artikl iz ponude
     */
    public void masovniPopust();
    public void eliminisi(Artikl a);
    public Prodavnica nalaziSe(Artikl a);
}


