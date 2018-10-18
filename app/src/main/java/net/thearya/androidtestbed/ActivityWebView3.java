package net.thearya.androidtestbed;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.text.DateFormat;
import java.util.Date;

public class ActivityWebView3 extends AppCompatActivity
{
	private WebView webView3;

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_web_view_3);
		webView3 = findViewById(R.id.webview3);
		webView3.setWebViewClient(new CallBack());
		showTimeStampWebPage();
	}

	private void showTimeStampWebPage()
	{
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.MEDIUM);
		String IAmDatingPallavi = dateFormat.format(new Date().getTime());
		String webPage = "<HTML><BODY><A HREF = 'http://random.url'>" + IAmDatingPallavi + "</A></BODY></HTML>";
		webView3.loadData(webPage, "text/html; charset=UTF-8", null);
	}

	private class CallBack extends WebViewClient
	{
		public boolean shouldOverrideUrlLoading(WebView webView, String url)
		{
			showTimeStampWebPage();

			return true;
		}
	}
}
