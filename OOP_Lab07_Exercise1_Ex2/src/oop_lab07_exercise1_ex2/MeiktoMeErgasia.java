package oop_lab07_exercise1_ex2;

public class MeiktoMeErgasia extends Course {

    private double vathmosErgastiriou;
    private double vathmosErgasias;

    public MeiktoMeErgasia() {
    }

    public MeiktoMeErgasia(String onomaMathimatos, double vathmosExetasis, double vathmosErgastiriou, double vathmosErgasias) {
        super(onomaMathimatos, vathmosExetasis);
        this.vathmosErgastiriou = vathmosErgastiriou;
        this.vathmosErgasias = vathmosErgasias;
    }

    public double getVathmosErgastiriou() {
        return vathmosErgastiriou;
    }

    public void setVathmosErgastiriou(double vathmosErgastiriou) {
        this.vathmosErgastiriou = vathmosErgastiriou;
    }

    public double getVathmosErgasias() {
        return vathmosErgasias;
    }

    public void setVathmosErgasias(double vathmosErgasias) {
        this.vathmosErgasias = vathmosErgasias;
    }

    @Override
    public double TelikosVathmos() {
        return 0.4 * getVathmosExetasis() + 0.4 * vathmosErgastiriou + 0.2 * vathmosErgasias;
    }

    @Override
    public String toString() {
        return super.toString() + ", Lab grade: " + vathmosErgastiriou + ", Project grade: " + vathmosErgasias + ", Final grade: " + TelikosVathmos();
    }
}
