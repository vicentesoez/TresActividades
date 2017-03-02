package com.example.soez.tresactividades;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import static com.example.soez.tresactividades.R.color.colorAccent;

public class Main2Activity extends AppCompatActivity {

    private int MenuPrincipal,MenuPregunta,MenuImagen;
    private TextView pregunta,respuesta1,respuesta2,respuesta3,respuesta4;
    private Typeface tf;
    final Context context = this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        MenuPrincipal=1;
        MenuPregunta=2;
        MenuImagen=3;

        pregunta= (TextView) findViewById(R.id.pregunta);
        respuesta1= (TextView) findViewById(R.id.respuesta1);
        respuesta2= (TextView) findViewById(R.id.respuesta2);
        respuesta3= (TextView) findViewById(R.id.respuesta3);
        respuesta4= (TextView) findViewById(R.id.respuesta4);

        Typeface tf = Typeface.createFromAsset(this.getAssets(),"fonts/BEBAS___.TTF");

        pregunta.setTypeface(tf);
        respuesta1.setTypeface(tf);
        respuesta2.setTypeface(tf);
        respuesta3.setTypeface(tf);
        respuesta4.setTypeface(tf);


        respuesta1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View a) {
                respuesta1.setTextColor(getResources().getColor(R.color.yellow));

                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context);

                // set title
                alertDialogBuilder.setTitle("Opción pulsada");

                // set dialog message
                alertDialogBuilder
                        .setMessage("¿Seguro que quieres escoger ser un oso?")
                        .setCancelable(false)
                        .setPositiveButton("SI",new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,int id) {

                                respuesta2.setVisibility(View.INVISIBLE);
                                respuesta3.setVisibility(View.INVISIBLE);
                                respuesta4.setVisibility(View.INVISIBLE);
                                dialog.cancel();


                            }
                        })
                        .setNegativeButton("NO",new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {

                                respuesta1.setTextColor(getResources().getColor(R.color.orange));
                                dialog.cancel();
                            }
                        });

                // create alert dialog
                AlertDialog alertDialog = alertDialogBuilder.create();

                // show it
                alertDialog.show();
            }
        });

        respuesta2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View b) {
                respuesta2.setTextColor(getResources().getColor(R.color.yellow));

                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context);

                // set title
                alertDialogBuilder.setTitle("Opción pulsada");

                // set dialog message
                alertDialogBuilder
                        .setMessage("¿Seguro que quieres escoger ser un león?")
                        .setCancelable(false)
                        .setPositiveButton("SI",new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,int id) {

                                respuesta1.setVisibility(View.INVISIBLE);
                                respuesta3.setVisibility(View.INVISIBLE);
                                respuesta4.setVisibility(View.INVISIBLE);
                                dialog.cancel();


                            }
                        })
                        .setNegativeButton("NO",new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {

                                respuesta2.setTextColor(getResources().getColor(R.color.orange));
                                dialog.cancel();
                            }
                        });

                // create alert dialog
                AlertDialog alertDialog = alertDialogBuilder.create();

                // show it
                alertDialog.show();
            }
        });

        respuesta3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View c) {
                respuesta3.setTextColor(getResources().getColor(R.color.yellow));

                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context);

                // set title
                alertDialogBuilder.setTitle("Opción pulsada");

                // set dialog message
                alertDialogBuilder
                        .setMessage("¿Seguro que quieres escoger ser un elefante?")
                        .setCancelable(false)
                        .setPositiveButton("SI",new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,int id) {

                                respuesta1.setVisibility(View.INVISIBLE);
                                respuesta2.setVisibility(View.INVISIBLE);
                                respuesta4.setVisibility(View.INVISIBLE);
                                dialog.cancel();


                            }
                        })
                        .setNegativeButton("NO",new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {

                                respuesta3.setTextColor(getResources().getColor(R.color.orange));
                                dialog.cancel();
                            }
                        });

                // create alert dialog
                AlertDialog alertDialog = alertDialogBuilder.create();

                // show it
                alertDialog.show();
            }
        });

        respuesta4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View d) {
                respuesta4.setTextColor(getResources().getColor(R.color.yellow));

                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context);

                // set title
                alertDialogBuilder.setTitle("Opción pulsada");

                // set dialog message
                alertDialogBuilder
                        .setMessage("¿Seguro que quieres escoger ser un tiburón?")
                        .setCancelable(false)
                        .setPositiveButton("SI",new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,int id) {

                                respuesta1.setVisibility(View.INVISIBLE);
                                respuesta2.setVisibility(View.INVISIBLE);
                                respuesta3.setVisibility(View.INVISIBLE);
                                dialog.cancel();


                            }
                        })
                        .setNegativeButton("NO",new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {

                                respuesta4.setTextColor(getResources().getColor(R.color.orange));
                                dialog.cancel();
                            }
                        });

                // create alert dialog
                AlertDialog alertDialog = alertDialogBuilder.create();

                // show it
                alertDialog.show();
            }
        });

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

            Intent intencion1 = new Intent(Main2Activity.this, MainActivity.class);
            intencion1.putExtra("VengoDe","Main2Activity");
            Main2Activity.super.startActivity(intencion1);

        } else if (item.getItemId() == MenuPregunta) {

            Log.d("Vicente.TresActividades","Me quedo en esta actividad");



        }
        else if(item.getItemId() == MenuImagen){

            Log.d("Vicente.TresActividades","Menú Imagen comenzado");
            Toast.makeText(this, "Menú Imagen", Toast.LENGTH_SHORT).show();

            Intent intencion3 = new Intent(Main2Activity.this, Main3Activity.class);
            intencion3.putExtra("VengoDe","Main2Activity");
            Main2Activity.super.startActivity(intencion3);

        }
        return false;
    }

    @Override
    public void onBackPressed() {
        // deja sin efecto la tecla física BACK (volver)

        return;
    }
}
