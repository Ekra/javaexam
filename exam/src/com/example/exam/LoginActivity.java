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
import android.widget.CheckBox;
import android.widget.EditText;
import android.os.Build;

public class LoginActivity extends ActionBarActivity implements OnClickListener {
	
Button btnback;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.loginscreen);
		
		
		btnback = (Button) findViewById(R.id.btn_back);
		btnback.setOnClickListener(this);
		
		
		
		
		

		
		}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.btn_back:
			startActivity(new Intent(getApplicationContext(),WelcomeActivity.class));
			
			break;

		default:
			break;
		}
		
	}
	}
