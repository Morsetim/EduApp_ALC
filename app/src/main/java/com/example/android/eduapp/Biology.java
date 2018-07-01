package com.example.android.eduapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.HashMap;
import java.util.Map;

public class Biology extends AppCompatActivity {
    RadioGroup r1;
    TextView resultText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.biology);
        resultText = findViewById(R.id.result);
        r1 = findViewById(R.id.Radio_group2);

    }

    public void refresh(View view) {
        startActivity(getIntent());
//        ttt = findViewById(R.id.Radio2);
//        ttt.toggle();
    }

    private void clickedValues(){
        resultText.setText("" +
                "Answer 1 is: Nucleus\n" +
                "Answer 2 is: This\n" +
                "Answer 3 is: This again");

    }

    public void submitForm(View view){
        clickedValues();
    }
}
