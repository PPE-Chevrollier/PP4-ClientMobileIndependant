package com.example.jordan.ppe4_androidbdd;

/**
 * Created by jordan on 17/03/2017.
 */

public class chambresHabitant extends Logement{
    private int parties_communes_chambreshabitant;


    public chambresHabitant(){}

    public chambresHabitant(char rue_logements, int ville_logements, int cp_logements, char complements_adresse_logements, int prix_logements, int surface_logements, int parties_communes_chambreshabitant){
        super(rue_logements,ville_logements,cp_logements,complements_adresse_logements, prix_logements, surface_logements);
        this.parties_communes_chambreshabitant = parties_communes_chambreshabitant;
    }
}

