package com.example.soez.tresactividades;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity {
    private int MenuPrincipal,MenuPregunta,MenuImagen;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        MenuPrincipal=1;
        MenuPregunta=2;
        MenuImagen=3;
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // para crear los menus (mejor definir constantes en vez 1234, 1235)

        menu.add(0, MenuPrincipal, 0, "Menú Principal").setIcon(android.R.drawable.ic_popup_sync);
        menu.add(0, MenuPregunta, 0, "Menú Pregunta").setIcon(android.R.drawable.ic_popup_sync);
        menu.add(0, MenuImagen, 0, "Menú Imagen").setIcon(android.R.drawable.ic_popup_sync);

        return true;

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // callback de una opcion del boton de menu
        if (item.getItemId() == MenuPrincipal) {

            Log.d("Vicente.TresActividades","Menú Principal comenzado");
            Toast.makeText(this, "Menú Principal", Toast.LENGTH_SHORT).show();

            Intent intencion1 = new Intent(Main3Activity.this, MainActivity.class);
            intencion1.putExtra("VengoDe","Main3Activity");
            Main3Activity.super.startActivity(intencion1);

        } else if (item.getItemId() == MenuPregunta) {

            Log.d("Vicente.TresActividades","Menú Pregunta comenzado");
            Toast.makeText(this, "Menú Pregunta", Toast.LENGTH_SHORT).show();

            Intent intencion2 = new Intent(Main3Activity.this, Main2Activity.class);
            intencion2.putExtra("VengoDe","Main3Activity");
            Main3Activity.super.startActivity(intencion2);

        }
        else if(item.getItemId() == MenuImagen){

            Log.d("Vicente.TresActividades","Me quedo en esta actividad");


        }
        return false;
    }

    @Override
    public void onBackPressed() {
        // deja sin efecto la tecla física BACK (volver)

        return;
    }
}
