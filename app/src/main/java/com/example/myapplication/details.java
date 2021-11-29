package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.BreakIterator;

public class details extends AppCompatActivity {


String fullName,fatherName,motherName,ctzNum,address;
String mobNum;
Button btnBack;
TextView textVotecheck,textviewFname, textviewFaname,textviewMoname,textviewAddress,textviewMobile,textCtznnum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        getSupportActionBar().hide();


        textviewFname = findViewById(R.id.textviewFname);
        textviewFaname = findViewById(R.id.textviewFaname);
        textviewMoname = findViewById(R.id.textviewMoname);
        textviewAddress = findViewById(R.id.textviewAddress);
        textviewMobile = findViewById(R.id.textviewMobile);
        textCtznnum = findViewById(R.id.textCtznnum);

        String fulname = getIntent().getStringExtra("Keyfullname");
        String fname = getIntent().getStringExtra("Keyfathersname");
        String mname = getIntent().getStringExtra("Keymothersname");
        String adds = getIntent().getStringExtra("Keyaddress");
        String pnum = getIntent().getStringExtra("Keyphonenum");
        String cnum = getIntent().getStringExtra("Keycitizennum");


        textviewFname.setText(fulname);
        textviewFaname.setText(fname);
        textviewMoname.setText(mname);
        textviewAddress.setText(adds);
        textviewMobile.setText(pnum);
        textCtznnum.setText(cnum);


        btnBack = findViewById(R.id.btnBack);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(details.this, MainActivity.class);
                startActivity(intent);

            }
        });
        textVotecheck = findViewById(R.id.textVotecheck);

        textVotecheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(details.this, votecheck.class);
                startActivity(intent);

            }
        });


    }
}