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
import android.widget.EditText;
import android.widget.Toast;
import android.os.Build;

public class RegisterActivity extends ActionBarActivity implements OnClickListener {
	
	EditText etreguname,etregpword ,etregemail;
	Button btnregdisplay,btnregback;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.register_screen);
		
		
		etreguname = (EditText) findViewById(R.id.etuser_name);
		etregpword = (EditText) findViewById(R.id.etreg_pwd);
		etregemail = (EditText) findViewById(R.id.etreg_email);
		
		btnregdisplay = (Button) findViewById(R.id.btn_display);
		btnregdisplay.setOnClickListener(this);
		btnregback = (Button) findViewById(R.id.btn_back);
		btnregback.setOnClickListener(this);

				}

	@Override
	public void onClick(View v) {
		
		switch (v.getId()) {
		case  R.id.btn_display:
			Toast.makeText(getApplicationContext(), "submit", Toast.LENGTH_SHORT).show();
			
			break;
		case R.id.btn_back:
			Toast.makeText(getApplicationContext(), "Back",Toast.LENGTH_SHORT).show();
			startActivity(new Intent(getApplicationContext(),WelcomeActivity.class));

		default:
			break;
				
	}
	}
}

	