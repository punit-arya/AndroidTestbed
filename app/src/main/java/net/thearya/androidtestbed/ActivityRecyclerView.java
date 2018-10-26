package net.thearya.androidtestbed;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;

abstract public class ActivityRecyclerView extends Activity
{
	private RecyclerView recyclerView = null;

	public void setAdapter(RecyclerView.Adapter adapter)
	// TODO: Adapter is a templatized class but no type parameter passed.  Check.
	{
		getRecyclerView().setAdapter(adapter);
	}

	public RecyclerView.Adapter getAdapter()
	{
		return getRecyclerView().getAdapter();
	}

	public void setLayoutManager(RecyclerView.LayoutManager layoutManager)
	{
		getRecyclerView().setLayoutManager(layoutManager);
	}

	public RecyclerView getRecyclerView()
	{
		if (recyclerView == null)
		{
			recyclerView = new RecyclerView(this);
			recyclerView.setHasFixedSize(true);
			setContentView(recyclerView);
		}

		return recyclerView;
	}
}
