package net.thearya.androidtestbed;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;

public class ActivityAutoCompleteTextView extends AppCompatActivity implements TextWatcher
{
	private static final String[] items = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50"};
	private TextView textView;
	private AutoCompleteTextView autoCompleteTextView;

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_auto_complete_text_view);
		textView = findViewById(R.id.textView);
		autoCompleteTextView = findViewById(R.id.autoCompleteTextView);
		autoCompleteTextView.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line, items));
	}

	@Override
	public void beforeTextChanged(CharSequence s, int start, int count, int after)
	{
	}

	@Override
	public void onTextChanged(CharSequence items, int start, int before, int count)
	{
		textView.setText(autoCompleteTextView.getText());
	}

	@Override
	public void afterTextChanged(Editable s)
	{
	}
}
