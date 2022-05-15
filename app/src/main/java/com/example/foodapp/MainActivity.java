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

        List<SlideModel> imageSlide=new ArrayList<>();
        imageSlide.add(new SlideModel(  "https://picsum.photos/id/237/200/30e"));
        imageSlide.add(new SlideModel(  "https://picsum.photos/seed/picsum/200/300"));
        imageSlide.add(new SlideModel(  "https://picsum.photos/200/300?grayscale"));
        imageSlide.add(new SlideModel(  "https://picsum.photos/id/237/200/300"));

        ImageSlider imageSlider = findViewById(R.id.image_slider);
        imageSlider.setImageList(imageSlide, true);
    }
}