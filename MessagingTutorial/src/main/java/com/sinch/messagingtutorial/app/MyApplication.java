package com.sinch.messagingtutorial.app;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseInstallation;

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Parse.initialize(this, "qKmz3Nbj1A3efQj8wKOnFRKafxenQJZrFuP0AOdk", "1MCwpWJH4edQMi85wcSw7LR13MhDDbzRrpaJgCBc");
        ParseInstallation.getCurrentInstallation().saveInBackground();
    }
}
