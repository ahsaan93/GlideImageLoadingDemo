package com.android.glidesample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Now am going to load an image from resources in that imageview using glide... Its simple!
        ImageView iv = (ImageView) findViewById(R.id.sampleImageView);
        //That was simple enough... just imageview's object is initialized and declared! now we can use glide
        //Glide.with(this).load(R.mipmap.ic_launcher).into(iv);
        //Am using image From mipmap directory beacuse i havent downloaded one in drawable... you do exactly same thing with drawable
        //That's It... :) you can use images from urls too
        Glide.with(this).load("https://assets.pcmag.com/media/images/536396-android-o.jpg?thumb=y&width=810&height=456").into(iv);
        //Just simply replaced the mipmap with string url... and it will work
        //Internet permission is required to access urls :)
        //It was so simple :)
    }
}
