package OOP1;

public class Main {
    public static void main(String[] args) {

        Knjizara knjizara = new Knjizara();

        Osoba osoba = new Osoba("Marko","Markovic",32);
        knjizara.getZaposleni().add(osoba);

        Osoba osoba1 = new Osoba("Nikola","Nikolic",30);
        knjizara.getZaposleni().add(osoba1);

        Autor autor = new Autor("Orhan","Pamuk",50);
        Autor autor1 = new Autor("Karlos","Ruiz Safon",71);

        Knjiga knjiga = new Knjiga("Zovem se Crveno",360,900.00,autor);
        Knjiga knjiga1 = new Knjiga("Senka vetra",1390,1100.50,autor);
        Knjiga knjiga2 = new Knjiga("Goblinski napad",3000,8400.6,autor1);

        knjizara.getKnjigeKojeKojeSuNaStanju().add(knjiga);
        knjizara.getKnjigeKojeKojeSuNaStanju().add(knjiga1);
        knjizara.getKnjigeKojeKojeSuNaStanju().add(knjiga2);

        knjizara.getAutoreKojeIzdaju().add(autor);
        knjizara.getAutoreKojeIzdaju().add(autor1);

        for (Knjiga k: knjizara.getKnjigeKojeKojeSuNaStanju()){
            if(k.getAutor().getIme().equals(autor.getIme())){
                autor.getKnjigeKojeJeNapisao().add(k);
            }
        }


        for (Knjiga k: knjizara.getKnjigeKojeKojeSuNaStanju()){
            if(k.getAutor().getIme().equals(autor1.getIme())){
                autor1.getKnjigeKojeJeNapisao().add(k);
            }
        }

        System.out.println();
        System.out.println(knjiga);
        System.out.println();

        System.out.println(knjiga1);
        System.out.println();

        System.out.println(knjiga2);
        System.out.println();

        System.out.println(autor);
        System.out.println("Broj knjiga: "+ autor.brojKnjigaKojeJeNapisao());

        System.out.println();

        System.out.println(autor1);
        System.out.println("Broj knjiga: "+autor1.brojKnjigaKojeJeNapisao());

        System.out.println();
        System.out.println("Ukupna cena knjiga u knjizari: " + knjizara.ukupnaCena() +" rsd.");
        System.out.println();


        System.out.println(knjizara);
    }
}



