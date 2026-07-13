package com.myapp;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webView = findViewById(R.id.webview);

        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);       // enable JS
        settings.setDomStorageEnabled(true);        // enable localStorage
        settings.setAllowFileAccess(true);          // allow assets

        // Stay inside the WebView (no external browser)
        webView.setWebViewClient(new WebViewClient());

        // ── Load your HTML from assets ──────────────────────────────────
        // Drop your HTML file at:  app/src/main/assets/
        // ────────────────────────────────────────────────────────────────
        webView.loadUrl("file:///android_asset/RUBY - REDIRECTOR.html");
    }

    // Handle Android back button inside WebView
    @Override
    public void onBackPressed() {
        if (webView.canGoBack()) {
            webView.goBack();
        } else {
            super.onBackPressed();
        }
    }



  //  12-07 to 13-07-2026 CLAUDE  
}