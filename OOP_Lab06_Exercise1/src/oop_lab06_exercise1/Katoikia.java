package oop_lab06_exercise1;

public class Katoikia {

    private int kodikos;
    private int pliuos;
    private double metra;
    private String dieyuinsi;

    public Katoikia() {
    }

    public Katoikia(int kodikos, int pliuos, double metra, String dieyuinsi) {
        this.kodikos = kodikos;
        this.pliuos = pliuos;
        this.metra = metra;
        this.dieyuinsi = dieyuinsi;
    }

    public int getKodikos() {
        return kodikos;
    }

    public void setKodikos(int kodikos) {
        this.kodikos = kodikos;
    }

    public int getPliuos() {
        return pliuos;
    }

    public void setPliuos(int pliuos) {
        this.pliuos = pliuos;
    }

    public double getMetra() {
        return metra;
    }

    public void setMetra(double metra) {
        this.metra = metra;
    }

    public String getDieyuinsi() {
        return dieyuinsi;
    }

    public void setDieyuinsi(String dieyuinsi) {
        this.dieyuinsi = dieyuinsi;
    }

    public String TyposSynalagis() {
        switch (kodikos) {
            case 1:
                return "Sale";
            case 2:
                return "Rent";
            default:
                return "Unknown transaction type";
        }
    }

    public double Poso() {
        return 0;
    }

    @Override
    public String toString() {
        return "Code: " + kodikos
                + "\nNumber of rooms: " + pliuos
                + "\nSquare meters: " + metra
                + "\nAddress: " + dieyuinsi
                + "\nTransaction type: " + TyposSynalagis()
                + "\nAmount: " + Poso();
    }
}
