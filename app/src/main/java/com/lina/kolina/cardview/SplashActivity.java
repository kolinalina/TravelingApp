package com.lina.kolina.cardview;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.widget.ImageView;

public class SplashActivity extends AppCompatActivity {

//    deklarasi variabel

    private ImageView logo;
    int delay = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_splash);


//        menyambungkan dengan objectnya
        logo = (ImageView) findViewById(R.id.splash);

//        memanfaatkan method postdelay pada class handler
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

//                untuk pindah halaman
                Intent intent = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        }, delay);

    }
}
