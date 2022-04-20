package com.example.Rangga_191011401316;

import android.os.Bundle;
import android.app.TabActivity;
import android.content.Intent;
import android.widget.TabHost;

public class MainActivity extends TabActivity { //jenis activity telah diubah ke TabActivity

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //perintah pemanggilan TabActivity
        TabHost tabhost = getTabHost();
        TabHost.TabSpec spec;
        Intent intent;

        //perintah pindah halaman
        intent = new Intent().setClass(this, Beranda.class);//content pada tab yg akan kita buat
        spec = tabhost.newTabSpec("beranda").setIndicator("Beranda",null).setContent(intent);//mengeset nama tab dan mengisi content pada menu tab anda
        tabhost.addTab(spec);//untuk membuat tabbaru disini bisa diatur sesuai keinginan anda
        intent = new Intent().setClass(this, Berita.class);
        spec = tabhost.newTabSpec("berita").setIndicator("Berita",null).setContent(intent);
        tabhost.addTab(spec);intent = new Intent().setClass(this, Teman.class);
        spec = tabhost.newTabSpec("teman").setIndicator("Teman",null).setContent(intent);
        tabhost.addTab(spec);
    }
}