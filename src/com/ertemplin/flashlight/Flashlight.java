package com.ertemplin.flashlight;

import android.R.string;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class Flashlight extends Activity {
    /** Called when the activity is first created. */
	
	public string mFlashStatus;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(android.R.style.Theme_Light);
        setContentView(R.layout.main);
        
        
        final Button OnButton = (Button) findViewById(R.id.Button01);
        OnButton.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {
                // Perform action on click


            }
        });
        
        final Button OffButton = (Button) findViewById(R.id.Button02);
        OffButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
            	
            }
        });

        
    }
}

