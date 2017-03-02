package com.example.soez.tresactividades;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import static com.example.soez.tresactividades.R.id.activity_main3;

public class Main3Activity extends AppCompatActivity {

    private int MenuPrincipal,MenuPregunta,MenuImagen;
    private TextView subeimagen, pulsa;
    private Intent intent;
    public static final int GET_FROM_GALLERY = 3;
    private RelativeLayout lay;
    private ImageView imagen;
    private Bitmap bitmap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        MenuPrincipal = 1;
        MenuPregunta = 2;
        MenuImagen = 3;

        subeimagen = (TextView) findViewById(R.id.subeimagen);
        pulsa = (TextView) findViewById(R.id.pulsa);
        imagen= (ImageView) findViewById(R.id.imageView);

        Typeface tf = Typeface.createFromAsset(this.getAssets(), "fonts/BEBAS___.TTF");
        subeimagen.setTypeface(tf);

        lay = (RelativeLayout) findViewById(activity_main3);
        lay.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

                intent = new Intent();
                intent.setType("image/*");
                intent.setAction(Intent.ACTION_GET_CONTENT);
                startActivityForResult(Intent.createChooser(intent, "Select Picture"), GET_FROM_GALLERY);

            }
        });

    }


    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        try {
            switch (requestCode) {

                case GET_FROM_GALLERY:
                    if (resultCode == Activity.RESULT_OK) {
                        //data gives you the image uri. Try to convert that to bitmap
                        Uri imageUri = data.getData();
                        bitmap = MediaStore.Images.Media.getBitmap(this.getContentResolver(), imageUri);
                        imagen.setImageBitmap(bitmap);
                        subeimagen.setVisibility(View.INVISIBLE);
                        pulsa.setVisibility(View.INVISIBLE);


                        break;

                    } else if (resultCode == Activity.RESULT_CANCELED) {
                        Log.d("Vicente.Main3activity", "Selecting picture cancelled");
                    }
                    break;
            }
        } catch (Exception e) {
            Log.d("Vicente.Main3activity","Exception in onActivityResult : " + e.getMessage());

        }
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
