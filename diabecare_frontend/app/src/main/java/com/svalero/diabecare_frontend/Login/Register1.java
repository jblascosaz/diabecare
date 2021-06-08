package com.svalero.diabecare_frontend.Login;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.svalero.diabecare_frontend.R;

public class Register1 extends AppCompatActivity {

    private Button siguiente;
    private Button siguiente2;
    private CheckBox f;
    private CheckBox m;
    private String sexo2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.regist);


        siguiente = (Button)findViewById(R.id.button3);
        siguiente2 = (Button)findViewById(R.id.button33);
        f = findViewById(R.id.checkBoxF);
        m = findViewById(R.id.checkBoxM);



        f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lanzar();
            }
        });
        m.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lanzar();
            }
        });

        siguiente2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!siguiente.isEnabled()) {
                    Toast toast1 = Toast.makeText(getApplicationContext(),
                            "Seleccione un sexo", Toast.LENGTH_SHORT);
                    toast1.show();
                }
            }
        });
        siguiente.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {



                    Intent toy = new Intent(Register1.this, Register2.class);

                    Bundle bundle = new Bundle();
                    bundle.putString("sexo2", sexo2);
                    toy.putExtras(bundle);

                    startActivity(toy);
                }

        });


        f.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (m.isChecked() && f.isChecked()) {
                    m.setChecked(false);
                }
                sexo2 = "f";
            }
        });
        m.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (f.isChecked() && m.isChecked()) {
                    f.setChecked(false);
                }
                sexo2 = "m";
            }
        });
    }

    private void lanzar() {
        if(!f.isChecked() && !m.isChecked()){
            siguiente.setEnabled(false);
        }
        if(f.isChecked() || m.isChecked()){
            siguiente.setEnabled(true);
        }
    }


}
