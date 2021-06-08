package com.svalero.diabecare_frontend.Home;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.svalero.diabecare_frontend.R;

public class InsulinCalculator  extends AppCompatActivity {
    private static final int SCREEN=1;
    private TextView resultado;
    private EditText a4, a5, a6;
    private Button volver, calcular;
    private String correcion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.insulincalc);

        resultado = findViewById(R.id.resultado);
        a4 = findViewById(R.id.a4);
        a5 = findViewById(R.id.a5);
        a6 = findViewById(R.id.a6);
        volver = findViewById(R.id.button47);
        calcular = findViewById(R.id.button48);

        calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(a4.getText().toString().trim().length()>0 && a5.getText().toString().trim().length()>0 && a6.getText().toString().trim().length()>0){
                    int cypher = Integer.parseInt(a4.getText().toString());
                    int cypher2 = Integer.parseInt(a5.getText().toString());
                    int cypher3 = Integer.parseInt(a6.getText().toString());

                    if(cypher2<150){
                        correcion = "";
                    }else if(cypher2>200 & cypher2<250){
                        correcion = " + 1";
                    }else if(cypher2>250 & cypher2<300){
                        correcion = " + 2";
                    }else if(cypher2>300 & cypher2<350){
                        correcion = " + 3";
                    }else if(cypher2>60 & cypher2<100){
                        correcion = " - 1";
                    }else if(cypher2>30 & cypher2<60){
                        correcion = " - 2";
                    }else{
                        correcion = " + 4";
                    }
                    resultado.setText("El total de unidades de insulina es: "+(cypher/10)+correcion);
                }else {
                    Toast toast1 = Toast.makeText(getApplicationContext(),
                            "Rellene todos los campos", Toast.LENGTH_SHORT);
                    toast1.show();
                }
            }
        });


    }
}
