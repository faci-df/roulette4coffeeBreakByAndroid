package io.hyonsok.roulettes4coffeebreak;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WebView webV = (WebView) findViewById(R.id.webView4Coffee);
        webV.getSettings().setJavaScriptEnabled(true);

        webV.setWebChromeClient(new WebChromeClient(){});

        webV.setWebViewClient(new WebViewClient(){

            @Override
            public void onPageStarted(WebView view, String url, Bitmap favicon) {
                super.onPageStarted(view, url, favicon);
                findViewById(R.id.progressBar).setVisibility(View.VISIBLE);
            }
            @Override
            public void onPageFinished(WebView view, String url) {
                super.onPageFinished(view, url);
                findViewById(R.id.progressBar).setVisibility(View.GONE);
            }
        });

        WebSettings webS = webV.getSettings();
        webS.setJavaScriptCanOpenWindowsAutomatically(true);


        //webV.loadUrl("https://roulette4coffeb.herokuapp.com/");
        webV.loadUrl("https://r4cb-global-c9.herokuapp.com/");


    }


}
