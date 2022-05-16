package com.example.foodapp;

import android.os.Bundle;
import android.widget.LinearLayout;


import androidx.appcompat.app.AppCompatActivity;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    LinearLayout linearLayout;
    String[] imagesUri= new String[]{
            "https://picsum.photos/id/237/200/30e",
            "https://picsum.photos/seed/picsum/200/300",
            "https://picsum.photos/200/300?grayscale"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List<SlideModel> imageContent = new ArrayList<>();

        ImageSlider imageSlider = findViewById(R.id.image_slider);
        linearLayout = findViewById(R.id.linear_layout);

        for (String s : imagesUri) {
            imageContent.add(new SlideModel(s));
            
        }

        imageSlider.setImageList(imageContent, true);
    }
}