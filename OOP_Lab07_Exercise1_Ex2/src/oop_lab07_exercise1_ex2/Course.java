package oop_lab07_exercise1_ex2;

public abstract class Course {

    private String onomaMathimatos;
    private double vathmosExetasis;

    public Course() {
    }

    public Course(String onomaMathimatos, double vathmosExetasis) {
        this.onomaMathimatos = onomaMathimatos;
        this.vathmosExetasis = vathmosExetasis;
    }

    public String getOnomaMathimatos() {
        return onomaMathimatos;
    }

    public void setOnomaMathimatos(String onomaMathimatos) {
        this.onomaMathimatos = onomaMathimatos;
    }

    public double getVathmosExetasis() {
        return vathmosExetasis;
    }

    public void setVathmosExetasis(double vathmosExetasis) {
        this.vathmosExetasis = vathmosExetasis;
    }

    public abstract double TelikosVathmos();

    @Override
    public String toString() {
        return "Course name: " + onomaMathimatos + ", Exam grade: " + vathmosExetasis;
    }
}
