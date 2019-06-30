package com.ezrasept.belajarbahasahurufarab;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class KasrohActivity extends AppCompatActivity {

    ImageView tampilKasrah;
    ImageButton kembali;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kasroh);

        tampilKasrah = findViewById(R.id.tampil_kasrah);
        kembali = findViewById(R.id.kembali);

        kembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
                finish();
            }
        });

        final MediaPlayer SuaraAlif = MediaPlayer.create(this, R.raw.kasroh_i);
        final MediaPlayer SuaraBa = MediaPlayer.create(this, R.raw.kasroh_bi);
        final MediaPlayer SuaraTa = MediaPlayer.create(this, R.raw.kasroh_ti);
        final MediaPlayer SuaraSa = MediaPlayer.create(this, R.raw.kasroh_tsi);
        final MediaPlayer SuaraJim = MediaPlayer.create(this, R.raw.kasroh_ji);
        final MediaPlayer SuaraHa = MediaPlayer.create(this, R.raw.kasroh_hi);
        final MediaPlayer SuaraKho = MediaPlayer.create(this, R.raw.kasroh_khi);
        final MediaPlayer SuaraDal = MediaPlayer.create(this, R.raw.kasroh_di);
        final MediaPlayer SuaraDzal = MediaPlayer.create(this, R.raw.kasroh_dzi);
        final MediaPlayer SuaraRo = MediaPlayer.create(this, R.raw.kasroh_ri);
        final MediaPlayer SuaraJa = MediaPlayer.create(this, R.raw.kasroh_zi);
        final MediaPlayer SuaraSin = MediaPlayer.create(this, R.raw.kasroh_si);
        final MediaPlayer SuaraSyin = MediaPlayer.create(this, R.raw.kasroh_syi);
        final MediaPlayer SuaraShad = MediaPlayer.create(this, R.raw.kasroh_shi);
        final MediaPlayer SuaraDod = MediaPlayer.create(this, R.raw.kasroh_dhi);
        final MediaPlayer SuaraTo = MediaPlayer.create(this, R.raw.kasroh_thi);
        final MediaPlayer SuaraDo = MediaPlayer.create(this, R.raw.kasroh_dzii);
        final MediaPlayer SuaraAin = MediaPlayer.create(this, R.raw.kasroh_ii);
        final MediaPlayer SuaraGin = MediaPlayer.create(this, R.raw.kasroh_ghi);
        final MediaPlayer Suarafa = MediaPlayer.create(this, R.raw.kasroh_fi);
        final MediaPlayer SuaraKof = MediaPlayer.create(this, R.raw.kasroh_qi);
        final MediaPlayer SuaraKaf = MediaPlayer.create(this, R.raw.kasroh_ki);
        final MediaPlayer SuaraLam = MediaPlayer.create(this, R.raw.kasroh_li);
        final MediaPlayer SuaraMim = MediaPlayer.create(this, R.raw.kasroh_mi);
        final MediaPlayer SuaraNun = MediaPlayer.create(this, R.raw.kasroh_ni);
        final MediaPlayer SuaraWawu = MediaPlayer.create(this, R.raw.kasroh_wi);
        final MediaPlayer SuaraHA = MediaPlayer.create(this, R.raw.kasroh_hii);
        final MediaPlayer SuaraYa = MediaPlayer.create(this, R.raw.kasroh_yi);

        ImageButton ButtonSuara = this.findViewById(R.id.kasrah_alif);
        ImageButton ButtonSuara2 = this.findViewById(R.id.kasrah_ba);
        ImageButton ButtonSuara3 = this.findViewById(R.id.kasrah_ta);
        ImageButton ButtonSuara4 = this.findViewById(R.id.kasrah_tsa);
        ImageButton ButtonSuara5 = this.findViewById(R.id.kasrah_jim);
        ImageButton ButtonSuara6 = this.findViewById(R.id.kasrah_kha);
        ImageButton ButtonSuara7 = this.findViewById(R.id.kasrah_kho);
        ImageButton ButtonSuara8 = this.findViewById(R.id.kasrah_dal);
        ImageButton ButtonSuara9 = this.findViewById(R.id.kasrah_dzal);
        ImageButton ButtonSuara10 = this.findViewById(R.id.kasrah_ra);
        ImageButton ButtonSuara11 = this.findViewById(R.id.kasrah_zai);
        ImageButton ButtonSuara12 = this.findViewById(R.id.kasrah_sin);
        ImageButton ButtonSuara13 = this.findViewById(R.id.kasrah_syin);
        ImageButton ButtonSuara14 = this.findViewById(R.id.kasrah_shod);
        ImageButton ButtonSuara15 = this.findViewById(R.id.kasrah_dhod);
        ImageButton ButtonSuara16 = this.findViewById(R.id.kasrah_tho);
        ImageButton ButtonSuara17 = this.findViewById(R.id.kasrah_dhlo);
        ImageButton ButtonSuara18 = this.findViewById(R.id.kasrah_ain);
        ImageButton ButtonSuara19 = this.findViewById(R.id.kasrah_ghoin);
        ImageButton ButtonSuara20 = this.findViewById(R.id.kasrah_fa);
        ImageButton ButtonSuara21 = this.findViewById(R.id.kasrah_qof);
        ImageButton ButtonSuara22 = this.findViewById(R.id.kasrah_kaf);
        ImageButton ButtonSuara23 = this.findViewById(R.id.kasrah_lam);
        ImageButton ButtonSuara24 = this.findViewById(R.id.kasrah_mim);
        ImageButton ButtonSuara25 = this.findViewById(R.id.kasrah_nun);
        ImageButton ButtonSuara26 = this.findViewById(R.id.kasrah_wawu);
        ImageButton ButtonSuara27 = this.findViewById(R.id.kasrah_ha);
        ImageButton ButtonSuara28 = this.findViewById(R.id.kasrah_ya);

        /*Menghidupkan Suara */
        ButtonSuara.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                tampilKasrah.setImageResource(R.drawable.alif_kasrah_i);
                SuaraAlif.start();
            }
        });

        ButtonSuara2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                tampilKasrah.setImageResource(R.drawable.ba_kasrah_bi);
                SuaraBa.start();
            }
        });

        ButtonSuara3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                tampilKasrah.setImageResource(R.drawable.ta_kasrah_ti);
                SuaraTa.start();
            }
        });

        ButtonSuara4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                tampilKasrah.setImageResource(R.drawable.tsa_kasrah_i);
                SuaraSa.start();
            }
        });
        ButtonSuara5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                tampilKasrah.setImageResource(R.drawable.jim_kasrah_ji);
                SuaraJim.start();
            }
        });
        ButtonSuara6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                tampilKasrah.setImageResource(R.drawable.kha_kasrah_khi);
                SuaraHa.start();
            }
        });
        ButtonSuara7.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                tampilKasrah.setImageResource(R.drawable.kho_kasrah_khi);
                SuaraKho.start();
            }
        });

        ButtonSuara8.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                tampilKasrah.setImageResource(R.drawable.dal_kasrah_di);
                SuaraDal.start();
            }
        });

        ButtonSuara9.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                tampilKasrah.setImageResource(R.drawable.dzal_kasrah_dzi);
                SuaraDzal.start();
            }
        });
        ButtonSuara10.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                tampilKasrah.setImageResource(R.drawable.ra_kasrah_ri);
                SuaraRo.start();
            }
        });
        ButtonSuara11.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                tampilKasrah.setImageResource(R.drawable.zai_kasrah_zi);
                SuaraJa.start();
            }
        });

        ButtonSuara12.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                tampilKasrah.setImageResource(R.drawable.sin_kasrah_si);
                SuaraSin.start();
            }
        });
        ButtonSuara13.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                tampilKasrah.setImageResource(R.drawable.syin_kasrah_syi);
                SuaraSyin.start();
            }
        });
        ButtonSuara14.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                tampilKasrah.setImageResource(R.drawable.shod_kasrah_shi);
                SuaraShad.start();
            }
        });

        ButtonSuara15.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                tampilKasrah.setImageResource(R.drawable.dhod_kasrah_dhi);
                SuaraDod.start();
            }
        });
        ButtonSuara16.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                tampilKasrah.setImageResource(R.drawable.tho_kasrah_thi);
                SuaraTo.start();
            }
        });
        ButtonSuara17.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                tampilKasrah.setImageResource(R.drawable.dhlo_kasrah_dhli);
                SuaraDo.start();
            }
        });
        ButtonSuara18.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                tampilKasrah.setImageResource(R.drawable.ain_kasrah_i);
                SuaraAin.start();
            }
        });

        ButtonSuara19.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                tampilKasrah.setImageResource(R.drawable.ghoin_kasrah_ghin);
                SuaraGin.start();
            }
        });
        ButtonSuara20.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                tampilKasrah.setImageResource(R.drawable.fa_kasrah_fi);
                Suarafa.start();
            }
        });
        ButtonSuara21.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                tampilKasrah.setImageResource(R.drawable.qof_kasrah_qi);
                SuaraKof.start();
            }
        });
        ButtonSuara22.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                tampilKasrah.setImageResource(R.drawable.kaf_kasrah_ki);
                // TODO Auto-generated method stub
                SuaraKaf.start();
            }
        });
        ButtonSuara23.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                tampilKasrah.setImageResource(R.drawable.lam_kasrah_li);
                SuaraLam.start();
            }
        });

        ButtonSuara24.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                tampilKasrah.setImageResource(R.drawable.mim_kasrah_mi);
                SuaraMim.start();
            }
        });
        ButtonSuara25.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                tampilKasrah.setImageResource(R.drawable.nun_kasrah_ni);

                SuaraNun.start();
            }
        });
        ButtonSuara26.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                tampilKasrah.setImageResource(R.drawable.wawu_kasrah_wi);
                SuaraWawu.start();
            }
        });
        ButtonSuara27.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                tampilKasrah.setImageResource(R.drawable.ha_kasrah_hi);
                SuaraHA.start();
            }
        });
        ButtonSuara28.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                tampilKasrah.setImageResource(R.drawable.ya_kasrah_yi);
                SuaraYa.start();
            }
        });

    }
}
