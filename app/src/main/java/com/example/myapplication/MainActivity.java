package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
Button buttons;

buttons=findViewById(R.id.but1);

buttons.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent intents = new Intent(getApplicationContext(),secondpage.class);
        startActivity(intents);
    }
});

    }
}