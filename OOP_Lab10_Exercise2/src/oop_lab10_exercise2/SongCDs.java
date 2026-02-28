package oop_lab10_exercise2;

public class SongCDs extends Items {

    private Integer pliuosTragoydion;
    private String eidos;
    private Double diarkeia;

    public SongCDs(String titlos, String paragogos, Integer xronia, Double timi, Integer pliuosTragoydion, String eidos, Double diarkeia) {
        super(titlos, paragogos, xronia, timi);
        this.pliuosTragoydion = pliuosTragoydion;
        this.eidos = eidos;
        this.diarkeia = diarkeia;
    }

    public Integer getPliuosTragoydion() {
        return pliuosTragoydion;
    }

    public void setPliuosTragoydion(Integer pliuosTragoydion) {
        this.pliuosTragoydion = pliuosTragoydion;
    }

    public String getEidos() {
        return eidos;
    }

    public void setEidos(String eidos) {
        this.eidos = eidos;
    }

    public Double getDiarkeia() {
        return diarkeia;
    }

    public void setDiarkeia(Double diarkeia) {
        this.diarkeia = diarkeia;
    }

    @Override
    public String toString() {
        return super.toString() + ", Number of songs: " + pliuosTragoydion + ", Genre: " + eidos + ", Duration: " + diarkeia;
    }

    @Override
    public boolean anazitisiMeTitlo(String titlos) {
        return super.anazitisiMeTitlo(titlos);
    }
}
