package com.moringaschool.blibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;

public class booksAvailable extends AppCompatActivity {
    @BindView(R.id.listView)ListView bListView;

//    private ListView bListView;

    private String[] books = new String[] {"harrypoter", "onceupon_time"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_books);
        ButterKnife.bind(this);
        Intent intent = getIntent();
        String b1 = intent.getStringExtra("b1");
//        bListView = (ListView) findViewById(R.id.listView);
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, books);
        bListView.setAdapter(adapter);

        bListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String book = ((TextView)view).getText().toString();
                Toast.makeText(booksAvailable.this, book, Toast.LENGTH_LONG).show();
            }
        });



    }
}