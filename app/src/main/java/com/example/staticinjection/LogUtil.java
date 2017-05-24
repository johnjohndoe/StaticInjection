package com.example.staticinjection;


import android.app.Activity;

import org.androidannotations.annotations.Bean;
import org.androidannotations.annotations.EBean;

@EBean
public class LogUtil {

	@Bean(CrashReporting.class) static Reporting reporting;

	public static void log(Activity activity, String method) {
		reporting.log(activity.getClass().getName() + ":" + method);
	}

}
