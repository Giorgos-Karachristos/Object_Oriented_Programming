package oop_lab06_exercise1;

public class Diamerisma extends Katoikia {

    private double TimiD;

    public Diamerisma() {
    }

    public Diamerisma(int kodikos, int pliuos, double metra, String dieyuinsi, double TimiD) {
        super(kodikos, pliuos, metra, dieyuinsi);
        this.TimiD = TimiD;
    }

    public double getTimiD() {
        return TimiD;
    }

    public void setTimiD(double TimiD) {
        this.TimiD = TimiD;
    }

    @Override
    public String TyposSynalagis() {
        return super.TyposSynalagis();
    }

    @Override
    public double Poso() {
        switch (TyposSynalagis()) {
            case "Sale":
                return TimiD + 1200;
            case "Rent":
                return 2 * TimiD + TimiD / 2;
            default:
                return 0;
        }
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nPrice of apartment: " + TimiD;
    }
}
