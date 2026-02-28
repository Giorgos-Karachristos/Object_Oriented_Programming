package oop_lab07_exercise1_ex2;

public class Ergastiriako extends Course {

    public Ergastiriako() {
    }

    public Ergastiriako(String onomaMathimatos, double vathmosExetasis) {
        super(onomaMathimatos, vathmosExetasis);
    }

    @Override
    public double TelikosVathmos() {
        return getVathmosExetasis();
    }

    @Override
    public String toString() {
        return super.toString() + ", Final grade: " + TelikosVathmos();
    }
}
