package fr.louis.Main;

import java.util.ArrayList;

public class BateauVoyageur extends Bateau {

    private final int vitesseBateauVoyageur;
    private final String imageBateauVoyageur;
    private ArrayList<ArrayList<Equipements>> lesEquipements = new ArrayList<ArrayList<Equipements>>();


    public BateauVoyageur(int ID_Bateau, String Nom_Bateau, float Longueur_Bateau, float Largeur_Bateau, int Vitesse_Bateau, String Img_Bateau, ArrayList<Equipements> Un_Equip) {
        super(ID_Bateau, Nom_Bateau, Longueur_Bateau, Largeur_Bateau);
        this.vitesseBateauVoyageur = Vitesse_Bateau;
        this.imageBateauVoyageur = Img_Bateau;
        this.lesEquipements.add(Un_Equip);
    }

    @Override
    public String toString() {
        String chaine = super.toString() + "Vitesse : " + this.vitesseBateauVoyageur + " noeuds \n" + "Liste des Équipements : ";
        for (int i = 0; i < lesEquipements.size(); i++){
            chaine = chaine + this.lesEquipements.get(i).toString();
        }
        return chaine;
    }




    public void ajout_Equipement(ArrayList<Equipements> unEquipement) {
        lesEquipements.add(unEquipement);
    }

    public int getVitesseBateauVoyageur() {
        return this.vitesseBateauVoyageur;
    }
    public String getImageBateauVoyageur() {
        return this.imageBateauVoyageur;
    }
}
