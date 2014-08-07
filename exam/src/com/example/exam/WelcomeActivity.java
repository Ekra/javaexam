package com.example.exam;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;
import android.os.Build;

public class WelcomeActivity extends ActionBarActivity implements OnClickListener {
	
	Button btnwellogin,btnwelregister;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.welcomescreen);
		
		
		btnwelregister = (Button) findViewById(R.id.btn_register);
		btnwelregister.setOnClickListener(this);
		
		btnwellogin = (Button) findViewById(R.id.btn_log);
		btnwellogin.setOnClickListener(this);
		}

	@Override
	public void onClick(View v) 
	{
		switch (v.getId()) {
		case R.id.btn_register :
			startActivity(new Intent(getApplicationContext(),RegisterActivity.class));
			
			break;
		case R.id.btn_log:
			startActivity(new Intent(getApplicationContext(),LoginActivity.class));
			
			break;
			

		default:
			break;
		
		
	}
	}
}

	