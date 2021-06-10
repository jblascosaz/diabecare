package com.svalero.diabecare_frontend;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.svalero.diabecare_frontend.Home.ExerciseList;
import com.svalero.diabecare_frontend.Home.FoodList;
import com.svalero.diabecare_frontend.Home.InsulinCalculator;
import com.svalero.diabecare_frontend.Home.RatioCalculator;
//import com.svalero.diabecare_frontend.Home.Stadistic;
import com.svalero.diabecare_frontend.Home.RecipeList;
import com.svalero.diabecare_frontend.Home.RecyclerFood;
import com.svalero.diabecare_frontend.Home.Stadistic;
import com.svalero.diabecare_frontend.Login.Login1;
import com.svalero.diabecare_frontend.Login.Register3;
import com.svalero.diabecare_frontend.Login.Register4;

public class HomeActivity extends AppCompatActivity {

    private Button volver;
    private Button botonRaciones, botonInsulina, botonEstadistica, botonFood, botonRecipe, botonEjercicio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
        volver = findViewById(R.id.button47);
        botonRaciones = findViewById(R.id.button5);
        botonInsulina = findViewById(R.id.button8);
        botonFood = findViewById(R.id.button9);
        botonEstadistica = findViewById(R.id.button13);
        botonRecipe = findViewById(R.id.button10);
        botonEjercicio = findViewById(R.id.button11);


        volver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy = new Intent(HomeActivity.this, Login1.class);
                startActivity(toy);
            }
        });
        botonRaciones.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy = new Intent(HomeActivity.this, RatioCalculator.class);
                startActivity(toy);
            }
        });
        botonInsulina.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy = new Intent(HomeActivity.this, InsulinCalculator.class);
                startActivity(toy);
            }
        });
        botonFood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy = new Intent(HomeActivity.this, FoodList.class);
                startActivity(toy);
            }
        });
        botonRecipe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy = new Intent(HomeActivity.this, RecipeList.class);
                startActivity(toy);
            }
        });
        botonEjercicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy = new Intent(HomeActivity.this, ExerciseList.class);
                startActivity(toy);
            }
        });
        botonEstadistica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy = new Intent(HomeActivity.this, Stadistic.class);
                startActivity(toy);
            }
        });

    }
}
