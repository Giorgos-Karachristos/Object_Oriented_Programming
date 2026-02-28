package oop_lab05_exercise1;

public class Tilefono {

    private String arithmos;
    private int kinito;
    private int stathero;

    public Tilefono() {
    }

    public Tilefono(String arithmos, int kinito, int stathero) {
        this.arithmos = arithmos;
        this.kinito = kinito;
        this.stathero = stathero;
    }

    public String getArithmos() {
        return arithmos;
    }

    public void setArithmos(String arithmos) {
        this.arithmos = arithmos;
    }

    public int getKinito() {
        return kinito;
    }

    public void setKinito(int kinito) {
        this.kinito = kinito;
    }

    public int getStathero() {
        return stathero;
    }

    public void setStathero(int stathero) {
        this.stathero = stathero;
    }

    public String TyposThlefonou() {
        return "";
    }

    public double klisiKinitou() {
        return 0;
    }

    public double klisiStatherou() {
        return 0;
    }

    @Override
    public String toString() {
        return "Number: " + arithmos + " is of type: " + TyposThlefonou()
                + ", with cost for calls to mobiles: " + klisiKinitou()
                + ", and cost for calls to landlines: " + klisiStatherou();
    }
}
