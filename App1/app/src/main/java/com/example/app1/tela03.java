package com.example.app1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class tela03 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela03);
    }
    public void voltaLogin(View view){
        Intent intent3 = new Intent(getApplicationContext(),MainActivity.class);
        startActivity(intent3);
    }
    public void voltaSplash(View view){
        Intent intent2 = new Intent(getApplicationContext(),SplashActivity.class);
        startActivity(intent2);
    }
}