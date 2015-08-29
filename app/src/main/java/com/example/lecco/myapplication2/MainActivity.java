package com.example.lecco.myapplication2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView texto;
    EditText nombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        texto = (TextView) findViewById(R.id.lbltextoSuperior);
        nombre = (EditText) findViewById(R.id.txtnombre);
        Button boton = (Button) findViewById(R.id.btnaceptar);
        texto.setText("Hola a todos");
    }

    public void tomarNombre(View v) {
        String nom = nombre.getText().toString();
        texto.setText(nom);
    }
}