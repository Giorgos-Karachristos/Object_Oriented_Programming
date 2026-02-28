package oop_lab05_exercise2;

public class Ellinikos extends Coffee {

    private Sugar sugar;

    public Ellinikos() {
    }

    public Ellinikos(String coffeeName, int typosCafe, int sweetness, int dosi, double price, Sugar sugar) {
        super(coffeeName, typosCafe, sweetness, dosi, price);
        this.sugar = sugar;
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nSugar Type: " + sugar.gettyposSug();
    }
}
