package com.example.comidarapida_ciclo4;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    Cursor cursor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        //-------------------BASE DE DATOS------------------------

        MotorBaseDatosSQLiteProductos conectar = new MotorBaseDatosSQLiteProductos(this, "TiendaProductos",null,1);



        //-------ESCRIBIR UN NUEVO REGISTRO EN LA BASE DE DATOS---------

        SQLiteDatabase db_escribir = conectar.getWritableDatabase();
        /*
        db_escribir.execSQL("INSERT INTO productos VALUES (6,'Nuevo producto', 'Descripcion nuevo producto', 1000)");
         */

        conectar.onUpgrade(db_escribir,1,2);




    //-------------------------BOTONES CON FUNCION DE LEER DATOS TABLA-------------------------

        SQLiteDatabase db_leer = conectar.getReadableDatabase();
        TextView mostrar_base_datos_titulo = (TextView) findViewById(R.id.text_titulo);
        TextView mostrar_base_datos_descripcion = (TextView) findViewById(R.id.text_descripcion);
        TextView mostrar_base_datos_precio = (TextView) findViewById(R.id.text_precio);
        TextView mostrar_toda = (TextView) findViewById(R.id.textView2);


        /*
        //Para mostrar la tabla completa
        cursor = db_leer.rawQuery("SELECT * FROM productos", null);
        while(cursor.moveToNext()){
            mostrar_toda.append(cursor.getInt(0)+cursor.getString(1)+cursor.getString(2)+cursor.getInt(3)+"\n");
        }
         */



        ImageButton button05 = (ImageButton) findViewById(R.id.button05);
        button05.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                cursor = db_leer.rawQuery("SELECT * FROM productos WHERE id= 1", null);
                while(cursor.moveToNext()){
                    mostrar_base_datos_titulo.setText(cursor.getString(1));
                    mostrar_base_datos_descripcion.setText(cursor.getString(2));
                    mostrar_base_datos_precio.setText("Precio: $ "+cursor.getInt(3));
                }
            }
        });

        ImageButton button06 = (ImageButton) findViewById(R.id.button06);
        button06.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                cursor = db_leer.rawQuery("SELECT * FROM productos WHERE id= 2", null);
                while(cursor.moveToNext()){
                    mostrar_base_datos_titulo.setText(cursor.getString(1));
                    mostrar_base_datos_descripcion.setText(cursor.getString(2));
                    mostrar_base_datos_precio.setText("Precio: $ "+cursor.getInt(3));
                }
            }
        });

        ImageButton button07 = (ImageButton) findViewById(R.id.button07);
        button07.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                cursor = db_leer.rawQuery("SELECT * FROM productos WHERE id= 3", null);
                while(cursor.moveToNext()){
                    mostrar_base_datos_titulo.setText(cursor.getString(1));
                    mostrar_base_datos_descripcion.setText(cursor.getString(2));
                    mostrar_base_datos_precio.setText("Precio: $ "+cursor.getInt(3));
                }
            }
        });

        ImageButton button08 = (ImageButton) findViewById(R.id.button08);
        button08.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                cursor = db_leer.rawQuery("SELECT * FROM productos WHERE id= 4", null);
                while(cursor.moveToNext()){
                    mostrar_base_datos_titulo.setText(cursor.getString(1));
                    mostrar_base_datos_descripcion.setText(cursor.getString(2));
                    mostrar_base_datos_precio.setText("Precio: $ "+cursor.getInt(3));
                }
            }
        });

        ImageButton button09 = (ImageButton) findViewById(R.id.button09);
        button09.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                cursor = db_leer.rawQuery("SELECT * FROM productos WHERE id= 5", null);
                while(cursor.moveToNext()){
                    mostrar_base_datos_titulo.setText(cursor.getString(1));
                    mostrar_base_datos_descripcion.setText(cursor.getString(2));
                    mostrar_base_datos_precio.setText("Precio: $ "+cursor.getInt(3));

                }
            }
        });

        ImageButton button10 = (ImageButton) findViewById(R.id.button10);
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                cursor = db_leer.rawQuery("SELECT * FROM productos WHERE id= 6", null);
                while(cursor.moveToNext()){
                    mostrar_base_datos_titulo.setText(cursor.getString(1));
                    mostrar_base_datos_descripcion.setText(cursor.getString(2));
                    mostrar_base_datos_precio.setText("Precio: $ "+cursor.getInt(3));

                }
            }
        });

        ImageButton button11 = (ImageButton) findViewById(R.id.button11);
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                cursor = db_leer.rawQuery("SELECT * FROM productos WHERE id= 7", null);
                while(cursor.moveToNext()){
                    mostrar_base_datos_titulo.setText(cursor.getString(1));
                    mostrar_base_datos_descripcion.setText(cursor.getString(2));
                    mostrar_base_datos_precio.setText("Precio: $ "+cursor.getInt(3));

                }
            }
        });

        ImageButton button12 = (ImageButton) findViewById(R.id.button12);
        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                cursor = db_leer.rawQuery("SELECT * FROM productos WHERE id= 8", null);
                while(cursor.moveToNext()){
                    mostrar_base_datos_titulo.setText(cursor.getString(1));
                    mostrar_base_datos_descripcion.setText(cursor.getString(2));
                    mostrar_base_datos_precio.setText("Precio: $ "+cursor.getInt(3));

                }
            }
        });

        ImageButton button13 = (ImageButton) findViewById(R.id.button13);
        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                cursor = db_leer.rawQuery("SELECT * FROM productos WHERE id= 9", null);
                while(cursor.moveToNext()){
                    mostrar_base_datos_titulo.setText(cursor.getString(1));
                    mostrar_base_datos_descripcion.setText(cursor.getString(2));
                    mostrar_base_datos_precio.setText("Precio: $ "+cursor.getInt(3));

                }
            }
        });

        ImageButton button14 = (ImageButton) findViewById(R.id.button14);
        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                cursor = db_leer.rawQuery("SELECT * FROM productos WHERE id= 10", null);
                while(cursor.moveToNext()){
                    mostrar_base_datos_titulo.setText(cursor.getString(1));
                    mostrar_base_datos_descripcion.setText(cursor.getString(2));
                    mostrar_base_datos_precio.setText("Precio: $ "+cursor.getInt(3));

                }
            }
        });

        ImageButton button15 = (ImageButton) findViewById(R.id.button15);
        button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                cursor = db_leer.rawQuery("SELECT * FROM productos WHERE id= 11", null);
                while(cursor.moveToNext()){
                    mostrar_base_datos_titulo.setText(cursor.getString(1));
                    mostrar_base_datos_descripcion.setText(cursor.getString(2));
                    mostrar_base_datos_precio.setText("Precio: $ "+cursor.getInt(3));

                }
            }
        });

        ImageButton button16 = (ImageButton) findViewById(R.id.button16);
        button16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                cursor = db_leer.rawQuery("SELECT * FROM productos WHERE id= 12", null);
                while(cursor.moveToNext()){
                    mostrar_base_datos_titulo.setText(cursor.getString(1));
                    mostrar_base_datos_descripcion.setText(cursor.getString(2));
                    mostrar_base_datos_precio.setText("Precio: $ "+cursor.getInt(3));

                }
            }
        });

        ImageButton button17 = (ImageButton) findViewById(R.id.button17);
        button17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                cursor = db_leer.rawQuery("SELECT * FROM productos WHERE id= 13", null);
                while(cursor.moveToNext()){
                    mostrar_base_datos_titulo.setText(cursor.getString(1));
                    mostrar_base_datos_descripcion.setText(cursor.getString(2));
                    mostrar_base_datos_precio.setText("Precio: $ "+cursor.getInt(3));

                }
            }
        });

        ImageButton button18 = (ImageButton) findViewById(R.id.button18);
        button18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                cursor = db_leer.rawQuery("SELECT * FROM productos WHERE id= 14", null);
                while(cursor.moveToNext()){
                    mostrar_base_datos_titulo.setText(cursor.getString(1));
                    mostrar_base_datos_descripcion.setText(cursor.getString(2));
                    mostrar_base_datos_precio.setText("Precio: $ "+cursor.getInt(3));

                }
            }
        });

        ImageButton button19 = (ImageButton) findViewById(R.id.button19);
        button19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                cursor = db_leer.rawQuery("SELECT * FROM productos WHERE id= 15", null);
                while(cursor.moveToNext()){
                    mostrar_base_datos_titulo.setText(cursor.getString(1));
                    mostrar_base_datos_descripcion.setText(cursor.getString(2));
                    mostrar_base_datos_precio.setText("Precio: $ "+cursor.getInt(3));

                }
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