package net.thearya.androidtestbed;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

public class ActivityWebView1 extends AppCompatActivity
{
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_web_view_1);
		WebView webView1 = findViewById(R.id.activityWebView1);
		webView1.loadData("<HTML><BODY>Hello, world!</BODY></HTML>", "text/html; charset=UTF-8", null);
	}
}
