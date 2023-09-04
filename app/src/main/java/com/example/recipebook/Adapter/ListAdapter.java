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

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.viewHolder>{
ArrayList<modals> list;
Context context;

    public ListAdapter(ArrayList<modals> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.list_layout,parent,false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        modals modal = list.get(position);
        holder.imageView.setImageResource(modal.getImg());
        holder.textView.setText(modal.getName());

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

    public static class viewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView textView;
        public viewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.list_image);
            textView = itemView.findViewById(R.id.list_tv1);

        }
    }
}
