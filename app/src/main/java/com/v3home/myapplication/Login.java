package com.v3home.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.v3home.myapplication.Preferences.PreferencesManager;


public class Login extends Activity implements View.OnClickListener{

    private EditText etUser;
    private EditText etPass;
    private Button btnLogin;
    private PreferencesManager pref;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        pref = new PreferencesManager(this);



        mFindView();
        btnLogin.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnLogin:
                String user = etUser.getText().toString();
                String pass = etPass.getText().toString();
                pref.putUser(user, pass);

                Intent act = new Intent(Login.this, Other.class);
                startActivity(act);

                break;
        }

    }

    //inicializa los elementos desde el xml
    private void mFindView(){
        etUser = (EditText) findViewById(R.id.etUser);
        etPass = (EditText) findViewById(R.id.etPass);
        btnLogin = (Button) findViewById(R.id.btnLogin);
    }


}
