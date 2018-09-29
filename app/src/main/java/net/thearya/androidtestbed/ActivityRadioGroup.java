package net.thearya.androidtestbed;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.RadioButton;

public class ActivityRadioGroup extends AppCompatActivity
{

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_radio_group);
		RadioButton radioButton = findViewById(R.id.radio2);
		radioButton.setChecked(true);
	}
}
