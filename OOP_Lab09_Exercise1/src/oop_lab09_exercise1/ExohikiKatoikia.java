package oop_lab09_exercise1;

public abstract class ExohikiKatoikia {

    private String typeName;
    private String Periohi_Poli;
    private int typeID;
    private int NrOfDays;
    private int TimiHmeras;

    public ExohikiKatoikia() {
    }

    public ExohikiKatoikia(String typeName, String Periohi_Poli, int typeID, int NrOfDays, int TimiHmeras) {
        this.typeName = typeName;
        this.Periohi_Poli = Periohi_Poli;
        this.typeID = typeID;
        this.NrOfDays = NrOfDays;
        this.TimiHmeras = TimiHmeras;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public String getPeriohi_Poli() {
        return Periohi_Poli;
    }

    public void setPeriohi_Poli(String Periohi_Poli) {
        this.Periohi_Poli = Periohi_Poli;
    }

    public int getTypeID() {
        return typeID;
    }

    public void setTypeID(int typeID) {
        this.typeID = typeID;
    }

    public int getNrOfDays() {
        return NrOfDays;
    }

    public void setNrOfDays(int NrOfDays) {
        this.NrOfDays = NrOfDays;
    }

    public int getTimiHmeras() {
        return TimiHmeras;
    }

    public void setTimiHmeras(int TimiHmeras) {
        this.TimiHmeras = TimiHmeras;
    }

    public abstract String getEnoikioType();

    public abstract double calcEnoikio();

    @Override
    public String toString() {
        return "Type Name: " + typeName
                + "\nCity/Area: " + Periohi_Poli
                + "\nType ID: " + typeID
                + "\nNumber of Days: " + NrOfDays
                + "\nDaily Price: " + TimiHmeras;
    }
}
