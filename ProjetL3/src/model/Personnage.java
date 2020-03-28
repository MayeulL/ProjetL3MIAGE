package model;

public class Personnage {

    private String Nom;
    private int PointsDeVie;
    private int Brule;
    private boolean Vivant = true;
    private int PosX;
    private int PosY;

    public Personnage(String nom, int pdv, int posX, int posy){
        Nom = nom;
        PointsDeVie = pdv;
        PosX = posX;
        PosY = posy;
    }

    public String getNom() {
        return Nom;
    }

    public void PerdrePdv(int dommages){
        int pdv = this.getPointsDeVie()-dommages;
        setPointsDeVie(pdv);

        if (pdv <= 0)
            this.Mourir();
    }

    public void GagnerPdv(int soins){
        int pdv = this.getPointsDeVie()+soins;
        setPointsDeVie(pdv);
    }

    private void Mourir() {
        this.Vivant = false;
    }

    //TO DO
    public String Parler(){
        return "boop";
    }

    public void Bruler(){
        // si le compteur Brule > 0
        // inflige de légers dégats
    }

    public int getPointsDeVie() {
        return PointsDeVie;
    }

    public int getPosX() {
        return PosX;
    }

    public int getPosY() {
        return PosY;
    }

    public int getBrule() {
        return Brule;
    }

    public void setBrule(int brule) {
        Brule = brule;
    }

    public void setPointsDeVie(int pointsDeVie) {
        PointsDeVie = pointsDeVie;
    }

    public void setPosX(int posX) {
        PosX = posX;
    }

    public void setPosY(int posY) {
        PosY = posY;
    }
}
