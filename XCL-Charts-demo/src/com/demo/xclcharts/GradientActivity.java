package com.demo.xclcharts;

import com.demo.xclcharts.view.PieChart02View;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class GradientActivity extends Activity {

	PieChart02View radialGradientView;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//setContentView(R.layout.activity_gradient);
		
		radialGradientView = new PieChart02View(this);
		setContentView(radialGradientView);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.gradient, menu);
		return true;
	}

}