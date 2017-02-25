package com.example.soez.dosactividades;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {

    private EditText numero1,numero2;
    private Button botonResultado;
    private int resultado,valor1,valor2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Log.d("Vicente.DosActividades","Inicio onCreate 2");

        botonResultado = (Button) findViewById(R.id.botonResultado);
        numero1 = (EditText) findViewById(R.id.numero1);
        numero2 = (EditText) findViewById(R.id.numero2);

        botonResultado.setOnClickListener(new View.OnClickListener(){
            public void onClick(View c){
                Log.d("Vicente.DosActividades","boton solve pulsado");
                valor1 = Integer.parseInt(numero1.getText().toString());
                valor2 = Integer.parseInt(numero2.getText().toString());

                resultado = valor1 + valor2;
                Log.d("Vicente.DosActividades","Resultado = " + valor1 + " + " + valor2 + " = " + resultado);

                Intent resultadoIntencion = new Intent();
                resultadoIntencion.putExtra("Valor",resultado);
                setResult(RESULT_OK, resultadoIntencion);
                finish();

            }
        });




    }
}
