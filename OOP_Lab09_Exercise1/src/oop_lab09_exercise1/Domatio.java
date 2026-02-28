package oop_lab09_exercise1;

public class Domatio extends ExohikiKatoikia {

    private int DomatioTypeID;

    public Domatio() {
    }

    public Domatio(String typeName, String Periohi_Poli, int typeID, int NrOfDays, int TimiHmeras, int DomatioTypeID) {
        super(typeName, Periohi_Poli, typeID, NrOfDays, TimiHmeras);
        this.DomatioTypeID = DomatioTypeID;
    }

    public String getDomatioTypeID() {
        switch (DomatioTypeID) {
            case 1:
                return "single";
            case 2:
                return "double";
            case 3:
                return "triple";
            default:
                return "wrong type";
        }
    }

    public void setDomatioTypeID(int DomatioTypeID) {
        this.DomatioTypeID = DomatioTypeID;
    }

    @Override
    public String getEnoikioType() {
        return "day";
    }

    @Override
    public double calcEnoikio() {
        return getNrOfDays() * getTimiHmeras();
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nRoom Type: " + getDomatioTypeID()
                + "\nRent Type: " + getEnoikioType()
                + "\nRent: " + calcEnoikio();
    }
}
