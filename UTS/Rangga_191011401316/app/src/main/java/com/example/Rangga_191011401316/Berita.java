package com.example.Rangga_191011401316;

import android.os.Bundle;
import android.app.ListActivity;
import android.widget.ArrayAdapter;

public class Berita extends ListActivity {

    String [] rangga_berita ={"Jadwal Piala Dunia 2014", "Capres Indonesia", "Debat Capres", "Debat Cawapres"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_berita);

        setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, rangga_berita));
    }
}