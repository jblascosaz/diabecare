package com.svalero.diabecare_frontend.Home;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.svalero.diabecare_frontend.HomeActivity;
import com.svalero.diabecare_frontend.Login.Login1;
import com.svalero.diabecare_frontend.Login.LoginActivity;
import com.svalero.diabecare_frontend.Login.Register5;
import com.svalero.diabecare_frontend.R;



public class RatioCalculator extends AppCompatActivity {
    private static final int SCREEN=1;
    private EditText a1, a2, a3, a4;
    private TextView xx, xx2;
    private Button volver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ratiocalc);

        a1 = findViewById(R.id.a1);
        a2 = findViewById(R.id.a2);
        a3 = findViewById(R.id.a3);
        a4 = findViewById(R.id.a);
        xx = findViewById(R.id.textView35);
        xx2 = findViewById(R.id.textView40);
        volver = findViewById(R.id.button47);


        a2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if(a2.getText().toString().trim().length()>0 && a1.getText().toString().trim().length()>0 && a2.getText().toString().trim().length()<6){
                    int cypher = Integer.parseInt(a1.getText().toString());
                    int cypher2 = Integer.parseInt(a2.getText().toString());
                    Double raciones = Double.valueOf(cypher*cypher2);
                    xx.setText((raciones/1000)+"");
                }

            }
        });

        a4.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if(a4.getText().toString().trim().length()>0 && a3.getText().toString().trim().length()>0){
                    int cypher3 = Integer.parseInt(a3.getText().toString());
                    int cypher4 = Integer.parseInt(a4.getText().toString());
                    Double gramos = Double.valueOf(cypher3*1000);
                    xx2.setText((gramos/cypher4)+"");
                }

            }
        });

        volver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy = new Intent(RatioCalculator.this, HomeActivity.class);
                startActivity(toy);
            }
        });
    }
}
