package com.boradurmus.cloudrobe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class SplashActivity extends AppCompatActivity {

    public Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Thread logoAnimation = new Thread(){
            @Override
            public void run(){
                ImageView logo = findViewById(R.id.Logo);
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.intro_logo);
                logo.startAnimation(animation);
            }

        };
        logoAnimation.start();

        Thread butonAnimation = new Thread(){
            @Override
            public void run(){
                Button button = findViewById(R.id.button);
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.intro_logo);
                button.startAnimation(animation);
            }

        };
        butonAnimation.start();

        Thread yaziAnimation = new Thread(){
            @Override
            public void run(){
                TextView yazi1 = findViewById(R.id.textView);
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.intro_logo);
                yazi1.startAnimation(animation);
            }

        };
        yaziAnimation.start();

        Thread aslogoAnimation = new Thread(){
            @Override
            public void run(){
                ImageView aslogo = findViewById(R.id.imageView4);
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.intro_logo);
                aslogo.startAnimation(animation);
            }

        };
        aslogoAnimation.start();

        btn1=findViewById(R.id.button);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent register = new Intent(SplashActivity.this, Register.class);
                startActivity(register);
                finish();
            }
        });
    }
}