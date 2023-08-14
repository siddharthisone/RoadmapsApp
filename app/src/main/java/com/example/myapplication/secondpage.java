package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

public class secondpage extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondpage);


      CardView  wb=findViewById(R.id.web);

        wb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent one = new Intent(getApplicationContext(),webRoad.class);
                startActivity(one);
            }
        });
        CardView cd = findViewById(R.id.appli);

        cd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intents = new Intent(getApplicationContext(),apliRoad.class);
                startActivity(intents);
            }
        });



CardView dd = findViewById(R.id.dev);
dd.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent two = new Intent(getApplicationContext(),devRoad.class);
        startActivity(two);
    }
});

CardView dt = findViewById(R.id.data);
dt.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent three = new Intent(getApplicationContext(),dataRoad.class);
        startActivity(three);
    }
});

CardView ht = findViewById(R.id.al);
ht.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent four = new Intent(getApplicationContext(),aiRoad.class);
        startActivity(four);
    }
});

CardView nt = findViewById(R.id.network);
nt.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent five = new Intent(getApplicationContext(),netRoad.class);
        startActivity(five);
    }
});
    }
}