package oop_lab01_exercise1;

public class OOP_Lab01_Exercise1 {

    /*Rent subsidy selection system*/
    public static void main(String[] args) {
        EpidotisiEnikoiou epidotisi[] = new EpidotisiEnikoiou[4];
        epidotisi[0] = new EpidotisiEnikoiou("Kikos Kikou", 1, 5000, 0);
        epidotisi[1] = new EpidotisiEnikoiou("Nikos Nikas", 2, 4200, 2);
        epidotisi[2] = new EpidotisiEnikoiou("Paulos Paulou", 2, 4100, 1);
        epidotisi[3] = new EpidotisiEnikoiou("Vasilis Vasileiou", 2, 7000, 3);
        for (EpidotisiEnikoiou epidoma : epidotisi) {
            if (epidoma.Check()) {
                System.out.println(epidoma.getFullΝame() + " Selected");
            } else {
                System.out.println(epidoma.getFullΝame() + " Not Selected");
            }
        }
    }
}
