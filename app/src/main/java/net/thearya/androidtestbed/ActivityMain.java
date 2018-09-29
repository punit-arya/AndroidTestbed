package net.thearya.androidtestbed;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class ActivityMain extends AppCompatActivity
{
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	public void onButtonTapLinearLayout(View view)
	{
		startActivity(new Intent(this, ActivityLinearLayout.class));
	}

	public void onButtonTapRelativeLayout(View view)
	{
		startActivity(new Intent(this, ActivityRelativeLayout.class));
	}

	public void onButtonTapTableLayout(View view)
	{
		startActivity(new Intent(this, ActivityTableLayout.class));
	}

	public void onButtonTapRadioGroup(View view)
	{
		startActivity(new Intent(this, ActivityRadioGroup.class));
	}

	public void onButtonTapScrollView(View view)
	{
		startActivity(new Intent(this, ActivityScrollView.class));
	}

	public void onButtonTapListView(View view)
	{
		startActivity(new Intent(this, ActivityListView.class));
	}

	public void onButtonTapListViewMultipleChoice(View view)
	{
		startActivity(new Intent(this, ActivityListViewMultipleChoice.class));
	}

	public void onButtonTapSpinner(View view)
	{
		startActivity(new Intent(this, ActivitySpinner.class));
	}

	public void onButtonTapGridView(View view)
	{
		startActivity(new Intent(this, ActivityGridView.class));
	}

	public void onButtonTapAutoCompleteTextView(View view)
	{
		startActivity(new Intent(this, ActivityAutoCompleteTextView.class));
	}
}
