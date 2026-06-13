package com.example.simplewebview;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Video_Player extends AppCompatActivity {

    WebView myWebview;
    public static String web_url;
    // public static ব্যবহার করা হয়েছে যাতে অন্য Activity থেকে object ছাড়া সরাসরি access করা যায়

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_video_player);

        myWebview = findViewById(R.id.myWebview);
        myWebview.setWebViewClient(new WebViewClient());
        myWebview.getSettings().setJavaScriptEnabled(true);
        myWebview.loadUrl(web_url);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}