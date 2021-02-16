package com.example.assignmentq5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Animation top,bottom;
    ImageView image;
    TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Handler handler= new Handler();
        top= AnimationUtils.loadAnimation(MainActivity.this,R.anim.top_amimation);
        bottom= AnimationUtils.loadAnimation(MainActivity.this,R.anim.bottom_animation);
        image=findViewById(R.id.image);
        text=findViewById(R.id.slogan);
        image.setAnimation(top);
        text.setAnimation(bottom);
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {

                sta();
                finish();
            }
        },3000);
    }
    public void sta(){

        try {

            startActivity(new Intent(this,Login.class));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}