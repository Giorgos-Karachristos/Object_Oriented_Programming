package oop_lab09_exercise1;

public class Villa extends ExohikiKatoikia {

    private int PlithosDomation;

    public Villa() {
    }

    public Villa(String typeName, String Periohi_Poli, int typeID, int NrOfDays, int TimiHmeras, int PlithosDomation) {
        super(typeName, Periohi_Poli, typeID, NrOfDays, TimiHmeras);
        this.PlithosDomation = PlithosDomation;
    }

    public int getPlithosDomation() {
        return PlithosDomation;
    }

    public void setPlithosDomation(int PlithosDomation) {
        this.PlithosDomation = PlithosDomation;
    }

    @Override
    public String getEnoikioType() {
        return "month";
    }

    @Override
    public double calcEnoikio() {
        if (getNrOfDays() >= 30) {
            return getNrOfDays() * getTimiHmeras() * 0.9;
        } else {
            throw new IllegalArgumentException("Prepei meres >= 30");
        }
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nNumber of Rooms: " + PlithosDomation
                + "\nRent Type: " + getEnoikioType()
                + "\nRent: " + calcEnoikio();
    }
}
