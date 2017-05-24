package com.example.staticinjection;


import org.androidannotations.annotations.EBean;

@EBean(scope = EBean.Scope.Singleton)
public class CrashReporting implements Reporting {

	@Override
	public void log(String text) {
		// Report to backend
	}

}
