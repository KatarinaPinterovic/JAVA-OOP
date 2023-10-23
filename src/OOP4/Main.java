package OOP4;

public class Main {
    public static void main(String[] args) {
        Planina planina1 = new Planina("Tara", 1000);
        Planina planina2 = new Planina("Rtanj", 2000);
        Planina planina3 = new Planina("Sar-planina", 3000);
        Planina andi = new Planina("Andi", 6000);
        Planina monteverest = new Planina("Monteverest", 8848);
        Planina karpati = new Planina("Beljanica", 2200);

        Amater amater = new Amater("Ivana");
        Rekreativac rekreativac = new Rekreativac("Ivan");
        Pro pro = new Pro("Marko");

        amater.popniSe(planina1);
        amater.popniSe(planina2);
        rekreativac.popniSe(planina2);
        pro.popniSe(planina2);
        pro.popniSe(planina3);

        // Dodajemo planine na crnu listu
        amater.popniSe(andi);
        rekreativac.popniSe(monteverest);
        pro.popniSe(karpati);

        System.out.println("Amater:\n" + amater);
        System.out.println("Rekreativac:\n" + rekreativac);
        System.out.println("Pro:\n" + pro);

        System.out.println("Crna lista Amatera:");
        for (Planina planina : amater.crnaLista()) {
            System.out.println(planina);
        }

        System.out.println("Crna lista Rekreativca:");
        for (Planina planina : rekreativac.crnaLista()) {
            System.out.println(planina);
        }

        System.out.println("Crna lista Pro-a:");
        for (Planina planina : pro.crnaLista()) {
            System.out.println(planina);
        }
    }
}

