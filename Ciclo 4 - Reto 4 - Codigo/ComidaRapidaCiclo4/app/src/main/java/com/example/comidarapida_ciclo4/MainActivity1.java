package com.example.comidarapida_ciclo4;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity1 extends AppCompatActivity{

    Cursor cursor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);




        //---------------------BOTONES-----------------------------

        ImageButton button01 = (ImageButton) findViewById(R.id.button01);
        button01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pasarPantalla = new Intent(getApplicationContext(),MainActivity2.class);
                startActivity(pasarPantalla);

                Context context = getApplicationContext();
                CharSequence text = "Oprimio Menú";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });


        ImageButton button02 = (ImageButton) findViewById(R.id.button02);
        button02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pasarPantalla = new Intent(getApplicationContext(),MainActivity3.class);
                startActivity(pasarPantalla);

                Context context = getApplicationContext();
                CharSequence text = "Oprimio Cupones";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });

        ImageButton button03 = (ImageButton) findViewById(R.id.button03);
        button03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pasarPantalla = new Intent(getApplicationContext(),MainActivity4.class);
                startActivity(pasarPantalla);

                Context context = getApplicationContext();
                CharSequence text = "Oprimio Sucursales";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });

        Button button04 = (Button) findViewById(R.id.button04);
        button04.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pasarPantalla = new Intent(getApplicationContext(),MainActivity5.class);
                startActivity(pasarPantalla);

                Context context = getApplicationContext();
                CharSequence text = "Oprimio Acerca de...";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });


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