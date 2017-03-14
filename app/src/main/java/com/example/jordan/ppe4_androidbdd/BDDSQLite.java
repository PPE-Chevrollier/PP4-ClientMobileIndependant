package com.example.jordan.ppe4_androidbdd;

/**
 * Created by jordan on 10/03/2017.
 */
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteDatabase.CursorFactory;

public class BDDSQLite extends SQLiteOpenHelper {
    private static final String TABLE_LOGEMENT = "table_logement";
    private static final String COL_ID_LOGEMENTS = "id_logements";
    private static final String COL_RUE_LOGEMENTS = "rue_logements";
    private static final String COL_VILLE_LOGEMENTS = "ville_logements";
    private static final String COL_CP_LOGEMENTS = "cp_logements";
    private static final String COL_COMPLEMENT_ADRESSE_LOGEMENTS = "complement_adresse_logements";
    private static final String COL_PRIX_LOGEMENTS = "prix_logements";
    private static final String COL_SURFACE_LOGEMENTS = "surface_logements";
    private static final String COL_NB_PIECES_APPARTEMENTS = "nb_places_appartements";
    private static final String COL_NB_CHAMBRES_APPARTEMENTS = "nb_chambres_appartements";
    private static final String COL_MEUBLE_STUDIOS = "nb_meuble_studios";
    private static final String COL_PARTIES_COMMUNES_CHAMBRESHABITANT = "nb_parties_communes_chambreshabitant";

    private static final String CREATE_BDD = "CREATE TABLE " + TABLE_LOGEMENT + " ("
            + COL_ID_LOGEMENTS + " INTEGER PRIMARY KEY AUTOINCREMENT, " + COL_RUE_LOGEMENTS + " CHAR NOT NULL, "
            + COL_VILLE_LOGEMENTS + " TEXT NOT NULL)" + COL_CP_LOGEMENTS + "TEXT NOT NULL" + COL_COMPLEMENT_ADRESSE_LOGEMENTS + "TEXT"
            + COL_PRIX_LOGEMENTS + "TEXT NOT NULL" + COL_SURFACE_LOGEMENTS + "TEXT NOT NULL"
            + COL_NB_PIECES_APPARTEMENTS + "TEXT" + COL_NB_CHAMBRES_APPARTEMENTS + "TEXT"
            + COL_MEUBLE_STUDIOS + "TEXT"
            + COL_PARTIES_COMMUNES_CHAMBRESHABITANT + "TEXT";

    public BDDSQLite(Context context, String name, CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        //on crée la table à partir de la requête écrite dans la variable CREATE_BDD
        db.execSQL(CREATE_BDD);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        //On peut faire ce qu'on veut ici moi j'ai décidé de supprimer la table et de la recréer
        //comme ça lorsque je change la version les id repartent de 0
        db.execSQL("DROP TABLE " + TABLE_LOGEMENT + ";");
        onCreate(db);
    }
}