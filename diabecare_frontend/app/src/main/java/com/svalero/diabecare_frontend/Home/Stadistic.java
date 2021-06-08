package com.svalero.diabecare_frontend.Home;

import android.annotation.SuppressLint;
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
/*
import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.svalero.diabecare_frontend.HomeActivity;
import com.svalero.diabecare_frontend.R;

public class Stadistic extends AppCompatActivity {
    private static final int SCREEN = 1;
    private TextView fecha;
    private EditText medicion;
    private Button volver, agregar;
    private int idUsuario = 1;
    private String strDate, ola;
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




        agregar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                executeService("http://95.16.159.62:8080/develop/insertar_medicion.php");
            }
        });
        volver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy = new Intent(Stadistic.this, HomeActivity.class);
                startActivity(toy);
            }
        });
    }

    private void executeService(String URL){
        StringRequest stringRequest = new StringRequest(Request.Method.POST, URL, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                Toast.makeText(getApplicationContext(), "MEDICION AÑADIDA", Toast.LENGTH_SHORT).show();
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(getApplicationContext(), "ALGO FALLÓ", Toast.LENGTH_SHORT).show();
            }
        }){
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                Map<String, String> paramentros = new HashMap<>();
                paramentros.put("idUsuario",Integer.toString(1));
                paramentros.put("fecha",strDate);
                paramentros.put("medicion",ola);
                return paramentros;
            }
        };
        RequestQueue requestQueue = Volley.newRequestQueue(this);
        requestQueue.add(stringRequest);
    }
}*/