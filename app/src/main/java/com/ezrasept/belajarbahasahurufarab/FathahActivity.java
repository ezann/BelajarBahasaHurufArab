package com.ezrasept.belajarbahasahurufarab;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class FathahActivity extends AppCompatActivity {

    ImageView tampilFathah;
    ImageButton kembali;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fathah);

        tampilFathah = findViewById(R.id.tampil_fathah);
        kembali = findViewById(R.id.kembali);

        kembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
                finish();
            }
        });

        final MediaPlayer SuaraBa = MediaPlayer.create(this, R.raw.fatah_ba);
        final MediaPlayer SuaraTa = MediaPlayer.create(this, R.raw.fatah_ta);
        final MediaPlayer SuaraSa = MediaPlayer.create(this, R.raw.fatah_sa);
        final MediaPlayer SuaraJim = MediaPlayer.create(this, R.raw.fatah_ja);
        final MediaPlayer SuaraHa = MediaPlayer.create(this, R.raw.fatah_ha);
        final MediaPlayer SuaraKho = MediaPlayer.create(this, R.raw.fatah_kho);
        final MediaPlayer SuaraDal = MediaPlayer.create(this, R.raw.fatah_da);
        final MediaPlayer SuaraDzal = MediaPlayer.create(this, R.raw.fatah_dza);
        final MediaPlayer SuaraRo = MediaPlayer.create(this, R.raw.fatah_ro);
        final MediaPlayer SuaraJa = MediaPlayer.create(this, R.raw.fatah_za);
        final MediaPlayer SuaraSin = MediaPlayer.create(this, R.raw.fatah_sa);
        final MediaPlayer SuaraSyin = MediaPlayer.create(this, R.raw.fatah_sya);
        final MediaPlayer SuaraShad = MediaPlayer.create(this, R.raw.fatah_sho);
        final MediaPlayer SuaraDod = MediaPlayer.create(this, R.raw.fatah_dho);
        final MediaPlayer SuaraTo = MediaPlayer.create(this, R.raw.fatah_tho);
        final MediaPlayer SuaraDo = MediaPlayer.create(this, R.raw.fatah_dzo);
        final MediaPlayer SuaraAin = MediaPlayer.create(this, R.raw.fatah_aa);
        final MediaPlayer SuaraGin = MediaPlayer.create(this, R.raw.fatah_gho);
        final MediaPlayer Suarafa = MediaPlayer.create(this, R.raw.fatah_fa);
        final MediaPlayer SuaraKof = MediaPlayer.create(this, R.raw.fatah_qo);
        final MediaPlayer SuaraKaf = MediaPlayer.create(this, R.raw.fatah_ka);
        final MediaPlayer SuaraLam = MediaPlayer.create(this, R.raw.fatah_la);
        final MediaPlayer SuaraMim = MediaPlayer.create(this, R.raw.fatah_ma);
        final MediaPlayer SuaraNun = MediaPlayer.create(this, R.raw.fatah_na);
        final MediaPlayer SuaraWawu = MediaPlayer.create(this, R.raw.fatah_wa);
        final MediaPlayer SuaraHA = MediaPlayer.create(this, R.raw.fatah_haa);
        final MediaPlayer SuaraYa = MediaPlayer.create(this, R.raw.fatah_ya);

        ImageButton ButtonSuara2 = this.findViewById(R.id.fathah_ba);
        ImageButton ButtonSuara3 = this.findViewById(R.id.fathah_ta);
        ImageButton ButtonSuara4 = this.findViewById(R.id.fathah_tsa);
        ImageButton ButtonSuara5 = this.findViewById(R.id.fathah_jim);
        ImageButton ButtonSuara6 = this.findViewById(R.id.fathah_kha);
        ImageButton ButtonSuara7 = this.findViewById(R.id.fathah_kho);
        ImageButton ButtonSuara8 = this.findViewById(R.id.fathah_dal);
        ImageButton ButtonSuara9 = this.findViewById(R.id.fathah_dzal);
        ImageButton ButtonSuara10 = this.findViewById(R.id.fathah_ro);
        ImageButton ButtonSuara11 = this.findViewById(R.id.fathah_zai);
        ImageButton ButtonSuara12 = this.findViewById(R.id.fathah_sin);
        ImageButton ButtonSuara13 = this.findViewById(R.id.fathah_syin);
        ImageButton ButtonSuara14 = this.findViewById(R.id.fathah_shod);
        ImageButton ButtonSuara15 = this.findViewById(R.id.fathah_dhod);
        ImageButton ButtonSuara16 = this.findViewById(R.id.fathah_tho);
        ImageButton ButtonSuara17 = this.findViewById(R.id.fathah_dhlo);
        ImageButton ButtonSuara18 = this.findViewById(R.id.fathah_ain);
        ImageButton ButtonSuara19 = this.findViewById(R.id.fathah_ghoin);
        ImageButton ButtonSuara20 = this.findViewById(R.id.fathah_fa);
        ImageButton ButtonSuara21 = this.findViewById(R.id.fathah_qof);
        ImageButton ButtonSuara22 = this.findViewById(R.id.fathah_kaf);
        ImageButton ButtonSuara23 = this.findViewById(R.id.fathah_lam);
        ImageButton ButtonSuara24 = this.findViewById(R.id.fathah_mim);
        ImageButton ButtonSuara25 = this.findViewById(R.id.fathah_nun);
        ImageButton ButtonSuara26 = this.findViewById(R.id.fathah_wawu);
        ImageButton ButtonSuara27 = this.findViewById(R.id.fathah_ha);
        ImageButton ButtonSuara28 = this.findViewById(R.id.fathah_ya);


        ButtonSuara2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                tampilFathah.setImageResource(R.drawable.fathahba);
                SuaraBa.start();
            }
        });

        ButtonSuara3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                tampilFathah.setImageResource(R.drawable.fathahta);
                SuaraTa.start();
            }
        });

        ButtonSuara4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                tampilFathah.setImageResource(R.drawable.fathahtsa);
                SuaraSa.start();
            }
        });
        ButtonSuara5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                tampilFathah.setImageResource(R.drawable.fathahjim);
                SuaraJim.start();
            }
        });
        ButtonSuara6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                tampilFathah.setImageResource(R.drawable.fathahkha);
                SuaraHa.start();
            }
        });
        ButtonSuara7.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                tampilFathah.setImageResource(R.drawable.fathahkho);
                SuaraKho.start();
            }
        });

        ButtonSuara8.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                tampilFathah.setImageResource(R.drawable.fathahdal);
                SuaraDal.start();
            }
        });

        ButtonSuara9.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                tampilFathah.setImageResource(R.drawable.fathahdzal);
                SuaraDzal.start();
            }
        });
        ButtonSuara10.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                tampilFathah.setImageResource(R.drawable.fathahro);
                SuaraRo.start();
            }
        });
        ButtonSuara11.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                tampilFathah.setImageResource(R.drawable.fathahzai);
                SuaraJa.start();
            }
        });

        ButtonSuara12.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                tampilFathah.setImageResource(R.drawable.fathahsin);
                SuaraSin.start();
            }
        });
        ButtonSuara13.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                tampilFathah.setImageResource(R.drawable.fathahsyin);
                SuaraSyin.start();
            }
        });
        ButtonSuara14.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                tampilFathah.setImageResource(R.drawable.fathahshod);
                SuaraShad.start();
            }
        });

        ButtonSuara15.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                tampilFathah.setImageResource(R.drawable.fathahdhod);
                SuaraDod.start();
            }
        });
        ButtonSuara16.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                tampilFathah.setImageResource(R.drawable.fathahtho);
                SuaraTo.start();
            }
        });
        ButtonSuara17.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                tampilFathah.setImageResource(R.drawable.fathahdhlo);
                SuaraDo.start();
            }
        });
        ButtonSuara18.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                tampilFathah.setImageResource(R.drawable.fathahain);
                SuaraAin.start();
            }
        });

        ButtonSuara19.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                tampilFathah.setImageResource(R.drawable.fathahghoin);
                SuaraGin.start();
            }
        });
        ButtonSuara20.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                tampilFathah.setImageResource(R.drawable.fathahfa);
                Suarafa.start();
            }
        });
        ButtonSuara21.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                tampilFathah.setImageResource(R.drawable.fathahqof);
                SuaraKof.start();
            }
        });
        ButtonSuara22.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                tampilFathah.setImageResource(R.drawable.fathahkaf);
                // TODO Auto-generated method stub
                SuaraKaf.start();
            }
        });
        ButtonSuara23.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                tampilFathah.setImageResource(R.drawable.fathahlam);
                SuaraLam.start();
            }
        });

        ButtonSuara24.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                tampilFathah.setImageResource(R.drawable.fathahmim);
                SuaraMim.start();
            }
        });
        ButtonSuara25.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                tampilFathah.setImageResource(R.drawable.fathahnun);
                SuaraNun.start();
            }
        });
        ButtonSuara26.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                tampilFathah.setImageResource(R.drawable.fathahwawu);
                SuaraWawu.start();
            }
        });
        ButtonSuara27.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                tampilFathah.setImageResource(R.drawable.fathahha);
                SuaraHA.start();
            }
        });
        ButtonSuara28.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                tampilFathah.setImageResource(R.drawable.fathahya);
                SuaraYa.start();
            }
        });
    }
}
