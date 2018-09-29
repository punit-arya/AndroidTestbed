package net.thearya.androidtestbed;

import android.app.ListActivity;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class ActivityListViewCustomized extends ListActivity
{
	private static final String[] items = {"lorem", "ipsum", "dolor", "sit", "amet", "consectetuer", "adipiscing", "elit", "morbi", "vel", "ligula", "vitae", "arcu", "aliquet", "mollis", "etiam", "vel", "erat", "placerat", "ante", "porttitor", "sodales", "pellentesque", "augue", "purus"};

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		//setContentView(R.layout.activity_list_view_customized);
		setListAdapter(new IconicAdapter());
	}

	class IconicAdapter extends ArrayAdapter<String>
	{
		IconicAdapter()
		{
			super(ActivityListViewCustomized.this, R.layout.activity_list_view_customized, R.id.label, items);
		}

		@NonNull
		@Override
		public View getView(int position, View convertView, @NonNull ViewGroup parent)
		{
			View row = super.getView(position, convertView, parent);
			ImageView icon = row.findViewById(R.id.icon);

			if (items[position].length() > 4)
			{
				icon.setImageResource(R.drawable.delete);
			}
			else
			{
				icon.setImageResource(R.drawable.ok);
			}
			TextView size = row.findViewById(R.id.size);
			size.setText(String.format(getString(R.string.size), items[position].length()));
			return row;
		}
	}
}
