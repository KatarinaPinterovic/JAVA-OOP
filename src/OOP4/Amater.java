package OOP4;

import java.util.ArrayList;

public class Amater extends Planinar{
    /*
   Amater moze da se popne na planine od 0 do 1000m visine
    */
    public Amater(String imePlaninara) {
        super(imePlaninara, new ArrayList<>(), 1000);
    }
}
