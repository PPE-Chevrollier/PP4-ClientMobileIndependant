package com.example.jordan.ppe4_androidbdd;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by jordan on 21/04/2017.
 */

public abstract class DAOBase  {
    // Nous sommes à la première version de la base
    // Si je décide de la mettre à jour, il faudra changer cet attribut
    protected final static int VERSION = 1;
    // Le nom du fichier qui représente ma base
    protected final static String NOM_BASE = "databaselogement.db";

    protected SQLiteDatabase mDb = null;
    protected BDDSQLite bddsqLite = null;

    public DAOBase( ){}

    public DAOBase(Context pContext) {

        //String chemin = pContext.getFilesDir().getPath();
        // Log.i("chemin", ": " + chemin);
        // chemin += "/"+NOM_BASE;
        this.bddsqLite = new BDDSQLite(pContext, NOM_BASE, null, VERSION);
        open();
    }

    public SQLiteDatabase open() {
        // Pas besoin de fermer la dernière base ouverte puisque getWritableDatabase s'en charge
        mDb = bddsqLite.getWritableDatabase();
        return mDb;
    }

    public void close() {
        mDb.close();
    }

    public SQLiteDatabase getDb() {
        return mDb;
    }
}

