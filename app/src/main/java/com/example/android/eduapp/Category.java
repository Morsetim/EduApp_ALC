package com.example.android.eduapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

public class Category extends AppCompatActivity {

    RadioButton radioButton_one;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.category);

        radioButton_one = findViewById(R.id.Radio2);
        TextView openBio = findViewById(R.id.text1);
        openBio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openBio();

            }
        });

        TextView openChemistry = findViewById(R.id.text2);
        openChemistry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openChemistry();

            }
        });

        TextView openMathematics = findViewById(R.id.text3);
        openMathematics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMathematics();

            }
        });

        TextView openPhysics = findViewById(R.id.text4);
        openPhysics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openPhysics();

            }
        });



    }

    public void openBio(){
        Intent intent = new Intent(this, Biology.class);
        startActivity(intent);
    }

    public void openChemistry(){
        Intent intent = new Intent(this, Biology.class);
        startActivity(intent);
    }

    public void openMathematics(){
        Intent intent = new Intent(this, Biology.class);
        startActivity(intent);
    }

    public void openPhysics(){
        Intent intent = new Intent(this, Biology.class);
        startActivity(intent);
    }



    public void refresh(View view) {
//        startActivity(getIntent());
        radioButton_one.toggle();
    }


}


