package com.example.recipebook.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recipebook.DetailActivity;
import com.example.recipebook.Modal.modals;
import com.example.recipebook.R;

import java.util.ArrayList;

public class FamousAdapter extends RecyclerView.Adapter<FamousAdapter.ViewHolder>{

    ArrayList<modals> list;
    Context context;

    public FamousAdapter(ArrayList<modals> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.famous_layout,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        modals modal = list.get(position);
        holder.imageView.setImageResource(modal.getImg());
        holder.tv1.setText(modal.getName());

        if (position==0){
            holder.itemView.setOnClickListener(v -> {
                Intent intent = new Intent(context, DetailActivity.class);
                intent.putExtra("name",modal.getName());
                intent.putExtra("image",modal.getImg());
                intent.putExtra("ingredients",modal.getIngredients());
                intent.putExtra("instruction",modal.getInstruction());
                context.startActivity(intent);
            });
        }
        if (position==1){
            holder.itemView.setOnClickListener(v -> {
                Intent intent = new Intent(context, DetailActivity.class);
                intent.putExtra("name",modal.getName());
                intent.putExtra("image",modal.getImg());
                intent.putExtra("ingredients",modal.getIngredients());
                intent.putExtra("instruction",modal.getInstruction());
                context.startActivity(intent);
            });
        }
        if (position==2){
            holder.itemView.setOnClickListener(v -> {
                Intent intent = new Intent(context, DetailActivity.class);
                intent.putExtra("name",modal.getName());
                intent.putExtra("image",modal.getImg());
                intent.putExtra("ingredients",modal.getIngredients());
                intent.putExtra("instruction",modal.getInstruction());
                context.startActivity(intent);
            });
        }
        if (position==3){
            holder.itemView.setOnClickListener(v -> {
                Intent intent = new Intent(context, DetailActivity.class);
                intent.putExtra("name",modal.getName());
                intent.putExtra("image",modal.getImg());
                intent.putExtra("ingredients",modal.getIngredients());
                intent.putExtra("instruction",modal.getInstruction());
                context.startActivity(intent);
            });
        }
        if (position==4){
            holder.itemView.setOnClickListener(v -> {
                Intent intent = new Intent(context, DetailActivity.class);
                intent.putExtra("name",modal.getName());
                intent.putExtra("image",modal.getImg());
                intent.putExtra("ingredients",modal.getIngredients());
                intent.putExtra("instruction",modal.getInstruction());
                context.startActivity(intent);
            });
        }
        if (position==5){
            holder.itemView.setOnClickListener(v -> {
                Intent intent = new Intent(context, DetailActivity.class);
                intent.putExtra("name",modal.getName());
                intent.putExtra("image",modal.getImg());
                intent.putExtra("ingredients",modal.getIngredients());
                intent.putExtra("instruction",modal.getInstruction());
                context.startActivity(intent);
            });
        }
        if (position==6){
            holder.itemView.setOnClickListener(v -> {
                Intent intent = new Intent(context, DetailActivity.class);
                intent.putExtra("name",modal.getName());
                intent.putExtra("image",modal.getImg());
                intent.putExtra("ingredients",modal.getIngredients());
                intent.putExtra("instruction",modal.getInstruction());
                context.startActivity(intent);
            });
        }
        if (position==7){
            holder.itemView.setOnClickListener(v -> {
                Intent intent = new Intent(context, DetailActivity.class);
                intent.putExtra("name",modal.getName());
                intent.putExtra("image",modal.getImg());
                intent.putExtra("ingredients",modal.getIngredients());
                intent.putExtra("instruction",modal.getInstruction());
                context.startActivity(intent);
            });
        }
        if (position==8){
            holder.itemView.setOnClickListener(v -> {
                Intent intent = new Intent(context, DetailActivity.class);
                intent.putExtra("name",modal.getName());
                intent.putExtra("image",modal.getImg());
                intent.putExtra("ingredients",modal.getIngredients());
                intent.putExtra("instruction",modal.getInstruction());
                context.startActivity(intent);
            });
        }
        if (position==9){
            holder.itemView.setOnClickListener(v -> {
                Intent intent = new Intent(context, DetailActivity.class);
                intent.putExtra("name",modal.getName());
                intent.putExtra("image",modal.getImg());
                intent.putExtra("ingredients",modal.getIngredients());
                intent.putExtra("instruction",modal.getInstruction());
                context.startActivity(intent);
            });
        }

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView tv1;
        ImageView imageView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            tv1 = itemView.findViewById(R.id.tv1);
            imageView = itemView.findViewById(R.id.image);


        }
    }
}
