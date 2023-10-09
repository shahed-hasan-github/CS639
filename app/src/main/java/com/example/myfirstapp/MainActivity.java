package com.example.myfirstapp;

import static android.content.ContentValues.TAG;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    Button btn;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.btnId);
        imageView = findViewById(R.id.viewImage);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    imageView.setVisibility(View.VISIBLE);
                    Log.d(TAG, "onClick: image is viewed");
                }catch (Exception e){
                    Log.e(TAG, "onClick: image is not loaded");
                }


            }
        });
    }
}