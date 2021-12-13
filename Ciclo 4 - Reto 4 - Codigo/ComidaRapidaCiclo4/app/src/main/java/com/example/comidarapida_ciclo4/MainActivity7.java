package com.example.comidarapida_ciclo4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity7 extends AppCompatActivity {

    Cursor cursor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);

        //-------------------DATOS COMPARTIDOS-------------------

        TextView U = (TextView)findViewById(R.id.text_view_user);
        TextView P =(TextView)findViewById(R.id.text_view_password);

        Bundle datos = getIntent().getExtras();
        String nameUser = datos.getString("nameUser");
        U.setText(nameUser);

        int passwordUser = datos.getInt("passwordUser");
        P.setText(String.valueOf(passwordUser));

        //----------------BOTON PARA VOLVER A LA PANTALLA DE INICIO-------------------

        Button button_return = (Button) findViewById(R.id.button_return);
        button_return.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pasarPantalla = new Intent(getApplicationContext(),MainActivity1.class);
                startActivity(pasarPantalla);
            }
        });



        //----------------BASE DE DATOS ------------------------

        MotorBaseDatosSQLiteUsuarios conectar = new MotorBaseDatosSQLiteUsuarios(this, "UsuariosRegistrados",null,1);

        //Metodos CRUD

        SQLiteDatabase db_leer = conectar.getReadableDatabase();
        SQLiteDatabase db_escribir = conectar.getWritableDatabase();
        SQLiteDatabase db_modificar = conectar.getReadableDatabase();
        SQLiteDatabase db_eliminar = conectar.getReadableDatabase();


        //READ
        //-------------------------BOTON CON FUNCION DE LEER DATOS TABLA-------------------------

        TextView mostrar_base_datos_usuarios = (TextView) findViewById(R.id.text_usuarios_registrados);

        Button button_tabla_usuarios = (Button) findViewById(R.id.button_tabla_usuarios);
        button_tabla_usuarios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrar_base_datos_usuarios.setText("");

                //Para mostrar la tabla completa

                cursor = db_leer.rawQuery("SELECT * FROM usuarios", null);
                while(cursor.moveToNext()){
                    mostrar_base_datos_usuarios.append("ID: "+cursor.getInt(0)+" - Nombre: "+cursor.getString(1)+" - Contraseña: "+cursor.getInt(2)+"\n");
                }

                Context context = getApplicationContext();
                CharSequence text = "Mostrando usuarios registrados";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();

            }
        });


        //CREATE
        //-------BOTON CON FUNCION DE ESCRIBIR UN NUEVO REGISTRO EN LA BASE DE DATOS---------

        Button button_crear = (Button) findViewById(R.id.button_crear);
        button_crear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrar_base_datos_usuarios.setText("");

                db_escribir.execSQL("INSERT INTO usuarios VALUES (6,'Laura', 1234)");

                cursor = db_leer.rawQuery("SELECT * FROM usuarios", null);
                while(cursor.moveToNext()){
                    mostrar_base_datos_usuarios.append("ID: "+cursor.getInt(0)+" - Nombre: "+cursor.getString(1)+" - Contraseña: "+cursor.getInt(2)+"\n");
                }

                Context context = getApplicationContext();
                CharSequence text = "Agregando usuario 6";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();

            }
        });


        //UPDATE
        //--------------BOTON CON FUNCION DE EDITAR REGISTRO EN LA BASE DE DATOS-----------

        Button button_modificar = (Button) findViewById(R.id.button_modificar);
        button_modificar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrar_base_datos_usuarios.setText("");

                //Para modificar el nombre del usuario de Manuela a Santiago


                db_modificar.execSQL("UPDATE usuarios SET nombre = 'Pablo' WHERE id = 2");

                cursor = db_leer.rawQuery("SELECT * FROM usuarios", null);
                while(cursor.moveToNext()){
                    mostrar_base_datos_usuarios.append("ID: "+cursor.getInt(0)+" - Nombre: "+cursor.getString(1)+" - Contraseña: "+cursor.getInt(2)+"\n");
                }

                Context context = getApplicationContext();
                CharSequence text = "Modificando usuario 2";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();

            }
        });

        //DELETE
        //-------------BOTON CON FUNCION DE ELIMINAR REGISTRO EN LA BASE DE DATOS

        Button button_eliminar = (Button) findViewById(R.id.button_eliminar);
        button_eliminar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrar_base_datos_usuarios.setText("");

                //Para eliminar el nombre del usuario de Carlos

                db_eliminar.execSQL("DELETE FROM usuarios WHERE id = 4");

                cursor = db_leer.rawQuery("SELECT * FROM usuarios", null);
                while(cursor.moveToNext()){
                    mostrar_base_datos_usuarios.append("ID: "+cursor.getInt(0)+" - Nombre: "+cursor.getString(1)+" - Contraseña: "+cursor.getInt(2)+"\n");
                }

                Context context = getApplicationContext();
                CharSequence text = "Eliminando usuario 4";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();

            }
        });

















    }
}