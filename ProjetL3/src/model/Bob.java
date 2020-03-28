package model;

import java.util.List;

public class Bob  extends Personnage{

    private int Munitons;
    private List<Objets> Inventaire;
    private boolean Assome;

    public Bob(String nom, int pdv, int posX, int posy, int mun) {
        super(nom, pdv, posX, posy);
        Munitons = mun;
    }

    public void Inventaire(){
        // ouvre l'inventaire
    }

    public void TirBlaster(){
        // s'il lui reste des munitions
        // Inflige petits dégats et brule pendant 2 tours
    }

    public void CoupDePoing(){
        // Inflige de bons dégats
    }

    public void Soins(){
        // soigne Bob
    }

    public boolean HasObject(Objets obj){
        if (Inventaire.contains(obj))
            return true;
        else
            return false;
    }

    public int getMunitons() {
        return Munitons;
    }

    public void setMunitons(int munitons) {
        Munitons = munitons;
    }

    public boolean isAssome() {
        return Assome;
    }

    public void setAssome(boolean assome) {
        Assome = assome;
    }
}
