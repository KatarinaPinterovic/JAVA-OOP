package OOP1;

import java.util.ArrayList;

public class Autor extends Osoba{


    private ArrayList<Knjiga> knjigeKojeJeNapisao;

    public Autor(String ime, String prezime, int brojGodina) {
        super(ime, prezime, brojGodina);
        this.knjigeKojeJeNapisao = new ArrayList<Knjiga>();
    }

    public Autor() {
        this.knjigeKojeJeNapisao = new ArrayList<>();
    }

    public ArrayList<Knjiga> getKnjigeKojeJeNapisao() {
        return knjigeKojeJeNapisao;
    }

    public int brojKnjigaKojeJeNapisao(){
        return knjigeKojeJeNapisao.size();
    }

    private String ispisKnjiga(){
        StringBuilder sb = new StringBuilder();

        for (Knjiga knjiga: knjigeKojeJeNapisao){
            sb.append("\"").append(knjiga.getNaziv()).append("\"").append(" ");
        }

        return sb.toString();
    }

    @Override
    public String toString() {
        return super.toString() +"\nKnjige: "+ ispisKnjiga();
    }
}


