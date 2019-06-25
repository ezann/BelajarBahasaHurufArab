package com.ezrasept.belajarbahasahurufarab;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class BelajarActivity extends AppCompatActivity {

    ImageView belajar1, belajar2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_belajar);

        belajar1 = findViewById(R.id.belajar1);
        belajar2 = findViewById(R.id.belajar2);

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

            }
        });
    }
}
