package com.ezrasept.belajarbahasahurufarab;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class DhomahActivity extends AppCompatActivity {

    ImageView tampilDhomah;
    ImageButton kembali;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dhomah);

        tampilDhomah = findViewById(R.id.tampil_dhomah);
        kembali = findViewById(R.id.kembali);

        kembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
                finish();
            }
        });

        final MediaPlayer SuaraAlif = MediaPlayer.create(this, R.raw.u); //Memanggil nama lagu
        final MediaPlayer SuaraBa = MediaPlayer.create(this, R.raw.bu);
        final MediaPlayer SuaraTa = MediaPlayer.create(this, R.raw.tu);
        final MediaPlayer SuaraSa = MediaPlayer.create(this, R.raw.su);
        final MediaPlayer SuaraJim = MediaPlayer.create(this, R.raw.ju);
        final MediaPlayer SuaraHa = MediaPlayer.create(this, R.raw.hu);
        final MediaPlayer SuaraKho = MediaPlayer.create(this, R.raw.khu);
        final MediaPlayer SuaraDal = MediaPlayer.create(this, R.raw.du);
        final MediaPlayer SuaraDzal = MediaPlayer.create(this, R.raw.dzu);
        final MediaPlayer SuaraRo = MediaPlayer.create(this, R.raw.ru);
        final MediaPlayer SuaraJa = MediaPlayer.create(this, R.raw.zu);
        final MediaPlayer SuaraSin = MediaPlayer.create(this, R.raw.su);
        final MediaPlayer SuaraSyin = MediaPlayer.create(this, R.raw.syu);
        final MediaPlayer SuaraShad = MediaPlayer.create(this, R.raw.shu);
        final MediaPlayer SuaraDod = MediaPlayer.create(this, R.raw.dhu);
        final MediaPlayer SuaraTo = MediaPlayer.create(this, R.raw.thu);
        final MediaPlayer SuaraDo = MediaPlayer.create(this, R.raw.dhu);
        final MediaPlayer SuaraAin = MediaPlayer.create(this, R.raw.uu);
        final MediaPlayer SuaraGin = MediaPlayer.create(this, R.raw.ghu);
        final MediaPlayer Suarafa = MediaPlayer.create(this, R.raw.fu);
        final MediaPlayer SuaraKof = MediaPlayer.create(this, R.raw.qu);
        final MediaPlayer SuaraKaf = MediaPlayer.create(this, R.raw.ku);
        final MediaPlayer SuaraLam = MediaPlayer.create(this, R.raw.lu);
        final MediaPlayer SuaraMim = MediaPlayer.create(this, R.raw.mu);
        final MediaPlayer SuaraNun = MediaPlayer.create(this, R.raw.nu);
        final MediaPlayer SuaraWawu = MediaPlayer.create(this, R.raw.wu);
        final MediaPlayer SuaraHA = MediaPlayer.create(this, R.raw.huu);
        final MediaPlayer SuaraYa = MediaPlayer.create(this, R.raw.yu);

        ImageButton ButtonSuara = this.findViewById(R.id.dommah_alif); //fariabel button
        ImageButton ButtonSuara2 = this.findViewById(R.id.dommah_ba);
        ImageButton ButtonSuara3 = this.findViewById(R.id.dommah_ta);
        ImageButton ButtonSuara4 = this.findViewById(R.id.dommah_tsa);
        ImageButton ButtonSuara5 = this.findViewById(R.id.dommah_jim);
        ImageButton ButtonSuara6 = this.findViewById(R.id.dommah_kha);
        ImageButton ButtonSuara7 = this.findViewById(R.id.dommah_kho);
        ImageButton ButtonSuara8 = this.findViewById(R.id.dommah_dal);
        ImageButton ButtonSuara9 = this.findViewById(R.id.dommah_dzal);
        ImageButton ButtonSuara10 = this.findViewById(R.id.dommah_ra);
        ImageButton ButtonSuara11 = this.findViewById(R.id.dommah_zai);
        ImageButton ButtonSuara12 = this.findViewById(R.id.dommah_sin);
        ImageButton ButtonSuara13 = this.findViewById(R.id.dommah_syin);
        ImageButton ButtonSuara14 = this.findViewById(R.id.dommah_shod);
        ImageButton ButtonSuara15 = this.findViewById(R.id.dommah_dhod);
        ImageButton ButtonSuara16 = this.findViewById(R.id.dommah_tho);
        ImageButton ButtonSuara17 = this.findViewById(R.id.dommah_dhlo);
        ImageButton ButtonSuara18 = this.findViewById(R.id.dommah_ain);
        ImageButton ButtonSuara19 = this.findViewById(R.id.dommah_ghoin);
        ImageButton ButtonSuara20 = this.findViewById(R.id.dommah_fa);
        ImageButton ButtonSuara21 = this.findViewById(R.id.dommah_qof);
        ImageButton ButtonSuara22 = this.findViewById(R.id.dommah_kaf);
        ImageButton ButtonSuara23 = this.findViewById(R.id.dommah_lam);
        ImageButton ButtonSuara24 = this.findViewById(R.id.dommah_mim);
        ImageButton ButtonSuara25 = this.findViewById(R.id.dommah_nun);
        ImageButton ButtonSuara26 = this.findViewById(R.id.dommah_wawu);
        ImageButton ButtonSuara27 = this.findViewById(R.id.dommah_ha);
        ImageButton ButtonSuara28 = this.findViewById(R.id.dommah_ya);

        /*Menghidupkan Suara */
        ButtonSuara.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                tampilDhomah.setImageResource(R.drawable.alif_dommah_u);
                SuaraAlif.start();
            }
        });

        ButtonSuara2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                tampilDhomah.setImageResource(R.drawable.ba_dommah_bu);
                SuaraBa.start();
            }
        });

        ButtonSuara3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                tampilDhomah.setImageResource(R.drawable.ta_dommah_tu);
                SuaraTa.start();
            }
        });

        ButtonSuara4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                tampilDhomah.setImageResource(R.drawable.tsa_dommah_tsu);
                SuaraSa.start();
            }
        });
        ButtonSuara5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                tampilDhomah.setImageResource(R.drawable.jim_dommah_ju);
                SuaraJim.start();
            }
        });
        ButtonSuara6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                tampilDhomah.setImageResource(R.drawable.kha_dommah_khu);
                SuaraHa.start();
            }
        });
        ButtonSuara7.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                tampilDhomah.setImageResource(R.drawable.kho_dommah_khu);
                SuaraKho.start();
            }
        });

        ButtonSuara8.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                tampilDhomah.setImageResource(R.drawable.dal_dommah_du);
                SuaraDal.start();
            }
        });

        ButtonSuara9.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                tampilDhomah.setImageResource(R.drawable.dzal_dommah_dzu);
                SuaraDzal.start();
            }
        });
        ButtonSuara10.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                tampilDhomah.setImageResource(R.drawable.ra_dommah_ru);
                SuaraRo.start();
            }
        });
        ButtonSuara11.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                tampilDhomah.setImageResource(R.drawable.zai_dommah_zu);
                SuaraJa.start();
            }
        });

        ButtonSuara12.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                tampilDhomah.setImageResource(R.drawable.sin_kasrah_si);
                SuaraSin.start();
            }
        });
        ButtonSuara13.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                tampilDhomah.setImageResource(R.drawable.syin_dommah_syu);
                SuaraSyin.start();
            }
        });
        ButtonSuara14.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                tampilDhomah.setImageResource(R.drawable.shod_dommah_shu);
                SuaraShad.start();
            }
        });

        ButtonSuara15.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                tampilDhomah.setImageResource(R.drawable.dhod_dommah_dhu);
                SuaraDod.start();
            }
        });
        ButtonSuara16.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                tampilDhomah.setImageResource(R.drawable.tho_dommah_thu);
                SuaraTo.start();
            }
        });
        ButtonSuara17.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                tampilDhomah.setImageResource(R.drawable.dhlo_dommah_dhu);
                SuaraDo.start();
            }
        });
        ButtonSuara18.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                tampilDhomah.setImageResource(R.drawable.ain_dommah_u);
                SuaraAin.start();
            }
        });

        ButtonSuara19.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                tampilDhomah.setImageResource(R.drawable.ghoin_dommah_ghu);
                SuaraGin.start();
            }
        });
        ButtonSuara20.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                tampilDhomah.setImageResource(R.drawable.fa_dommah_fu);
                Suarafa.start();
            }
        });
        ButtonSuara21.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                tampilDhomah.setImageResource(R.drawable.qof_dommah_qu);
                SuaraKof.start();
            }
        });
        ButtonSuara22.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                tampilDhomah.setImageResource(R.drawable.kaf_dommah_ku);
                // TODO Auto-generated method stub
                SuaraKaf.start();
            }
        });
        ButtonSuara23.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                tampilDhomah.setImageResource(R.drawable.lam_dommah_lu);
                SuaraLam.start();
            }
        });

        ButtonSuara24.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                tampilDhomah.setImageResource(R.drawable.mim_dommah_mu);
                SuaraMim.start();
            }
        });
        ButtonSuara25.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                tampilDhomah.setImageResource(R.drawable.nun_dommah_nu);

                SuaraNun.start();
            }
        });
        ButtonSuara26.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                tampilDhomah.setImageResource(R.drawable.wawu_dommah_wu);
                SuaraWawu.start();
            }
        });
        ButtonSuara27.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                tampilDhomah.setImageResource(R.drawable.ha_dommah_hu);
                SuaraHA.start();
            }
        });
        ButtonSuara28.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                tampilDhomah.setImageResource(R.drawable.ya_dommah_yu);
                SuaraYa.start();
            }
        });

    }
}
