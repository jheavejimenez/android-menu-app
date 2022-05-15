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

        List<SlideModel> imageContent=new ArrayList<>();
        imageContent.add(new SlideModel(  "https://picsum.photos/id/237/200/30e"));
        imageContent.add(new SlideModel(  "https://picsum.photos/seed/picsum/200/300"));
        imageContent.add(new SlideModel(  "https://picsum.photos/200/300?grayscale"));
        imageContent.add(new SlideModel(  "https://picsum.photos/id/237/200/300"));

        ImageSlider imageSlider = findViewById(R.id.image_slider);
        imageSlider.setImageList(imageContent, true);
    }
}