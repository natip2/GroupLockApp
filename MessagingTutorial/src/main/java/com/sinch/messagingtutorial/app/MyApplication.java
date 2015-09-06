package com.sinch.messagingtutorial.app;

import android.app.Application;
import com.parse.Parse;
//asjflksg
public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        int x;
        Parse.initialize(this, "qKmz3Nbj1A3efQj8wKOnFRKafxenQJZrFuP0AOdk", "1MCwpWJH4edQMi85wcSw7LR13MhDDbzRrpaJgCBc");
    }
}
