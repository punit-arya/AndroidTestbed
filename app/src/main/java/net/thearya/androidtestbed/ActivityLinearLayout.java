package net.thearya.androidtestbed;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.CheckBox;
import android.widget.CompoundButton;

public class ActivityLinearLayout extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener
{
	CheckBox checkBox;

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_linear_layout);
		checkBox = findViewById(R.id.checkbox);
		checkBox.setOnCheckedChangeListener(this);
	}

	@Override
	public void onCheckedChanged(CompoundButton buttonView, boolean isChecked)
	{
		if (isChecked)
		{
			checkBox.setText(R.string.checked);
		}
		else
		{
			checkBox.setText(R.string.unchecked);
		}

	}
}
