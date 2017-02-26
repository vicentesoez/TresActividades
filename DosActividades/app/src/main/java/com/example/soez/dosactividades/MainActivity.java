package com.example.soez.dosactividades;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.util.Log;


public class MainActivity extends AppCompatActivity {

    private Button botonPrincipal, botonCompartir;
    private TextView textoResultado;
    int idBotonPrincipal = 3;
    private int respuesta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        Log.d("Vicente.DosActividades","Inicio onCreate");

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botonCompartir = (Button) findViewById(R.id.botonCompartir);
        botonCompartir.setVisibility(View.INVISIBLE);
        botonPrincipal = (Button) findViewById(R.id.botonPrincipal);
        textoResultado = (TextView) findViewById(R.id.MuestraResultado);

        botonPrincipal.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Log.d("Vicente.DosActividades","Boton principal pulsado");
                Intent intencion = new Intent(MainActivity.this, Main2Activity.class);
                intencion.putExtra("VengoDe","MainActivity");
                MainActivity.super.startActivityForResult(intencion, idBotonPrincipal);
            }
        });


    }

    protected void onActivityResult(int requestCode, int resultCode, Intent intentRespuesta) {
// si acaba la "otra" actividad
        if (requestCode == idBotonPrincipal) {
            Log.d("Vicente.DosActividades","Vuelta de la actividad 2");

            botonCompartir.setVisibility(View.VISIBLE);
            respuesta = intentRespuesta.getExtras().getInt("Valor");
            this.textoResultado.setText("Resultado = " + respuesta);

            botonCompartir.setOnClickListener(new View.OnClickListener(){
                public void onClick(View y){
                    Log.d("Vicente.DosActividades","Boton compartir pulsado");

                    Intent sendIntent = new Intent();
                    sendIntent.setAction(Intent.ACTION_SEND);
                    sendIntent.putExtra(Intent.EXTRA_TEXT, "He hecho una suma que ha dado " + respuesta);
                    sendIntent.setType("text/plain");
                    startActivity(sendIntent);

                }
            });


        }


    }
}