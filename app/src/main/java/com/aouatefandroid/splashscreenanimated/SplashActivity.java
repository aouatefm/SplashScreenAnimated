package com.aouatefandroid.splashscreenanimated;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class SplashActivity extends Activity {
Animation fromBottom, fromTop;
ImageView imgSplash;
TextView txtSplash;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        txtSplash =findViewById(R.id.txtSplash);
        imgSplash=findViewById(R.id.imgSplash);
         fromBottom= AnimationUtils.loadAnimation(this, R.anim.frombottom);
        fromTop= AnimationUtils.loadAnimation(this, R.anim.fromtop);
        txtSplash.setAnimation(fromBottom);
        imgSplash.setAnimation(fromTop);


    }
}
