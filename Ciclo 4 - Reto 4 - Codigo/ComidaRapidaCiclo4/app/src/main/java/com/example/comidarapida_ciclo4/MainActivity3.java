package com.example.comidarapida_ciclo4;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }

    //----------------------MENU OPCIONES------------------------

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menuopciones, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if (id==R.id.option00){
            Intent pasarPantalla = new Intent(getApplicationContext(),MainActivity6.class);
            startActivity(pasarPantalla);
            Toast.makeText(this,"Oprimio Iniciar Sesión", Toast.LENGTH_LONG).show();
        }
        if (id==R.id.option01){
            Intent pasarPantalla = new Intent(getApplicationContext(),MainActivity2.class);
            startActivity(pasarPantalla);
            Toast.makeText(this,"Oprimio Menú", Toast.LENGTH_LONG).show();
        }
        if (id==R.id.option02){
            Intent pasarPantalla = new Intent(getApplicationContext(),MainActivity3.class);
            startActivity(pasarPantalla);
            Toast.makeText(this,"Oprimio Cupones", Toast.LENGTH_LONG).show();
        }
        if (id==R.id.option03){
            Intent pasarPantalla = new Intent(getApplicationContext(),MainActivity4.class);
            startActivity(pasarPantalla);
            Toast.makeText(this,"Oprimio Sucursales", Toast.LENGTH_LONG).show();
        }
        if (id==R.id.option04){
            Intent pasarPantalla = new Intent(getApplicationContext(),MainActivity5.class);
            startActivity(pasarPantalla);
            Toast.makeText(this,"Oprimio Acerca de...", Toast.LENGTH_LONG).show();
        }
        return super.onOptionsItemSelected(item);
    }

}