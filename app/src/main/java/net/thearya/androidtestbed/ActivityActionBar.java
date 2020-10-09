package net.thearya.androidtestbed;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import java.util.ArrayList;
import java.util.Arrays;

public class ActivityActionBar extends ListActivity
{
	private final String[] items = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20"};
	private ArrayAdapter<String> adapter;

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		initAdapter();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu)
	{
		getMenuInflater().inflate(R.menu.menu_action_bar_1, menu);

		return super.onCreateOptionsMenu(menu);
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem menuItem)
	{
		switch (menuItem.getItemId())
		{
			case R.id.add:
				addWord();

				return true;

			case R.id.reset:
				initAdapter();

				return true;

			// case R.id.about:
			// 	Toast.makeText(this, R.string.aboutToast, Toast.LENGTH_LONG).show();
			//
			// 	return true;
			//
			// case R.id.home:
			// 	Toast.makeText(this, R.string.home, Toast.LENGTH_LONG).show();
			// 	Log.i("INFO Tag", "You wanna go home ?");
			// 	startActivity(new Intent(this, ActivityMain.class));
			//
			// 	return true;
		}

		return super.onOptionsItemSelected(menuItem);
	}

	private void initAdapter()
	{
		// Toast.makeText(this, R.string.reset, Toast.LENGTH_LONG).show();
		ArrayList<String> words = new ArrayList<>(Arrays.asList(items).subList(0, 5));
		adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, words);
		setListAdapter(adapter);
	}

	private void addWord()
	{
		// Toast.makeText(this, R.string.add, Toast.LENGTH_LONG).show();
		// if (getListAdapter().getCount() < items.length)
		if (adapter.getCount() < items.length)
		{
			adapter.add(items[adapter.getCount()]);
		}
	}

}
