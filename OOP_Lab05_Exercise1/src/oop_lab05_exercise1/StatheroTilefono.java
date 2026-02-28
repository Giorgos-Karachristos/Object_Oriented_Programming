package oop_lab05_exercise1;

public class StatheroTilefono extends Tilefono {

    public StatheroTilefono() {
    }

    public StatheroTilefono(String arithmos, int kinito, int stathero) {
        super(arithmos, kinito, stathero);
    }

    @Override
    public String TyposThlefonou() {
        return "landline phone";
    }

    @Override
    public double klisiKinitou() {
        return 0;
    }

    @Override
    public double klisiStatherou() {
        return getStathero() * 0.1;
    }
}
