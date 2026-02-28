package oop_lab05_exercise2;

public class Coffee {

    private String coffeeName;
    private int typosCafe;
    private int sweetness;
    private int dosi;
    private double price;

    public Coffee() {
    }

    public Coffee(String coffeeName, int typosCafe, int sweetness, int dosi, double price) {
        this.coffeeName = coffeeName;
        this.typosCafe = typosCafe;
        this.sweetness = sweetness;
        this.dosi = dosi;
        this.price = price;
    }

    public String getCoffeeName() {
        return coffeeName;
    }

    public String getTypos_cafe() {
        switch (typosCafe) {
            case 1:
                return "Regular";
            case 2:
                return "Decaf";
            default:
                return "Unknown coffee type";
        }
    }

    public String getSweetness() {
        switch (sweetness) {
            case 1:
                return "Sweet";
            case 2:
                return "Medium";
            case 3:
                return "Black";
            default:
                return "Unknown sugar type";
        }
    }

    public String getDosi() {
        switch (dosi) {
            case 1:
                return "Single";
            case 2:
                return "Double";
            default:
                return "Unknown dose type";
        }
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Coffee name: " + coffeeName
                + "\nCoffee type: " + getTypos_cafe()
                + "\nSweetness: " + getSweetness()
                + "\nDose: " + getDosi()
                + "\nPrice: " + price;
    }
}
