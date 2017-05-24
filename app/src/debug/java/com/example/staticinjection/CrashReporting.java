package com.example.staticinjection;

import android.util.Log;

import org.androidannotations.annotations.EBean;

@EBean(scope = EBean.Scope.Singleton)
public class CrashReporting implements Reporting {

	@Override
	public void log(String text) {
		Log.d(getClass().getName(), text);
	}

}
