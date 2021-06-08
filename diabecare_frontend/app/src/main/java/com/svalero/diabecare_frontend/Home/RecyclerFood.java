package com.svalero.diabecare_frontend.Home;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.svalero.diabecare_frontend.R;

public class RecyclerFood extends RecyclerView.Adapter<RecyclerFood.ViewHolder> {

    String data[];
    Context context;
    String hcs[]={"170","23","12","0","170","23","12","0","170","23","12","0"};

    public RecyclerFood(Context context, String[] data) {
        this.data = data;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerFood.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.custome_design,parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerFood.ViewHolder holder, int position) {

        holder.textName.setText(data[position]);
        holder.textName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "El alimento: "+data[position]+" tiene "+hcs[position] + " HC cada 100gr.", Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView textName, textHC;


        public ViewHolder(@NonNull View itemView){
            super (itemView);
            textName = itemView.findViewById(R.id.foods);

        }
    }

}
