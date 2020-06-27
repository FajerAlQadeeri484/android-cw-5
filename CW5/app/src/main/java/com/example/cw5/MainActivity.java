package com.example.cw5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText username=findViewById(R.id.username);
        final Button one=findViewById(R.id.one);
        final Button two=findViewById(R.id.two);

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                username.getText().toString();
                Intent i = new Intent(MainActivity.this,MainActivity2.class);
                startActivity(i);

            }
        });

    }
}