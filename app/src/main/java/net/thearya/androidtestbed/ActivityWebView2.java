package net.thearya.androidtestbed;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

public class ActivityWebView2 extends AppCompatActivity
{
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_web_view_2);
		WebView webView2 = findViewById(R.id.webview2);
		webView2.loadData("<HTML><BODY>Hello, world!</BODY></HTML>", "text/html; charset=UTF-8", null);
	}
}
