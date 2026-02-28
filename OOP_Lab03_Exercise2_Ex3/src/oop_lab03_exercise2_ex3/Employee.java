package oop_lab03_exercise2_ex3;

public class Employee {

    private String onoma;
    private String eponimo;
    private long afm;
    private double misthos;

    public Employee() {
    }

    public Employee(String onoma, String eponimo, long afm, double misthos) {
        this.onoma = onoma;
        this.eponimo = eponimo;
        this.afm = afm;
        this.misthos = misthos;
    }

    public String getOnoma() {
        return onoma;
    }

    public void setOnoma(String onoma) {
        this.onoma = onoma;
    }

    public String getEponimo() {
        return eponimo;
    }

    public void setEponimo(String eponimo) {
        this.eponimo = eponimo;
    }

    public long getAfm() {
        return afm;
    }

    public void setAfm(long afm) {
        this.afm = afm;
    }

    public double getMisthos() {
        return misthos;
    }

    public void setMisthos(double misthos) {
        this.misthos = misthos;
    }

    @Override
    public String toString() {
        return "First Name: " + onoma + ", Last Name: " + eponimo + ", AFM: " + afm + ", Salary: " + misthos;
    }
}
