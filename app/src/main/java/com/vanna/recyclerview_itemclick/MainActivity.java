package com.vanna.recyclerview_itemclick;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(linearLayoutManager);

        String[] data = {"Item 1",
                        "Item 2",
                        "Item 3"};
        Adapter adapter = new Adapter(data);
        recyclerView.setAdapter(adapter);

        adapter.setAdapterItemClickListener(new AdapterItemClickListener() {
            @Override
            public void onItemClick(String item) {
                goToDetail(item);
            }
        });

    }

    private void goToDetail(String item) {
        Intent intent = new Intent(getApplicationContext(), DetailActivity.class);
        intent.putExtra("item", item);
        startActivity(intent);
    }
}
