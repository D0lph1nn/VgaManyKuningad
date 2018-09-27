package com.example.opilane.vgamanykuningad;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    // Duration of wait
    private final int SPLASH_DISPLAY_LENGTH = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        boolean b = new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent mainIntent = new Intent(packageContext:SplashScreen.this, MainActivity.class)
                ;
                SplashScreen.this.startActivity(mainIntent);
                SplashScreen.this.finish();
            }
        };
    }
}
