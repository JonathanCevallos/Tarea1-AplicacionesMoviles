package com.example.practica2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SaludoActivity extends AppCompatActivity {
    TextView msj;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saludo);
        msj=(TextView) findViewById(R.id.txtSaludo);
        Bundle bRecibe = this.getIntent().getExtras();
        if(bRecibe!=null){
            String  nombre=bRecibe.getString("NOMBRE");
            String  FechaNacimiento=bRecibe.getString("FECHANACIMIENTO");
            String  telefono=bRecibe.getString("TELEFONO");
            String  genero=bRecibe.getString("GENERO");
            msj.setText("Bienvenido: "+nombre+"\n"+"Genero: "+genero+"\n"+"Tu fecha de Nacimiento es: "+FechaNacimiento+"\n"+"Tu Telefono es: "+telefono);
        }
    }

    public void onclick(View view) {
        finish();
    }
}