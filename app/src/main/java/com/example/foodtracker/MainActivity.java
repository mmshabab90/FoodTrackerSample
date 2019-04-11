package com.example.foodtracker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.github.clans.fab.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    FloatingActionButton fabbtnAdd, fabbtnScan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fabbtnAdd = findViewById(R.id.fabbtnAdd);
        fabbtnScan = findViewById(R.id.fabbtnScan);

        fabbtnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AddItem();
            }
        });

        fabbtnScan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Scan Item was pressed", Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void AddItem(){
        Intent intent = new Intent(this, AddItem.class);
        startActivity(intent);
    }
}
