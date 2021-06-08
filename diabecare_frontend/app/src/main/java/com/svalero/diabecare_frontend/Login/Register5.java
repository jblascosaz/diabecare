package com.svalero.diabecare_frontend.Login;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.FirebaseDatabase;
import com.svalero.diabecare_frontend.HomeActivity;
import com.svalero.diabecare_frontend.R;
import com.svalero.diabecare_frontend.User;

public class Register5 extends AppCompatActivity {
    private Button siguiente;
    private Button siguiente2;

    private TextView prueba;
    private String nombre;
    private int peso;
    private int altura;
    private int sensibilidad;
    private int edad;
    private EditText usernameedit;
    private EditText password1;
    private EditText validacion;
    private ProgressBar barra;
    private String username1;
    private String password;

    private FirebaseAuth mAuth;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.regist5);


        siguiente = findViewById(R.id.button7);
        barra = findViewById(R.id.simpleProgressBar);
        siguiente2 = (Button) findViewById(R.id.button33);


        validacion = findViewById(R.id.editText5);
        usernameedit = findViewById(R.id.editText3);
        password1 = findViewById(R.id.editText4);

        mAuth = FirebaseAuth.getInstance();

        final Bundle bundle = this.getIntent().getExtras();

        if (bundle != null) {
            peso = bundle.getInt("peso");
            altura = bundle.getInt("altura");
            sensibilidad = bundle.getInt("sensibilidad");
            edad = bundle.getInt("edad");
        }


        validacion.addTextChangedListener(new TextWatcher() {
            @Override
            public void afterTextChanged(Editable s) {
            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start,
                                      int before, int count) {
                if (usernameedit.getText().toString().trim().length() > 1 && password1.getText().toString().trim().length() > 1 && validacion.getText().toString().trim().length() > 1) {
                    if ((usernameedit.getText().toString().equals(validacion.getText().toString()))) {
                        siguiente.setEnabled(true);
                    }
                } else {
                    siguiente.setEnabled(true);
                }
            }
        });


        siguiente2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!siguiente.isEnabled()) {
                    Toast toast1 = Toast.makeText(getApplicationContext(),
                            "Rellene los campos requeridos", Toast.LENGTH_SHORT);
                    toast1.show();
                }
            }
        });

        siguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                registerUser();

            }
        });


    }

    private void registerUser() {
        String email = usernameedit.getText().toString().trim();
        String password_user = password1.getText().toString().trim();
        final Bundle bundle = this.getIntent().getExtras();
        char sexo = (bundle.getString("sexo2")).charAt(0);
        peso = bundle.getInt("peso");
        altura = bundle.getInt("altura");
        sensibilidad = bundle.getInt("sensibilidad");
        edad = bundle.getInt("edad");

        barra.setVisibility(View.VISIBLE);
        mAuth.createUserWithEmailAndPassword(email.toString(), password_user.toString()).addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if (task.isSuccessful()) {
                    FirebaseUser user = mAuth.getCurrentUser();
                    Toast.makeText(Register5.this, "Registrado con éxito", Toast.LENGTH_SHORT).show();
                    Intent toy = new Intent(Register5.this, Login1.class);
                    toy.putExtras(bundle);
                    startActivity(toy);
                } else {
                    Toast.makeText(Register5.this, "El email ya está registrado o la contraseña es errónea", Toast.LENGTH_SHORT).show();
                    barra.setVisibility(View.GONE);
                }
            }
        });

    }
}



