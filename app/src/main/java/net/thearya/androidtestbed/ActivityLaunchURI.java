package net.thearya.androidtestbed;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class ActivityLaunchURI extends AppCompatActivity
{

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_launch_u_r_i);
	}

	public void showMe(View v)
	{
		Log.i("INFO TAG", "showMe");
		EditText url = (EditText) findViewById(R.id.url1);
		startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(url.getText().toString())));
		Log.i("INFO TAG", "ended Show me: " + url.getText().toString());
	}
}
