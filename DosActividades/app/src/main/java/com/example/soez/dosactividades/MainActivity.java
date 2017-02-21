package com.example.soez.dosactividades;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.util.Log;


public class MainActivity extends AppCompatActivity {

    private Button botonPrincipal;
    private TextView textoResultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        Log.d("Vicente.DosActividades","Inicio onCreate");

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botonPrincipal = (Button) findViewById(R.id.botonPrincipal);
        textoResultado = (TextView) findViewById(R.id.MuestraResultado);

        botonPrincipal.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Log.d("Vicente.DosActividades","Boton principal pulsado");
                
            }
        });
    }


}