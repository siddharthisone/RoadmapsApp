package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class aiRoad extends AppCompatActivity {

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ai_road);

        WebView wt = findViewById(R.id.aiML);
wt.loadUrl("https://whimsical.com/machine-learning-roadmap-by-ayush-singh-newera-J1EwnqAPUtF77ejgbRc8Hk");
        wt.getSettings().setJavaScriptEnabled(true);
        wt.setWebViewClient(new WebViewClient());

    }
}