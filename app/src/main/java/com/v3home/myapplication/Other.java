package com.v3home.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import com.v3home.myapplication.Preferences.PreferencesManager;


public class Other extends Activity {

    private PreferencesManager pref;
    private TextView tvUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other);
        pref = new PreferencesManager(this);
        mFindView();
        tvUser.setText(pref.getUser());

    }

    private void mFindView(){
        tvUser = (TextView) findViewById(R.id.tvUser);
    }



}
