package oop_lab11_exercise3;

public class Employee {

    private String onoma;
    private String eponimo;
    private int kodikos;
    private double misuos;

    public Employee() {
    }

    public Employee(String onoma, String eponimo, int kodikos, double misuos) {
        this.onoma = onoma;
        this.eponimo = eponimo;
        this.kodikos = kodikos;
        this.misuos = misuos;
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

    public int getKodikos() {
        return kodikos;
    }

    public void setKodikos(int kodikos) {
        this.kodikos = kodikos;
    }

    public double getMisuos() {
        return misuos;
    }

    public void setMisuos(double misuos) {
        this.misuos = misuos;
    }

    @Override
    public String toString() {
        return "First Name: " + onoma + ", Last Name: " + eponimo + ", Code: " + kodikos + ", Salary: " + misuos;
    }
}
