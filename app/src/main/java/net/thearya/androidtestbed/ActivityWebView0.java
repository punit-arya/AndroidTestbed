package net.thearya.androidtestbed;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

public class ActivityWebView0 extends AppCompatActivity
{
	WebView webView0;

	@SuppressLint("SetJavaScriptEnabled")
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_web_view_0);
		webView0 = findViewById(R.id.activityWebView0);
		webView0.getSettings().setJavaScriptEnabled(true);
		webView0.loadUrl("https://google.com");
	}
}
