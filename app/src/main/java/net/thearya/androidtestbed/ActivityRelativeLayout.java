package net.thearya.androidtestbed;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.CompoundButton;
import android.widget.Switch;

public class ActivityRelativeLayout extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener
{
	Switch aSwitch;

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_relative_layout);
		aSwitch = findViewById(R.id.toggleSwitch);
		aSwitch.setOnCheckedChangeListener(this);
	}

	@Override
	public void onCheckedChanged(CompoundButton buttonView, boolean isChecked)
	{
		if (isChecked)
		{
			buttonView.setText(R.string.switched_on);
		} else
		{
			buttonView.setText(R.string.switched_off);
		}
	}
}
