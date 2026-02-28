package oop_lab10_exercise2;

public class Items {

    private String titlos;
    private String paragogos;
    private Integer xronia;
    private Double timi;

    public Items(String titlos, String paragogos, Integer xronia, Double timi) {
        this.titlos = titlos;
        this.paragogos = paragogos;
        this.xronia = xronia;
        this.timi = timi;
    }

    public String getTitlos() {
        return titlos;
    }

    public void setTitlos(String titlos) {
        this.titlos = titlos;
    }

    public String getParagogos() {
        return paragogos;
    }

    public void setParagogos(String paragogos) {
        this.paragogos = paragogos;
    }

    public Integer getXronia() {
        return xronia;
    }

    public void setXronia(Integer xronia) {
        this.xronia = xronia;
    }

    public Double getTimi() {
        return timi;
    }

    public void setTimi(Double timi) {
        this.timi = timi;
    }

    @Override
    public String toString() {
        return "Title: " + titlos + ", Producer: " + paragogos + ", Year: " + xronia + ", Price: " + timi;
    }

    public boolean anazitisiMeTitlo(String titlos) {
        return this.titlos.equalsIgnoreCase(titlos);
    }
}
