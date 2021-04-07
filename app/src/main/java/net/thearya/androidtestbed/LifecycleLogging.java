package net.thearya.androidtestbed;

import android.os.Bundle;

public class LifecycleLogging extends ActivityMain
{
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_lifecycle_logging);
	}

}
