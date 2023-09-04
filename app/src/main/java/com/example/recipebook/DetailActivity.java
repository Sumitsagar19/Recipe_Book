package com.example.recipebook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class DetailActivity extends AppCompatActivity {
    ImageView imageView;
    TextView text_name,Ingredient, instructions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        text_name = findViewById(R.id.textView8);
        Ingredient = findViewById(R.id.ingredient);
        instructions = findViewById(R.id.instruction);
        imageView = findViewById(R.id.imageView3);

        Intent fromintent = getIntent();
        String name = fromintent.getStringExtra("name");
        String instruction = fromintent.getStringExtra("instruction");
        String ingredient = fromintent.getStringExtra("ingredients");
        int image = fromintent.getIntExtra("image",0);

        text_name.setText(name);
        Ingredient.setText(ingredient);
        instructions.setText(instruction);
        imageView.setImageResource(image);








    }
}