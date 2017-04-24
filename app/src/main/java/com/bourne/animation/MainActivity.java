package com.bourne.animation;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.bourne.animation.dynamicAnimation.SpringAnimationActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void SpringAnimation(View view) {
        Intent intent = new Intent(this, SpringAnimationActivity.class);
        startActivity(intent);
    }
}
