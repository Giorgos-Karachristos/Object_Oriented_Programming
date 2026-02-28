package oop_lab07_exercise1_ex2;

public class Meikto extends Course {

    private double vathmosErgastiriou;

    public Meikto() {
    }

    public Meikto(String onomaMathimatos, double vathmosExetasis, double vathmosErgastiriou) {
        super(onomaMathimatos, vathmosExetasis);
        this.vathmosErgastiriou = vathmosErgastiriou;
    }

    public double getVathmosErgastiriou() {
        return vathmosErgastiriou;
    }

    public void setVathmosErgastiriou(double vathmosErgastiriou) {
        this.vathmosErgastiriou = vathmosErgastiriou;
    }

    @Override
    public double TelikosVathmos() {
        return 0.6 * getVathmosExetasis() + 0.4 * vathmosErgastiriou;
    }

    @Override
    public String toString() {
        return super.toString() + ", Lab grade: " + vathmosErgastiriou + ", Final grade: " + TelikosVathmos();
    }
}
