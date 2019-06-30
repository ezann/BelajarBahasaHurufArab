package com.ezrasept.belajarbahasahurufarab;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class KasrohTainActivity extends AppCompatActivity {

    ImageView tampilKasrohTain;
    ImageButton kembali;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kasroh_tain);

        tampilKasrohTain = findViewById(R.id.tampil_kasroh_tain);
        kembali = findViewById(R.id.kembali);

        kembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
                finish();
            }
        });

        final MediaPlayer SuaraAlif = MediaPlayer.create(this, R.raw.tanwin_kasroh_iin); //Memanggil nama lagu
        final MediaPlayer SuaraBa = MediaPlayer.create(this, R.raw.tanwin_kasroh_bin);
        final MediaPlayer SuaraTa = MediaPlayer.create(this, R.raw.tanwin_kasroh_tin);
        final MediaPlayer SuaraSa = MediaPlayer.create(this, R.raw.tanwin_kasroh_sin);
        final MediaPlayer SuaraJim = MediaPlayer.create(this, R.raw.tanwin_kasroh_jin);
        final MediaPlayer SuaraHa = MediaPlayer.create(this, R.raw.tanwin_kasroh_hin);
        final MediaPlayer SuaraKho = MediaPlayer.create(this, R.raw.tanwin_kasroh_khin);
        final MediaPlayer SuaraDal = MediaPlayer.create(this, R.raw.tanwin_kasroh_din);
        final MediaPlayer SuaraDzal = MediaPlayer.create(this, R.raw.tanwin_kasroh_dzin);
        final MediaPlayer SuaraRo = MediaPlayer.create(this, R.raw.button); //
        final MediaPlayer SuaraJa = MediaPlayer.create(this, R.raw.button);
        final MediaPlayer SuaraSin = MediaPlayer.create(this, R.raw.tanwin_kasroh_sin);
        final MediaPlayer SuaraSyin = MediaPlayer.create(this, R.raw.button);
        final MediaPlayer SuaraShad = MediaPlayer.create(this, R.raw.tanwin_kasroh_shin);
        final MediaPlayer SuaraDod = MediaPlayer.create(this, R.raw.tanwin_kasroh_dhin);
        final MediaPlayer SuaraTo = MediaPlayer.create(this, R.raw.tanwin_kasroh_thin);
        final MediaPlayer SuaraDo = MediaPlayer.create(this, R.raw.tanwin_kasroh_dziin);
        final MediaPlayer SuaraAin = MediaPlayer.create(this, R.raw.tanwin_kasroh_iin);
        final MediaPlayer SuaraGin = MediaPlayer.create(this, R.raw.tanwin_kasroh_ghin);
        final MediaPlayer Suarafa = MediaPlayer.create(this, R.raw.tanwin_kasroh_fin);
        final MediaPlayer SuaraKof = MediaPlayer.create(this, R.raw.tanwin_kasroh_qin);
        final MediaPlayer SuaraKaf = MediaPlayer.create(this, R.raw.tanwin_kasroh_kin);
        final MediaPlayer SuaraLam = MediaPlayer.create(this, R.raw.button);
        final MediaPlayer SuaraMim = MediaPlayer.create(this, R.raw.button);
        final MediaPlayer SuaraNun = MediaPlayer.create(this, R.raw.tanwin_kasroh_nin);
        final MediaPlayer SuaraWawu = MediaPlayer.create(this, R.raw.tanwin_kasroh_win);
        final MediaPlayer SuaraHA = MediaPlayer.create(this, R.raw.tanwin_kasroh_hiin);
        final MediaPlayer SuaraYa = MediaPlayer.create(this, R.raw.tanwin_kasroh_yin);

        ImageButton ButtonSuara = this.findViewById(R.id.kasroh_alif); //fariabel button
        ImageButton ButtonSuara2 = this.findViewById(R.id.kasroh_ba);
        ImageButton ButtonSuara3 = this.findViewById(R.id.kasroh_ta);
        ImageButton ButtonSuara4 = this.findViewById(R.id.kasroh_tsa);
        ImageButton ButtonSuara5 = this.findViewById(R.id.kasroh_jim);
        ImageButton ButtonSuara6 = this.findViewById(R.id.kasroh_kha);
        ImageButton ButtonSuara7 = this.findViewById(R.id.kasroh_kho);
        ImageButton ButtonSuara8 = this.findViewById(R.id.kasroh_dal);
        ImageButton ButtonSuara9 = this.findViewById(R.id.kasroh_dzal);
        ImageButton ButtonSuara10 = this.findViewById(R.id.kasroh_ra);
        ImageButton ButtonSuara11 = this.findViewById(R.id.kasroh_zai);
        ImageButton ButtonSuara12 = this.findViewById(R.id.kasroh_sin);
        ImageButton ButtonSuara13 = this.findViewById(R.id.kasroh_syin);
        ImageButton ButtonSuara14 = this.findViewById(R.id.kasroh_shod);
        ImageButton ButtonSuara15 = this.findViewById(R.id.kasroh_dhod);
        ImageButton ButtonSuara16 = this.findViewById(R.id.kasroh_tho);
        ImageButton ButtonSuara17 = this.findViewById(R.id.kasroh_dhlo);
        ImageButton ButtonSuara18 = this.findViewById(R.id.kasroh_ain);
        ImageButton ButtonSuara19 = this.findViewById(R.id.kasroh_ghoin);
        ImageButton ButtonSuara20 = this.findViewById(R.id.kasroh_fa);
        ImageButton ButtonSuara21 = this.findViewById(R.id.kasroh_qof);
        ImageButton ButtonSuara22 = this.findViewById(R.id.kasroh_kaf);
        ImageButton ButtonSuara23 = this.findViewById(R.id.kasroh_lam);
        ImageButton ButtonSuara24 = this.findViewById(R.id.kasroh_mim);
        ImageButton ButtonSuara25 = this.findViewById(R.id.kasroh_nun);
        ImageButton ButtonSuara26 = this.findViewById(R.id.kasroh_wawu);
        ImageButton ButtonSuara27 = this.findViewById(R.id.kasroh_ha);
        ImageButton ButtonSuara28 = this.findViewById(R.id.kasroh_ya);

        /*Menghidupkan Suara */
        ButtonSuara.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                tampilKasrohTain.setImageResource(R.drawable.alif_tanwin_in);
                SuaraAlif.start();
            }
        });

        ButtonSuara2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                tampilKasrohTain.setImageResource(R.drawable.ba_tanwin_bin);
                SuaraBa.start();
            }
        });

        ButtonSuara3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                tampilKasrohTain.setImageResource(R.drawable.ta_tanwin_tin);
                SuaraTa.start();
            }
        });

        ButtonSuara4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                tampilKasrohTain.setImageResource(R.drawable.tsa_tanwin_tsin);
                SuaraSa.start();
            }
        });
        ButtonSuara5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                tampilKasrohTain.setImageResource(R.drawable.jim_tanwin_jin);
                SuaraJim.start();
            }
        });
        ButtonSuara6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                tampilKasrohTain.setImageResource(R.drawable.kha_tanwin_khin);
                SuaraHa.start();
            }
        });
        ButtonSuara7.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                tampilKasrohTain.setImageResource(R.drawable.kho_tanwin_khin);
                SuaraKho.start();
            }
        });

        ButtonSuara8.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                tampilKasrohTain.setImageResource(R.drawable.dal_tanwin_din);
                SuaraDal.start();
            }
        });

        ButtonSuara9.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                tampilKasrohTain.setImageResource(R.drawable.dzal_tanwin_dzin);
                SuaraDzal.start();
            }
        });
        ButtonSuara10.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                tampilKasrohTain.setImageResource(R.drawable.ra_tanwin_rin);
                SuaraRo.start();
            }
        });
        ButtonSuara11.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                tampilKasrohTain.setImageResource(R.drawable.zai_tanwin_zin);
                SuaraJa.start();
            }
        });

        ButtonSuara12.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                tampilKasrohTain.setImageResource(R.drawable.sin_tanwin_sin);
                SuaraSin.start();
            }
        });
        ButtonSuara13.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                tampilKasrohTain.setImageResource(R.drawable.syin_tanwin_syin);
                SuaraSyin.start();
            }
        });
        ButtonSuara14.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                tampilKasrohTain.setImageResource(R.drawable.shod_tanwin_shin);
                SuaraShad.start();
            }
        });

        ButtonSuara15.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                tampilKasrohTain.setImageResource(R.drawable.dhod_tanwin_dhin);
                SuaraDod.start();
            }
        });
        ButtonSuara16.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                tampilKasrohTain.setImageResource(R.drawable.tho_tanwin_thin);
                SuaraTo.start();
            }
        });
        ButtonSuara17.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                tampilKasrohTain.setImageResource(R.drawable.dhlo_tanwin_zhin);
                SuaraDo.start();
            }
        });
        ButtonSuara18.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                tampilKasrohTain.setImageResource(R.drawable.ain_tanwin_in);
                SuaraAin.start();
            }
        });

        ButtonSuara19.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                tampilKasrohTain.setImageResource(R.drawable.ghoin_tanwin_ghin);
                SuaraGin.start();
            }
        });
        ButtonSuara20.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                tampilKasrohTain.setImageResource(R.drawable.fa_tanwin_fin);
                Suarafa.start();
            }
        });
        ButtonSuara21.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                tampilKasrohTain.setImageResource(R.drawable.qof_tanwin_qin);
                SuaraKof.start();
            }
        });
        ButtonSuara22.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                tampilKasrohTain.setImageResource(R.drawable.kaf_tanwin_kin);
                // TODO Auto-generated method stub
                SuaraKaf.start();
            }
        });
        ButtonSuara23.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                tampilKasrohTain.setImageResource(R.drawable.lam_tanwin_lin);
                SuaraLam.start();
            }
        });

        ButtonSuara24.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                tampilKasrohTain.setImageResource(R.drawable.mim_tanwin_min);
                SuaraMim.start();
            }
        });
        ButtonSuara25.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                tampilKasrohTain.setImageResource(R.drawable.nun_tanwin_nin);

                SuaraNun.start();
            }
        });
        ButtonSuara26.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                tampilKasrohTain.setImageResource(R.drawable.wawu_tanwin_win);
                SuaraWawu.start();
            }
        });
        ButtonSuara27.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                tampilKasrohTain.setImageResource(R.drawable.ha_tanwin_hin);
                SuaraHA.start();
            }
        });
        ButtonSuara28.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                tampilKasrohTain.setImageResource(R.drawable.ya_tanwin_yin);
                SuaraYa.start();
            }
        });
    }
}
