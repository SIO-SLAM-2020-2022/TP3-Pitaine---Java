package fr.louis.Main;

public class BateauFret extends Bateau{

    private final float masseBateau;

    public BateauFret(int ID_Bateau, String Nom_Bateau, float Longueur_Bateau, float Largeur_Bateau, float Masse_Bateau){
        super(ID_Bateau, Nom_Bateau, Longueur_Bateau, Largeur_Bateau);
        this.masseBateau = Masse_Bateau;
    }

    @Override
    public String toString(){
        return super.toString()
                + "Poids : " + this.masseBateau + " kg \n";
    }


}
