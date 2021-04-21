package net.thearya.androidtestbed;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.widget.TextView;

public class Fragment2 extends FragmentActivity
{
	public static final String EXTRA_MESSAGE = "msg";

	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.fragment_2);

		TextView tv = (TextView) findViewById(R.id.msg);

	}
}
