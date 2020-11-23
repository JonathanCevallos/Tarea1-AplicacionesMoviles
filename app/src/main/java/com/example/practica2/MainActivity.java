package com.example.practica2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {
    String cadena = "";
    RadioButton rbMasculino, rbFemenino;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnEnviar(View view) {
        EditText txtNombre = (EditText) findViewById(R.id.txtNombre);
        EditText txtFechaNacimiento = (EditText) findViewById(R.id.txtFechaNacimiento);
        EditText txtTelefono = (EditText)findViewById(R.id.txtTelefono);
        rbMasculino= (RadioButton)findViewById(R.id.rbMasculino);
        rbFemenino= (RadioButton)findViewById(R.id.rbFemenino);
        validar();
        Intent intent = new Intent(this, SaludoActivity.class);
        Bundle b = new Bundle();
        b.putString("NOMBRE", txtNombre.getText().toString());
        b.putString("FECHANACIMIENTO", txtFechaNacimiento.getText().toString());
        b.putString("TELEFONO", txtTelefono.getText().toString());
        b.putString("GENERO", cadena);
        intent.putExtras(b);
        startActivity(intent);
    }

    public void validar() {

        if (rbMasculino.isChecked() == true)
            cadena = "Masculino";
        {
            if (rbFemenino.isChecked() == true)
                cadena = "Femenino";
        }
    }


}
