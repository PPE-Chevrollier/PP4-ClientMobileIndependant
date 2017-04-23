package com.example.jordan.ppe4_androidbdd;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.util.Log;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;


/**
 * Created by jordan on 21/04/2017.
 */

public class LogementDAO extends DAOBase{

    public static final String LOGEMENT_TABLE_NAME = "table_logement";
    public static final String LOGEMENT_KEY = "id_logements";


    public static final String LES_LOGEMENTS = "SELECT * FROM " + LOGEMENT_TABLE_NAME + ";";

    public LogementDAO(Context pContext) {
        super(pContext);
    }

    public LogementDAO(){}

    public boolean existe(Logement l) {
		/*vérifie si un client existe déjà en BDD, on se sert de son id*/
        boolean exist = false;
        try (Cursor cursor = mDb.query(LOGEMENT_TABLE_NAME, new String[]{LOGEMENT_KEY}, LOGEMENT_KEY + " = " + l.getId_logements(), null, null, null, null)) {
            if (cursor.moveToFirst()) {
                Log.i("EXIST VRAI = ", cursor.getString(0));
                exist = true;
            }
        }
        catch(Exception e){Log.i("CATCH client DAO", "Requete query erreur");}
        return exist;
    }
    /**
     * @param l le logement à ajouter à la base
     */
    public boolean inserer(Logement l) {
        boolean insert = true ;

        ContentValues value = new ContentValues();
        value.put(LOGEMENT_KEY,l.getId_logements());

            /*ici mDb est accessible car en protected dans la classe mère*/
        long  i = mDb.insert(LOGEMENT_TABLE_NAME, null, value);
        if (i == -1) {
            insert = false ;
        }
        return insert ;
    }
    /**
     * @param id l'identifiant du client à supprimer
     */
    public void supprimer(long id) {
        mDb.delete(LOGEMENT_TABLE_NAME, LOGEMENT_KEY + " = ?", new String[]{String.valueOf(id)});
    }
    /**
     * @param l le logement modifié : on peut choisir les données modifiables (celle que l'on met dans le put)
     */
    public void modifier(Logement l) {

        /*ContentValues value = new ContentValues();
        value.put(CLIENT_NUMPORT, c.getNumPortable());

        mDb.update(LOGEMENT_TABLE_NAME, value, LOGEMENT_KEY + " = ?", new String[]{String.valueOf(l.getId())});*/
    }
    /**
     * @return listeTmpClient liste des clients récuupés dans la BDD via un curseur
     * */

    public ArrayList<Logement> listeAppartement() {
        ArrayList<Logement> listeTmpAppartement = new ArrayList<Logement>();
            /*ici mDb est accessible car en protected dans la classe mère*/
        Cursor c = mDb.rawQuery(LES_LOGEMENTS,null);
        Appartements app;
        while (c.moveToNext()) {
            //c.getString(0) correspond à l'id du client

                String rue_logements = c.getString(1);
                int ville_logements = Integer.parseInt(c.getString(2));
                int cp_logements = Integer.parseInt(c.getString(3));
                String complements_adresse_logements = c.getString(4);
                int prix_logements = Integer.parseInt(c.getString(5));
                int surface_logements = Integer.parseInt(c.getString(6));
                int nb_places_appartements = Integer.parseInt(c.getString(7));
                int nb_chambres_appartements = Integer.parseInt(c.getString(8));

                app = new Appartements (rue_logements, ville_logements, cp_logements, complements_adresse_logements, prix_logements, surface_logements, nb_places_appartements, nb_chambres_appartements);
                Log.i("logement", app.toString());
                listeTmpAppartement.add(app);
        }
        c.close();
        return listeTmpAppartement;

    }

}
