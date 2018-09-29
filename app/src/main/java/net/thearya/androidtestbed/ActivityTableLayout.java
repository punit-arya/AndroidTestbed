package net.thearya.androidtestbed;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ToggleButton;

public class ActivityTableLayout extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener
{

	ToggleButton toggleButton;

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_table_layout);
		toggleButton = findViewById(R.id.toggleButton);
		toggleButton.setOnCheckedChangeListener(this);
	}

	public void onButtonTableLayoutTap(View v)
	{
		startActivity(new Intent(this, ActivityMain.class));
	}

	@Override
	public void onCheckedChanged(CompoundButton buttonView, boolean isChecked)
	{
		if (isChecked)
		{
			buttonView.setText(R.string.toggleButtonOn);
		} else
		{
			buttonView.setText(R.string.toggleButtonOff);
		}
	}
}
