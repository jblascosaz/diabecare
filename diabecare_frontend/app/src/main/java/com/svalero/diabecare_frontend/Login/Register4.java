package com.svalero.diabecare_frontend.Login;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.svalero.diabecare_frontend.R;

public class Register4 extends AppCompatActivity {

    private Button siguiente;
    private TextView calcular;
    private EditText indice;

    private TextView prueba;
    private String nombre;
    private int peso;
    private int altura;

    private int indice2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.regist4);


        siguiente = findViewById(R.id.button4);
        calcular = findViewById(R.id.textView90);
        indice = findViewById(R.id.editText2);




        final Bundle bundle = this.getIntent().getExtras();


        if(indice.getText().toString().trim().length() > 10){
            siguiente.setEnabled(true);
        }

        indice.addTextChangedListener(new TextWatcher() {
            @Override
            public void afterTextChanged(Editable s) {}
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }
            @Override
            public void onTextChanged(CharSequence s, int start,
                                      int before, int count) {
                if(indice.getText().toString().trim().length() > 1 && indice.getText().toString().trim().length() < 4){
                    siguiente.setEnabled(true);
                } else{
                    siguiente.setEnabled(false);
                }
            }
        });
        siguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value3= indice.getText().toString();
                indice2 =Integer.parseInt(value3);

                Intent toy = new Intent(Register4.this, Register5.class);
                bundle.putInt("sensibilidad",indice2);
                toy.putExtras(bundle);
                startActivity(toy);
            }
        });

        calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy = new Intent(Register4.this, Register4_1.class);

                toy.putExtras(bundle);
                startActivity(toy);
            }
        });
    }
}