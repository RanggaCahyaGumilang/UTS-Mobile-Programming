package com.example.Rangga_191011401316;

        import android.app.ListActivity;
        import android.os.Bundle;
        import android.widget.ArrayAdapter;

public class Teman extends ListActivity {
    String [] rangga_teman ={"Niki", "Toni", "Ari", "Ardy", "Rangga"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teman);

        setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, rangga_teman));
    }
}