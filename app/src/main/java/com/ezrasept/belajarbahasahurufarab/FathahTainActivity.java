package com.ezrasept.belajarbahasahurufarab;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class FathahTainActivity extends AppCompatActivity {

    ImageView tampilFathahTain;
    ImageButton kembali;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fathah_tain);

        tampilFathahTain = findViewById(R.id.tampil_fathah_tain);
        kembali = findViewById(R.id.kembali);

        kembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
                finish();
            }
        });

        final MediaPlayer SuaraAlif = MediaPlayer.create(this, R.raw.tanwin_fatah_an); //Memanggil nama lagu
        final MediaPlayer SuaraBa = MediaPlayer.create(this, R.raw.tanwin_fatah_ban);
        final MediaPlayer SuaraTa = MediaPlayer.create(this, R.raw.tanwin_fatah_tan);
        final MediaPlayer SuaraSa = MediaPlayer.create(this, R.raw.tanwin_fatah_tsan);
        final MediaPlayer SuaraJim = MediaPlayer.create(this, R.raw.tanwin_fatah_jan);
        final MediaPlayer SuaraHa = MediaPlayer.create(this, R.raw.tanwin_fatah_han);
        final MediaPlayer SuaraKho = MediaPlayer.create(this, R.raw.tanwin_fatah_khon);
        final MediaPlayer SuaraDal = MediaPlayer.create(this, R.raw.tanwin_fatah_dan);
        final MediaPlayer SuaraDzal = MediaPlayer.create(this, R.raw.tanwin_fatah_dzan);
        final MediaPlayer SuaraRo = MediaPlayer.create(this, R.raw.tanwin_fatah_ron);
        final MediaPlayer SuaraJa = MediaPlayer.create(this, R.raw.tanwin_fatah_zan);
        final MediaPlayer SuaraSin = MediaPlayer.create(this, R.raw.tanwin_fatah_san);
        final MediaPlayer SuaraSyin = MediaPlayer.create(this, R.raw.tanwin_fatah_syan);
        final MediaPlayer SuaraShad = MediaPlayer.create(this, R.raw.button);
        final MediaPlayer SuaraDod = MediaPlayer.create(this, R.raw.tanwin_fatah_dhon);
        final MediaPlayer SuaraTo = MediaPlayer.create(this, R.raw.tanwin_fatah_thon);
        final MediaPlayer SuaraDo = MediaPlayer.create(this, R.raw.tanwin_fatah_dhon);
        final MediaPlayer SuaraAin = MediaPlayer.create(this, R.raw.tanwin_fatah_aan);
        final MediaPlayer SuaraGin = MediaPlayer.create(this, R.raw.tanwin_fatah_ghon);
        final MediaPlayer Suarafa = MediaPlayer.create(this, R.raw.tanwin_fatah_fan);
        final MediaPlayer SuaraKof = MediaPlayer.create(this, R.raw.tanwin_fatah_qon);
        final MediaPlayer SuaraKaf = MediaPlayer.create(this, R.raw.tanwin_fatah_kan);
        final MediaPlayer SuaraLam = MediaPlayer.create(this, R.raw.tanwin_fatah_lan);
        final MediaPlayer SuaraMim = MediaPlayer.create(this, R.raw.tanwin_fatah_man);
        final MediaPlayer SuaraNun = MediaPlayer.create(this, R.raw.tanwin_fatah_nan);
        final MediaPlayer SuaraWawu = MediaPlayer.create(this, R.raw.button);
        final MediaPlayer SuaraHA = MediaPlayer.create(this, R.raw.tanwin_fatah_haan);
        final MediaPlayer SuaraYa = MediaPlayer.create(this, R.raw.tanwin_fatah_yan);

        ImageButton ButtonSuara = this.findViewById(R.id.tanwin_alif); //fariabel button
        ImageButton ButtonSuara2 = this.findViewById(R.id.tanwin_ba);
        ImageButton ButtonSuara3 = this.findViewById(R.id.tanwin_ta);
        ImageButton ButtonSuara4 = this.findViewById(R.id.tanwin_tsa);
        ImageButton ButtonSuara5 = this.findViewById(R.id.tanwin_jim);
        ImageButton ButtonSuara6 = this.findViewById(R.id.tanwin_kha);
        ImageButton ButtonSuara7 = this.findViewById(R.id.tanwin_kho);
        ImageButton ButtonSuara8 = this.findViewById(R.id.tanwin_dal);
        ImageButton ButtonSuara9 = this.findViewById(R.id.tanwin_dzal);
        ImageButton ButtonSuara10 = this.findViewById(R.id.tanwin_ra);
        ImageButton ButtonSuara11 = this.findViewById(R.id.tanwin_zai);
        ImageButton ButtonSuara12 = this.findViewById(R.id.tanwin_sin);
        ImageButton ButtonSuara13 = this.findViewById(R.id.tanwin_syin);
        ImageButton ButtonSuara14 = this.findViewById(R.id.tanwin_shod);
        ImageButton ButtonSuara15 = this.findViewById(R.id.tanwin_dhod);
        ImageButton ButtonSuara16 = this.findViewById(R.id.tanwin_tho);
        ImageButton ButtonSuara17 = this.findViewById(R.id.tanwin_dhlo);
        ImageButton ButtonSuara18 = this.findViewById(R.id.tanwin_ain);
        ImageButton ButtonSuara19 = this.findViewById(R.id.tanwin_ghoin);
        ImageButton ButtonSuara20 = this.findViewById(R.id.tanwin_fa);
        ImageButton ButtonSuara21 = this.findViewById(R.id.tanwin_qof);
        ImageButton ButtonSuara22 = this.findViewById(R.id.tanwin_kaf);
        ImageButton ButtonSuara23 = this.findViewById(R.id.tanwin_lam);
        ImageButton ButtonSuara24 = this.findViewById(R.id.tanwin_mim);
        ImageButton ButtonSuara25 = this.findViewById(R.id.tanwin_nun);
        ImageButton ButtonSuara26 = this.findViewById(R.id.tanwin_wawu);
        ImageButton ButtonSuara27 = this.findViewById(R.id.tanwin_ha);
        ImageButton ButtonSuara28 = this.findViewById(R.id.tanwin_ya);

        /*Menghidupkan Suara */
        ButtonSuara.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                tampilFathahTain.setImageResource(R.drawable.alif_tanwin_an);
                SuaraAlif.start();
            }
        });

        ButtonSuara2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                tampilFathahTain.setImageResource(R.drawable.ba_tanwin_ban);
                SuaraBa.start();
            }
        });

        ButtonSuara3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                tampilFathahTain.setImageResource(R.drawable.ta_tanwin_tan);
                SuaraTa.start();
            }
        });

        ButtonSuara4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                tampilFathahTain.setImageResource(R.drawable.tsa_tanwin_tsan);
                SuaraSa.start();
            }
        });
        ButtonSuara5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                tampilFathahTain.setImageResource(R.drawable.jim_tanwin_jan);
                SuaraJim.start();
            }
        });
        ButtonSuara6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                tampilFathahTain.setImageResource(R.drawable.kha_tanwin_khan);
                SuaraHa.start();
            }
        });
        ButtonSuara7.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                tampilFathahTain.setImageResource(R.drawable.kho_tanwin_khan);
                SuaraKho.start();
            }
        });

        ButtonSuara8.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                tampilFathahTain.setImageResource(R.drawable.dal_tanwin_dan);
                SuaraDal.start();
            }
        });

        ButtonSuara9.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                tampilFathahTain.setImageResource(R.drawable.dzal_tanwin_dzan);
                SuaraDzal.start();
            }
        });
        ButtonSuara10.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                tampilFathahTain.setImageResource(R.drawable.ra_tanwin_ran);
                SuaraRo.start();
            }
        });
        ButtonSuara11.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                tampilFathahTain.setImageResource(R.drawable.zai_tanwin_zan);
                SuaraJa.start();
            }
        });

        ButtonSuara12.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                tampilFathahTain.setImageResource(R.drawable.sin_tanwin_san);
                SuaraSin.start();
            }
        });
        ButtonSuara13.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                tampilFathahTain.setImageResource(R.drawable.syin_tanwin_syan);
                SuaraSyin.start();
            }
        });
        ButtonSuara14.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                tampilFathahTain.setImageResource(R.drawable.shod_tanwin_shan);
                SuaraShad.start();
            }
        });

        ButtonSuara15.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                tampilFathahTain.setImageResource(R.drawable.dhod_tanwin_dhan);
                SuaraDod.start();
            }
        });
        ButtonSuara16.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                tampilFathahTain.setImageResource(R.drawable.tho_tanwin_than);
                SuaraTo.start();
            }
        });
        ButtonSuara17.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                tampilFathahTain.setImageResource(R.drawable.dhlo_tanwin_zhan);
                SuaraDo.start();
            }
        });
        ButtonSuara18.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                tampilFathahTain.setImageResource(R.drawable.ain_tanwin_an);
                SuaraAin.start();
            }
        });

        ButtonSuara19.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                tampilFathahTain.setImageResource(R.drawable.ghoin_tanwin_ghan);
                SuaraGin.start();
            }
        });
        ButtonSuara20.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                tampilFathahTain.setImageResource(R.drawable.fa_tanwin_fan);
                Suarafa.start();
            }
        });
        ButtonSuara21.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                tampilFathahTain.setImageResource(R.drawable.qof_tanwin_qan);
                SuaraKof.start();
            }
        });
        ButtonSuara22.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                tampilFathahTain.setImageResource(R.drawable.kaf_tanwin_kan);
                // TODO Auto-generated method stub
                SuaraKaf.start();
            }
        });
        ButtonSuara23.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                tampilFathahTain.setImageResource(R.drawable.lam_tanwin_lan);
                SuaraLam.start();
            }
        });

        ButtonSuara24.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                tampilFathahTain.setImageResource(R.drawable.mim_tanwin_man);
                SuaraMim.start();
            }
        });
        ButtonSuara25.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                tampilFathahTain.setImageResource(R.drawable.nun_tanwin_nan);

                SuaraNun.start();
            }
        });
        ButtonSuara26.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                tampilFathahTain.setImageResource(R.drawable.wawu_tanwin_wan);
                SuaraWawu.start();
            }
        });
        ButtonSuara27.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                tampilFathahTain.setImageResource(R.drawable.ha_tanwin_han);
                SuaraHA.start();
            }
        });
        ButtonSuara28.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                tampilFathahTain.setImageResource(R.drawable.ya_tanwin_yan);
                SuaraYa.start();
            }
        });

    }
}
