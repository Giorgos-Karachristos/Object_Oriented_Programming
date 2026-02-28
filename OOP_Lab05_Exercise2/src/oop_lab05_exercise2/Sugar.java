package oop_lab05_exercise2;

public class Sugar {

    private int typosSug;

    public Sugar() {
    }

    public Sugar(int typosSug) {
        this.typosSug = typosSug;
    }

    public String gettyposSug() {
        switch (typosSug) {
            case 1:
                return "white";
            case 2:
                return "brown";
            default:
                return "Unknown suggar type";
        }
    }
}
