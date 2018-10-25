package net.thearya.androidtestbed;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class ActivityRecyclerView0 extends RecyclerViewActivity
{
	private static final String[] items = {"lorem", "ipsum", "dolor", "sit", "amet", "consectetuer", "adipiscing", "elit", "morbi", "vel", "ligula", "vitae", "arcu", "aliquet", "mollis", "etiam", "vel", "erat", "placerat", "ante", "porttitor", "sodales", "pellentesque", "augue", "purus"};

	@Override
	public void onCreate(Bundle state)
	{
		super.onCreate(state);
		setLayoutManager(new LinearLayoutManager(this));
		setAdapter(new AdapterIcon());
	}

	static class RowHolder extends RecyclerView.ViewHolder
	{
		TextView label;
		TextView size;
		ImageView icon;
		private String template;

		RowHolder(View viewRow)
		{
			super(viewRow);
			label = viewRow.findViewById(R.id.label);
			size = viewRow.findViewById(R.id.size);
			icon = viewRow.findViewById(R.id.icon);
			template = size.getContext().getString(R.string.sizeTemplate);
		}

		void bindModel(String item)
		{
			label.setText(item);
			size.setText(String.format(template, item.length()));

			if (item.length() > 4)
			{
				icon.setImageResource(R.drawable.delete);
			}
			else
			{
				icon.setImageResource(R.drawable.ok);
			}
		}
	}

	class AdapterIcon extends RecyclerView.Adapter<RowHolder>
	{
		@NonNull
		@Override
		public RowHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
		{
			return new RowHolder(getLayoutInflater().inflate(R.layout.activity_recycler_view_0, parent, false));
		}

		@Override
		public void onBindViewHolder(@NonNull RowHolder holder, int position)
		{
			holder.bindModel(items[position]);
		}

		@Override
		public int getItemCount()
		{
			return items.length;
		}
	}
}

