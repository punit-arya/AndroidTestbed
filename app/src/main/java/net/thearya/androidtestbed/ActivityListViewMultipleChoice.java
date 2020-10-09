package net.thearya.androidtestbed;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class ActivityListViewMultipleChoice extends ListActivity
{
	private static final String[] items = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20"};
	private TextView textView;

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_list_view_multiple_choice);
		setListAdapter(new ArrayAdapter<>(this, android.R.layout.simple_list_item_multiple_choice, items));
		textView = findViewById(R.id.textView);
	}

	public void onListItemClick(ListView parent, View view, int position, long id)
	{
		// MED: Pretty print all checked items as a sequence.
		parent.setItemChecked(4, true);
		//SparseBooleanArray sparseBooleanArray = parent.getCheckedItemPositions();
		//textView.setText(sparseBooleanArray.toString());
		textView.setText(items[position]);
	}
}
