package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class netRoad extends AppCompatActivity {

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_net_road);

        WebView nt = findViewById(R.id.netWeb);
        nt.loadUrl("https://whimsical.com/networking-cheatsheet-by-love-babbar-FcLExFDezehhfsbDPfZDBv");
        nt.getSettings().setJavaScriptEnabled(true);
        nt.setWebViewClient(new WebViewClient());
    }
}