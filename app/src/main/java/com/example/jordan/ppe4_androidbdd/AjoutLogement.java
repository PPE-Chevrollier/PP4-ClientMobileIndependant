package com.example.jordan.ppe4_androidbdd;

import android.app.Activity;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TabHost;
import android.view.Menu;
import android.widget.Button;
import android.widget.Toast;

public class AjoutLogement extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ajout_logement);
        /*Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);*/

        Spinner spinnerA = (Spinner) findViewById(R.id.villes_spinnerA);
        Spinner spinnerS = (Spinner) findViewById(R.id.villes_spinnerS);
        Spinner spinnerC = (Spinner) findViewById(R.id.villes_spinnerC);
// Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.villes_array, android.R.layout.simple_spinner_item);
// Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
// Apply the adapter to the spinner
        spinnerA.setAdapter(adapter);
        spinnerS.setAdapter(adapter);
        spinnerC.setAdapter(adapter);


        class SpinnerActivity extends Activity implements AdapterView.OnItemSelectedListener {


            public void onItemSelected(AdapterView<?> parent, View view,
                                       int pos, long id) {
                Object item = parent.getItemAtPosition(pos);
            }

            public void onNothingSelected(AdapterView<?> parent) {
                // Another interface callback
            }
        }

        TabHost host = (TabHost)findViewById(R.id.tabHost);
        host.setup();

        //Tab 1
        TabHost.TabSpec spec = host.newTabSpec("Tableau numero 1");
        spec.setContent(R.id.Appartement);
        spec.setIndicator("Appartement");
        host.addTab(spec);
        Button btnAjouterA=(Button) findViewById(R.id.buttonAjouterAppartement);
        btnAjouterA.setOnClickListener(btnclick);

        //Tab 2
        spec = host.newTabSpec("Tableau numero 2");
        spec.setContent(R.id.Studio);
        spec.setIndicator("Studio");
        host.addTab(spec);
        Button btnAjouterS=(Button) findViewById(R.id.buttonAjouterStudio);
        btnAjouterS.setOnClickListener(btnclick);

        //Tab 3
        spec = host.newTabSpec("Tableau numero 3");
        spec.setContent(R.id.Chambrehabitant);
        spec.setIndicator("Chambre Habitant");
        host.addTab(spec);
        Button btnAjouterC=(Button) findViewById(R.id.buttonAjouterCCH);
        btnAjouterC.setOnClickListener(btnclick);


    }

    private View.OnClickListener btnclick = new View.OnClickListener() {
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.buttonAjouterAppartement:
/*le clic sur le bouton a eu lieu, qu'est-ce que l'on fait*/
                    Toast.makeText(getApplicationContext(), "Enregistrement de l'appartement en cours", Toast.LENGTH_SHORT).show();
//création d'un nouveau Client en récupérant les id des différents champs
//pour récupérer un élément par son id on utilise la méthode findViewById :
                    Logement lA = new Logement();
                    lA.setRue_logements(((EditText) findViewById(R.id.editTextRueAppartement)).getText().toString());
                    /*lA.setVille_logements(Integer.parseInt(((EditText) findViewById(R.id.editTextVilleAppartement)).getText().toString()));*/
                    lA.setCp_logements(Integer.parseInt(((EditText) findViewById(R.id.editTextCPAppartement)).getText().toString())); 
                    /*lA.setComplements_adresse_logements((char) Integer.parseInt(((EditText) findViewById(R.id.editTextComplementAdresseAppartement)).getText().toString()));*/
                    lA.setPrix_logements(Integer.parseInt(((EditText) findViewById(R.id.editTextPrixAppartement)).getText().toString()));
                    lA.setSurface_logements(Integer.parseInt(((EditText) findViewById(R.id.editTextVilleAppartement)).getText().toString()));
                    Toast.makeText(getApplicationContext(), lA.getRue_logements()+" \n"+lA.getVille_logements()+" \n"+lA.getCp_logements()+" \n"+lA.getPrix_logements()+" \n"+lA.getSurface_logements(), Toast.LENGTH_LONG).show();
                break;
                case R.id.buttonAjouterStudio:
/*le clic sur le bouton a eu lieu, qu'est-ce que l'on fait*/
                    Toast.makeText(getApplicationContext(), "Enregistrement du studio en cours", Toast.LENGTH_SHORT).show();
//création d'un nouveau Client en récupérant les id des différents champs
//pour récupérer un élément par son id on utilise la méthode findViewById :
                    Logement lS = new Logement();
                    lS.setRue_logements(((EditText) findViewById(R.id.editTextRueStudio)).getText().toString());
                    /*lS.setVille_logements(Integer.parseInt(((EditText) findViewById(R.id.editTextVilleStudio)).getText().toString()));*/
                    lS.setCp_logements(Integer.parseInt(((EditText) findViewById(R.id.editTextCPStudio)).getText().toString()));
                   /* lS.setComplements_adresse_logements((char) Integer.parseInt(((EditText) findViewById(R.id.editTextComplementAdresseStudio)).getText().toString()));*/
                    lS.setPrix_logements(Integer.parseInt(((EditText) findViewById(R.id.editTextPrixStudio)).getText().toString()));
                    lS.setSurface_logements(Integer.parseInt(((EditText) findViewById(R.id.editTextVilleStudio)).getText().toString()));
                    Toast.makeText(getApplicationContext(), lS.getRue_logements()+" \n"+lS.getVille_logements()+" \n"+lS.getCp_logements()+" ", Toast.LENGTH_LONG).show();
                    break;
                case R.id.buttonAjouterCCH:
/*le clic sur le bouton a eu lieu, qu'est-ce que l'on fait*/
                    Toast.makeText(getApplicationContext(), "Enregistrement de la chambre habitant en cours", Toast.LENGTH_SHORT).show();
//création d'un nouveau Client en récupérant les id des différents champs
//pour récupérer un élément par son id on utilise la méthode findViewById :
                    Logement lC = new Logement();
                    lC.setRue_logements(((EditText) findViewById(R.id.editTextRueCCH)).getText().toString());
                    /*lC.setVille_logements(Integer.parseInt(((EditText) findViewById(R.id.editTextVilleCCH)).getText().toString()));*/
                    lC.setCp_logements(Integer.parseInt(((EditText) findViewById(R.id.editTextCPCCH)).getText().toString()));
                   /* lC.setComplements_adresse_logements((char) Integer.parseInt(((EditText) findViewById(R.id.editTextComplementAdresseCCH)).getText().toString()));*/
                    lC.setPrix_logements(Integer.parseInt(((EditText) findViewById(R.id.editTextPrixCCH)).getText().toString()));
                    lC.setSurface_logements(Integer.parseInt(((EditText) findViewById(R.id.editTextVilleCCH)).getText().toString()));
                    Toast.makeText(getApplicationContext(), lC.getRue_logements()+" \n"+lC.getVille_logements()+" \n"+lC.getCp_logements()+" ", Toast.LENGTH_LONG).show();
                    break;
            }
        }

/* @Override
    public boolean onCreateOptionsMenu(Menu menu) {
         // Inflate the menu; this adds items to the action bar if it is present.
         getMenuInflater().inflate(R.menu.menu_main, menu);
         return true;
     }

     @Override
     public boolean onOptionsItemSelected(MenuItem item) {
         // Handle action bar item clicks here. The action bar will
         // automatically handle clicks on the Home/Up button, so long
         // as you specify a parent activity in AndroidManifest.xml.
         int id = item.getItemId();

         //noinspection SimplifiableIfStatement
         if (id == R.id.action_settings) {
             return true;
         }

         return super.onOptionsItemSelected(item);
     }*/

        /*FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/
            };
        }