package com.example.androidtest;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Menu extends ListActivity {

	String[] menu = { "Test", "second", "Splash", "MainActivity" };

	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		// TODO Auto-generated method stub
		super.onListItemClick(l, v, position, id);

		String str = menu[position];

		try {
			Class ourClass = Class.forName("com.example.androidtest." + str);
			Intent intent = new Intent(Menu.this, ourClass);
			startActivity(intent);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);

		ArrayAdapter<String> adapter = new ArrayAdapter<String>(Menu.this,
				android.R.layout.simple_list_item_1, menu);
		setListAdapter(adapter);
	}

}
