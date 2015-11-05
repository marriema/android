package com.example.androidtest;

import java.util.Random;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ToggleButton;

public class Test extends Activity implements View.OnClickListener {
	Button bto;
	EditText type;
	ToggleButton tg;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.test);

		bacon();

		tg.setOnClickListener(this);
		bto.setOnClickListener(this);

	}

	private void bacon() {
		type = (EditText) findViewById(R.id.editText1);
		bto = (Button) findViewById(R.id.button1);
		tg = (ToggleButton) findViewById(R.id.button2);

	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.button1:
			String userinput = type.getText().toString();
			System.out.println(userinput);
			Random crazy = new Random();
			bto.setBackgroundColor(Color.rgb(crazy.nextInt(255),
					crazy.nextInt(255), 40));
			break;

		case R.id.button2:
			if (tg.isChecked()) {
				type.setInputType(InputType.TYPE_CLASS_TEXT
						| InputType.TYPE_TEXT_VARIATION_PASSWORD);
			} else {
				type.setInputType(InputType.TYPE_CLASS_TEXT);
			}
			break;

		}

	}

}
