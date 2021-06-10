package com.svalero.diabecare_frontend.Home;

import android.content.Context;
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
import com.svalero.diabecare_frontend.R;

public class RecyclerExercise extends RecyclerView.Adapter<RecyclerExercise.ViewHolder> {

    private RecyclerExercise.RecyclerViewClickListener listener;

    String data[];
    Context context;
    int imagenes[]={(R.drawable.running),(R.drawable.stairs),(R.drawable.dumbbell)};
    String fotos[]={"Corre/anda 5km","No uses el ascensor, ¡hoy toca escaleras!","Realiza 3 series de 10 flexiones"};


    public RecyclerExercise(Context context, String[] data, RecyclerExercise.RecyclerViewClickListener listener) {
        this.data = data;
        this.context = context;
        this.listener = listener;
    }

    @NonNull
    @Override
    public RecyclerExercise.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.custom_design3,parent, false);
        RecyclerExercise.ViewHolder viewHolder = new RecyclerExercise.ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerExercise.ViewHolder holder, int position) {

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

        return fotos.length;
    }



    public interface RecyclerViewClickListener{
        void onClick(View v, int position);
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        TextView textName, info;
        ImageView imagen;


        public ViewHolder(@NonNull View itemView){
            super (itemView);
            textName = itemView.findViewById(R.id.exer);
            imagen = itemView.findViewById(R.id.imageView30);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            listener.onClick(v, getAdapterPosition());
        }
    }

}