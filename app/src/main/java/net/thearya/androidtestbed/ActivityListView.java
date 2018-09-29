package net.thearya.androidtestbed;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class ActivityListView extends ListActivity
{
	private static final String[] items = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20"};
	private TextView textView;

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		this.setContentView(R.layout.activity_list_view);
		setListAdapter(new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, items));
		textView = findViewById(R.id.textView);
	}

	public void onListItemClick(ListView parent, View view, int position, long id)
	{
		textView.setText(items[position]);
	}
}
