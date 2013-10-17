package com.dwinter.libgdxdemo;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class Demo01 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_demo01);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.demo01, menu);
		return true;
	}

}
