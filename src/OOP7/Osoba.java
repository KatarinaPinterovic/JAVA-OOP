package OOP7;

public class Osoba {


    private String ime;
    private String prezime;
    private int godina;



    public Osoba(String ime, String prezime,int godina) {
        this.ime = ime;
        this.prezime = prezime;
        this.godina = godina;
    }



    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public int getGodina() {
        return godina;
    }

    public void setGodina(int godina) {
        this.godina = godina;
    }



    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("Ime: ").append(ime).append("\n").append("Prezime: ").append(prezime).append("\n").append("Ima godina: ").append(godina);
        return sb.toString();
    }
}


