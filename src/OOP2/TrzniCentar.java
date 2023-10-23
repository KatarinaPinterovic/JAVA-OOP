package OOP2;

import java.util.ArrayList;

public class TrzniCentar implements Usluge{

    /*
    Napraviti klasu TrzniCentar koja ima listu prodavnica i sledece metode:
-ukupnaZarada() - vraca ukupnu zaradu Trznog centra iz svih prodavnica
-najskuplji() - vraca najskuplji artikl u celoj prodavnici
     */
    private String naziv;
    private ArrayList<Prodavnica> prodavnice;

    public TrzniCentar(String naziv, ArrayList<Prodavnica> prodavnice) {
        this.naziv = naziv;
        this.prodavnice = prodavnice;
    }

    public TrzniCentar() {
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public ArrayList<Prodavnica> getProdavnice() {
        return prodavnice;
    }

    public void setProdavnice(ArrayList<Prodavnica> prodavnice) {
        this.prodavnice = prodavnice;
    }
    public double ukupnaZarada() {
        double suma = 0.0;
        for (Prodavnica p : prodavnice) {
            suma += p.zarada();
        }
        return suma;
    }
    public Artikl najskuplji(){
        Artikl a = new Artikl();
        for(Prodavnica p : prodavnice){
            for(Artikl art : p.getArtikli()){
                if(art.getCena() > a.getCena()){
                    a = art;
                }
            }
        }
        return a;
    }
    /*
    masovniPopust() - dodeljuje 20% popusta na sve artikle u svim prodavnicama
-nalaziSe(Artikl a) - vraca prodavnicu u kojoj se nalazi dati artikl
-eleminisi(Artikl a) - izbacuje dati artikl iz ponude
*/
    @Override
    public void masovniPopust(){
        for(Prodavnica p : prodavnice){
            for(Artikl a : p.getArtikli()){
                a.setCena(a.getCena()*0.8);
            }
        }

    }
    @Override
    public Prodavnica nalaziSe(Artikl a) {
        for (Prodavnica p : prodavnice) {
            for (Artikl art : p.getArtikli()) {
                if (art.equals(a)) {
                    return p;
                }
            }
        }
        return null;
    }
    @Override
    public void eliminisi(Artikl a){
        for(int i=0; i< prodavnice.size(); i++){
            for(int j=0; j<prodavnice.get(i).getArtikli().size(); j++){
                if(prodavnice.get(i).getArtikli().get(j).equals(a)){
                    prodavnice.get(i).getArtikli().remove(prodavnice.get(i).getArtikli().get(j));
                }
            }

        }
    }
    public void izlistaj(){
        for(Prodavnica p : prodavnice){
            for(Artikl a : p.getArtikli()){
                System.out.println(a);
            }
        }
    }

}



