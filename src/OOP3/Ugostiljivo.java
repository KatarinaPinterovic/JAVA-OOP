package OOP3;

import java.util.List;

public interface Ugostiljivo {

    /*
    *
Napisati interfejs Ugostljivo koji ima naredne metode:
- void usluzi(Osoba o); // Usluzava osobu o
- void usluziSve(List<Osoba> osobe); //Usluzava citavu listu osoba
- void usluziSve(Osoba ... osobe); //Prima promenjiv broj osoba
    * */

    void usluzi(Osoba o);
    void usluziSve(List<Osoba> osobe);
    void usluziSve(Osoba ... osobe);
}


