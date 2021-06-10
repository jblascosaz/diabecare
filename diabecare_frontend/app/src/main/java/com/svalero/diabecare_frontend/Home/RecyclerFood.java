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
    String hcs[]={"3","10","1","7","19","1","7","7","8","0","0","27","19","25","12","33","25","0","0","12","3","12","0","40","0","0","13","2","0","18","4","7","2","2","6","55","32","13","0","2","12","0","2","10","0","0","12","21","12","4","12","9","1","14","0","23","44","12","0","12","33","15","6","0","0","9","0","0","0","0","1","41","0","0","0","0","0","2","44","12","20","12","0","10","0","10","21","12","33","10","0","12","0","2","12","4","32","12","0","10","3","2","13","9","25","33"};

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
