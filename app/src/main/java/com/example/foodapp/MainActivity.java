package com.example.foodapp;

import android.os.Bundle;
import android.widget.LinearLayout;


import androidx.appcompat.app.AppCompatActivity;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;
import java.util.List;

import app.num.numandroidpagecurleffect.PageCurlView;

public class MainActivity extends AppCompatActivity {
    PageCurlView pageCurlView;

    // get image in drawable folder
    int[] imagesUri= new int[]{
            R.drawable.images1,
            R.drawable.images2,
            R.drawable.images,
            R.drawable.share
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List<SlideModel> imageContent = new ArrayList<>();
        List<Integer> imageIds = new ArrayList<>();

        ImageSlider imageSlider = findViewById(R.id.image_slider);
        pageCurlView =findViewById(R.id.pagecurlView);

        for (int j : imagesUri) {
            imageIds.add(j);
            imageContent.add(new SlideModel(j));
        }

        pageCurlView.setCurlView(imageIds);
        pageCurlView.setCurlSpeed(100);
        imageSlider.setImageList(imageContent, true);
    }
}