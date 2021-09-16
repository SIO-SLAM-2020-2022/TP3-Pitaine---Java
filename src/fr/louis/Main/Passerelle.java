package fr.louis.Main;

import java.sql.*;
import java.util.ArrayList;

public class Passerelle {


    public Passerelle(){}

    public static ArrayList<Equipements> chargerLesEquipements(int idBat) throws SQLException {
        JeuEnregistrement jeu = new JeuEnregistrement("select id,libelle from equipement join posseder on equipement.id = posseder.idEquip where idBat=" + idBat);
        ArrayList<Equipements> listeEquipements = new ArrayList<>();
        do {
            jeu.suivant();
            listeEquipements.add(
                    new Equipements(
                            Integer.parseInt(jeu.getValeur("id")),
                            jeu.getValeur("libelle")));
        } while (!jeu.fin());
        return listeEquipements;
    }


    public static ArrayList<BateauVoyageur> chargerBateauxVoyageur() throws SQLException {
        JeuEnregistrement jeu = new JeuEnregistrement("select id, nom, longueur, largeur, vitesse, image from bateau WHERE type='v'");
        ArrayList<BateauVoyageur> listeBateaux = new ArrayList<>();
        do {
            jeu.suivant();
            listeBateaux.add(
                    new BateauVoyageur(
                        Integer.parseInt(jeu.getValeur("id")),
                        jeu.getValeur("nom"),
                        Float.parseFloat(jeu.getValeur("longueur")),
                        Float.parseFloat(jeu.getValeur("largeur")),
                        Integer.parseInt(jeu.getValeur("vitesse")),
                        jeu.getValeur("image"),
                        chargerLesEquipements(Integer.parseInt(jeu.getValeur("id")))));

        } while (!jeu.fin());
        return listeBateaux;

    }

}
