package oop_lab06_exercise1;

public class ExohikiKatoikia extends Katoikia {

    private double TimiEx;

    public ExohikiKatoikia() {
    }

    public ExohikiKatoikia(int kodikos, int pliuos, double metra, String dieyuinsi, double TimiEx) {
        super(kodikos, pliuos, metra, dieyuinsi);
        this.TimiEx = TimiEx;
    }

    public double getTimiEx() {
        return TimiEx;
    }

    public void setTimiEx(double TimiEx) {
        this.TimiEx = TimiEx;
    }

    @Override
    public String TyposSynalagis() {
        return super.TyposSynalagis();
    }

    @Override
    public double Poso() {
        switch (TyposSynalagis()) {
            case "Sale":
                return TimiEx + 1200;
            case "Rent":
                return 2 * TimiEx + TimiEx / 2;
            default:
                return 0;
        }
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nPrice of detached house: " + TimiEx;
    }
}
