package com.example.myshopee;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class Login_Activity extends AppCompatActivity
{

    EditText username,password;
    Button nxtBtn;
    ImageView google,facebook;
    TextView regiHere;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        nxtBtn = findViewById(R.id.nextbtn);

        google = findViewById(R.id.google);
        facebook = findViewById(R.id.facebook);

        regiHere = findViewById(R.id.registerhere);

        nxtBtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(Login_Activity.this,VerifyOTP_Activity.class);
                startActivity(intent);
            }
        });
    }
}