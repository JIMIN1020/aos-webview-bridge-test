package com.example.bridge;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.webkit.WebView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // WebView 초기화
        WebView webView = findViewById(R.id.webView);

        // WebView 설정 (자바스크립트 활성화)
        webView.getSettings().setJavaScriptEnabled(true);

        // HTML 페이지 로드 (assets 폴더에 있는 index.html 파일)
        webView.loadUrl("file:///android_asset/index.html");

        // WebView에 JavascriptInterface 추가
        AndroidBridge bridge = new AndroidBridge(this);
        webView.addJavascriptInterface(bridge, "Android");
    }
}
