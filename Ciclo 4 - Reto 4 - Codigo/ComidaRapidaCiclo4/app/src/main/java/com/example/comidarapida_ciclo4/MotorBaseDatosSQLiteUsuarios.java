package com.example.comidarapida_ciclo4;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class MotorBaseDatosSQLiteUsuarios extends SQLiteOpenHelper {


    public MotorBaseDatosSQLiteUsuarios(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        //------------------------------CREACION TABLA USUARIOS Y REGISTROS---------------------

        db.execSQL("CREATE TABLE usuarios (id INT, nombre TEXT, password INT)");

        db.execSQL("INSERT INTO usuarios VALUES (1, 'Camila', 2003)");
        db.execSQL("INSERT INTO usuarios VALUES (2, 'Juan', 1709)");
        db.execSQL("INSERT INTO usuarios VALUES (3, 'Santiago', 8805)");
        db.execSQL("INSERT INTO usuarios VALUES (4, 'Carlos', 3323)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        db.execSQL("DROP TABLE usuarios");

        onCreate(db);


    }
}
