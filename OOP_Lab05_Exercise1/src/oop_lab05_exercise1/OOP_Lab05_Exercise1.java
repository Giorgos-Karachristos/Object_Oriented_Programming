package oop_lab05_exercise1;

public class OOP_Lab05_Exercise1 {

    /*Phone management system with call cost calculation for mobiles and landlines*/
    public static void main(String[] args) {
        Tilefono[] tilefona = new Tilefono[4];
        tilefona[0] = new StatheroTilefono("2310456972", 5, 15);
        tilefona[1] = new KinitoTilefono("6945872100", 13, 27);
        tilefona[2] = new StatheroTilefono("2310123456", 3, 20);
        tilefona[3] = new KinitoTilefono("6971234567", 15, 7);

        double sum = 0;
        for (Tilefono tilefono : tilefona) {
            sum += tilefono.klisiKinitou() + tilefono.klisiStatherou();
            System.out.println(tilefono);
        }
        System.out.println("Total cost: " + sum);
    }
}