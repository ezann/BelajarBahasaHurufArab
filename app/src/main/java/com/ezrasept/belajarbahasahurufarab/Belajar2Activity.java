package com.ezrasept.belajarbahasahurufarab;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class Belajar2Activity extends AppCompatActivity {

    ImageView harokat1, harokat2, harokat3;
    ImageButton kembali;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_belajar2);

        harokat1 = findViewById(R.id.harokat1);
        harokat2 = findViewById(R.id.harokat2);
        harokat3 = findViewById(R.id.harokat3);
        kembali = findViewById(R.id.kembali);

        kembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
                finish();
            }
        });

        harokat1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Belajar2Activity.this,FathahActivity.class);
                startActivity(intent);
            }
        });
        harokat2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Belajar2Activity.this,KasrohActivity.class);
                startActivity(intent);
            }
        });
        harokat3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Belajar2Activity.this,DhomahActivity.class);
                startActivity(intent);
            }
        });
    }
}
