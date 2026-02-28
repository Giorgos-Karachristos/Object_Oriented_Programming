package oop_lab10_exercise2;

public class MovieDVDs extends Items {

    private Double diarkeia;
    private String xora;
    private Integer eisprajeis;

    public MovieDVDs(String titlos, String paragogos, Integer xronia, Double timi, Double diarkeia, String xora, Integer eisprajeis) {
        super(titlos, paragogos, xronia, timi);
        this.diarkeia = diarkeia;
        this.xora = xora;
        this.eisprajeis = eisprajeis;
    }

    public Double getDiarkeia() {
        return diarkeia;
    }

    public void setDiarkeia(Double diarkeia) {
        this.diarkeia = diarkeia;
    }

    public String getXora() {
        return xora;
    }

    public void setXora(String xora) {
        this.xora = xora;
    }

    public Integer getEisprajeis() {
        return eisprajeis;
    }

    public void setEisprajeis(Integer eisprajeis) {
        this.eisprajeis = eisprajeis;
    }

    @Override
    public String toString() {
        return super.toString() + ", Duration: " + diarkeia + ", Country: " + xora + ", Earnings: " + eisprajeis;
    }

    @Override
    public boolean anazitisiMeTitlo(String titlos) {
        return super.anazitisiMeTitlo(titlos);
    }
}
