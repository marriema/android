package com.example.androidtest;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ToggleButton;



public class Register extends Activity implements View.OnClickListener {
	Button submit;
	Button cancel;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.addnew);

		bacon();

		submit.setOnClickListener(this);
		

	}

	private void bacon() {
	    cancel = (Button) findViewById(R.id.cancel);
		submit = (Button) findViewById(R.id.save);
		
	}

	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		
	}


}
