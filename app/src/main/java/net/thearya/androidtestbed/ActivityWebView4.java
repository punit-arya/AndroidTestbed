package net.thearya.androidtestbed;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class ActivityWebView4 extends AppCompatActivity
{
	WebView webView4;

	@TargetApi(Build.VERSION_CODES.O)
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_web_view_4);
		webView4 = findViewById(R.id.webview4);
		webView4.setWebViewClient(new WebViewClient()
		{
			@Override
			public boolean shouldOverrideUrlLoading(WebView webView, String url)
			{
				webView.loadUrl(url);

				// TODO: Even if this is changed to false, it still opens in WebView.  Check.
				return true;
			}
		});
		// NOTE: This overrides the manifest element.
		// webView4.getSettings().setSafeBrowsingEnabled(false);
		webView4.loadUrl("http://commonsware.com");
	}
}
