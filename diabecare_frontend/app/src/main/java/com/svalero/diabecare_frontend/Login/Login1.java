package com.svalero.diabecare_frontend.Login;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.svalero.diabecare_frontend.HomeActivity;
import com.svalero.diabecare_frontend.R;

public class Login1 extends AppCompatActivity {

    private Button siguiente;
    private EditText editTextEmail,editTextPassword;
    private ProgressBar progressBar;
    private FirebaseAuth mAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        siguiente = findViewById(R.id.button6);
        editTextEmail = (EditText) findViewById(R.id.editText6);
        editTextPassword = (EditText) findViewById(R.id.editText7);


        progressBar = (ProgressBar) findViewById(R.id.simpleProgressBar);
        mAuth = FirebaseAuth.getInstance();
        siguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                singIn();
            }
        });

    }

            public void singIn(){
            String email = editTextEmail.getText().toString().trim();
            String password = editTextPassword.getText().toString().trim();

            if(email.isEmpty()){
                editTextEmail.setError("La email es requerida");
                editTextEmail.requestFocus();
                return;
            }

            if(!Patterns.EMAIL_ADDRESS.matcher(email).matches()){
                editTextEmail.setError("El email es inválido");
                editTextEmail.requestFocus();
            }

            if(password.isEmpty()){
                editTextPassword.setError("La contraseña es requerida");
                editTextPassword.requestFocus();
                return;
            }

            if(password.length() < 6){
                editTextPassword.setError("La contraseña es menor a 6 caracteres");
                editTextPassword.requestFocus();
                return;
            }

            progressBar.setVisibility(View.VISIBLE);
            mAuth.signInWithEmailAndPassword(email, password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                @Override
                public void onComplete(@NonNull Task<AuthResult> task) {
                    if(task.isSuccessful()){
                        Intent toy = new Intent(Login1.this, HomeActivity.class);
                        startActivity(toy);
                    }else{
                        Toast.makeText(Login1.this,"Error en el inicio de sesión", Toast.LENGTH_LONG).show();
                        progressBar.setVisibility(View.GONE);
                    }
                }
            });

            }



    }

