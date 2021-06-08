package com.svalero.diabecare_frontend.Login;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.svalero.diabecare_frontend.R;

public class LoginActivity extends AppCompatActivity
{

    /*ANCLA CON LA SIGUIENTE CAPA*/
    private static final String TAG = "CustomAuthActivity";

    private Button login;
    private Button register;


    private static final int SCREEN=2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        login = (Button)findViewById(R.id.button);
        register = (Button)findViewById(R.id.button2);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy = new Intent(LoginActivity.this, Login1.class);
                startActivity(toy);
            }
        });

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy = new Intent(LoginActivity.this, Register1.class);
                startActivity(toy);
            }
        });
        //btnLogin = findViewById(R.id.btnLogin);

/*
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pantalla = new Intent(getBaseContext(),
                        ListViewActivity.class);
                startActivity(pantalla);
            }
        });
*/

        //3ª: Inicializar elemento que necesite de XML
        //initComponents();


    }
}
