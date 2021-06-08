package com.svalero.diabecare_frontend.Login;


import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.svalero.diabecare_frontend.R;

public class Register4_1 extends AppCompatActivity {

    private Button siguiente;
    private EditText indice;
    private int indice_num;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.regist4_1);

        siguiente = findViewById(R.id.button51);
        indice = findViewById(R.id.editText);

        final Bundle bundle3 = this.getIntent().getExtras();

        if(bundle3!=null){
            String nombre = bundle3.getString("sexo");
            int peso = bundle3.getInt("peso");
            int altura = bundle3.getInt("altura");
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

                if(indice.getText().toString().trim().length() > 0) siguiente.setEnabled(true);
            }
        });



        siguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy = new Intent(Register4_1.this, Register5.class);
                String value= indice.getText().toString();
                int sensibilidad= 1800 / (Integer.parseInt(value));
                Toast toast1 = Toast.makeText(getApplicationContext(),
                        " indice: "+ sensibilidad, Toast.LENGTH_SHORT);
                toast1.show();
                bundle3.putInt("sensibilidad",sensibilidad);
                toy.putExtras(bundle3);
                startActivity(toy);
            }
        });

    }
}