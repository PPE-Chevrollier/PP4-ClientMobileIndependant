package com.example.jordan.ppe4_androidbdd;

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
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

    private static final int SELECTED_PICTURE = 1;

    EditText rue_logements, cp_logements, complements_adresse_logements, prix_logements, surface_logements;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ajout_logement);


        /*Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);*/

        rue_logements=(EditText) findViewById(R.id.editTextRueAppartement);
        cp_logements=(EditText) findViewById(R.id.editTextCPAppartement);
        complements_adresse_logements=(EditText) findViewById(R.id.editTextComplementAdresseAppartement);
        prix_logements=(EditText) findViewById(R.id.editTextPrixAppartement);
        surface_logements=(EditText) findViewById(R.id.editTextSurfaceAppartement);

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
                    Appartements A1 = new Appartements();
                    A1.setRue_logements(((EditText) findViewById(R.id.editTextRueAppartement)).getText().toString());
                    /*A1.setVille_logements(Integer.parseInt(((EditText) findViewById(R.id.editTextVilleAppartement)).getText().toString()));*/
                    A1.setCp_logements(Integer.parseInt(((EditText) findViewById(R.id.editTextCPAppartement)).getText().toString()));
                    A1.setComplements_adresse_logements(((EditText) findViewById(R.id.editTextComplementAdresseAppartement)).getText().toString());
                    A1.setPrix_logements(Integer.parseInt(((EditText) findViewById(R.id.editTextPrixAppartement)).getText().toString()));
                    A1.setSurface_logements(Integer.parseInt(((EditText) findViewById(R.id.editTextSurfaceAppartement)).getText().toString()));
                    A1.setNb_places_appartements(Integer.parseInt(((EditText) findViewById(R.id.editTextNbPlacesAppartement)).getText().toString()));
                    A1.setNb_chambres_appartements(Integer.parseInt(((EditText) findViewById(R.id.editTextNbChambresAppartement)).getText().toString()));
                    Toast.makeText(getApplicationContext(),"Nom de la rue: "+A1.getRue_logements()+" \nCode Postal: "+A1.getCp_logements()+" \nComplement adresse: "+A1.getComplements_adresse_logements()+" \nPrix: "+A1.getPrix_logements()+"€ \nSurface: "+A1.getSurface_logements()+" m² \nNombres de places: "+A1.getNb_places_appartements()+" \nNombres de chambres: "+A1.getNb_chambres_appartements(), Toast.LENGTH_LONG).show();
                    Log.d("Appartement",A1.toString());
                    /*l.inserer(A1);*/

                break;
                case R.id.buttonAjouterStudio:
/*le clic sur le bouton a eu lieu, qu'est-ce que l'on fait*/
                    Toast.makeText(getApplicationContext(), "Enregistrement du studio en cours", Toast.LENGTH_SHORT).show();

                    Studios S1 = new Studios();
                    S1.setRue_logements(((EditText) findViewById(R.id.editTextRueStudio)).getText().toString());
                    /*S1.setVille_logements(Integer.parseInt(((EditText) findViewById(R.id.editTextVilleStudio)).getText().toString()));*/
                    S1.setCp_logements(Integer.parseInt(((EditText) findViewById(R.id.editTextCPStudio)).getText().toString()));
                    S1.setComplements_adresse_logements(((EditText) findViewById(R.id.editTextComplementAdresseStudio)).getText().toString());
                    S1.setPrix_logements(Integer.parseInt(((EditText) findViewById(R.id.editTextPrixStudio)).getText().toString()));
                    S1.setSurface_logements(Integer.parseInt(((EditText) findViewById(R.id.editTextSurfaceStudio)).getText().toString()));
                    S1.setMeuble_studios(Integer.parseInt(((EditText) findViewById(R.id.editTextMeubleStudio)).getText().toString()));
                    Toast.makeText(getApplicationContext(),"Nom de la rue: "+S1.getRue_logements()+" \nCode Postal: "+S1.getCp_logements()+" \nComplement adresse: "+S1.getComplements_adresse_logements()+" \nPrix: "+S1.getPrix_logements()+"€ \nSurface: "+S1.getSurface_logements()+" m² \nStudio meublés: "+S1.getMeuble_studios(), Toast.LENGTH_LONG).show();
                    Log.d("Studio",S1.toString());
                   /* l.inserer(S1);*/
                break;
                case R.id.buttonAjouterCCH:
/*le clic sur le bouton a eu lieu, qu'est-ce que l'on fait*/
                    Toast.makeText(getApplicationContext(), "Enregistrement de la chambre habitant en cours", Toast.LENGTH_SHORT).show();
//création d'un nouveau Client en récupérant les id des différents champs
//pour récupérer un élément par son id on utilise la méthode findViewById :
                    chambresHabitant CH1 = new chambresHabitant();
                    CH1.setRue_logements(((EditText) findViewById(R.id.editTextRueCCH)).getText().toString());
                    /*CH1.setVille_logements(Integer.parseInt(((EditText) findViewById(R.id.editTextVilleCCH)).getText().toString()));*/
                    CH1.setCp_logements(Integer.parseInt(((EditText) findViewById(R.id.editTextCPCCH)).getText().toString()));
                    CH1.setComplements_adresse_logements(((EditText) findViewById(R.id.editTextComplementAdresseCCH)).getText().toString());
                    CH1.setPrix_logements(Integer.parseInt(((EditText) findViewById(R.id.editTextPrixCCH)).getText().toString()));
                    CH1.setSurface_logements(Integer.parseInt(((EditText) findViewById(R.id.editTextSurfaceCCH)).getText().toString()));
                    /*CH1.setParties_communes_chambreshabitant(((EditText) findViewById(R.id.editTextPrixCCH)).getText().toString()));*/
                    Toast.makeText(getApplicationContext(),"Nom de la rue: "+CH1.getRue_logements()+" \nCode Postal: "+CH1.getCp_logements()+" \nComplement adresse: "+CH1.getComplements_adresse_logements()+" \nPrix: "+CH1.getPrix_logements()+"€ \nSurface: "+CH1.getSurface_logements()+" m² \nParties communes: "+CH1.getParties_communes_chambreshabitant(), Toast.LENGTH_LONG).show();
                    Log.d("Chambre chez l'habitant",CH1.toString());
                    /*l.inserer(CH1);*/
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

    public void fab(View v){
        Intent i = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
        startActivityForResult(i, SELECTED_PICTURE);
    }
@Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        switch (requestCode) {
            case SELECTED_PICTURE: {
                if (resultCode == RESULT_OK && data != null && data.getData() != null) {
                    Uri uri = data.getData();
                    String[] projection = {MediaStore.Images.Media.DATA};

                    Cursor cursor=getContentResolver().query(uri, projection, null, null, null);
                    cursor.moveToFirst();

                    int columnIndex=cursor.getColumnIndex(projection[0]);
                    String filePath=cursor.getString(columnIndex);
                    cursor.close();

                    Bitmap yourSelectedImage= BitmapFactory.decodeFile(filePath);
                    Drawable d = new BitmapDrawable(yourSelectedImage);


                }

            }
                break;
            }
        }
    }
