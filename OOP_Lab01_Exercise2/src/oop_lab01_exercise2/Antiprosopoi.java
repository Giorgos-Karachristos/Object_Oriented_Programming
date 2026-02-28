package oop_lab01_exercise2;

public class Antiprosopoi {

    private int kodikos;
    private String onoma;
    private double poliseis;

    Antiprosopoi(int x, String y, double z) {
        kodikos = x;
        onoma = y;
        poliseis = z;
    }

    public static double[] Promhtheia(Antiprosopoi pinakas[]) {
        double telika_posa[] = new double[3];
        for (int i = 0; i < 3; i++) {
            if (pinakas[i].kodikos == 1) {
                telika_posa[i] = pinakas[i].poliseis * 3 / 100;
            } else if (pinakas[i].kodikos == 2) {
                telika_posa[i] = pinakas[i].poliseis * 2 / 100;
            } else {
                telika_posa[i] = (pinakas[i].poliseis * 6 / 100) + 2000;
            }
        }
        return telika_posa;
    }

    public static double sumPoliseon(Antiprosopoi antiprosopoi[]) {
        double sum = 0;
        for (Antiprosopoi ekprosvpoi : antiprosopoi) {
            sum += ekprosvpoi.poliseis;
        }
        return sum;
    }
}
