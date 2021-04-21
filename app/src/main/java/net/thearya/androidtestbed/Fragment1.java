package net.thearya.androidtestbed;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;

public class Fragment1 extends FragmentActivity
{
	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.fragment_1);
	}

	public void showOther(View v)
	{
		Intent other = new Intent(this, Fragment2.class);

		other.putExtra(Fragment2.EXTRA_MESSAGE, getString(R.string.fragment_2));
		startActivity(other);
	}
}
