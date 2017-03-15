package com.reserva;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by CECyT9 on 15/03/2017.
 */

public class Login extends Activity {
    String nombre = "Erick";
    String contra = "dragonball";
    EditText password, name;
    TextView error;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        name = (EditText) findViewById(R.id.nombre);
        password = (EditText) findViewById(R.id.contra);
        error=(TextView) findViewById(R.id.texto);

    }
    public void inicio(View v){
        if(name.getText().toString().equals(nombre)&&password.getText().toString().equals(contra)){
            Intent intento = new Intent(this, MainActivity.class);
            startActivity(intento);

        }else{
            error.setText("datos incorrectos");
        }

    }
}

