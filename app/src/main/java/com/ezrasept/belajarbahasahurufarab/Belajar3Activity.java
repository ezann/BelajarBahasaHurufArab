package com.ezrasept.belajarbahasahurufarab;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class Belajar3Activity extends AppCompatActivity {

    ImageView tanwin1, tanwin2, tanwin3;
    ImageButton kembali;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_belajar3);

        tanwin1 = findViewById(R.id.tanwin1);
        tanwin2 = findViewById(R.id.tanwin2);
        tanwin3 = findViewById(R.id.tanwin3);
        kembali = findViewById(R.id.kembali);

        kembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
                finish();
            }
        });

        tanwin1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Belajar3Activity.this,FathahTainActivity.class);
                startActivity(intent);
            }
        });
        tanwin2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Belajar3Activity.this,KasrohTainActivity.class);
                startActivity(intent);
            }
        });
        tanwin3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Belajar3Activity.this,DhomahTainActivity.class);
                startActivity(intent);
            }
        });
    }
}
