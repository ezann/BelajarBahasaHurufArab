package com.ezrasept.belajarbahasahurufarab;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class Belajar1Activity extends AppCompatActivity {

    ImageView tampilHijaiyah;
    ImageButton kembali;


    public Belajar1Activity() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_belajar1);

        tampilHijaiyah = findViewById(R.id.tampil_hijaiyah);
        kembali = findViewById(R.id.kembali);

        kembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
                finish();
            }
        });

        final MediaPlayer SuaraAlif = MediaPlayer.create(this, R.raw.alif); //Memanggil nama lagu
        final MediaPlayer SuaraBa = MediaPlayer.create(this, R.raw.ba);
        final MediaPlayer SuaraTa = MediaPlayer.create(this, R.raw.ta);
        final MediaPlayer SuaraSa = MediaPlayer.create(this, R.raw.sa);
        final MediaPlayer SuaraJim = MediaPlayer.create(this, R.raw.jim);
        final MediaPlayer SuaraHa = MediaPlayer.create(this, R.raw.ha);
        final MediaPlayer SuaraKho = MediaPlayer.create(this, R.raw.kho);
        final MediaPlayer SuaraDal = MediaPlayer.create(this, R.raw.dal);
        final MediaPlayer SuaraDzal = MediaPlayer.create(this, R.raw.dzal);
        final MediaPlayer SuaraRo = MediaPlayer.create(this, R.raw.ro);
        final MediaPlayer SuaraJa = MediaPlayer.create(this, R.raw.dza);
        final MediaPlayer SuaraSin = MediaPlayer.create(this, R.raw.sin);
        final MediaPlayer SuaraSyin = MediaPlayer.create(this, R.raw.syin);
        final MediaPlayer SuaraShad = MediaPlayer.create(this, R.raw.shad);
        final MediaPlayer SuaraDod = MediaPlayer.create(this, R.raw.dod);
        final MediaPlayer SuaraTo = MediaPlayer.create(this, R.raw.to);
        final MediaPlayer SuaraDo = MediaPlayer.create(this, R.raw.dho);
        final MediaPlayer SuaraAin = MediaPlayer.create(this, R.raw.ain);
        final MediaPlayer SuaraGin = MediaPlayer.create(this, R.raw.gin);
        final MediaPlayer Suarafa = MediaPlayer.create(this, R.raw.fa);
        final MediaPlayer SuaraKof = MediaPlayer.create(this, R.raw.kof);
        final MediaPlayer SuaraKaf = MediaPlayer.create(this, R.raw.kaf);
        final MediaPlayer SuaraLam = MediaPlayer.create(this, R.raw.lam);
        final MediaPlayer SuaraMim = MediaPlayer.create(this, R.raw.min);
        final MediaPlayer SuaraNun = MediaPlayer.create(this, R.raw.nun);
        final MediaPlayer SuaraWawu = MediaPlayer.create(this, R.raw.wawu);
        final MediaPlayer SuaraHA = MediaPlayer.create(this, R.raw.haa);
        final MediaPlayer SuaraYa = MediaPlayer.create(this, R.raw.ya);

        ImageButton ButtonSuara = this.findViewById(R.id.alif); //fariabel button
        ImageButton ButtonSuara2 = this.findViewById(R.id.ba);
        ImageButton ButtonSuara3 = this.findViewById(R.id.ta);
        ImageButton ButtonSuara4 = this.findViewById(R.id.tsa);
        ImageButton ButtonSuara5 = this.findViewById(R.id.jim);
        ImageButton ButtonSuara6 = this.findViewById(R.id.kha);
        ImageButton ButtonSuara7 = this.findViewById(R.id.kho);
        ImageButton ButtonSuara8 = this.findViewById(R.id.dal);
        ImageButton ButtonSuara9 = this.findViewById(R.id.dzal);
        ImageButton ButtonSuara10 = this.findViewById(R.id.ra);
        ImageButton ButtonSuara11 = this.findViewById(R.id.za);
        ImageButton ButtonSuara12 = this.findViewById(R.id.sin);
        ImageButton ButtonSuara13 = this.findViewById(R.id.syin);
        ImageButton ButtonSuara14 = this.findViewById(R.id.shod);
        ImageButton ButtonSuara15 = this.findViewById(R.id.dhod);
        ImageButton ButtonSuara16 = this.findViewById(R.id.tho);
        ImageButton ButtonSuara17 = this.findViewById(R.id.dhlo);
        ImageButton ButtonSuara18 = this.findViewById(R.id.ain);
        ImageButton ButtonSuara19 = this.findViewById(R.id.ghoin);
        ImageButton ButtonSuara20 = this.findViewById(R.id.fa);
        ImageButton ButtonSuara21 = this.findViewById(R.id.kaf);
        ImageButton ButtonSuara22 = this.findViewById(R.id.qof);
        ImageButton ButtonSuara23 = this.findViewById(R.id.lam);
        ImageButton ButtonSuara24 = this.findViewById(R.id.mim);
        ImageButton ButtonSuara25 = this.findViewById(R.id.nun);
        ImageButton ButtonSuara26 = this.findViewById(R.id.wawu);
        ImageButton ButtonSuara27 = this.findViewById(R.id.ha);
        ImageButton ButtonSuara28 = this.findViewById(R.id.ya);

        /*Menghidupkan Suara */
        ButtonSuara.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                tampilHijaiyah.setImageResource(R.drawable.alif);
                SuaraAlif.start();
            }
        });

        ButtonSuara2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                tampilHijaiyah.setImageResource(R.drawable.ba);
                SuaraBa.start();
            }
        });

        ButtonSuara3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                tampilHijaiyah.setImageResource(R.drawable.ta);
                SuaraTa.start();
            }
        });

        ButtonSuara4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                tampilHijaiyah.setImageResource(R.drawable.tsa);
                SuaraSa.start();
            }
        });
        ButtonSuara5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                tampilHijaiyah.setImageResource(R.drawable.jim);
                SuaraJim.start();
            }
        });
        ButtonSuara6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                tampilHijaiyah.setImageResource(R.drawable.kha);
                SuaraHa.start();
            }
        });
        ButtonSuara7.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                tampilHijaiyah.setImageResource(R.drawable.kho);
                SuaraKho.start();
            }
        });

        ButtonSuara8.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                tampilHijaiyah.setImageResource(R.drawable.dal);
                SuaraDal.start();
            }
        });

        ButtonSuara9.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                tampilHijaiyah.setImageResource(R.drawable.dzal);
                SuaraDzal.start();
            }
        });
        ButtonSuara10.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                tampilHijaiyah.setImageResource(R.drawable.ra);
                SuaraRo.start();
            }
        });
        ButtonSuara11.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                tampilHijaiyah.setImageResource(R.drawable.za);
                SuaraJa.start();
            }
        });

        ButtonSuara12.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                tampilHijaiyah.setImageResource(R.drawable.sin);
                SuaraSin.start();
            }
        });
        ButtonSuara13.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                tampilHijaiyah.setImageResource(R.drawable.syin);
                SuaraSyin.start();
            }
        });
        ButtonSuara14.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                tampilHijaiyah.setImageResource(R.drawable.shod);
                SuaraShad.start();
            }
        });

        ButtonSuara15.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                tampilHijaiyah.setImageResource(R.drawable.dhod);
                SuaraDod.start();
            }
        });
        ButtonSuara16.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                tampilHijaiyah.setImageResource(R.drawable.tho);
                SuaraTo.start();
            }
        });
        ButtonSuara17.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                tampilHijaiyah.setImageResource(R.drawable.dhlo);
                SuaraDo.start();
            }
        });
        ButtonSuara18.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                tampilHijaiyah.setImageResource(R.drawable.ain);
                SuaraAin.start();
            }
        });

        ButtonSuara19.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                tampilHijaiyah.setImageResource(R.drawable.ghoin);
                SuaraGin.start();
            }
        });
        ButtonSuara20.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                tampilHijaiyah.setImageResource(R.drawable.fa);
                Suarafa.start();
            }
        });
        ButtonSuara21.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                tampilHijaiyah.setImageResource(R.drawable.kaf);
                SuaraKof.start();
            }
        });
        ButtonSuara22.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                tampilHijaiyah.setImageResource(R.drawable.qof);
                // TODO Auto-generated method stub
                SuaraKaf.start();
            }
        });
        ButtonSuara23.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                tampilHijaiyah.setImageResource(R.drawable.lam);
                SuaraLam.start();
            }
        });

        ButtonSuara24.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                tampilHijaiyah.setImageResource(R.drawable.mim);
                SuaraMim.start();
            }
        });
        ButtonSuara25.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                tampilHijaiyah.setImageResource(R.drawable.nun);

                SuaraNun.start();
            }
        });
        ButtonSuara26.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                tampilHijaiyah.setImageResource(R.drawable.wawu);
                SuaraWawu.start();
            }
        });
        ButtonSuara27.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                tampilHijaiyah.setImageResource(R.drawable.ha);
                SuaraHA.start();
            }
        });
        ButtonSuara28.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                tampilHijaiyah.setImageResource(R.drawable.ya);
                SuaraYa.start();
            }
        });
    }
}
