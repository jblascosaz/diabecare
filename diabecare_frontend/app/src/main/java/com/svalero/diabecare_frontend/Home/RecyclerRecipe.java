package com.svalero.diabecare_frontend.Home;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;
import com.svalero.diabecare_frontend.HomeActivity;
import com.svalero.diabecare_frontend.R;

public class RecyclerRecipe extends RecyclerView.Adapter<RecyclerRecipe.ViewHolder> {

    private RecyclerViewClickListener listener;

    String data[];
    Context context;
    int imagenes[]={(R.drawable.alc),(R.drawable.burri),(R.drawable.cazo),(R.drawable.zana),(R.drawable.beren), (R.drawable.ens), (R.drawable.ensala), (R.drawable.gall)};
    String fotos[]={"Alcachofas gratinadas","Burrito casero","Cazo verduras","Baby Zanas","Berenjena","Ensalada 1","Ensalada 2","Galletas caseras"};

    public RecyclerRecipe(Context context, String[] data, RecyclerViewClickListener listener) {
        this.data = data;
        this.context = context;
        this.listener = listener;
    }

    @NonNull
    @Override
    public RecyclerRecipe.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.custome_design2,parent, false);
        RecyclerRecipe.ViewHolder viewHolder = new RecyclerRecipe.ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerRecipe.ViewHolder holder, int position) {

        holder.textName.setText(fotos[position]);


        Uri uri = Uri.parse(imagenes[position]+"");
        Picasso.with(holder.imagen.getContext())
                .load(Uri.parse(String.valueOf(uri)))
                .placeholder(imagenes[position])
                .into(holder.imagen);

        holder.imagen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


            }
        });

    }

    @Override
    public int getItemCount() {

        return imagenes.length;
    }



    public interface RecyclerViewClickListener{
        void onClick(View v, int position);
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        TextView textName, info;
        ImageView imagen;


        public ViewHolder(@NonNull View itemView){
            super (itemView);
            textName = itemView.findViewById(R.id.foods);
            imagen = itemView.findViewById(R.id.imageView30);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            listener.onClick(v, getAdapterPosition());
        }
    }

}
