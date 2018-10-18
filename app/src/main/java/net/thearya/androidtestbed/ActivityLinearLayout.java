package net.thearya.androidtestbed;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Toast;

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

	public void onButtonSubmitNameTap(View view)
	{
		EditText editText = findViewById(R.id.name);
		String name = editText.getText().toString();
		//String toastContent = getString(R.string.toastContent, name);
		//Toast.makeText(this, toastContent, Toast.LENGTH_SHORT).show();
		Toast.makeText(this, "Hello, " + name, Toast.LENGTH_SHORT).show();
	}
}
