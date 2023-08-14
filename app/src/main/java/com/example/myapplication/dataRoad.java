package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class dataRoad extends AppCompatActivity {

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_road);

        WebView dtw;
        dtw = findViewById(R.id.dataWeb);
        dtw.loadUrl("https://www.whimsical.com/data-science-roadmap-2022-H31ozuZ7cBiBFNLi1kmgwF");
        dtw.getSettings().setJavaScriptEnabled(true);
        dtw.setWebViewClient(new WebViewClient());

    }
}