package fr.louis.Main;

public class Bateau {

    protected int idBateau;
    protected String nomBateau;
    protected float longueurBateau;
    protected float largeurBateau;

    public Bateau(int ID_Bateau, String Nom_Bateau, float Longueur_Bateau, float Largeur_Bateau){
        this.idBateau = ID_Bateau;
        this.nomBateau = Nom_Bateau;
        this.longueurBateau = Longueur_Bateau;
        this.largeurBateau = Largeur_Bateau;
    }


    @Override
    public String toString(){
        return "Nom du bateau : " + this.nomBateau + "\n"
                + "Longueur : " + this.longueurBateau + " mètres \n"
                + "Largeur : " + this.largeurBateau + " mètres \n";
    }


    // Getters
    public int getIdBateau() {
        return this.idBateau;
    }
    public String getNomBateau() {
        return this.nomBateau;
    }
    public float getLargeurBateau() {
        return this.largeurBateau;
    }
    public float getLongueurBateau() {
        return this.longueurBateau;
    }
}

