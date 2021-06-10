package com.svalero.diabecare_frontend.Home;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.svalero.diabecare_frontend.HomeActivity;
import com.svalero.diabecare_frontend.Login.LoginActivity;
import com.svalero.diabecare_frontend.R;

public class FoodList extends AppCompatActivity {
    private static final int SCREEN=1;
    RecyclerView recyclerView;
    RecyclerFood adapter;
    RecyclerFood adapter2;
    private Button volver;

    String alimentos[]={"Aceitunas","Acelga","Ajo","Alcachofa","Alioli","Almeja","Almendra","Alubiua","Anchoa","Bacon","Barquillo","Barritas","Batido Cacao","Bayas","Bizocho","Bombon","Bonito","Caballa","Cacahuetes","Cafe","Calamares","Cerdo","Dulce leche","Datiles","Ensalada","Espaguetis","Espinacas","Fuet","Galleta","Garbanzos","Gazpacho","Guisantes", "Habas", "Harina","Helado","Huevo","Hummus","Jamon","Judias","Ketchup","Lacon","Langostinos","Leche","Lentejas","Lomo","Marcarrones","Macedonia","Magdalena","Mantequilla","Manzana","Mayonesa","Maiz","Melocoton","Merluza","Mostaza","Napolitana","Nata","Ostras","Palomitas","Pan molde","Patatas","Paté","Pavo","Pepinillo","Pipas","Pollo","Pulpo","Queso","Rape","Remolacha","Rosquillas","Salami","Salchicha","Salmorejo","Salmon","Sardinas","Semillas de amapola","Sirope","Snack mix","Soda","Sobrasada con miel","Surimi","Tinto","Tomate","Torta","Tostadas","Trigo","Turron","Tonica","Verdura","Yogur","Zamburiñas","Zanahoria","Zumo arandano","Zumo de tomate","Zumo exprimido","Zumo tropical"};




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.alimentos_recycler);

        recyclerView= findViewById(R.id.recycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter= new RecyclerFood(this, alimentos);
        volver = findViewById(R.id.button47);
        recyclerView.setAdapter(adapter);

        volver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy = new Intent(FoodList.this, HomeActivity.class);
                startActivity(toy);

            }
        });


    }

}