package io.hyonsok.roulettes4coffeebreak;

import android.os.Handler;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;

/**
 * Created by hyonsokshin on 1/26/17.
 */

public class AndroidBridge {

    WebView webVw;
    Handler handlr;

    public AndroidBridge(final WebView webV, Handler handler) {
        this.webVw = webV;
        this.handlr = handler;
    }
    @JavascriptInterface
    public void changeWebView4SalesP() {
        handlr.post(new Runnable() {
            @Override
            public void run() {
                webVw.loadUrl("https://roulette4coffeb.herokuapp.com/");
            }
        });
    }
}
