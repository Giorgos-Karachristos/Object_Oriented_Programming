package oop_lab07_exercise1_ex2;

public class Theoritiko extends Course {

    private double vathmosErgasias;

    public Theoritiko() {
    }

    public Theoritiko(String onomaMathimatos, double vathmosExetasis, double vathmosErgasias) {
        super(onomaMathimatos, vathmosExetasis);
        this.vathmosErgasias = vathmosErgasias;
    }

    public double getVathmosErgasias() {
        return vathmosErgasias;
    }

    public void setVathmosErgasias(double vathmosErgasias) {
        this.vathmosErgasias = vathmosErgasias;
    }

    @Override
    public double TelikosVathmos() {
        return 0.7 * getVathmosExetasis() + 0.3 * vathmosErgasias;
    }

    @Override
    public String toString() {
        return super.toString() + ", Project grade: " + vathmosErgasias + ", Final grade: " + TelikosVathmos();
    }
}
