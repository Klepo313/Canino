package com.example.myapplication;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.transition.Fade;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class nakonRegistracije extends AppCompatActivity {

    Animation fromtop, fromright, fromleft;
    TextView parStvariTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_nakon_registracije);

        parStvariTxt = (TextView)findViewById(R.id.parstvari);
        fromright = AnimationUtils.loadAnimation(this,R.anim.fromright);
        parStvariTxt.setAnimation(fromright);

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void run() {
                nakonRegistracije.this.startActivity(new Intent(nakonRegistracije.this, ImasPsa.class));
                Fade fade = new Fade();
                fade.setDuration(1000);
                getWindow().setExitTransition(fade);
                finish();
            }
        }, 5000);
    }
}