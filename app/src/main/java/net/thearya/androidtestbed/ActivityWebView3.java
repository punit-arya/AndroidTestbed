package net.thearya.androidtestbed;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class ActivityWebView3 extends AppCompatActivity
{
	WebView webView3;

	@TargetApi(Build.VERSION_CODES.O)
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_web_view_3);
		webView3 = findViewById(R.id.activityWebView3);
		webView3.setWebViewClient(new WebViewClient()
		{
			@Override
			public boolean shouldOverrideUrlLoading(WebView webView, String url)
			{
				webView.loadUrl(url);

				// MED: Even if this is changed to false, it still opens in WebView.  Check.
				return true;
			}
		});
		// NOT: This overrides the manifest element.
		// webView3.getSettings().setSafeBrowsingEnabled(false);
		webView3.loadUrl("http://commonsware.com");
	}
}
