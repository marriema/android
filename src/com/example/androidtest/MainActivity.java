package com.example.androidtest;


import android.R.layout;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.app.Activity;


public class MainActivity extends Activity implements View.OnClickListener{
	
	int counter;
	Button x;
	Button y;
	TextView text;
	
	MediaPlayer mp;
	

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.);
        
        mp = MediaPlayer.create(MainActivity.this, R.);
		mp.start();
        
        counter = 0;
        x = (Button) findViewById(R.id.button1);
        y = (Button) findViewById(R.id.button2);
        text = (TextView) findViewById(R.id.text1);
        
        
        x.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Toast.makeText(MainActivity.this, "我是动态button",Toast.LENGTH_SHORT).show();
				counter++;
				text.setText("Your total is "+counter);
				
				
				
			}
		});
        y.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				counter--;
				text.setText("Your total is "+counter);
				
				
			}
		});
        

    }

    private void setContentView(layout layout) {
		// TODO Auto-generated method stub
		
	}

	@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
    
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		mp.release();
		finish();
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
	}
    
}
