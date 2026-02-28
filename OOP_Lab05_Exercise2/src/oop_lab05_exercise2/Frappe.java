package oop_lab05_exercise2;

public class Frappe extends Coffee {

    private String gefsi;
    private int iced;
    private Sugar sugar;
    private Cream cream;

    public Frappe() {
    }

    public Frappe(String coffeeName, int typosCafe, int sweetness, int dosi, double price, String gefsi, int iced, Sugar sugar, Cream cream) {
        super(coffeeName, typosCafe, sweetness, dosi, price);
        this.gefsi = gefsi;
        this.iced = iced;
        this.sugar = sugar;
        this.cream = cream;
    }

    public String getGefsi() {
        return gefsi;
    }

    public String getIced() {
        switch (iced) {
            case 1:
                return "Kryos";
            case 2:
                return "Zestos";
            default:
                return "Lauos typos";
        }
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nFlavor: " + gefsi
                + "\nIced: " + getIced()
                + "\nSugar Type: " + sugar.gettyposSug()
                + "\nCream Type: " + cream.getTyposCre();
    }
}
