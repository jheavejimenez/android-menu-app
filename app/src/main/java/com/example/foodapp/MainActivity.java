package com.example.foodapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<SlideModel> slideModels=new ArrayList<>();
        slideModels.add(new SlideModel(  "https://picsum.photos/id/237/200/30e"));
        slideModels.add(new SlideModel(  "https://picsum.photos/seed/picsum/200/300"));
        slideModels.add(new SlideModel(  "https://picsum.photos/200/300?grayscale"));
        slideModels.add(new SlideModel(  "https://picsum.photos/id/237/200/300"));

        ImageSlider imageSlider = findViewById(R.id.image_slider);
        imageSlider.setImageList(slideModels, true);
    }
}