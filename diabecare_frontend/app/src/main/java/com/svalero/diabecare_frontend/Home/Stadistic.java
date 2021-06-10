package com.svalero.diabecare_frontend.Home;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.firestore.FirebaseFirestore;
import com.svalero.diabecare_frontend.HomeActivity;
import com.svalero.diabecare_frontend.R;

public class Stadistic extends AppCompatActivity {

    private FirebaseFirestore db = FirebaseFirestore.getInstance();

    private static final int SCREEN = 1;
    private TextView fecha;
    private EditText medicion;
    private Button volver, agregar;
    private String strDate, ola;
    Context context;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.estadist);

        fecha = findViewById(R.id.fecha);
        medicion = findViewById(R.id.xd);
        volver = findViewById(R.id.button47);
        agregar = findViewById(R.id.button48);

        ola = medicion.getText().toString();

        Date currentTime = Calendar.getInstance().getTime();
        DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
        strDate = dateFormat.format(currentTime);
        fecha.setText(strDate);

        volver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy = new Intent(Stadistic.this, HomeActivity.class);
                startActivity(toy);

            }
        });

        agregar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference("diabecare-dcec1-default-rtdb");
                myRef.setValue(ola);
                myRef.setValue(strDate);
                Toast toast=Toast.makeText(getApplicationContext(),"Medición añadida con éxito",Toast.LENGTH_SHORT);
                toast.show();

            }
        });

    }
}