package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class votecheck extends AppCompatActivity {
Button btnBack1, btnCheck;
TextView textReturnhome, voteResult;
EditText textinputAge;
CardView circle_result;
int age;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_votecheck);
        getSupportActionBar().hide();


        textinputAge = findViewById(R.id.textinputAge);
        btnCheck = findViewById(R.id.btnCheck);
        voteResult = findViewById(R.id.voteResult);
        circle_result = findViewById(R.id.circle_result);

        btnCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                age = Integer.valueOf(textinputAge.getText().toString());

                if (age >= 18) {
                    voteResult.setText("You can Vote");
                    circle_result.setCardBackgroundColor(getResources().getColor(R.color.green));
                } else {
                    voteResult.setText("You can't Vote");
                    circle_result.setCardBackgroundColor(getResources().getColor(R.color.red));

//                    circle_result.setCardBackgroundColor(Integer.parseInt(String.valueOf(R.color.red)));
                }
            }
});

                btnBack1 = findViewById(R.id.btnBack1);
        btnBack1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(votecheck.this, details.class);
                startActivity(intent);

            }
        });

        textReturnhome = findViewById(R.id.textReturnhome);

        textReturnhome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(votecheck.this, MainActivity.class);
                startActivity(intent);

            }
        });
    }
}