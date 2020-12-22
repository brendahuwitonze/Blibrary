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

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.button) Button b1;
    @BindView(R.id.editText) EditText username;
    @BindView(R.id.editText2) EditText password;
    @BindView(R.id.textview) TextView tx1;
    @BindView(R.id.button3) Button b3;
    int counter = 3;

//    Button b1;
//    EditText username,password;
//    TextView tx1;
//    int counter = 3;
//    Button b3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

//        b1 = (Button)findViewById(R.id.button);
//        b3=(Button)findViewById(R.id.button3);
//        username = (EditText)findViewById(R.id.editText);
//        password= (EditText)findViewById(R.id.editText2);
//        tx1 = (TextView)findViewById(R.id.textview);
//        tx1.setVisibility(View.GONE);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(username.getText().toString().equals("admin") &&
                        password.getText().toString().equals("admin")) {
                    Toast.makeText(getApplicationContext(),
                            "Redirecting...", Toast.LENGTH_SHORT).show();
                }
                    else{
                        Toast.makeText(getApplicationContext(), "Wrong Credentials"
                                ,Toast.LENGTH_SHORT).show();
                    }
                if (counter == 0) {
                    b1.setEnabled(false);
                }
                Intent intent = new Intent(MainActivity.this, booksAvailable.class);
                startActivity(intent);

            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }

            Intent intent = new Intent(MainActivity.this, login_Activty.class);



        });
    }
}

