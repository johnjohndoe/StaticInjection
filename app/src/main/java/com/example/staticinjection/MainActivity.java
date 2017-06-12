package com.example.staticinjection;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import org.androidannotations.annotations.AfterInject;
import org.androidannotations.annotations.EActivity;

@EActivity
public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		// Fails
		// LogUtil.log(this, "ONCREATE");
	}

	@AfterInject
	public void afterInject() {
		LogUtil.log(this, "AFTERINJECT");
	}

}
