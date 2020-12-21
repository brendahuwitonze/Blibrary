package com.moringaschool.blibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button b1;
    EditText username,password;
    TextView tx1;
    int counter = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = (Button)findViewById(R.id.button);
        username = (EditText)findViewById(R.id.editText);
        password= (EditText)findViewById(R.id.editText2);
        tx1 = (TextView)findViewById(R.id.textview);
        tx1.setVisibility(View.GONE);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, booksAvailable.class);


                startActivity(intent);
            }
        });

    }
}

