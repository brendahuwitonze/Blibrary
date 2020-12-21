package com.moringaschool.blibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class booksAvailable extends AppCompatActivity {
    private ListView mListView;
    private String[] books = new String[] {"harrypoter", "onceupon_time"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_books);
        Intent intent = getIntent();
        String b1 = intent.getStringExtra("b1");
        mListView = (ListView) findViewById(R.id.listView);
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, books);
        mListView.setAdapter(adapter);

        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String book = ((TextView)view).getText().toString();
                Toast.makeText(booksAvailable.this, book, Toast.LENGTH_LONG).show();
            }
        });



    }
}