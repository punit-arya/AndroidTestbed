package net.thearya.androidtestbed;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class ActivityRecyclerView0 extends ActivityRecyclerView
{
	private static final String[] items = {"lorem", "ipsum", "dolor", "sit", "amet", "consectetuer", "adipiscing", "elit", "morbi", "vel", "ligula", "vitae", "arcu", "aliquet", "mollis", "etiam", "vel", "erat", "placerat", "ante", "porttitor", "sodales", "pellentesque", "augue", "purus"};

	@Override
	public void onCreate(Bundle state)
	{
		super.onCreate(state);
		setLayoutManager(new LinearLayoutManager(this));
		// getRecyclerView().addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));
		Drawable divider = getResources().getDrawable(R.drawable.drawable_divider);
		getRecyclerView().addItemDecoration(new HorizontalDividerItemDecoration(divider));
		setAdapter(new AdapterIcon());
	}

	class RowTappable extends RecyclerView.ViewHolder implements View.OnClickListener
	{
		TextView label;
		TextView size;
		ImageView icon;
		private String template;

		RowTappable(View viewRow)
		{
			super(viewRow);
			label = viewRow.findViewById(R.id.label);
			size = viewRow.findViewById(R.id.size);
			icon = viewRow.findViewById(R.id.icon);
			template = size.getContext().getString(R.string.sizeTemplate);
			viewRow.setOnClickListener(this);
			if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP)
			{
				viewRow.setOnTouchListener(new View.OnTouchListener()
				{
					@Override
					@SuppressLint("ClickableViewAccessibility")
					@TargetApi(Build.VERSION_CODES.LOLLIPOP)
					public boolean onTouch(View view, MotionEvent event)
					{
						view.findViewById(R.id.rowContent).getBackground().setHotspot(event.getX(), event.getY());
						return false;
					}
				});
			}
		}

		void bindModel(String item)
		{
			label.setText(item);
			size.setText(String.format(template, item.length()));

			if (item.length() > 4)
			{
				icon.setImageResource(R.drawable.longer);
			}
			else
			{
				icon.setImageResource(R.drawable.shorter);
			}
		}

		@Override
		public void onClick(View view)
		{
			Toast.makeText(view.getContext(), String.format(getString(R.string.youClicked), getAdapterPosition()), Toast.LENGTH_SHORT).show();
		}
	}

	class AdapterIcon extends RecyclerView.Adapter<RowTappable>
	{
		@NonNull
		@Override
		public RowTappable onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
		{
			return new RowTappable(getLayoutInflater().inflate(R.layout.activity_recycler_view_0, parent, false));
		}

		@Override
		public void onBindViewHolder(@NonNull RowTappable rowTappable, int position)
		{
			rowTappable.bindModel(items[position]);
		}

		@Override
		public int getItemCount()
		{
			return items.length;
		}
	}

	class HorizontalDividerItemDecoration extends RecyclerView.ItemDecoration
	{
		private Drawable divider;

		HorizontalDividerItemDecoration(Drawable divider)
		{
			this.divider = divider.mutate();
		}

		@Override
		public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state)
		{
			int left = recyclerView.getPaddingLeft();
			int right = recyclerView.getWidth() - recyclerView.getPaddingRight();
			int childCount = recyclerView.getChildCount();

			for (int i = 0; i < childCount - 1; i++)
			{
				View child = recyclerView.getChildAt(i);
				RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) child.getLayoutParams();
				int top = child.getBottom() + layoutParams.bottomMargin;
				int bottom = top + divider.getIntrinsicHeight();
				divider.setBounds(left, top, right, bottom);
				divider.draw(canvas);
			}
		}
	}
}
