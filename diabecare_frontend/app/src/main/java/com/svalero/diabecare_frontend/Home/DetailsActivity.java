package com.svalero.diabecare_frontend.Home;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.squareup.picasso.Picasso;
import com.svalero.diabecare_frontend.HomeActivity;
import com.svalero.diabecare_frontend.R;

public class DetailsActivity extends AppCompatActivity {
    private static final int SCREEN=1;
    private Button atras;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recipe_details);
        TextView receta = findViewById(R.id.textname);
        TextView detalles = findViewById(R.id.textinfo);
        ImageView img = findViewById(R.id.imagereceta);
        atras = findViewById(R.id.button47);

        final Bundle bundle = this.getIntent().getExtras();
        receta.setText(bundle.getString("ola"));
        detalles.setText(bundle.getString("desc"));
        Picasso.with(this)
                .load(bundle.getInt("imgs"))
                .into(img);


        atras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy = new Intent(DetailsActivity.this, RecipeList.class);
                startActivity(toy);
            }
        });

    }
}