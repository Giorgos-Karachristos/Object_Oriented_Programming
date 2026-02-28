package oop_lab05_exercise2;

public class Capuccino extends Coffee {

    private String gefsi;
    private int iced;
    private int kanella;
    private Sugar sugar;
    private Cream cream;

    public Capuccino() {
    }

    public Capuccino(String coffeeName, int typosCafe, int sweetness, int dosi, double price, String gefsi, int iced, int kanella, Sugar sugar, Cream cream) {
        super(coffeeName, typosCafe, sweetness, dosi, price);
        this.gefsi = gefsi;
        this.iced = iced;
        this.kanella = kanella;
        this.sugar = sugar;
        this.cream = cream;
    }

    public String getGefsi() {
        return gefsi;
    }

    public String getIced() {
        switch (iced) {
            case 1:
                return "Cold";
            case 2:
                return "Hot";
            default:
                return "Unknown type";
        }
    }

    public String getKanella() {
        switch (kanella) {
            case 1:
                return "Yes";
            case 2:
                return "No";
            default:
                return "Unknown cinnamon type";
        }
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nFlavor: " + gefsi
                + "\nIced: " + getIced()
                + "\nCinnamon: " + getKanella()
                + "\nSugar Type: " + sugar.gettyposSug()
                + "\nCream Type: " + cream.getTyposCre();
    }
}
