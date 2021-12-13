package com.example.comidarapida_ciclo4;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        //----------------BASE DE DATOS ------------------------

        MotorBaseDatosSQLiteUsuarios conectar = new MotorBaseDatosSQLiteUsuarios(this, "UsuariosRegistrados",null,1);

        //CREATE
        //-------ESCRIBIR UN NUEVO REGISTRO EN LA BASE DE DATOS---------

        SQLiteDatabase db_escribir = conectar.getWritableDatabase();

        conectar.onUpgrade(db_escribir,1,2);


        //-----------DATOS QUE SERAN ENVIADOS A LA OTRA PANTALLA----------------

        EditText nameUser = (EditText) findViewById(R.id.text_name);
        EditText passwordUser = (EditText) findViewById(R.id.text_password);

        Button botonIngresar = (Button) findViewById(R.id.button_signin);
        botonIngresar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {


                //CREATE
                //-------ESCRIBIR UN NUEVO REGISTRO EN LA BASE DE DATOS, EL NOMBRE Y CONTRASEÑA---------

                //Creamos el registro a insertar como objeto ContentValues
                ContentValues nuevoRegistro = new ContentValues();
                nuevoRegistro.put("id", 5);
                nuevoRegistro.put("nombre", nameUser.getText().toString());
                nuevoRegistro.put("password", Integer.parseInt(passwordUser.getText().toString()));

                //Insertamos el registro en la base de datos
                db_escribir.insert("usuarios", null, nuevoRegistro);


                //---------------PASAR PANTALLA LLEVANDO DATOS--------------

                Intent pasarPantalla = new Intent(getApplicationContext(), MainActivity7.class);
                    pasarPantalla.putExtra("nameUser", nameUser.getText().toString());
                    pasarPantalla.putExtra("passwordUser", Integer.parseInt(passwordUser.getText().toString()));
                startActivity(pasarPantalla);

                //----------------MENSAJE TOAST PARTE INFERIOR----------------

                Context context = getApplicationContext();
                CharSequence text = "Registrando...";
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