package com.example.calculadorapvdndmobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FirstActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        //onclicklistener só funciona dentro do oncreate
        Button button = findViewById(R.id.btntomain);
        button.setOnClickListener (new View.OnClickListener(){
            public void onClick(View v) {
                Intent connect = new Intent(FirstActivity.this, MainActivity.class);
                startActivity(connect);
            }

        });

    }




}