package oop_lab05_exercise2;

public class OOP_Lab05_Exercise2 {

    /*The program creates different types of coffee with various characteristics and displays all their details*/
    public static void main(String[] args) {
        Coffee coffee[] = new Coffee[5];

        Sugar whiteSugar = new Sugar(1);
        Sugar brownSugar = new Sugar(2);

        Cream xorisCream = new Cream(0);
        Cream afrogalaCream = new Cream(1);
        Cream fitikCream = new Cream(2);
        Cream galaCream = new Cream(3);

        coffee[0] = new Espresso("espresso", 1, 1, 1, 1.5, "hazelnut", 1, whiteSugar, galaCream);
        coffee[1] = new Capuccino("capuccino", 2, 2, 1, 3.5, "hazelnut", 1, 2, whiteSugar, afrogalaCream);
        coffee[2] = new Frappe("frappe", 2, 1, 2, 2.5, "hazelnut", 1, brownSugar, xorisCream);
        coffee[3] = new Filtrou("filtrou", 1, 3, 1, 2.2, "hazelnut", brownSugar, fitikCream);
        coffee[4] = new Ellinikos("ellinikos", 1, 1, 1, 1.5, brownSugar);

        for (Coffee kafes : coffee) {
            System.out.println(kafes + "\n");
        }
    }
}
