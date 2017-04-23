package com.example.jordan.ppe4_androidbdd;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TabHost;

public class MainActivity extends AppCompatActivity {

    /*private LogementDAO maBddLogement;*/

    public void CliqueAddButton (View view) {
        startActivity(new Intent(this, AjoutLogement.class));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("Main", "CREATION de l'activite principale");
        setContentView(R.layout.activity_main);


        /*maBddLogement = new LogementDAO(getApplicationContext());

        if (maBddLogement.getDb() != null) {

            Log.i("BDD", "récupération des clients présents en BDD");

            maBddLogement.open();*/

/* parcourir le liste des clients de la BDD et les mettre dans le camping*/

            /*maBddLogement.close();
        }*/
    }

    public void CliqueListeButton (View view) {
        startActivity(new Intent(this, ListeLogement.class));
    }


}
