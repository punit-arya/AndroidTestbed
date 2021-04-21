package net.thearya.androidtestbed;

import android.app.ListActivity;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.lang.reflect.Field;

public class ActivityListViewCustomized extends ListActivity
{
	// HIG: Change this to API levels.
	private static final String[] items = {"lorem", "ipsum", "dolor", "sit", "amet", "consectetuer", "adipiscing", "elit", "morbi", "vel", "ligula", "vitae", "arcu", "aliquet", "mollis", "etiam", "vel", "erat", "placerat", "ante", "porttitor", "sodales", "pellentesque", "augue", "purus"};
	private static final String[] versionNames = new String[30];

	private static void initializeVersionNames()
	{
		// HashMap<Integer, String> apiNames = new HashMap<>();
		// for (int i = 1; i < 31; ++i)
		// {
		// 	Build.VERSION_CODES versionCodes = new Build.VERSION_CODES();
		// 	versionCodes = Build.VERSION_CODES.LOLLIPOP;
		// 	apiNames.put(i, Build.VERSION_CODES.class);
		// }

		// Field[] fields;
		// Log.e("ERROR: ", "ActivityListViewCustomized.initializeItems(): ");
		// String osName = fields[Build.VERSION.SDK_INT + 1].getName();
		// Log.d("OsName","" + osName);

		Log.e("ERROR: ", "initializeVersionNames: ");
		Field[] fields = Build.VERSION_CODES.class.getFields();
		// versionNames[0] = "FINALlorem";
		// for (String versionName : versionNames)
		// {
		// 	Log.e("ERROR: ", "initializeItems: " + versionName);
		// }
		for (int i = 0; i < 30; ++i)
		{
			Log.e("ERROR: ", "FieldName: " + fields[i].getName());
			versionNames[i] = fields[i].getName();
		}
		// String versionCodename = null;
		// fields = Build.VERSION_CODES.class.getFields();
		// for (Field field : fields)
		// {
		// 	try
		// 	{
		// 		int value = field.getInt(null);
		// 		if (value == Build.VERSION.SDK_INT && field.getName().length() > 1)
		// 		{
		// 			String fieldName = field.getName();
		// 			System.out.println(fieldName + " fieldName" + "value: " + value);
		// 			versionCodename = fieldName.substring(0, 1).toUpperCase() + fieldName.substring(1).toLowerCase();
		// 			System.out.println(versionCodename + " versionCodeName");
		// 			break;
		// 		}
		// 	}
		// 	catch (IllegalAccessException e)
		// 	{
		// 		e.printStackTrace();
		// 	}
		// }
	}

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
		{
			ActivityListViewCustomized.initializeVersionNames();
		}

		AdapterIcon()
		{
			super(ActivityListViewCustomized.this, R.layout.activity_list_view_customized, R.id.label, ActivityListViewCustomized.versionNames);
		}

		@NonNull
		@Override
		public View getView(int position, View convertView, @NonNull ViewGroup parent)
		{
			View row = super.getView(position, convertView, parent);
			ImageView icon = row.findViewById(R.id.icon);
			ViewHolder holder = (ViewHolder) row.getTag();

			if (versionNames[position].length() > 4)
			{
				icon.setImageResource(R.drawable.longer);
			}
			else
			{
				icon.setImageResource(R.drawable.shorter);
			}

			TextView size = row.findViewById(R.id.size);

			if (holder == null)
			{
				holder = new ViewHolder(row);
				row.setTag(holder);
			}

			size.setText(String.format(getString(R.string.sizeTemplate), versionNames[position].length()));

			return row;
		}
	}
}
