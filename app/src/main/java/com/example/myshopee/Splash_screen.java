package com.example.myshopee;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

public class Splash_screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);

        Window window = getWindow() ;
        window.addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);


        Thread splashTread = new Thread()
        {
            @Override
            public void run()
            {
                try
                {
                    sleep(2000);
                    startActivity(new Intent(getApplicationContext(), Login_Activity.class));
                    finish();
                }
                catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
                super.run();
            }
        };
        splashTread.start();
    }
}