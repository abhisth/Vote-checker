package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText textFullname,textFathername,textMothername,textCtznnum,textMobnum,textAddress;

 Button btnContinue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();


        textFullname = findViewById(R.id.textFullname);
        textFathername = findViewById(R.id.textFathername);
        textMothername = findViewById(R.id.textMothername);
        textCtznnum = findViewById(R.id.textCtznnum);
        textMobnum = findViewById(R.id.textMobnum);
        textAddress = findViewById(R.id.textAddress);
        btnContinue = findViewById(R.id.btnContinue);

        btnContinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            String fulname = textFullname.getText().toString();
            String fname = textFathername.getText().toString();
            String mname = textMothername.getText().toString();
            String cnum = textCtznnum.getText().toString();
            String pnum = textMobnum.getText().toString();
            String adds = textAddress.getText().toString();

            Intent intent = new Intent(MainActivity.this, details.class);
        intent.putExtra("Keyfullname",fulname);
        intent.putExtra("Keyfathersname",fname);
        intent.putExtra("Keymothersname",mname);
        intent.putExtra("Keycitizennum",cnum);
        intent.putExtra("Keyphonenum",pnum);
        intent.putExtra("Keyaddress",adds);
        startActivity(intent);

Toast.makeText(MainActivity .this,"Loading Your Details",Toast.LENGTH_LONG).show();

        }
    });

        }
    }
