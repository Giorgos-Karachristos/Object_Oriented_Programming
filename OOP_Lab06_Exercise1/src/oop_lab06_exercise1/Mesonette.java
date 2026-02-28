package oop_lab06_exercise1;

public class Mesonette extends Katoikia {

    private double TimiM;

    public Mesonette() {
    }

    public Mesonette(int kodikos, int pliuos, double metra, String dieyuinsi, double TimiM) {
        super(kodikos, pliuos, metra, dieyuinsi);
        this.TimiM = TimiM;
    }

    public double getTimiM() {
        return TimiM;
    }

    public void setTimiM(double TimiM) {
        this.TimiM = TimiM;
    }

    @Override
    public String TyposSynalagis() {
        return super.TyposSynalagis();
    }

    @Override
    public double Poso() {
        switch (TyposSynalagis()) {
            case "Sale":
                return TimiM + 1200;
            case "Rent":
                return 2 * TimiM + TimiM / 2;
            default:
                return 0;
        }
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nPrice of maisonette: " + TimiM;
    }
}
