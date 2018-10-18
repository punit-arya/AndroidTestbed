package net.thearya.androidtestbed;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

public class ActivityWebView1 extends AppCompatActivity
{
	WebView webView1;

	@SuppressLint("SetJavaScriptEnabled")
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_web_view_1);
		webView1 = findViewById(R.id.webview1);
		webView1.getSettings().setJavaScriptEnabled(true);
		webView1.loadUrl("https://google.com");
	}
}
