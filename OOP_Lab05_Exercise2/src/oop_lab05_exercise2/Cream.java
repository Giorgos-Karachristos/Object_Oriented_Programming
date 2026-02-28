package oop_lab05_exercise2;

public class Cream {

    private int typosCre;

    public Cream() {
    }

    public Cream(int typosCre) {
        this.typosCre = typosCre;
    }

    public String getTyposCre() {
        switch (typosCre) {
            case 0:
                return "None";
            case 1:
                return "Whipped cream";
            case 2:
                return "Plant-based";
            case 3:
                return "Milk";
            default:
                return "Unknown cream type";
        }
    }
}
