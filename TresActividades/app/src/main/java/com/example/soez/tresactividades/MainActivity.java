package com.example.soez.tresactividades;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int Actividad1,Actividad2,Actividad3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Actividad1=1;
        Actividad2=2;
        Actividad3=3;
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // para crear los menus (mejor definir constantes en vez 1234, 1235)

        menu.add(0, Actividad1, 0, "Actividad1").setIcon(android.R.drawable.ic_popup_sync);
        menu.add(0, Actividad2, 0, "Actividad2").setIcon(android.R.drawable.ic_popup_sync);
        menu.add(0, Actividad3, 0, "Actividad3").setIcon(android.R.drawable.ic_popup_sync);

        return true;

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // callback de una opcion del boton de menu
        if (item.getItemId() == Actividad1) {

            Log.d("Vicente.TresActividades","Me quedo en esta actividad");
            Toast.makeText(this, "Actividad1", Toast.LENGTH_LONG).show();


        } else if (item.getItemId() == Actividad2) {

            Log.d("Vicente.TresActividades","Actividad2 comenzada");
            Toast.makeText(this, "Actividad2", Toast.LENGTH_LONG).show();

            Intent intencion2 = new Intent(MainActivity.this, Main2Activity.class);
            intencion2.putExtra("VengoDe","MainActivity");
            MainActivity.super.startActivity(intencion2);

        }
        else if(item.getItemId() == Actividad3){

            Log.d("Vicente.TresActividades","Actividad3 comenzada");
            Toast.makeText(this, "Actividad3", Toast.LENGTH_LONG).show();

            Intent intencion3 = new Intent(MainActivity.this, Main3Activity.class);
            intencion3.putExtra("VengoDe","MainActivity");
            MainActivity.super.startActivity(intencion3);

        }
        return false;
    }

    @Override
    public void onBackPressed() {
        // deja sin efecto la tecla física BACK (volver)

        return;
    }
}
