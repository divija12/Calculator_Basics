package com.example.calculator_basic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button scientific;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        scientific=findViewById(R.id.scientific);

        scientific.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent dataIntent=new Intent(MainActivity.this,MainActivity2.class);
                startActivity(dataIntent);
            }
        });
    }
}