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

public class RecipeList extends AppCompatActivity {
    private static final int SCREEN=1;
    RecyclerView recyclerView;
    RecyclerRecipe adapter;
    RecyclerFood adapter2;
    private Button volver;
    private RecyclerRecipe.RecyclerViewClickListener listener;

    int imagenes[]={(R.drawable.alc),(R.drawable.burri),(R.drawable.cazo),(R.drawable.zana),(R.drawable.beren), (R.drawable.ens), (R.drawable.ensala), (R.drawable.gall)};
    String alimentos[]={"Alcachofas gratinadas","Burrito casero","Cazo verduras","Baby Zanas","Berenjena","Ensalada 1","Ensalada 2","Galletas caseras"};
    String desc[]={"La zanahoria es un alimento muy saludable, y podemos optar por el tipo baby hecho al horno para convertirla en un snack apetecible y muy sano o en un acompañamiento ideal a carne o pescado.","Los burritos son una comida típica mejicana que cada vez tiene más éxito en otras partes del mundo. Son sencillos de preparar y podemos rellenarlos con lo que más nos guste, así que pueden ser tan saludables como queramos","Esta receta es un acompañante ideal y sanísimo, compuesto en su mayoría por verdura y huevo. Una forma ideal de comer verdura para los que no son muy aficionados a consumirlas al vapor o hervidas.","La zanahoria es un alimento muy saludable, y podemos optar por el tipo baby hecho al horno para convertirla en un snack apetecible y muy sano o en un acompañamiento ideal a carne o pescado.","Esta receta mezcla carne con verduras, y es ideal como acompañamiento o como plato principal. Podemos añadirle salsa de tomate o un chorrito de aceite, lo que más nos apetezca.","Esta receta es una combinación perfecta entre pescado y verdura, dándole un toque muy especial a esta ensalada.","Con la llegada del buen tiempo cada vez es más apetecible comer una ensalada bien fresquita. En esta receta combinamos elementos muy mediterráneos para que con pocos ingredientes creemos un plato fácil, sano y muy sabroso.","Con la llegada del buen tiempo cada vez es más apetecible comer una ensalada bien fresquita. En esta receta combinamos elementos muy mediterráneos para que con pocos ingredientes creemos un plato fácil, sano y muy sabroso."};




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recetas_recycler);
        volver = findViewById(R.id.button47);
        recyclerView= findViewById(R.id.recycler2);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        setAdapter();
        recyclerView.setAdapter(adapter);


        volver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy = new Intent(RecipeList.this, HomeActivity.class);
                startActivity(toy);

            }
        });
    }

    private void setAdapter(){
        setOnClickListener();
        adapter= new RecyclerRecipe(this, alimentos, listener);
    }

    private void setOnClickListener() {
        listener = new RecyclerRecipe.RecyclerViewClickListener() {
            @Override
            public void onClick(View v, int position) {
                Intent toy = new Intent(getApplicationContext(), DetailsActivity.class);
                Bundle bundle = new Bundle();
                bundle.putString("ola",""+alimentos[position]);
                bundle.putString("desc",""+desc[position]);
                bundle.putInt("imgs",imagenes[position]);
                toy.putExtras(bundle);
                startActivity(toy);
            }
        };
    }

}