package oop_lab10_exercise2;

public class GameDVDs extends Items {

    private Boolean multiplayer;
    private String platforma;
    private Integer katallilotita;

    public GameDVDs(String titlos, String paragogos, Integer xronia, Double timi, Boolean multiplayer, String platforma, Integer katallilotita) {
        super(titlos, paragogos, xronia, timi);
        this.multiplayer = multiplayer;
        this.platforma = platforma;
        this.katallilotita = katallilotita;
    }

    public Boolean getMultiplayer() {
        return multiplayer;
    }

    public void setMultiplayer(Boolean multiplayer) {
        this.multiplayer = multiplayer;
    }

    public String getPlatforma() {
        return platforma;
    }

    public void setPlatforma(String platforma) {
        this.platforma = platforma;
    }

    public Integer getKatallilotita() {
        return katallilotita;
    }

    public void setKatallilotita(Integer katallilotita) {
        this.katallilotita = katallilotita;
    }

    @Override
    public String toString() {
        return super.toString() + ", Multiplayer: " + multiplayer + ", Platform: " + platforma + ", Suitability: " + katallilotita;
    }

    @Override
    public boolean anazitisiMeTitlo(String titlos) {
        return super.anazitisiMeTitlo(titlos);
    }
}
