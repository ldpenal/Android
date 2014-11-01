package com.v3home.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import com.v3home.myapplication.Preferences.PreferencesManager;

import java.util.Timer;
import java.util.TimerTask;


public class Splash extends Activity {
    private PreferencesManager pref;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        pref = new PreferencesManager(this);



        if(pref.isLogin()){

            TimerTask task = new TimerTask() {
                @Override
                public void run() {

                    Intent act = new Intent(Splash.this, Other.class);
                    startActivity(act);

                    // Close the activity so the user won't able to go back this
                    // activity pressing Back button
                    finish();
                }
            };

            // Simulate a long loading process on application startup.
            Timer timer = new Timer();
            timer.schedule(task, 2000);

        }else{
            TimerTask task = new TimerTask() {
                @Override
                public void run() {

                    Intent act = new Intent(Splash.this, Login.class);
                    startActivity(act);

                    // Close the activity so the user won't able to go back this
                    // activity pressing Back button
                    finish();
                }
            };

            // Simulate a long loading process on application startup.
            Timer timer = new Timer();
            timer.schedule(task, 2000);
        }
    }

}
