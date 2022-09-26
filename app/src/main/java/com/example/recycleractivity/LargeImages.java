package com.example.recycleractivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class LargeImages extends AppCompatActivity {

    private int toggle = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_large_images);
    }

   /* public void changeImage(View view){
        if (toggle == 0) {
            view.setBackgroundResource(R.drawable.dinosaur_medium);
            toggle = 1;
        } else {
            view.setBackgroundResource(R.drawable.ankylo);
            toggle = 0;
        }
    }*/

    public void changeImage(View view){
        if (toggle == 0) {
            view.setBackgroundResource(R.drawable.dinosaur_large);
            toggle = 1;
        } else {
            try {
                Thread.sleep(32); // two refreshes
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            view.setBackgroundResource(R.drawable.ankylo);
            toggle = 0;
        }
    }

}