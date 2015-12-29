package me.mhsjlw.android_snap;

import android.app.Application;

import com.parse.Parse;

public class SnapApplication extends Application {
	
	@Override
	public void onCreate() { 
		super.onCreate();
	    Parse.initialize(this, "APPLICATION_ID", "CLIENT_KEY");
	}
}
