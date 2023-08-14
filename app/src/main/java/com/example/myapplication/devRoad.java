package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class devRoad extends AppCompatActivity {

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dev_road);


    WebView dv=findViewById(R.id.devRoad);
dv.loadUrl("https://whimsical.com/devops-7E37RVStMQycbbJYjfM77P");
    dv.getSettings().setJavaScriptEnabled(true);
dv.setWebViewClient(new WebViewClient());


    }
}