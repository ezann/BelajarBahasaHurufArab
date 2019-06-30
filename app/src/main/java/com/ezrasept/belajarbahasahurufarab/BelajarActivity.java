package com.ezrasept.belajarbahasahurufarab;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class BelajarActivity extends AppCompatActivity {

    ImageView belajar1, belajar2, belajar3;
    ImageButton exit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_belajar);

        belajar1 = findViewById(R.id.belajar1);
        belajar2 = findViewById(R.id.belajar2);
        belajar3 = findViewById(R.id.belajar3);
        exit = findViewById(R.id.keluar);

        belajar1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            Intent intent = new Intent(BelajarActivity.this,Belajar1Activity.class);
            startActivity(intent);
            }
        });
        belajar2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            Intent intent = new Intent(BelajarActivity.this,Belajar2Activity.class);
            startActivity(intent);
            }
        });
        belajar3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            Intent intent = new Intent(BelajarActivity.this,Belajar3Activity.class);
            startActivity(intent);
            }
        });

        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
