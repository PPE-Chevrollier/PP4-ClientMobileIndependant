package com.example.jordan.ppe4_androidbdd;

/**
 * Created by jordan on 10/03/2017.
 */

public class Logement {
    private int id_logements;
    private char rue_logements;
    private int ville_logements;
    private int cp_logements;
    private char complements_adresse_logements;
    private int prix_logements;
    private int surface_logements;
    private char nb_places_appartements;
    private char nb_chambres_appartements;
    private int meuble_studios;
    private char parties_communes_chambreshabitant; //char en attendant de régler le problème de surcharge de constructeur
    public Logement(){}

    public Logement(char rue_logements, int ville_logements, int cp_logements, char complements_adresse_logements, int prix_logements, int surface_logements){
        this.rue_logements = rue_logements;
        this.ville_logements = ville_logements;
        this.cp_logements = cp_logements;
        this.complements_adresse_logements = complements_adresse_logements;
        this.prix_logements = prix_logements;
        this.surface_logements = surface_logements;
    }
    //constructeur permettant de créer un appartement
    public Logement(char rue_logements, int ville_logements, int cp_logements, char complements_adresse_logements, int prix_logements, int surface_logements, char nb_places_appartements, char nb_chambres_appartements){
        this.rue_logements = rue_logements;
        this.ville_logements = ville_logements;
        this.cp_logements = cp_logements;
        this.complements_adresse_logements = complements_adresse_logements;
        this.prix_logements = prix_logements;
        this.surface_logements = surface_logements;
        this.nb_places_appartements = nb_places_appartements;
        this.nb_chambres_appartements = nb_chambres_appartements;
    }
    //constructeur permettant de créer un studio
    public Logement(char rue_logements, int ville_logements, int cp_logements, char complements_adresse_logements, int prix_logements, int surface_logements, int meuble_studios){
        this.rue_logements = rue_logements;
        this.ville_logements = ville_logements;
        this.cp_logements = cp_logements;
        this.complements_adresse_logements = complements_adresse_logements;
        this.prix_logements = prix_logements;
        this.surface_logements = surface_logements;
        this.meuble_studios = meuble_studios;
    }

    public Logement(char rue_logements, int ville_logements, int cp_logements, char complements_adresse_logements, int prix_logements, int surface_logements, char parties_communes_chambreshabitant){
        this.rue_logements = rue_logements;
        this.ville_logements = ville_logements;
        this.cp_logements = cp_logements;
        this.complements_adresse_logements = complements_adresse_logements;
        this.prix_logements = prix_logements;
        this.surface_logements = surface_logements;
        this.parties_communes_chambreshabitant = parties_communes_chambreshabitant;
    }

//region accesseurs
    public int getId_logements() {
        return id_logements;
    }

    public void setId_logements(int id) {
        this.id_logements = id;
    }

    public char getRue_logements() {
        return rue_logements;
    }

    public void setRue_logements(char rue_logements) {
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

    public char getComplements_adresse_logements(){
        return complements_adresse_logements;
    }
    public void setComplements_adresse_logements(char complements_adresse_logements){
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

    public char getNb_places_appartements() {
        return nb_places_appartements;
    }

    public void setNb_places_appartements(char nb_places_appartements) {
        this.nb_places_appartements = nb_places_appartements;
    }

    public char getNb_chambres_appartements() {
        return nb_chambres_appartements;
    }

    public void setNb_chambres_appartements(char nb_chambres_appartements) {
        this.nb_chambres_appartements = nb_chambres_appartements;
    }

    public int getMeuble_studios() {
        return meuble_studios;
    }

    public void setMeuble_studios(int meuble_studios) {
        this.meuble_studios = meuble_studios;
    }

    public char getParties_communes_chambreshabitant() {
        return parties_communes_chambreshabitant;
    }

    public void setParties_communes_chambreshabitant(char parties_communes_chambreshabitant) {
        this.parties_communes_chambreshabitant = parties_communes_chambreshabitant;
    }
//endregion

    public String toString(){
        return "ID : "+id_logements+"\nRue : "+rue_logements+"\nVille : "+ville_logements+"\nCP : "+cp_logements+"\nComplement adresse: "+complements_adresse_logements+"\nPrix : "+prix_logements+"\nSurface : "+surface_logements ;
    }


}

