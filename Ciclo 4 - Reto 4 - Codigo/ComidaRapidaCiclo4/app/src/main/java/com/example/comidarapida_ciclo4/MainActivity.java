package com.example.comidarapida_ciclo4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements Runnable{

    Thread h1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView splash_image = (ImageView) findViewById(R.id.splash_image);

        h1 = new Thread(this);
        h1.start();

    }

    @Override
    public void run() {
        try {
            Thread.sleep(4000);
            Intent pasarPantalla = new Intent(getApplicationContext(), MainActivity1.class);
            startActivity(pasarPantalla);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}