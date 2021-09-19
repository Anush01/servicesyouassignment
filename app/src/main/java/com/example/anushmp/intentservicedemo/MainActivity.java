package com.example.anushmp.intentservicedemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnsave;

    TextView tc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnsave = findViewById(R.id.btnSave);

        tc = findViewById(R.id.tvlink);


        btnsave.setOnClickListener(v -> {

            Intent i = new Intent(MainActivity.this,DownloadSiteService.class);
            startService(i);

        });


    }
}