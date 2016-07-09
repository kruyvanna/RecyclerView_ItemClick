package com.vanna.recyclerview_itemclick;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        String item = getIntent().getStringExtra("item");
        TextView textView = (TextView) findViewById(R.id.detailTextView);
        textView.setText(item);
    }
}
