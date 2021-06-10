package com.svalero.diabecare_frontend;

// BLASCO SAZ, JOSE ANTONIO 2ºSI

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

import com.svalero.diabecare_frontend.Home.RatioCalculator;
import com.svalero.diabecare_frontend.Login.LoginActivity;


public class MainActivity extends AppCompatActivity {
    private static final int SCREEN=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                //Write whatever to want to do after delay specified (1 sec)
                Intent pantalla = new Intent(getBaseContext(),
                        LoginActivity.class);
                startActivity(pantalla);
                // Threads--> Clase
                // Runnable-->Interfaz
            }
        }, 3200);


    }
}