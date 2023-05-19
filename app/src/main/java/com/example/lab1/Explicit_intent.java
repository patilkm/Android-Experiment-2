package com.example.lab1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.content.Intent;


public class Explicit_intent extends AppCompatActivity {
    Button bt_back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explicit_intent);
        bt_back = findViewById(R.id.bt_back);

    }
    public void callFirstActivity(View view) {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
        Toast.makeText(this, "We are moved to First Activity", Toast.LENGTH_SHORT)
                .show();

    }

}
