package com.ezrasept.belajarbahasahurufarab;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class DhomahTainActivity extends AppCompatActivity {

    ImageView tampilDhomahTain;
    ImageButton kembali;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dhomah_tain);

        tampilDhomahTain = findViewById(R.id.tampil_dhomah_tain);
        kembali = findViewById(R.id.kembali);

        kembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
                finish();
            }
        });

        final MediaPlayer SuaraAlif = MediaPlayer.create(this, R.raw.tanwin_domah_un); //Memanggil nama lagu
        final MediaPlayer SuaraBa = MediaPlayer.create(this, R.raw.tanwin_domah_bun);
        final MediaPlayer SuaraTa = MediaPlayer.create(this, R.raw.tanwin_domah_tun);
        final MediaPlayer SuaraSa = MediaPlayer.create(this, R.raw.tanwin_domah_tsun);
        final MediaPlayer SuaraJim = MediaPlayer.create(this, R.raw.tanwin_domah_jun);
        final MediaPlayer SuaraHa = MediaPlayer.create(this, R.raw.tanwin_domah_hun);
        final MediaPlayer SuaraKho = MediaPlayer.create(this, R.raw.tanwin_domah_khun);
        final MediaPlayer SuaraDal = MediaPlayer.create(this, R.raw.tanwin_domah_dun);
        final MediaPlayer SuaraDzal = MediaPlayer.create(this, R.raw.tanwin_domah_dzun);
        final MediaPlayer SuaraRo = MediaPlayer.create(this, R.raw.tanwin_domah_run);
        final MediaPlayer SuaraJa = MediaPlayer.create(this, R.raw.tanwin_domah_zun);
        final MediaPlayer SuaraSin = MediaPlayer.create(this, R.raw.tanwin_domah_sun);
        final MediaPlayer SuaraSyin = MediaPlayer.create(this, R.raw.tanwin_domah_syun);
        final MediaPlayer SuaraShad = MediaPlayer.create(this, R.raw.tanwin_domah_shun);
        final MediaPlayer SuaraDod = MediaPlayer.create(this, R.raw.tanwin_domah_dhun);
        final MediaPlayer SuaraTo = MediaPlayer.create(this, R.raw.tanwin_domah_thun);
        final MediaPlayer SuaraDo = MediaPlayer.create(this, R.raw.tanwin_domah_dzuun);
        final MediaPlayer SuaraAin = MediaPlayer.create(this, R.raw.tanwin_domah_uun);
        final MediaPlayer SuaraGin = MediaPlayer.create(this, R.raw.tanwin_domah_ghun);
        final MediaPlayer Suarafa = MediaPlayer.create(this, R.raw.tanwin_domah_fun);
        final MediaPlayer SuaraKof = MediaPlayer.create(this, R.raw.tanwin_domah_qun);
        final MediaPlayer SuaraKaf = MediaPlayer.create(this, R.raw.tanwin_domah_kun);
        final MediaPlayer SuaraLam = MediaPlayer.create(this, R.raw.tanwin_domah_lun);
        final MediaPlayer SuaraMim = MediaPlayer.create(this, R.raw.tanwin_domah_mun);
        final MediaPlayer SuaraNun = MediaPlayer.create(this, R.raw.tanwin_domah_nun);
        final MediaPlayer SuaraWawu = MediaPlayer.create(this, R.raw.tanwin_domah_wun);
        final MediaPlayer SuaraHA = MediaPlayer.create(this, R.raw.tanwin_domah_huun);
        final MediaPlayer SuaraYa = MediaPlayer.create(this, R.raw.tanwin_domah_yun);

        ImageButton ButtonSuara = this.findViewById(R.id.dommah_tain_alif); //fariabel button
        ImageButton ButtonSuara2 = this.findViewById(R.id.dommah_tain_ba);
        ImageButton ButtonSuara3 = this.findViewById(R.id.dommah_tain_ta);
        ImageButton ButtonSuara4 = this.findViewById(R.id.dommah_tain_tsa);
        ImageButton ButtonSuara5 = this.findViewById(R.id.dommah_tain_jim);
        ImageButton ButtonSuara6 = this.findViewById(R.id.dommah_tain_kha);
        ImageButton ButtonSuara7 = this.findViewById(R.id.dommah_tain_kho);
        ImageButton ButtonSuara8 = this.findViewById(R.id.dommah_tain_dal);
        ImageButton ButtonSuara9 = this.findViewById(R.id.dommah_tain_dzal);
        ImageButton ButtonSuara10 = this.findViewById(R.id.dommah_tain_ra);
        ImageButton ButtonSuara11 = this.findViewById(R.id.dommah_tain_zai);
        ImageButton ButtonSuara12 = this.findViewById(R.id.dommah_tain_sin);
        ImageButton ButtonSuara13 = this.findViewById(R.id.dommah_tain_syin);
        ImageButton ButtonSuara14 = this.findViewById(R.id.dommah_tain_shod);
        ImageButton ButtonSuara15 = this.findViewById(R.id.dommah_tain_dhod);
        ImageButton ButtonSuara16 = this.findViewById(R.id.dommah_tain_tho);
        ImageButton ButtonSuara17 = this.findViewById(R.id.dommah_tain_dhlo);
        ImageButton ButtonSuara18 = this.findViewById(R.id.dommah_tain_ain);
        ImageButton ButtonSuara19 = this.findViewById(R.id.dommah_tain_ghoin);
        ImageButton ButtonSuara20 = this.findViewById(R.id.dommah_tain_fa);
        ImageButton ButtonSuara21 = this.findViewById(R.id.dommah_tain_qof);
        ImageButton ButtonSuara22 = this.findViewById(R.id.dommah_tain_kaf);
        ImageButton ButtonSuara23 = this.findViewById(R.id.dommah_tain_lam);
        ImageButton ButtonSuara24 = this.findViewById(R.id.dommah_tain_mim);
        ImageButton ButtonSuara25 = this.findViewById(R.id.dommah_tain_nun);
        ImageButton ButtonSuara26 = this.findViewById(R.id.dommah_tain_wawu);
        ImageButton ButtonSuara27 = this.findViewById(R.id.dommah_tain_ha);
        ImageButton ButtonSuara28 = this.findViewById(R.id.dommah_tain_ya);

        /*Menghidupkan Suara */
        ButtonSuara.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                tampilDhomahTain.setImageResource(R.drawable.alif_tanwin_un);
                SuaraAlif.start();
            }
        });

        ButtonSuara2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                tampilDhomahTain.setImageResource(R.drawable.ba_tanwin_bun);
                SuaraBa.start();
            }
        });

        ButtonSuara3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                tampilDhomahTain.setImageResource(R.drawable.ta_tanwin_tun);
                SuaraTa.start();
            }
        });

        ButtonSuara4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                tampilDhomahTain.setImageResource(R.drawable.tsa_tanwin_tsun);
                SuaraSa.start();
            }
        });
        ButtonSuara5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                tampilDhomahTain.setImageResource(R.drawable.jim_tanwin_jun);
                SuaraJim.start();
            }
        });
        ButtonSuara6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                tampilDhomahTain.setImageResource(R.drawable.kha_tanwin_khun);
                SuaraHa.start();
            }
        });
        ButtonSuara7.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                tampilDhomahTain.setImageResource(R.drawable.kho_tanwin_khun);
                SuaraKho.start();
            }
        });

        ButtonSuara8.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                tampilDhomahTain.setImageResource(R.drawable.dal_tanwin_dun);
                SuaraDal.start();
            }
        });

        ButtonSuara9.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                tampilDhomahTain.setImageResource(R.drawable.dzal_tanwin_dzun);
                SuaraDzal.start();
            }
        });
        ButtonSuara10.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                tampilDhomahTain.setImageResource(R.drawable.ra_tanwin_run);
                SuaraRo.start();
            }
        });
        ButtonSuara11.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                tampilDhomahTain.setImageResource(R.drawable.zai_tanwin_zun);
                SuaraJa.start();
            }
        });

        ButtonSuara12.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                tampilDhomahTain.setImageResource(R.drawable.sin_tanwin_sun);
                SuaraSin.start();
            }
        });
        ButtonSuara13.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                tampilDhomahTain.setImageResource(R.drawable.syin_tanwin_syun);
                SuaraSyin.start();
            }
        });
        ButtonSuara14.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                tampilDhomahTain.setImageResource(R.drawable.shod_tanwin_shun);
                SuaraShad.start();
            }
        });

        ButtonSuara15.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                tampilDhomahTain.setImageResource(R.drawable.dhod_tanwin_dhun);
                SuaraDod.start();
            }
        });

        ButtonSuara16.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                tampilDhomahTain.setImageResource(R.drawable.tho_tanwin_thun);
                SuaraTo.start();
            }
        });
        ButtonSuara17.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                tampilDhomahTain.setImageResource(R.drawable.dhlo_tanwin_zhun);
                SuaraDo.start();
            }
        });
        ButtonSuara18.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                tampilDhomahTain.setImageResource(R.drawable.ain_tanwin_un);
                SuaraAin.start();
            }
        });

        ButtonSuara19.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                tampilDhomahTain.setImageResource(R.drawable.ghoin_tanwin_ghun);
                SuaraGin.start();
            }
        });
        ButtonSuara20.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                tampilDhomahTain.setImageResource(R.drawable.fa_tanwin_fun);
                Suarafa.start();
            }
        });
        ButtonSuara21.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                tampilDhomahTain.setImageResource(R.drawable.qof_tanwin_qun);
                SuaraKof.start();
            }
        });
        ButtonSuara22.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                tampilDhomahTain.setImageResource(R.drawable.kaf_tanwin_kun);
                // TODO Auto-generated method stub
                SuaraKaf.start();
            }
        });
        ButtonSuara23.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                tampilDhomahTain.setImageResource(R.drawable.lam_tanwin_lun);
                SuaraLam.start();
            }
        });

        ButtonSuara24.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                tampilDhomahTain.setImageResource(R.drawable.mim_tanwin_mun);
                SuaraMim.start();
            }
        });
        ButtonSuara25.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                tampilDhomahTain.setImageResource(R.drawable.nun_tanwin_nun);

                SuaraNun.start();
            }
        });
        ButtonSuara26.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                tampilDhomahTain.setImageResource(R.drawable.wawu_tanwin_wun);
                SuaraWawu.start();
            }
        });
        ButtonSuara27.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                tampilDhomahTain.setImageResource(R.drawable.ha_tanwin_hun);
                SuaraHA.start();
            }
        });
        ButtonSuara28.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                tampilDhomahTain.setImageResource(R.drawable.ya_tanwin_yun);
                SuaraYa.start();
            }
        });

    }
}
