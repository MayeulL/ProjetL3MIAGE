package model;

public class Chmdak extends Personnage {

    private boolean Enrage;

    public Chmdak(String nom, int pdv, int posX, int posy) {
        super(nom, pdv, posX, posy);
    }

    public boolean isEnrage() {
        return Enrage;
    }

    public void setEnrage(boolean enrage) {
        Enrage = enrage;
    }

    public void Fouet(){
        //inflige des dégats
    }

    public void Charge(){
        // inflige des dégats, assomme Bob pour un tour mais s'inflige des dégâts à lui meme
    }

    public void Meditation(){
        // Seulement en état enragé
        // Lui rend des points de vie

    }

}
