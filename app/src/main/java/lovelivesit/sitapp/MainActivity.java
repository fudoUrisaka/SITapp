package lovelivesit.sitapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    private WebView sit_web_app;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sit_web_app = (WebView)findViewById(R.id.sit_app_ac_main);
        WebSettings webSettings = sit_web_app.getSettings();
        webSettings.setJavaScriptEnabled(true);
        sit_web_app.loadUrl("https://sit.moe/");
        sit_web_app.setWebViewClient(new WebViewClient());

    }

    @Override
    public void onBackPressed() {
        if (sit_web_app.canGoBack()){
            sit_web_app.goBack();
        }
        else {
            super.onBackPressed();
        }
    }
}
