package com.svalero.diabecare_frontend.Home;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.svalero.diabecare_frontend.Login.LoginActivity;
import com.svalero.diabecare_frontend.R;

public class FoodList extends AppCompatActivity {
    private static final int SCREEN=1;
    RecyclerView recyclerView;
    RecyclerFood adapter;
    RecyclerFood adapter2;

    String alimentos[]={"Anacardo","Pollo frito","Payamsitos","Danones","Anacardo","Pollo frito","Payamsitos","Danones","Anacardo","Pollo frito","Payamsitos","Danones"};




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.alimentos_recycler);

        recyclerView= findViewById(R.id.recycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter= new RecyclerFood(this, alimentos);

        recyclerView.setAdapter(adapter);

    }
}