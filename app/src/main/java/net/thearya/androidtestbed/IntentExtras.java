package net.thearya.androidtestbed;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class IntentExtras extends AppCompatActivity
{
	public static final String EXTRA_MESSAGE = "Message";

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_extras_demo);

		TextView textView = (TextView) findViewById(R.id.msg);
		textView.setText(getIntent().getStringExtra(EXTRA_MESSAGE));
	}
}
