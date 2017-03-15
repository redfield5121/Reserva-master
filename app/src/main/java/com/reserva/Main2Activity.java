package com.reserva;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.TextView;

public class Main2Activity extends Activity {

    String nombre = "";
    String fecha = "";
    TextView texto;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        texto = (TextView) findViewById(R.id.texto);
        Bundle recibe = new Bundle();
        recibe = getIntent().getExtras();

        nombre = recibe.getString("nombre");
        fecha = recibe.getString("fecha");

        texto.setText("Confirmar reservacion" +
                "nombre: "+nombre + "fecha: "+ fecha);

    }
    public void volver(View v){
        Intent intento= new Intent(this, MainActivity.class);
        startActivity(intento);
    }



}
