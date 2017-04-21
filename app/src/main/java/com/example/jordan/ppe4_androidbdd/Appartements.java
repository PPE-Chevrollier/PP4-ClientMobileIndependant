package com.example.jordan.ppe4_androidbdd;

/**
 * Created by jordan on 17/03/2017.
 */

public class Appartements extends Logement {
    private int nb_places_appartements;
    private int nb_chambres_appartements;


    public Appartements(){}

    public Appartements(String rue_logements, int ville_logements, int cp_logements, String complements_adresse_logements, int prix_logements, int surface_logements, int nb_places_appartements, int nb_chambres_appartements){
        super(rue_logements,ville_logements,cp_logements,complements_adresse_logements, prix_logements, surface_logements);
        this.nb_places_appartements = nb_places_appartements;
        this.nb_chambres_appartements = nb_chambres_appartements;
    }

    //region accesseur
    public int getNb_places_appartements() {
        return nb_places_appartements;
    }

    public void setNb_places_appartements(char nb_places_appartements) {
        this.nb_places_appartements = nb_places_appartements;
    }

    public int getNb_chambres_appartements() {
        return nb_chambres_appartements;
    }

    public void setNb_chambres_appartements(char nb_chambres_appartements) {
        this.nb_chambres_appartements = nb_chambres_appartements;
    }
    //endregion
}
