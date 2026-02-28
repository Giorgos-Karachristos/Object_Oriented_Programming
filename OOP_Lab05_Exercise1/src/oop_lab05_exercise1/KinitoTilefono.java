package oop_lab05_exercise1;

public class KinitoTilefono extends Tilefono {

    public KinitoTilefono() {
    }

    public KinitoTilefono(String arithmos, int kinito, int stathero) {
        super(arithmos, kinito, stathero);
    }

    @Override
    public String TyposThlefonou() {
        return "mobile phone";
    }

    @Override
    public double klisiKinitou() {
        return getKinito() * 0.2;
    }

    @Override
    public double klisiStatherou() {
        return 0;
    }
}
