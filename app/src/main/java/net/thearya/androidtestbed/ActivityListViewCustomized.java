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
		// setContentView(R.layout.activity_list_view_customized);
		setListAdapter(new AdapterIcon());
	}

	private String getModel(int position)
	{
		return (String) getListAdapter().getItem(position);
	}

	class ViewHolder
	{
		ImageView icon;
		TextView size;

		ViewHolder(View row)
		{
			this.icon = row.findViewById(R.id.icon);
			this.size = row.findViewById(R.id.size);
		}
	}

	class AdapterIcon extends ArrayAdapter<String>
	{
		AdapterIcon()
		{
			super(ActivityListViewCustomized.this, R.layout.activity_list_view_customized, R.id.label, items);
		}

		@NonNull
		@Override
		public View getView(int position, View convertView, @NonNull ViewGroup parent)
		{
			View row = super.getView(position, convertView, parent);
			// ImageView icon = row.findViewById(R.id.icon);
			ViewHolder holder = (ViewHolder) row.getTag();

			// if (items[position].length() > 4)
			// {
			// 	icon.setImageResource(R.drawable.delete);
			// }
			// else
			// {
			// 	icon.setImageResource(R.drawable.ok);
			// }
			//
			// TextView size = row.findViewById(R.id.size);

			if (holder == null)
			{
				holder = new ViewHolder(row);
				row.setTag(holder);
			}

			if (getModel(position).length() > 4)
			{
				holder.icon.setImageResource(R.drawable.delete);
			}
			else
			{
				holder.icon.setImageResource(R.drawable.ok);
			}

			// size.setText(String.format(getString(R.string.sizeTemplate), items[position].length()));
			holder.size.setText(String.format(getString(R.string.sizeTemplate), items[position].length()));

			return row;
		}
	}
}
