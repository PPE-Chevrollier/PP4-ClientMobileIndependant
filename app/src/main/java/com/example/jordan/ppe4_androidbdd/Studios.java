package com.example.jordan.ppe4_androidbdd;

/**
 * Created by jordan on 17/03/2017.
 */

public class Studios extends Logement{
    private int meuble_studios;


    public Studios(){}

    public Studios(String rue_logements, int ville_logements, int cp_logements, char complements_adresse_logements, int prix_logements, int surface_logements, int meuble_studios){
        super(rue_logements,ville_logements,cp_logements,complements_adresse_logements, prix_logements, surface_logements);
        this.meuble_studios = meuble_studios;
    }


    //region acesseur
    public int getMeuble_studios() {
        return meuble_studios;
    }

    public void setMeuble_studios(int meuble_studios) {
        this.meuble_studios = meuble_studios;
    }
    //endregion
}
