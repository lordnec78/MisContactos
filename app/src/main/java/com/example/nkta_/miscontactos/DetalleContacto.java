package com.example.nkta_.miscontactos;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;

import java.net.URI;

public class DetalleContacto extends AppCompatActivity {

    private TextView Nombre;
    private TextView Telefono;
    private TextView Correo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_contacto);

        Bundle parametros = getIntent().getExtras();

        String nombre = parametros.getString(getResources().getString(R.string.pnombre));
        String telefono = parametros.getString(getResources().getString(R.string.ptelefono));
        String correo = parametros.getString(getResources().getString(R.string.pemail));

        Nombre = (TextView) findViewById(R.id.Nombre);
        Telefono = (TextView) findViewById(R.id.Telefono);
        Correo = (TextView) findViewById(R.id.Correo);

        Nombre.setText(nombre);
        Telefono.setText(telefono);
        Correo.setText(correo);
    }




}