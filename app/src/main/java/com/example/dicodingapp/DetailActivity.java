package com.example.dicodingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Hero selectedHero = getIntent().getParcelableExtra("selected_hero");

        ImageView imageView = findViewById(R.id.image_view_hero);
        TextView nameTextView = findViewById(R.id.text_view_name);
        TextView descriptionTextView = findViewById(R.id.text_view_description);

        if(selectedHero != null) {
            nameTextView.setText(selectedHero.getName());
            imageView.setImageResource(selectedHero.getPhoto());
            descriptionTextView.setText(selectedHero.getDescription());
        }
    }
}