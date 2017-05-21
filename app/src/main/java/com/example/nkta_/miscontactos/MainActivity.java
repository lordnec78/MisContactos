package com.example.nkta_.miscontactos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Contactos> contactos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        contactos=new ArrayList<Contactos>();
        contactos.add(new Contactos("Edgar Martínez","66664954","nkta_mtz@hotmail.com"));
        contactos.add(new Contactos("Edel Martínez","64298461","mknas@hotmail.com"));
        contactos.add(new Contactos("Ariel Enriquez","6345444","jariel@hotmail.com"));
        contactos.add(new Contactos("Antonio Palomares","642243456","a_paloares@hotmail.com"));
        contactos.add(new Contactos("Liliana Lagarda","642217839","lagardauson@hotmail.com"));


       // ListView ListContactos =(ListView)findViewById(R.id.ListContactos);

       // ListContactos.setAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, nombrescontactos));

        // ListContactos.setOnItemClickListener(new AdapterView.OnItemClickListener() {

       // });

    }
    public void verificar(View view) {

        setContentView(R.layout.activity_detalle_contacto);


    }
}
