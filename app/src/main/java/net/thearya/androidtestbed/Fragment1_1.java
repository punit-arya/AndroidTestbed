package net.thearya.androidtestbed;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Fragment1_1 extends Fragment implements View.OnClickListener
{
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
	{
		View result = inflater.inflate(R.layout.fragment1_1, container, false);
		result.findViewById(R.id.showOther).setOnClickListener(this);

		return (result);
	}

	@Override
	public void onClick(View v)
	{
		// super.onCreate(savedInstanceState);
		// setContentView(R.layout.fragment1_1);
		((Fragment1) getActivity()).showOther(v);
	}

	@Override
	public void onAttach(Activity a)
	{
		super.onAttach(a);
		Log.d(getClass().getSimpleName(), "onAttach()");
	}

	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		Log.d(getClass().getSimpleName(), "onCreate()");
	}

	@Override
	public void onActivityCreated(Bundle savedInstanceState)
	{
		super.onActivityCreated(savedInstanceState);
		Log.d(getClass().getSimpleName(), "onActivityCreated()");
	}

	@Override
	public void onStart()
	{
		super.onStart();
		Log.d(getClass().getSimpleName(), "onStart()");
	}

	@Override
	public void onResume()
	{
		super.onResume();
		Log.d(getClass().getSimpleName(), "onResume()");
	}

	@Override
	public void onPause()
	{
		Log.d(getClass().getSimpleName(), "onPause()");
		super.onPause();
	}

	@Override
	public void onStop()
	{
		Log.d(getClass().getSimpleName(), "onStop()");
		super.onStop();
	}

	@Override
	public void onDestroyView()
	{
		Log.d(getClass().getSimpleName(), "onDestroyView()");
		super.onDestroyView();
	}

	@Override
	public void onDestroy()
	{
		Log.d(getClass().getSimpleName(), "onDestroy()");
		super.onDestroy();
	}

	@Override
	public void onDetach()
	{
		Log.d(getClass().getSimpleName(), "onDetach()");
		super.onDetach();
	}
}
