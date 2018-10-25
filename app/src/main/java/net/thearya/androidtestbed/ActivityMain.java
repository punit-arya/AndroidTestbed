package net.thearya.androidtestbed;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

public class ActivityMain extends AppCompatActivity
{
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		// TODO: Convert this to a table layout with no horizontal scrolling and no wrapping.
		setContentView(R.layout.activity_main);
	}

	public void onButtonTapLinearLayout(View view)
	{
		Log.i("INFO Tag", "You tapped onButtonTapLinearLayout");
		startActivity(new Intent(this, ActivityLinearLayout.class));
	}

	public void onButtonTapRelativeLayout(View view)
	{
		Log.i("INFO Tag", "You tapped onButtonTapRelativeLayout");
		startActivity(new Intent(this, ActivityRelativeLayout.class));
	}

	public void onButtonTapTableLayout(View view)
	{
		Log.i("INFO Tag", "You tapped onButtonTapTableLayout");
		startActivity(new Intent(this, ActivityTableLayout.class));
	}

	public void onButtonTapRadioGroup(View view)
	{
		Log.i("INFO Tag", "You tapped onButtonTapRadioGroup");
		startActivity(new Intent(this, ActivityRadioGroup.class));
	}

	public void onButtonTapScrollView(View view)
	{
		Log.i("INFO Tag", "You tapped onButtonTapScrollView");
		startActivity(new Intent(this, ActivityScrollView.class));
	}

	public void onButtonTapListView(View view)
	{
		Log.i("INFO Tag", "You tapped onButtonTapListView");
		startActivity(new Intent(this, ActivityListView.class));
	}

	public void onButtonTapListViewMultipleChoice(View view)
	{
		Log.i("INFO Tag", "You tapped onButtonTapListViewMultipleChoice");
		startActivity(new Intent(this, ActivityListViewMultipleChoice.class));
	}

	public void onButtonTapSpinner(View view)
	{
		Log.i("INFO Tag", "You tapped onButtonTapSpinner");
		startActivity(new Intent(this, ActivitySpinner.class));
	}

	public void onButtonTapGridView(View view)
	{
		Log.i("INFO Tag", "You tapped onButtonTapGridView");
		startActivity(new Intent(this, ActivityGridView.class));
	}

	public void onButtonTapAutoCompleteTextView(View view)
	{
		Log.i("INFO Tag", "You tapped onButtonTapAutoCompleteTextView");
		startActivity(new Intent(this, ActivityAutoCompleteTextView.class));
	}

	public void onButtonTapListViewCustomized(View view)
	{
		Log.i("INFO Tag", "You tapped onButtonTapListViewCustomized");
		startActivity(new Intent(this, ActivityListViewCustomized.class));
	}

	public void onButtonTapWebView1(View view)
	{
		Log.i("INFO Tag", "You tapped onButtonTapWebView1");
		startActivity(new Intent(this, ActivityWebView1.class));
	}

	public void onButtonTapWebView2(View view)
	{
		Log.i("INFO Tag", "You tapped onButtonTapWebView2");
		startActivity(new Intent(this, ActivityWebView2.class));
	}

	public void onButtonTapWebView3(View view)
	{
		Log.i("INFO Tag", "You tapped onButtonTapWebView3");
		startActivity(new Intent(this, ActivityWebView3.class));
	}

	public void onButtonTapWebView4(View view)
	{
		Log.i("INFO Tag", "You tapped onButtonTapWebView4");
		startActivity(new Intent(this, ActivityWebView4.class));
	}

	public void onButtonTapConstraintLayout0(View view)
	{
		Log.i("INFO Tag", "You tapped onButtonTapConstraintLayout0");
		startActivity(new Intent(this, ActivityConstraintLayout0.class));
	}

	public void onButtonTapConstraintLayout1(View view)
	{
		Log.i("INFO Tag", "You tapped onButtonTapConstraintLayout1");
		startActivity(new Intent(this, ActivityConstraintLayout1.class));
	}

	public void onButtonTapConstraintLayout2(View view)
	{
		Log.i("INFO Tag", "You tapped onButtonTapConstraintLayout2");
		startActivity(new Intent(this, ActivityConstraintLayout2.class));
	}

	public void onButtonTapRecyclerView0(View view)
	{
		Log.i("INFO Tag", "You tapped onButtonTapRecyclerView0");
		startActivity(new Intent(this, ActivityRecyclerView0.class));
	}
}
