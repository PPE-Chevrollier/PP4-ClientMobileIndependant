package com.example.jordan.ppe4_androidbdd;

/**
 * Created by jordan on 10/03/2017.
 */

public abstract class Logement {
    private static int id_max;
    protected int id_logements;
    protected String rue_logements;
    protected int ville_logements;
    protected int cp_logements;
    protected String complements_adresse_logements;
    protected int prix_logements;
    protected int surface_logements;
    public Logement(){
        id_max++;
        id_logements = id_max;
    }

    public Logement(String rue_logements, int ville_logements, int cp_logements, String complements_adresse_logements, int prix_logements, int surface_logements){
        this();
        this.rue_logements = rue_logements;
        this.ville_logements = ville_logements;
        this.cp_logements = cp_logements;
        this.complements_adresse_logements = complements_adresse_logements;
        this.prix_logements = prix_logements;
        this.surface_logements = surface_logements;
    }

//region accesseurs
    public int getId_logements() {
        return id_logements;
    }

    public void setId_logements(int id) {
        this.id_logements = id;
    }

    public String getRue_logements() {
        return rue_logements;
    }

    public void setRue_logements(String rue_logements) {
        this.rue_logements = rue_logements;
    }

    public int getVille_logements(){
        return ville_logements;
    }

    public void setVille_logements(int ville_logements){
        this.ville_logements = ville_logements;
    }

    public int getCp_logements() {
        return cp_logements;
    }

    public void setCp_logements(int cp_logements) {
        this.cp_logements = cp_logements;
    }

    public String getComplements_adresse_logements(){
        return complements_adresse_logements;
    }
    public void setComplements_adresse_logements(String complements_adresse_logements){
        this.complements_adresse_logements = complements_adresse_logements;
    }

    public int getPrix_logements(){
        return prix_logements;
    }

    public void setPrix_logements(int prix_logements){
        this.prix_logements = prix_logements;
    }

    public int getSurface_logements() {
        return surface_logements;
    }

    public void setSurface_logements(int surface_logements) {
        this.surface_logements = surface_logements;
    }
//endregion

    public abstract String toString();
        /*return "ID : "+id_logements+"\nRue : "+rue_logements+"\nVille : "+ville_logements+"\nCP : "+cp_logements+"\nComplement adresse: "+complements_adresse_logements+"\nPrix : "+prix_logements+"\nSurface : "+surface_logements ;*/



}

