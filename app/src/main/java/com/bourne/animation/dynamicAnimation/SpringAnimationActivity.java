package com.bourne.animation.dynamicAnimation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.bourne.animation.R;

public class SpringAnimationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spring_animation);
        getSupportActionBar().setTitle("SpringAnimation");
    }
}
