package com.example.lab1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    Button bt_explicit;
    Button bt_implicit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt_explicit = findViewById(R.id.bt_explicit);
        bt_implicit = findViewById(R.id.bt_implicit);

        bt_implicit.setOnClickListener(v -> {
            Intent implicit_intent = new Intent(Intent.ACTION_VIEW,
                    Uri.parse("http://www.google.com"));
            startActivity(implicit_intent);
            Toast.makeText(MainActivity.this, "Clicked Implicit Intent Button", Toast.LENGTH_SHORT)
                    .show();
        });

    }
    public void callSecondActivity(View view) {

        Intent explicit_intent = new Intent(MainActivity.this,Explicit_intent.class);
        startActivity(explicit_intent);
        Toast.makeText(MainActivity.this, "Clicked Explicit Intent Button", Toast.LENGTH_SHORT)
                .show();

    }

}
