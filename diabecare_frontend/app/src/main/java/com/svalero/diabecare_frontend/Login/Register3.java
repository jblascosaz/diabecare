package com.svalero.diabecare_frontend.Login;


import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.text.InputFilter;
import android.text.Spanned;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.svalero.diabecare_frontend.R;

public class Register3 extends AppCompatActivity {

    private Button siguiente;
    private EditText peso;
    private EditText altura;
    private int altura2;
    private int peso2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.regist3);

        altura = findViewById(R.id.editText1);
        peso = findViewById(R.id.editText2);

        final Bundle bundle = this.getIntent().getExtras();



        class InputFilterMinMax implements InputFilter {

            private int min, max;

            public InputFilterMinMax(int min, int max) {
                this.min = min;
                this.max = max;
            }

            public InputFilterMinMax(String min, String max) {
                this.min = Integer.parseInt(min);
                this.max = Integer.parseInt(max);
            }

            @Override
            public CharSequence filter(CharSequence source, int start, int end, Spanned dest, int dstart, int dend) {
                try {
                    int input = Integer.parseInt(dest.toString() + source.toString());
                    if (isInRange(min, max, input))
                        return null;
                } catch (NumberFormatException nfe) { }
                return "";
            }

            private boolean isInRange(int a, int b, int c) {
                return b > a ? c >= a && c <= b : c >= b && c <= a;
            }
        }

        peso.addTextChangedListener(new TextWatcher() {
            @Override
            public void afterTextChanged(Editable s) {}
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }
            @Override
            public void onTextChanged(CharSequence s, int start,
                                      int before, int count) {
                if(peso.getText().toString().trim().length() > 0 && altura.getText().toString().trim().length() > 0) siguiente.setEnabled(true);
            }
        });
        altura.addTextChangedListener(new TextWatcher() {
            @Override
            public void afterTextChanged(Editable s) {}
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }
            @Override
            public void onTextChanged(CharSequence s, int start,
                                      int before, int count) {
                if(peso.getText().toString().trim().length() > 0 && altura.getText().toString().trim().length() > 0) siguiente.setEnabled(true);
            }
        });


        siguiente = findViewById(R.id.button4);

        siguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value= peso.getText().toString();
                peso2 =Integer.parseInt(value);
                String value2= altura.getText().toString();
                altura2 =Integer.parseInt(value2);

                Intent toy = new Intent(Register3.this, Register4.class);
                bundle.putInt("peso", peso2);
                bundle.putInt("altura", altura2);
                toy.putExtras(bundle);
                startActivity(toy);
            }
        });
    }


}