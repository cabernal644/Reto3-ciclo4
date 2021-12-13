package com.example.comidarapida_ciclo4;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class MotorBaseDatosSQLiteProductos extends SQLiteOpenHelper {


    public MotorBaseDatosSQLiteProductos(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        //------------------------------CREACION TABLA PRODUCTOS Y REGISTROS---------------------

        db.execSQL("CREATE TABLE productos (id INT, titulo TEXT, descripcion TEXT, precio INT)");

        db.execSQL("INSERT INTO productos VALUES (1, 'Hamburguesa de la Casa', 'Deliciosa hamburguesa de la Casa, hecha con ingredientes naturales y de la mejor calidad. Esta compuesta por una cama de lechuga, carne de adobada de cerdo, huevo, trozos de queso mozzarella y tomate.', 22000)");
        db.execSQL("INSERT INTO productos VALUES (2, 'Hamburguesa Big', 'Deliciosa hamburguesa Big, hecha con ingredientes naturales y de la mejor calidad. Esta compuesta por una cama de albahaca, doble carne de adobada de cerdo, queso mozzarella y rabano.', 25000)");
        db.execSQL("INSERT INTO productos VALUES (3, 'Hamburguesa Black Edition', 'Deliciosa hamburguesa Black Edition, hecha con ingredientes naturales y de la mejor calidad. Esta compuesta por una cama de lechuga, carne de adobada de cerdo, queso cheddar y tomate. Ademas de nuestro pan artesanal Black', 28000)");
        db.execSQL("INSERT INTO productos VALUES (4, 'Hamburguesa Ranchera', 'Deliciosa hamburguesa Ranchera, hecha con ingredientes naturales y de la mejor calidad. Esta compuesta por una cama de zuchini, chorizo de cerdo, beacon y queso cheddar.', 25000)");
        db.execSQL("INSERT INTO productos VALUES (5, 'Hamburguesa Vegana', 'Deliciosa hamburguesa Vegana, hecha con ingredientes naturales y de la mejor calidad. Esta compuesta por una cama de lechuga y espinaca, fake meal (nuestra receta secreta), guacamole, trozos de albahaca, queso mozzarella y tomate.', 22000)");
        db.execSQL("INSERT INTO productos VALUES (6, 'Pizza de la Casa', 'Deliciosa pizza de la Casa, hecha con ingredientes naturales y de la mejor calidad. Esta compuesta por una masa hecha en la casa, queso mozzarella, pepperoni y aceitunas.', 20000)");
        db.execSQL("INSERT INTO productos VALUES (7, 'Pizza de Aceitunas y Albahaca', 'Deliciosa pizza de Aceitunas y Albahaca, hecha con ingredientes naturales y de la mejor calidad. Esta compuesta por una masa hecha en la casa, queso mozzarella, albahaca y aceitunas negras.', 20000)");
        db.execSQL("INSERT INTO productos VALUES (8, 'Pizza Gourmet', 'Deliciosa pizza Gourmet, hecha con ingredientes naturales y de la mejor calidad. Esta compuesta por una masa hecha en la casa, queso mozzarella, aceitunas, trozos de pimiento, albahaca y champiñones.', 25000)");
        db.execSQL("INSERT INTO productos VALUES (9, 'Pizza de Pepperoni', 'Deliciosa pizza de Pepperoni, hecha con ingredientes naturales y de la mejor calidad. Esta compuesta por una masa hecha en la casa, queso mozzarella y pepperoni.', 18000)");
        db.execSQL("INSERT INTO productos VALUES (10, 'Sandwich de la Casa', 'Delicioso sandwich de la Casa, hecho con ingredientes naturales y de la mejor calidad. Esta compuesta jamon serrano, queso mozzarella, lechuga fresca, tomate y nuestra deliciosa cebolla crunch.', 10000)");
        db.execSQL("INSERT INTO productos VALUES (11, 'Sandwich de Pepinillos', 'Delicioso sandwich de Pepinillos, hecho con ingredientes naturales y de la mejor calidad. Esta compuesta jamon de cordero, pavo, queso mozzarella, lechuga fresca, tomate y pepinillos.', 14000)");
        db.execSQL("INSERT INTO productos VALUES (12, 'Papas Fritas a la Francesa', 'Deliciosas papas a fritas, espolvoreadas con nuestro toque secreto.', 5000)");
        db.execSQL("INSERT INTO productos VALUES (13, 'Papas Fritas en Cascos', 'Deliciosas papas a fritas, espolvoreadas con nuestro toque secreto.', 5000)");
        db.execSQL("INSERT INTO productos VALUES (14, 'Gaseosa 300ml', 'Bebida carbonatada de su preferencia, para acompañar las mejores comidas.', 3000)");
        db.execSQL("INSERT INTO productos VALUES (15, 'Malteada de Fresa', 'BDeliciosa malteada de Fresa, para acompañar las mejores comidas.', 6000)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        db.execSQL("DROP TABLE productos");
        onCreate(db);

    }
}
