package oop_lab05_exercise2;

public class Filtrou extends Coffee {

    private String gefsi;
    private Sugar sugar;
    private Cream cream;

    public Filtrou() {
    }

    public Filtrou(String coffeeName, int typosCafe, int sweetness, int dosi, double price, String gefsi, Sugar sugar, Cream cream) {
        super(coffeeName, typosCafe, sweetness, dosi, price);
        this.gefsi = gefsi;
        this.sugar = sugar;
        this.cream = cream;
    }

    public String getGefsi() {
        return gefsi;
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nFlavor: " + gefsi
                + "\nSugar Type: " + sugar.gettyposSug()
                + "\nCream Type: " + cream.getTyposCre();
    }
}
