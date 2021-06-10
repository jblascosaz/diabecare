package com.svalero.diabecare_frontend.Home;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.svalero.diabecare_frontend.HomeActivity;
import com.svalero.diabecare_frontend.R;

public class ExerciseList extends AppCompatActivity {
    private static final int SCREEN=1;
    RecyclerView recyclerView;
    RecyclerExercise adapter;
    RecyclerFood adapter2;
    private Button volver;
    private RecyclerExercise.RecyclerViewClickListener listener;
    int imagenes[]={(R.drawable.running),(R.drawable.stairs),(R.drawable.dumbbell)};
    String ejercicios[]={"Corre/anda 5km","No uses el ascensor, ¡hoy toca escaleras!","Realiza 3 series de 10 flexiones"};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ejercicios_recycler);

        recyclerView= findViewById(R.id.recycler3);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        volver = findViewById(R.id.button47);

        setAdapter();
        recyclerView.setAdapter(adapter);


        volver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy = new Intent(ExerciseList.this, HomeActivity.class);
                startActivity(toy);

            }
        });
    }

    private void setAdapter(){
        setOnClickListener();
        adapter= new RecyclerExercise(this, ejercicios, listener);
    }

    private void setOnClickListener() {
        listener = new RecyclerExercise.RecyclerViewClickListener() {
            @Override
            public void onClick(View v, int position) {

            }
        };
    }
}